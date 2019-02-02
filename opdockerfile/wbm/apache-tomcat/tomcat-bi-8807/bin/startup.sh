#!/bin/bash
export CATALINA_HOME=/opt/tomcat/apache-tomcat-8.0.47
export CATALINA_BASE="/opt/tomcat/tomcat-bi-8807"
export CATALINA_TMPDIR="$CATALINA_BASE/temp"
export CATALINA_PID="$CATALINA_BASE/bin/tomcat.pid"
export JAVA_OPTS="-server -Xms1024m -Xmx1024m -Djava.awt.headless=true -Dtomcat.name=tomcat-bi-8807"

#创建logs目录
if [ ! -d "$CATALINA_BASE/logs" ]; then
  mkdir $CATALINA_BASE/logs
fi

#创建temp目录
if [ ! -d "$CATALINA_BASE/temp" ]; then
  mkdir $CATALINA_BASE/temp
fi

# 调用tomcat启动脚本
bash $CATALINA_HOME/bin/startup.sh "$@"

