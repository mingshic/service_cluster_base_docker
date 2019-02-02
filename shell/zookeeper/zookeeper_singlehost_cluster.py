#!/usr/bin/env python


import os
import sys

def zookeeper_singlehost():
    for i in range(1, 4):
        volume_localtime = "/etc/localtime:/etc/localtime:ro"
        volume_conf = "/opt/zookeeper/zk%s/conf:/opt/zookeeper/conf" % i
        volume_data = "/opt/zookeeper/zk%s/data:/opt/zookeeper/data" % i
        volume_logs = "/opt/zookeeper/zk%s/logs:/opt/zookeeper/logs" % i
        os.system("docker run -itd --restart=always --name zookeeper%s --net=host --oom-kill-disable=true -m 200m --memory-swappiness=1 -v %s -v %s -v %s -v %s 172.16.1.14:5000/zookeeper" % (i, volume_localtime, volume_conf, volume_data, volume_logs))


if __name__ == "__main__":
    zookeeper_singlehost()

