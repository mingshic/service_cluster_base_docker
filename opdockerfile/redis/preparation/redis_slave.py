#!/usr/bin/env python3

import sys
import os
import socket

file_path = sys.argv[1]
env_dict = os.environ
master_hostname = env_dict["MASTER_CONTAINER"]
ip = socket.gethostbyname(master_hostname)

file_data = ""
with open(file_path, "r") as f:
    for line in f:
        if "slaveof" in line:
            line = line.replace(line, "slaveof %s 6379") % ip    
            file_data += line
        else:
            file_data += line
    if "slaveof" not in file_data:
        file_data += "slaveof %s 6379" % ip
with open(file_path, "w") as f:
    f.write(file_data)
