#!/usr/bin/env python

import os
import socket
from jinja2 import Environment, FileSystemLoader

def startup(role, names):
    mq_path = "/preparation"
    env = Environment(loader = FileSystemLoader(mq_path))
    ips = []
    hostnames = []
    for i in range(len(names.split(","))):
        hostnames.append(names.split(",")[i])
    print (hostnames)
    for name in hostnames:
        ip = socket.gethostbyname(name)
        ips.append(ip)
    if role == "consumer":
        template = env.get_template("activemq_bak_nodeA.xml")
        content = template.render(ip1=ips[0], ip2=ips[1])
        with open("/opt/apache-activemq-5.15.6/conf/" + "activemq.xml", "w") as fp:
            fp.write(content)
        os.system("/opt/apache-activemq-5.15.6/bin/activemq console")
    if role == "producer_and_consumer":
        template = env.get_template("activemq_bak_node.xml")
        content = template.render(ip0=ips[0])
        with open("/opt/apache-activemq-5.15.6/conf/" + "activemq.xml", "w") as fp:
            fp.write(content)
        os.system("/opt/apache-activemq-5.15.6/bin/activemq console")


if __name__ == "__main__":
    env_dict = os.environ
    role = env_dict["MQ_ROLE"]
    names = env_dict["MQ_CLUSTER"]
    startup(role, names)
    


