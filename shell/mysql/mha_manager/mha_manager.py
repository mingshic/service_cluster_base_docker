#!/usr/bin/env python


import os
import sys
import signal

volume_localtime = "/etc/localtime:/etc/localtime:ro"
volume_manager_conf = "/opt/mysql/mha_manager/app.cnf:/etc/masterha/app.cnf"
volume_manager_workdir = "/opt/mysql/mha_manager/workdir:/masterha/app"


def docker_mha_manager(ips, mha_manager, password):
    os.system("docker run -itd --name %s -v %s -v %s -v %s mha_manager" % (mha_manager, volume_localtime, volume_manager_conf, volume_manager_workdir))
    os.system("docker exec -it %s ssh-keygen -t rsa -P '' -f ~/.ssh/id_rsa" % mha_manager)
    for i in range(len(ips)):
        os.system("docker exec -it %s /preparation/ssh_copy_id.sh root %s %s" % (mha_manager, password, ips[i].values()[0]))

    os.system("docker exec -it %s masterha_check_ssh --conf=/etc/masterha/app.cnf" % mha_manager)
    os.system("docker exec -it %s masterha_check_repl --conf=/etc/masterha/app.cnf" % mha_manager)

if __name__ == "__main__":
    null = None
    true = True
    false = False
    ips = []
    names = os.popen("docker ps --format='{{.Names}}'").read().strip().split("\n")
    try:
        if sys.argv[1] in names:
            print ("Mha_manager location error, command: python %s <mha_manager> <mysql_container_name> <password>" % sys.argv[0])
            os.kill(os.getpid(), signal.SIGKILL)
        else:
            pass
    except:
        print ("Mha_manager no argv, command: python %s <mha_manager> <mysql_container_name> <password>" % sys.argv[0])
        os.kill(os.getpid(), signal.SIGKILL)
    if len(sys.argv) > 2:
        for i in range(2, len(sys.argv)-1):
            info = os.popen("docker inspect %s" % sys.argv[i]).read()
            ips.append({sys.argv[i]: eval(info)[0]["NetworkSettings"]["IPAddress"]})
        print (ips)
        docker_mha_manager(ips, sys.argv[1], sys.argv[-1])
    else:
        print ("\033[31m please carrying container name or ID: python %s <container_name or container_ID>. \033[0m" % sys.argv[0])

