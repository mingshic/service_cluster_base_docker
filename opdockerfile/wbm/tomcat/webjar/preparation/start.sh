#!/bin/bash


rm -rf $SERVICE_PATH/bin/tomcat.pid

exec $SERVICE_PATH/bin/startup.sh 
