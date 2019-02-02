#!/usr/bin/env python

import os
import sys
import socket
import time
import multiprocessing


def formal_start(platform_path, user_ip, shell_path, workspace_uddi):
    os.system("sh %s/startconf.sh %s %s %s" % (shell_path, platform_path, user_ip, workspace_uddi))
    os.system("sh %s/startServer.sh" % platform_path)

def tap0_close(t):
    time.sleep(t)
    os.system("ip addr del 172.16.3.50/32 dev tap0")

if __name__ == "__main__":
    shell_path = sys.argv[1]
    platform_path = sys.argv[2]
    workspace_uddi = sys.argv[3]
    local_ip = [(s.connect(('8.8.8.8', 53)), s.getsockname()[0], s.close()) for s in [socket.socket(socket.AF_INET, socket.SOCK_DGRAM)]][0][1]

    p_start = multiprocessing.Process(target = formal_start, args = (platform_path, local_ip, shell_path, workspace_uddi,))
    p_tap = multiprocessing.Process(target = tap0_close, args = (1800,))
    p_start.start()
    p_tap.start()
    p_tap.join()
