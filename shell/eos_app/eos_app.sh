#!/bin/bash

container_name="$1"
port="$2"
on_timer="$3"

if [[ "$container_name" == "" ]];then
    echo -e "container name and port is needed, command: \033[31m\"sh $0 container_name port\"\033[0m"
elif [[ "$port" == "" ]];then
    echo -e "port is needed, command: \033[31m\"sh $0 $1 port\"\033[0m"
else
    volume_localtime="/etc/localtime:/etc/localtime:ro"
    volume_default="/opt/eos_app/webapps/default:/app/tomcat-7.0.68/webapps/default"
    volume_logs="/opt/eos_app/logs/$container_name:/app/tomcat-7.0.68/logs"
    volume_license_default="/opt/eos_app/config/primetonlicense.xml:/app/primeton/platform/apps_config/default/license/primetonlicense.xml:rw" 
    volume_license_governor="/opt/eos_app/config/primetonlicense.xml:/app/primeton/platform/apps_config/governor/license/primetonlicense.xml:rw"
    volume_license_workspace="/opt/eos_app/config/primetonlicense.xml:/app/primeton/platform/apps_config/workspace/license/primetonlicense.xml:rw"
    volume_userconfig="/opt/eos_app/config/user-config.xml:/app/primeton/platform/apps_config/default/config/user-config.xml:rw"
#    if [[ "$on_timer" == "timer" ]];then
#        volume_userconfig="/opt/eos_app/config/user-config_on_timer.xml:/app/primeton/platform/apps_config/default/config/user-config.xml:rw"
#    else
#        volume_userconfig="/opt/eos_app/config/user-config.xml:/app/primeton/platform/apps_config/default/config/user-config.xml:rw"
#    fi
    
    docker run -it --name $container_name --device=/dev/net/tun --cap-add NET_ADMIN -p $port:80 -v $volume_localtime -v $volume_default -v $volume_logs -v $volume_license_default -v $volume_license_governor -v $volume_license_workspace -v $volume_userconfig -d 172.16.1.14:5000/centos_eos_ntop
fi
