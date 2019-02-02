
FROM centos_eos:latest
        
ENV platform_path /app/primeton/platform
ENV shell_path /app/shell
ENV workspace_uddi /app/tomcat-7.0.68/webapps/workspace/WEB-INF/classes/uddi-address.xml
ENV LANG en_US.UTF-8    
ENV LANGUAGE en_US:en    
ENV LC_ALL en_US.UTF-8

RUN mkdir -p $shell_path && mkdir -p $platform_path

COPY . /app/shell
COPY nux-misc.repo /etc/yum.repos.d

RUN yum --enablerepo=nux-misc install -y tunctl && yum install -y \
        gcc \
        zlib-devel \
        lzo \
        lzo-devel \
        openssl-devel && cd $shell_path && tar xf $shell_path/tinc-1.0.30.tar.gz && cd tinc-1.0.30 && ./configure && make && make install


#EXPOSE 80 8029 6200

CMD ["python","/app/shell/formal_startup.py","$shell_path","$platform_path","$workspace_uddi"]
