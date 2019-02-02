#!/usr/bin/env python

import signal
import os
import sys
import time
# master config
volume_localtime = "/etc/localtime:/etc/localtime:ro"
volume_master_conf = "/opt/mysql/master/conf:/etc/mysql"
volume_data = "/opt/mysql/master/data:/var/lib/mysql"
volume_log = "/opt/mysql/master/log:/var/log/mysql"
# slave config
volume_slave_conf = "/opt/mysql/master/conf:/etc/mysql"
volume_slave_data = "/opt/mysql/master/data:/var/lib/mysql"
volume_slave_log = "/opt/mysql/master/log:/var/log/mysql"
# slave repl copy path
slave = "/opt/mysql/slave" 

def gain_master(master_name, password):
    master_key = os.popen("docker exec -it %s mysql -uroot -p%s -e 'SHOW MASTER STATUS;' |awk -F '|' '{print $2,$3}' |grep -iv file" % (master_name, password)).read().strip()
    binlog, postion = master_key.split(" ")[0], master_key.split(" ")[-1]
    return binlog, postion

def container_start(master_name, slave_name, mysql_number, password):
    os.system("docker run -d -e MYSQL_ROOT_PASSWORD=%s --name %s -v %s -v %s -v %s -v %s -p 3306:3306 mha_node" % (password, master_name, volume_localtime, volume_master_conf, volume_data, volume_log))
    time.sleep(10)
    os.system("docker exec -it %s mysql -uroot -p%s -e 'flush privileges;'" % (master_name, password))
    create_repl = "CREATE USER 'repl'@'%%' IDENTIFIED BY '%s';" % password
    os.system('docker exec -it %s mysql -uroot -p%s -e "%s"' % (master_name, password, create_repl))
    grant_repl = "GRANT REPLICATION SLAVE ON *.* TO 'repl'@'%';"
    os.system('docker exec -it %s mysql -uroot -p%s -e "%s"' % (master_name, password, grant_repl))

    binlog, postion = gain_master(master_name, password)
    slave_start(master_name, slave_name, mysql_number, password, binlog, int(postion))
        
def slave_start(master_name, slave_name, mysql_number, password, binlog, postion):
    master_slave_ip = []
    containers_name = []
    null = None
    true = True
    false = False
    info = os.popen("docker inspect %s" % master_name).read() 
    master_ip = eval(info)[0]["NetworkSettings"]["IPAddress"]
    containers_name.append(master_name)
    master_slave_ip.append(master_ip)
    for i in range(mysql_number-1):
        if os.path.exists("/opt/mysql/slave%s" % (i)):
            print ("<mysql_Slave_name> container name have been already exists")
            break
        else:
            os.system("cp -rp %s %s%s && rm -rf %s%s/log/* && rm -rf %s%s/data/*" % (slave, slave, i, slave, i, slave, i)) 
            os.system("sed -i 's/server-id.*/server-id=%s/g' %s%s/conf/my.cnf" % (i+2, slave, i))
            os.system("sed -i 's/log-bin.*/log-bin=%s/g' %s%s/conf/my.cnf" % ("mysql"+str(i+2), slave, i))

        os.system("docker run -d -e MYSQL_ROOT_PASSWORD=%s --name %s%s -v %s -v /opt/mysql/slave%s/conf:/etc/mysql -v /opt/mysql/slave%s/data:/var/lib/mysql -v /opt/mysql/slave%s/log:/var/log/mysql -p 3306%d:3306 mha_node" % (password, slave_name, i, volume_localtime, i, i, i, i))
        time.sleep(10)
        slave_to_master = "CHANGE MASTER TO MASTER_HOST='%s', MASTER_USER='repl', MASTER_PASSWORD='%s', MASTER_LOG_FILE='%s', MASTER_LOG_POS=%d;" % (master_ip, password, binlog, postion)
        os.system('docker exec -it %s%s mysql -uroot -p%s -e "%s"' % (slave_name, i, password, slave_to_master))
        os.system("docker exec -it %s%s mysql -uroot -p%s -e 'start slave';" % (slave_name, i, password))
        info = os.popen("docker inspect %s%s" % (slave_name, i)).read()
        slave_ip = eval(info)[0]["NetworkSettings"]["IPAddress"]
        master_slave_ip.append(slave_ip)
        containers_name.append(slave_name+str(i)) 
    ip_container = dict(zip(master_slave_ip,containers_name))
    mysql_ssh_interflow(ip_container, password, master_name)
    print (ip_container)

def mysql_ssh_interflow(ip_container, password, master_name):
    _list = []
    for ip,container in ip_container.items():
        os.system("docker exec -it %s /etc/init.d/ssh start" % container)
        os.system("docker exec -it %s ssh-keygen -t rsa -P '' -f ~/.ssh/id_rsa" % container)
        _list.append({ip: container})
    for i in range(len(_list)):
        for ip,container in ip_container.items():            
            os.system("docker exec -it %s /preparation/ssh_copy_id.sh root %s %s" % (_list[i].values()[0], password, ip))
    print ("ssh_interflow success")
    mha_manager_repl_usertomysql(_list, password, master_name)

def mha_manager_repl_usertomysql(_list, password, master_name):
    for i in range(len(_list)):
        if _list[i].values()[0] == master_name:
            create_manager = "grant all privileges on *.* to 'manager'@'%%' identified by '%s';" % password
            os.system('docker exec -it %s mysql -uroot -p%s -e "%s"' % (_list[i].values()[0], password, create_manager))
        else:
            create_repl_slave = "grant replication slave on *.* to 'repl'@'%%' identified by '%s';" % password
            os.system('docker exec -it %s mysql -uroot -p%s -e "%s"' % (_list[i].values()[0], password, create_repl_slave))
            os.system("docker exec -it %s mysql -uroot -p%s -e 'set global read_only=1;'" % (_list[i].values()[0], password))
#    for i in range(len(_list)):
#        if _list[i].values()[0] == master_name: 
#            create_manager = "grant all privileges on *.* to 'manager'@'%%' identified by '%s';" % password
#            os.system('docker exec -it %s mysql -uroot -p%s -e "%s"' % (_list[i].values()[0], password, create_manager))
#        else:
#            pass
    print ("slave's manager and repl success")



if __name__ == "__main__":
    if len(sys.argv) != 5:
        print ("input: python %s <mysql_Master_Name> <mysql_Slave_Name> <Mysql_number> <Password>" % sys.argv[0])
    else:
        master_name = sys.argv[1]
        slave_name = sys.argv[2]
        password = sys.argv[4]
        all_Name = os.popen("docker ps --format '{{.Names}}'").read().strip().split("\n")
        try: 
            mysql_number = int(sys.argv[3])
            if 2 <= mysql_number <= 5:
                pass
            else:
                print ("<Mysql_number> a few")
        except:
            print ("<Mysql_number> is number[int]")
        if master_name in all_Name:
            print ("<mysql_Master_name> container name have been already exists")
        elif slave_name in all_Name:
            print ("<mysql_Slave_name> container name have been already exists")
        else:
            container_start(master_name, slave_name, mysql_number, password)
         
