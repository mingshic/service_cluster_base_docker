#!/usr/bin/env python3

import sys
import os
import socket

file_path = sys.argv[1]

file_data = ""
with open(file_path, "r") as f:
    for line in f:
        if "slaveof" in line:
            line = "" 
            file_data += line
        else:
            file_data += line
with open(file_path, "w") as f:
    f.write(file_data)
