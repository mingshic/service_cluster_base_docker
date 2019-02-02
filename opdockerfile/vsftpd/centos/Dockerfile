FROM 172.16.1.14:5000/centos_ssh

ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8

COPY ./preparation/vsftpd /etc/pam.d/vsftpd
COPY ./preparation /preparation

RUN yum install vsftpd -y \
    && useradd -d /home/vsftpd -s /sbin/nologin vsftpd \
    && chmod 777 /preparation/* \
    && mkdir /opt/vsftpd/data -p && chown vsftpd.vsftpd /opt/vsftpd/data


CMD ["/bin/bash"] 
