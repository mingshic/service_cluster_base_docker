FROM tomcat:latest 

ENV TOMCAT_HOME /usr/local/tomcat
ENV JAVA_HOME /usr/java/jdk1.8.0_172
ENV JRE_HOME $JAVA_HOME/jre
ENV PATH $PATH:$JAVA_HOME/bin:$JRE_HOME/bin
ENV CLASSPATH .:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$JRE_HOME/lib

COPY ./preparation/profile /etc/profile
COPY ./preparation/jdk-8u172-linux-x64.tar.gz /tmp/
COPY ./preparation/start.sh /preparation/start.sh

RUN apt-get update \
    && apt-get install python python-jinja2 vim procps -y \
    && mkdir /opt/www/webjar -p && mkdir /opt/www/webserver -p && mkdir /opt/tomcat \
    && mkdir /usr/java/ && tar xf /tmp/jdk-8u172-linux-x64.tar.gz -C /usr/java/ && rm -rf /tmp/jdk-8u172-linux-x64.tar.gz \
    && chmod 777 /preparation/start.sh \
    && export JAVA_HOME JRE_HOME PATH CLASSPATH 


CMD ["catalina.sh","run"] 
