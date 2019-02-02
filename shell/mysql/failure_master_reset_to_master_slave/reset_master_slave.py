#!/usr/bin/env python

import os
import sys
import time

def reset_master(filter_names, failure_master, failure_master_password, position):
    other_mysql = []
    os.system("docker start %s" % failure_master)
    os.system("docker exec -it %s /etc/init.d/ssh start" % failure_master)
    time.sleep(10)
    for i in range(len(filter_names)):
        if filter_names[i] == failure_master:
            pass
        else:
            other_mysql.append(filter_names[i])
    for i in range(len(other_mysql)):
        if len(os.popen("docker exec -it %s mysql -uroot -p%s -e 'show slave status \G;'" % (other_mysql[i], failure_master_password)).read().split("Slave_IO_Running")) == 2:
            pass
        else:
            data = os.popen("docker exec -it %s mysql -uroot -p%s -e 'show master status;'" % (other_mysql[i], failure_master_password)).read()
            binlog = data.split("\r\n")[-3].split("|")[1].replace(" ","")
            postion = data.split("\r\n")[-3].split("|")[2].replace(" ","")

            info = os.popen("docker inspect %s" % other_mysql[i]).read()
            ip = eval(info)[0]["NetworkSettings"]["IPAddress"]

            slave_to_master_reset = "CHANGE MASTER TO MASTER_HOST='%s', MASTER_USER='repl', MASTER_PASSWORD='%s', MASTER_LOG_FILE='%s', MASTER_LOG_POS=%d;" % (ip, failure_master_password, binlog, position)

            os.system('docker exec -it %s mysql -uroot -p%s -e "%s"' % (failure_master, failure_master_password, slave_to_master_reset))
            os.system("docker exec -it %s mysql -uroot -p%s -e 'start slave';" % (failure_master, failure_master_password))
            os.system("docker exec -it %s mysql -uroot -p%s -e 'set global read_only=1;'" % (failure_master, failure_master_password))


if __name__ == "__main__":
    null = None
    true = True
    false = False
    filter_names = []
    if len(sys.argv) != 4:
        print ("python %s <failure_master_reset_name> <mysql_root_password> <position>" % sys.argv[0])
    else:
        failure_master = sys.argv[1]
        failure_master_password = sys.argv[2]
        position = sys.argv[3]
        names = os.popen("docker ps --format='{{.Names}}'").read().strip().split("\n")
        for i in range(len(names)):
            info = os.popen("docker inspect %s" % names[i]).read()
            if eval(info)[0]["Config"]["Cmd"][0] == "mysqld":
                filter_names.append(names[i])
        print (filter_names)
        reset_master(filter_names, failure_master, failure_master_password, int(position))
     
    

