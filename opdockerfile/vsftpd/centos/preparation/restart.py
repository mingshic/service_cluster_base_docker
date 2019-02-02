#!/usr/bin/env python


import os
import time
import multiprocessing

def init_vsftpdb():
    os.system("db_load -T -t hash -f /etc/vsftpd/virtusers.txt /etc/vsftpd/virtusers.db")

def start_vsftpdb(t):
    time.sleep(t)
    os.system("systemctl restart vsftpd")

p_start = multiprocessing.Process(target = start_vsftpdb, args = (3,))
p_tap = multiprocessing.Process(target = init_vsftpdb, args = ())
p_start.start()
p_tap.start()
p_tap.join()
p_start.join()
