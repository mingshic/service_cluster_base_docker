#!/bin/bash
export CATALINA_HOME=/opt/tomcat/apache-tomcat-8.0.47
export CATALINA_BASE="/opt/tomcat/tomcat-upms-8800"
export CATALINA_TMPDIR="$CATALINA_BASE/temp"
export CATALINA_PID="$CATALINA_BASE/bin/tomcat.pid"

bash $CATALINA_HOME/bin/shutdown.sh "$@"

