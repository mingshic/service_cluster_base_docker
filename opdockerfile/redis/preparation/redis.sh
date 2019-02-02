#!/bin/bash

config_file="/etc/redis/redis.conf"

if [[ $REDIS_ROLE == "slave" ]];then
    a=`python3 /preparation/redis_slave.py $config_file`
    if [ $? -eq 0 ];then
        exec redis-server $config_file
    else
        echo "param error"
    fi
elif [[ $REDIS_ROLE == "master" ]];then
    a=`python3 /preparation/redis_master.py $config_file`
    if [ $? -eq 0 ];then
        exec redis-server $config_file
    else
        echo "param error"
    fi
fi
