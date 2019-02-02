FROM debian:jessie 

COPY ./preparation /preparation
RUN build_deps='ssh sshpass expect supervisor perl libdbi-perl libdbd-mysql-perl libconfig-tiny-perl liblog-dispatch-perl libparallel-forkmanager-perl make' \
    && pack='/preparation' \
    && mv /etc/apt/sources.list /etc/apt/sources.list.bak \
    && mv $pack/sources.list /etc/apt/sources.list \
#    && apt-get clean \
    && apt-get update \
    && apt-get -y --force-yes install $build_deps \
    && apt-get purge -y --auto-remove $buil_deps \
    && sed -n -i 's/UsePAM yes/UsePAM no/gp' /etc/ssh/sshd_config \
    && tar -zxf $pack/mha4mysql-node-0.56.tar.gz -C /opt \
    && cd /opt/mha4mysql-node-0.56 \
    && perl Makefile.PL \
    && make \
    && make install \
    && tar -zxf $pack/mha4mysql-manager-0.56.tar.gz -C /opt \
    && cd /opt/mha4mysql-manager-0.56 \
    && perl Makefile.PL \
    && make \
    && make install \
    && rm -rf /opt/mha4mysql-* \
    && /etc/init.d/ssh start \
    && echo "root:123456" | chpasswd \
    && mkdir /etc/masterha \
    && mkdir -p /masterha/app 

CMD ["masterha_manager", "--conf=/etc/masterha/app.cnf"]

