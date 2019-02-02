FROM 172.16.1.14:5000/ubuntu_16.04_ssh

ENV LANG C.UTF-8 

COPY ./sshd_config /etc/ssh/sshd_config
COPY ./sftp.sh /sftp.sh
#COPY ./entrypoint /entrypoint
#COPY ./create-sftp-user /usr/local/bin/create-sftp-user
#RUN chmod 777 /entrypoint #&& chmod 777 /usr/local/bin/create-sftp-user
RUN chmod 777 /sftp.sh #&& chmod 777 /usr/local/bin/create-sftp-user

#ENTRYPOINT ["/sftp.sh"]
ENTRYPOINT ["/sftp.sh"]
