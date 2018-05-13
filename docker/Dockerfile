FROM maven
MAINTAINER victor hugo <victorhundo@gmail.com>

EXPOSE 8080

WORKDIR /opt/spring/
VOLUME /config
COPY ./entrypoint.sh /

ENTRYPOINT ["bash", "/entrypoint.sh"]
