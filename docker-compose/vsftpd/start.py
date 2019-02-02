#!/usr/bin/env python

import os
import sys



if __name__ == "__main__":
    if len(sys.argv) >= 2:
#        if sys.argv[-1] not in os.popen("docker ps --format '{{.Names}}'"):
        for i in range(1, len(sys.argv)):
            os.system("docker exec -it %s /preparation/start.py" % sys.argv[i])
            os.system("docker exec -it %s chown vsftpd.vsftpd /opt/vsftpd/data" % sys.argv[i]) 
    else:
        print ("error")



