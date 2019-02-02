#!/usr/bin/env python

import os
import sys
from jinja2 import Environment, FileSystemLoader

mq_path = "/opt/activemq/"
volume_time = "/etc/localtime:/etc/localtime:ro"
volume_mq1_conf = "/opt/activemq/mq1/conf:/opt/apache-activemq-5.15.6/conf"
volume_mq2_data = "/opt/activemq/data:/opt/apache-activemq-5.15.6/data"
volume_mq2_conf = "/opt/activemq/mq2/conf:/opt/apache-activemq-5.15.6/conf"
volume_mq3_data = "/opt/activemq/data:/opt/apache-activemq-5.15.6/data"
volume_mq3_conf = "/opt/activemq/mq3/conf:/opt/apache-activemq-5.15.6/conf"

def docker_inspect(names):
    env = Environment(loader = FileSystemLoader(mq_path))
    name_ips = []
    for i in range(len(names)):
        info = os.popen("docker inspect %s" % names[i]).read()
        name_ips.append({names[i]: eval(info)[0]["NetworkSettings"]["IPAddress"]})
    for i in range(len(name_ips)):
        if i == 0:
            template = env.get_template("activemq_bak_nodeA.xml")
            content = template.render(ip1=name_ips[1].values()[0], ip2=name_ips[2].values()[0])
            with open(mq_path + "/mq1/conf/" + "activemq.xml", "w") as fp:
                fp.write(content)
            os.system("docker restart %s" % name_ips[i].keys()[0])
        elif i == 1:
            template = env.get_template("activemq_bak_node.xml")
            content = template.render(ip0=name_ips[0].values()[0])
            with open(mq_path + "/mq2/conf/" + "activemq.xml", "w") as fp:
                fp.write(content)
            os.system("docker restart %s" % name_ips[i].keys()[0]) 
        else:
            template = env.get_template("activemq_bak_node.xml")
            content = template.render(ip0=name_ips[0].values()[0])
            with open(mq_path + "/mq3/conf/" + "activemq.xml", "w") as fp:
                fp.write(content)
            os.system("docker restart %s" % name_ips[i].keys()[0])


if __name__ == "__main__":
    null = None
    true = True
    false = False
    if len(sys.argv) != 2:
        print ("active_container_name is needed: python %s <container_name>" % sys.argv[0])
    else:
        name = sys.argv[1]
        names = []
        for i in range(3):
            if i == 0:
                os.system("docker run -itd -m 500m --name %s%s -p 8161:8161 -p 6163:61613 -p 61616:61616 -v %s -v %s rmohr/activemq" % (name, i, volume_time, volume_mq1_conf))
            elif i == 1:
                os.system("docker run -itd -m 500m --name %s%s -p 8162:8161 -p 6164:61613 -p 61617:61616 -v %s -v %s -v %s rmohr/activemq" % (name, i, volume_time, volume_mq2_data, volume_mq2_conf))
            elif i == 2:
                os.system("docker run -itd -m 500m --name %s%s -p 8163:8161 -p 6165:61613 -p 61618:61616 -v %s -v %s -v %s rmohr/activemq" % (name, i, volume_time, volume_mq3_data, volume_mq3_conf))
            names.append("%s%s" % (name, i))
        ips = docker_inspect(names)
