#!/usr/bin/env python 

import os
import sys
import socket
import time
import multiprocessing

def master_config(t, nums):
#    os.system("/etc/init.d/ssh start")
#    time.sleep(2)
#    names = []
#    for i in range(1, len(nums)):
#        names.append(sys.argv[i])
#    link_ssh(names)
    time.sleep(t)

    slave_auth = "show grants for repl@'%';"
    master_slave_auth = os.popen('mysql -uroot -p%s -e "%s"' % (env_dict["MYSQL_ROOT_PASSWORD"], slave_auth)).read()
    master_info = os.popen("mysql -uroot -p%s -e 'show master status;'" % env_dict["MYSQL_ROOT_PASSWORD"]).read()
    if master_slave_auth and master_info:
        pass
    else:
        create_repl_user = "CREATE USER '%s'@'%%' IDENTIFIED BY '%s';" % (env_dict["MYSQL_REPL_USER"], env_dict["MYSQL_REPL_PASSWORD"])
        grant_repl = "GRANT REPLICATION SLAVE ON *.* TO '%s'@'%%';" % env_dict["MYSQL_REPL_USER"]
    
        os.system("mysql -uroot -p%s -e 'flush privileges;'" % env_dict["MYSQL_ROOT_PASSWORD"])
        os.system('mysql -uroot -p%s -e "%s"' % (env_dict["MYSQL_ROOT_PASSWORD"], create_repl_user))
        os.system('mysql -uroot -p%s -e "%s"' % (env_dict["MYSQL_ROOT_PASSWORD"], grant_repl))

#def link_ssh(names):
#    os.system("ssh-keygen -t rsa -P '' -f ~/.ssh/id_rsa")
#    for name in names:
#        os.system("/preparation/ssh_copy_id.sh root 123456 %s" % name)

