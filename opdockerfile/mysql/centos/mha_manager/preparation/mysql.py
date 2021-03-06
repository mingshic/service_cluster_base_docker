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

    binlogfile = os.popen("mysql -h %s -uroot -p%s -e 'show master status;' |awk -F ' ' '{print $1,$2}' |grep -v File |awk -F ' ' '{print $1}'" % (env_dict["MYSQL_MASTER_CONTAINER"], env_dict["MYSQL_MASTER_ROOT_PASSWORD"])).read().strip()
    position = os.popen("mysql -h %s -uroot -p%s -e 'show master status;' |awk -F ' ' '{print $1,$2}' |grep -v File |awk -F ' ' '{print $2}'" % (env_dict["MYSQL_MASTER_CONTAINER"], env_dict["MYSQL_MASTER_ROOT_PASSWORD"])).read().strip()

    slave_to_master = "CHANGE MASTER TO MASTER_HOST='%s', MASTER_USER='%s', MASTER_PASSWORD='%s', MASTER_LOG_FILE='%s', MASTER_LOG_POS=%d;" % (masterip, env_dict["MYSQL_REPL_USER"], env_dict["MYSQL_REPL_PASSWORD"], binlogfile, int(position)) 
    create_repl_slave = "grant replication slave on *.* to '%s'@'%%' identified by '%s';" % (env_dict["MYSQL_REPL_USER"], env_dict["MYSQL_REPL_PASSWORD"])   

    os.system('mysql -uroot -p%s -e "%s"' % (env_dict["MYSQL_ROOT_PASSWORD"], slave_to_master))
    os.system("mysql -uroot -p%s -e 'start slave';" % env_dict["MYSQL_ROOT_PASSWORD"])
    time.sleep(5)
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
        p_tap = multiprocessing.Process(target = master_config, args = (10, nums,))
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


