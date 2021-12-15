FROM openjdk:8-alpine
MAINTAINER "Mohsen Ahmadinejad"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} atm-client.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/atm-client.jar"]