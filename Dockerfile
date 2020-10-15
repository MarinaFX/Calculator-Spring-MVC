FROM tomcat:8.0

LABEL maintainer="github.com/MarinaFX"

COPY ./build/libs/Calculator-1.0.0.war /usr/local/tomcat/webapps/

EXPOSE 80

CMD ["catalina.sh", "run"]