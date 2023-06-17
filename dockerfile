FROM openjdk:20-jdk-slim-buster

MAINTAINER Gaurav

WORKDIR /tmp
VOLUME ["/tmp/log"]
COPY target/nagp-premiere-league-1.0.jar /tmp/nagp-postgres-1.0.jar
ENTRYPOINT ["java", "-jar", "/tmp/nagp-postgres-1.0.jar"]
EXPOSE 8081
