#/usr/bin/env python

import os
import sys





if __name__ == "__main__":
    if len(sys.argv) != 2:
        print ("python %s <mha_manager_container>" % sys.argv[0])
    else:
        mha_manager = sys.argv[1]
        if os.path.exists("/opt/mysql/mha_manager/workdir/app.failover.complete"):
            os.system("rm -rf /opt/mysql/mha_manager/workdir/*")
            mha_manager_command = 'nohup masterha_manager --conf=/etc/masterha/app.cnf &> /masterha/app/mha_manager.log &'
            os.system("docker exec -it %s %s" % (mha_manager, mha_manager_command))
