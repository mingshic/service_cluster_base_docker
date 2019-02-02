#!/bin/bash

path="$1"
LocalIP="$2"
uddiPathFile="$3"
start_file="$path/startServer.sh"
install_context="$path/install-context.properties"
default_domain_file="$path/apps_config/default/domain/domain.xml"
governor_domain_file="$path/apps_config/governor/domain/domain.xml"
workspace_domain_file="$path/apps_config/workspace/domain/domain.xml"

sed -i "s%^LocalIP=.*%LocalIP=$LocalIP%g" $path/apps_config/default/startup.conf
sed -i "s%^LocalIP=.*%LocalIP=$LocalIP%g" $path/apps_config/governor/startup.conf
sed -i "s%^LocalIP=.*%LocalIP=$LocalIP%g" $path/apps_config/test_delivery/startup.conf
sed -i "s%^LocalIP=.*%LocalIP=$LocalIP%g" $path/apps_config/workspace/startup.conf

## 
sed -i "s%^USER_IP=.*%USER_IP=$LocalIP%g" $install_context

## workspace uddi
sed -i "s%<uddiHost>172\.17.*%<uddiHost>$LocalIP</uddiHost>%g" $uddiPathFile

## 
sed -i 's/export JAVA_OPTS="-.*/export JAVA_OPTS="-Xms1g -Xmx2g -XX:MaxPermSize=512m"/g' $start_file


## domain config
echo "" > $default_domain_file
echo '<?xml version="1.0" encoding="UTF-8"?>
<domain name="PrimetonDomain" timestamp="1540532839552" interval="5000" timeout="5000" adminServerIP="'$LocalIP'" adminServerPort="6299" adminAppName="governor">
  <servers>
    <server ip="'$LocalIP'" jndiPort="0" httpPort="0" adminPort="6200" appName="default" isSynchronized="true" name="server_'$LocalIP'_6200" type="tomcat"/>
  </servers>
  <groups/>
</domain>' > $default_domain_file

echo "" > $governor_domain_file
echo '<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<domain adminAppName="governor" adminServerIP="'$LocalIP'" adminServerPort="6299" interval="5000" name="PrimetonDomain" timeout="5000" timestamp="1540532839552">
  <servers>  <server adminPort="6200" appName="default" ip="'$LocalIP'" isSynchronized="true" jndiPort="0" name="server_'$LocalIP'_6200" type="tomcat"/>
    </servers>
  <groups/>
</domain>' > $governor_domain_file

echo "" > $workspace_domain_file
echo '<?xml version="1.0" encoding="UTF-8"?>
<domain name="PrimetonDomain" timestamp="0" interval="5000" timeout="5000" adminServerPort="0">
  <servers/>
  <groups/>
</domain>' > $workspace_domain_file


## tinc config
tinc() {
    tunctl -t tap0
    ifconfig tap0 172.16.3.50 netmask 255.255.255.255
    mkdir /usr/local/etc/tinc/vNet -p
    mkdir /usr/local/etc/tinc/vNet/hosts -p
    mkdir /usr/local/var/run -p
    echo "Name = tinc
Mode = switch
Port = 6656
Interface = tinc" > /usr/local/etc/tinc/vNet/tinc.conf
    /usr/local/sbin/tincd -n vNet -K < /dev/null

}
tinc
