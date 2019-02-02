FROM rmohr/activemq

USER root

COPY ./preparation /preparation
RUN apt-get update \
    && apt-get install python python-jinja2 vim procps -y \
    && chmod 777 /preparation/*


CMD ["/preparation/start.py"] 
