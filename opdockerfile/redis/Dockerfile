FROM 172.16.1.14:5000/ubuntu_16.04_ssh

ENV LANG C.UTF-8

COPY ./preparation /preparation
RUN apt-get update \
    && apt-get install redis-server ruby rubygems-integration -y \
    && gem install redis 

CMD ["/preparation/redis.sh"]
