#!/bin/bash

nginx_status=$(ps aux | grep -Ev "grep|$0" | grep '\bnginx\b' | wc -l)
if [ $nginx_status -lt 1 ];then
        systemctl stop keepalived
fi
