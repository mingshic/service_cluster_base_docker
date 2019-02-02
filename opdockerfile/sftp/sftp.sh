#!/bin/bash

userConfPath="/etc/sftp/users.conf"


if id -u sftp >/dev/null 2>&1; then
    echo "sftp user esists"
else
    useradd -m sftp
    chown root.root /home/sftp
fi

cat $userConfPath | while read line; do
user=`echo $line | awk -F ":" '{print $1}'`
pass=`echo $line | awk -F ":" '{print $2}'`
groupsftp=`echo $line | awk -F ":" '{print $3}'`

if id -u $user >/dev/null 2>&1; then
    echo "$user user exists"
else
    useradd -d /opt/$user -m $user
    echo "$user:$pass" | chpasswd
    chown root.root /opt/$user
    usermod -G sftp $user
    if [ ! -d "/opt/$user/data" ];then
#        chown root.root /home/$user
        mkdir /opt/$user/data
        chown $user:sftp /opt/$user/data
        chmod 775 /opt/$user/data
    else
        chown $user:sftp /opt/$user/data
        chmod 775 /opt/$user/data
        echo "$user data dir exists"
    fi
fi
done

exec /usr/sbin/sshd -D 