def slave_config(t, nums, masterip):
#    os.system("/etc/init.d/ssh start")
#    time.sleep(4)
#    names = []
#    for i in range(1, len(nums)):
#        names.append(sys.argv[i])
#    link_ssh(names)
    time.sleep(t)
    slave_io = ""
    slave_sql = ""

    slave_info = os.popen("mysql -uroot -p%s -e 'show slave status \G;' | egrep 'Master_Log_File|Slave_IO_Running|Slave_SQL_Running' |grep -v Slave_SQL_Running_State" % env_dict["MYSQL_MASTER_ROOT_PASSWORD"]).read()
    try:
        slave_file, slave_io, slave_sql = slave_info.split("Master_Log_File:")[1].split("\n")[0].strip(), slave_info.split("Slave_IO_Running:")[1].split("\n")[0].strip(), slave_info.split("Slave_SQL_Running:")[1].split("\n")[0].strip()
    except:
        pass    
    if slave_io == "Yes" and slave_sql == "Yes":
        time.sleep(5)
        pass
    elif slave_io != "Yes" or slave_sql != "Yes":
        binlogfile = os.popen("mysql -h %s -uroot -p%s -e 'show master status;' |awk -F ' ' '{print $1,$2}' |grep -v File |awk -F ' ' '{print $1}'" % (env_dict["MYSQL_MASTER_CONTAINER"], env_dict["MYSQL_MASTER_ROOT_PASSWORD"])).read().strip()
        position = os.popen("mysql -h %s -uroot -p%s -e 'show master status;' |awk -F ' ' '{print $1,$2}' |grep -v File |awk -F ' ' '{print $2}'" % (env_dict["MYSQL_MASTER_CONTAINER"], env_dict["MYSQL_MASTER_ROOT_PASSWORD"])).read().strip()    
        slave_to_master = "CHANGE MASTER TO MASTER_HOST='%s', MASTER_USER='%s', MASTER_PASSWORD='%s', MASTER_LOG_FILE='%s', MASTER_LOG_POS=%d;" % (masterip, env_dict["MYSQL_REPL_USER"], env_dict["MYSQL_REPL_PASSWORD"], binlogfile, int(position)) 
        create_repl_slave = "grant replication slave on *.* to '%s'@'%%' identified by '%s';" % (env_dict["MYSQL_REPL_USER"], env_dict["MYSQL_REPL_PASSWORD"])   
    
        os.system("mysql -uroot -p%s -e 'stop slave';" % env_dict["MYSQL_ROOT_PASSWORD"])
        os.system('mysql -uroot -p%s -e "%s"' % (env_dict["MYSQL_ROOT_PASSWORD"], slave_to_master))
        os.system("mysql -uroot -p%s -e 'start slave';" % env_dict["MYSQL_ROOT_PASSWORD"])
        time.sleep(4)
        os.system('mysql -uroot -p%s -e "%s"' % (env_dict["MYSQL_ROOT_PASSWORD"], create_repl_slave))
        os.system("mysql -uroot -p%s -e 'set global read_only=1;'" % env_dict["MYSQL_ROOT_PASSWORD"])
    else:
        binlogfile = os.popen("mysql -h %s -uroot -p%s -e 'show master status;' |awk -F ' ' '{print $1,$2}' |grep -v File |awk -F ' ' '{print $1}'" % (env_dict["MYSQL_MASTER_CONTAINER"], env_dict["MYSQL_MASTER_ROOT_PASSWORD"])).read().strip()
        position = os.popen("mysql -h %s -uroot -p%s -e 'show master status;' |awk -F ' ' '{print $1,$2}' |grep -v File |awk -F ' ' '{print $2}'" % (env_dict["MYSQL_MASTER_CONTAINER"], env_dict["MYSQL_MASTER_ROOT_PASSWORD"])).read().strip()
        slave_to_master = "CHANGE MASTER TO MASTER_HOST='%s', MASTER_USER='%s', MASTER_PASSWORD='%s', MASTER_LOG_FILE='%s', MASTER_LOG_POS=%d;" % (masterip, env_dict["MYSQL_REPL_USER"], env_dict["MYSQL_REPL_PASSWORD"], binlogfile, int(position)) 
        create_repl_slave = "grant replication slave on *.* to '%s'@'%%' identified by '%s';" % (env_dict["MYSQL_REPL_USER"], env_dict["MYSQL_REPL_PASSWORD"])   
    
        os.system('mysql -uroot -p%s -e "%s"' % (env_dict["MYSQL_ROOT_PASSWORD"], slave_to_master))
        os.system("mysql -uroot -p%s -e 'start slave';" % env_dict["MYSQL_ROOT_PASSWORD"])
        time.sleep(4)
        os.system('mysql -uroot -p%s -e "%s"' % (env_dict["MYSQL_ROOT_PASSWORD"], create_repl_slave))
        os.system("mysql -uroot -p%s -e 'set global read_only=1;'" % env_dict["MYSQL_ROOT_PASSWORD"])
    
def mysqld_start():
    os.system("/entrypoint.sh mysqld")

if __name__ == "__main__":
    nums = sys.argv
    env_dict = os.environ 
    master_hostname = env_dict["MYSQL_MASTER_CONTAINER"]
    ip = socket.gethostbyname(master_hostname)
    if env_dict["MYSQL_ROLE"] == "master":
        p_start = multiprocessing.Process(target = mysqld_start, args = ())
        p_tap = multiprocessing.Process(target = master_config, args = (15, nums,))
       # p_tap = multiprocessing.Process(target = master_config, args = (10,))
        p_start.start()
        p_tap.start()
        p_tap.join()
        
    elif env_dict["MYSQL_ROLE"] == "slave":
        p_start = multiprocessing.Process(target = mysqld_start, args = ())
        p_tap = multiprocessing.Process(target = slave_config, args = (25, nums, ip,))
       # p_tap = multiprocessing.Process(target = slave_config, args = (25, ip,))
        p_start.start()
        p_tap.start()
        p_tap.join()


