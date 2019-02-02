#!/usr/bin/env python

import os
import sys

def del_image_metadata(image_name, tag):
    sha256_code = os.popen("curl -v --silent -H 'Accept: application/vnd.docker.distribution.manifest.v2+json' -X GET  http://10.126.2.65:5000/v2/%s/manifests/%s 2>&1 | grep Docker-Content-Digest | awk '{print ($3)}'" % (image_name, tag)).read()
    if sha256_code: 
        url = "curl -v --silent -H 'Accept: application/vnd.docker.distribution.manifest.v2+json' -X DELETE http://10.126.2.65:5000/v2/%s/manifests/%s" % (image_name, sha256_code)
        del_url = url.replace("\r","")
        os.system("%s" % (del_url))
        statu = 1
    else:
        print ("\033[31m image_name not correct or image have been deleted\033[0m")

    try:
        if statu == 1:
            _input = raw_input("\033[31m Metadata has been deleted, please enter whether to delete file system data.\033[0m \033[32m please input \"yes\" to delete: \033[0m")
            if _input == "yes":
                os.system("docker exec registry bin/registry garbage-collect /etc/docker/registry/config.yml")
    except:
        pass





if __name__ == "__main__":
    if len(sys.argv) != 2:
        print ("image name is needed, command: \033[31m\"python %s image_name\"\033[0m" % sys.argv[0])
        statu = 0
    else:
        image_name = ":".join(sys.argv[1].split(":")[:-1])
        print (image_name)
        tag = sys.argv[1].split(":")[1]
        del_image_metadata(image_name, tag)
 
