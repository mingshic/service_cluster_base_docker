#!/usr/bin/env python

import os
import sys


file_path = "/opt/nginx/nginx_keepalived1/conf/server8090.conf"

volume_htpasswd = "/opt/nginx/nginx_keepalived1/htpasswd:/var/cache/nginx/htpasswd"
volume_logs = "/opt/nginx/nginx_keepalived1/logs:/etc/nginx/logs"
volume_nginx_conf = "/opt/nginx/nginx_keepalived1/conf/nginx.conf:/etc/nginx/nginx.conf:rw"
volume_proxy_conf = "/opt/nginx/nginx_keepalived1/conf/proxy.conf:/etc/nginx/conf.d/proxy.conf:rw"
volume_server = "/opt/nginx/nginx_keepalived1/conf/server8090.conf:/etc/nginx/conf.d/default.conf:rw"
volume_keepalived = "/opt/nginx/nginx_keepalived1/keepalived_master.conf:/etc/keepalived/keepalived.conf"
volume_filesystem_conf = "/opt/nginx/nginx_keepalived1/conf/filesystem.conf:/etc/nginx/conf.d/filesystem.conf:rw"
volume_filesysdir = "/opt/fileSystemDir:/opt/fileSystemDir"

def docker_nginx(ip_port):
    os.system("sed -i '/server 172/d' %s" % file_path) 
    num = 0
    for i in range(len(ip_port)):
        os.system("sed -i '2a\    server %s weight=1 max_fails=2 fail_timeout=30s;' %s" % (ip_port[i], file_path))
        num += 1
    if num == len(sys.argv) - 1:
        os.system("docker run -it --name nginx -p 80:80 -p 8181:8181 -v %s -v %s -v %s -v %s -v %s -v %s -v %s -d %s" % (volume_htpasswd, volume_logs, volume_nginx_conf, volume_proxy_conf, volume_server, volume_filesystem_conf, volume_filesysdir, "nginx_keeplived"))
    else:
        print ("\033[31m argv is not corret, please troubleshooting. \033[0m")

if __name__ == "__main__":
    null = None
    true = True
    false = False
    ip_port = []
    if len(sys.argv) > 1:
        for i in range(1, len(sys.argv)):
            info = os.popen("docker inspect %s" % sys.argv[i]).read()
            ip_port.append("%s:%s" % (eval(info)[0]["NetworkSettings"]["IPAddress"],80))
        docker_nginx(ip_port)
    else:
        print ("\033[31m please carrying container name or ID: python %s <container_name or container_ID>. \033[0m" % sys.argv[0])
         
