FROM ubuntu_16.04_ssh_mysql 

COPY ./preparation /preparation
RUN build_deps='sshpass expect perl libdbi-perl libdbd-mysql-perl make' \
    && pack='/preparation' \
    && apt-get update \
    && apt-get -y --force-yes install $build_deps \
    && tar -zxf $pack/mha4mysql-node-0.56.tar.gz -C /opt \
    && cd /opt/mha4mysql-node-0.56 \
    && perl Makefile.PL \
    && make \
    && make install \
    && rm -rf /opt/mha4mysql-node-0.56 \
    && rm -rf /etc/mysql/mysql.conf.d/* && rm -rf /etc/mysql/conf.d/* && rm -rf /etc/mysql/debian.cnf && rm -rf /etc/mysql/debian-start \
    && mkdir /var/run/mysqld && chown mysql.mysql /var/run/mysqld \
    && mv /etc/mysql/mysql.cnf /etc/alternatives/my.cnf

CMD ["/preparation/mysql.py"]
