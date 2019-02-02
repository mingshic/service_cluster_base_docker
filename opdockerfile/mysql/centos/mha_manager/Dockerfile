FROM 172.16.1.14:5000/centos_ssh

COPY ./preparation /preparation
RUN build_deps='sshpass expect perl' \
    && sed -n -i 's/UsePAM yes/UsePAM no/gp' /etc/ssh/sshd_config \
    && echo "root:123456" | chpasswd \
    && yum install /preparation/mysql_repo/* -y \
    && yum -y install $build_deps \
    && yum -y install /preparation/mha/* \
    && yum -y install /preparation/mha4mysql-node-0.58-0.el7.centos.noarch.rpm \
    && yum -y install /preparation/mha4mysql-manager-0.58-0.el7.centos.noarch.rpm
    

ENTRYPOINT ["/preparation/mysql.py"]
