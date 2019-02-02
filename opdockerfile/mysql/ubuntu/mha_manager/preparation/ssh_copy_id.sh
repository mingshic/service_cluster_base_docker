#!/usr/bin/expect

set timeout 10
set username [lindex $argv 0]
set password [lindex $argv 1]
set hostname [lindex $argv 2]
spawn ssh-copy-id -i /root/.ssh/id_rsa.pub $username@$hostname
expect {
        "Are you sure you want to continue connecting (yes/no)?" {
        send "yes\r"
        expect "password:"
            send "$password\r"
        }
        "password:" {
            send "$password\r"
        }
        "Now try logging into the machine"{
            #do nothing
        }
    }
expect eof
