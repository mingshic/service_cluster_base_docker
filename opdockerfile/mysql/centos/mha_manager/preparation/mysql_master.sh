#!/bin/bash


master_start() {
    mysql -uroot -p$MYSQL_ROOT_PASSWORD -e "flush privileges;"
    mysql -uroot -p$MYSQL_ROOT_PASSWORD -e "CREATE USER '$MYSQL_REPL_USER'@'%' IDENTIFIED BY '$MYSQL_REPL_PASSWORD';"
    mysql -uroot -p$MYSQL_ROOT_PASSWORD -e "GRANT REPLICATION SLAVE ON *.* TO '$MYSQL_REPL_USER'@'%';"
}


/etc/init.d/ssh start
master_start


sleep 35
str=$1
array=(${str//,/ })
ssh-keygen -t rsa -P '' -f ~/.ssh/id_rsa
for i in ${array[@]}
do
    echo $i
    /preparation/ssh_copy_id.sh root 123456 $i
done
