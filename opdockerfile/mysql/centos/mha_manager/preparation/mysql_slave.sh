#!/bin/bash


masterip=$1

slave_start() {
    mysql -uroot -p$MYSQL_ROOT_PASSWORD -e "CHANGE MASTER TO MASTER_HOST='$masterip', MASTER_USER='$MYSQL_REPL_USER', MASTER_PASSWORD='$MYSQL_REPL_PASSWORD', MASTER_LOG_FILE='$binlogfile', MASTER_LOG_POS=$position;" 
    mysql -uroot -p$MYSQL_ROOT_PASSWORD -e "start slave;"
    sleep 5
    mysql -uroot -p$MYSQL_ROOT_PASSWORD -e "CREATE USER '$MYSQL_REPL_USER'@'%' IDENTIFIED BY '$MYSQL_REPL_PASSWORD';"
    mysql -uroot -p$MYSQL_ROOT_PASSWORD -e "GRANT REPLICATION SLAVE ON *.* TO '$MYSQL_REPL_USER'@'%';"
    mysql -uroot -p$MYSQL_ROOT_PASSWORD -e "grant replication slave on *.* to '$MYSQL_REPL_USER'@'%' identified by '$MYSQL_REPL_PASSWORD';"
    mysql -uroot -p$MYSQL_ROOT_PASSWORD -e "set global read_only=1;"
}


/etc/init.d/ssh start
binlogfile=`mysql -h $MYSQL_MASTER_CONTAINER -uroot -p$MYSQL_MASTER_ROOT_PASSWORD -e "show master status;" |awk -F " " '{print $1,$2}' |grep -v File |awk -F " " '{print $1}'`
position=`mysql -h $MYSQL_MASTER_CONTAINER -uroot -p$MYSQL_MASTER_ROOT_PASSWORD -e "show master status;" |awk -F " " '{print $1,$2}' |grep -v File |awk -F " " '{print $2}'`
#masterip=`nslookup $MYSQL_MASTER_CONTAINER |tail -n 4 |grep Address |awk -F " " '{print $2}'`

slave_start

#str=$2
#array=(${str//,/ })
#ssh-keygen -t rsa -P '' -f ~/.ssh/id_rsa
#for i in ${array[@]}
#do
#    /preparation/ssh_copy_id.sh root 123456 $i
#done

