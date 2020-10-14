FROM tomcat:8.0
MAINTAINER @https://github.com/MarinaFX

COPY /build/libs/Calculator-1.0.0.war /usr/local/tomcat/webapps/
CMD docker exec -it calculator bash
RUN ls -la usr/local/tomcat/webapps/
CMD bin/catalina.sh start
CMD cat logs/catalina.out
CMD exit

EXPOSE 80