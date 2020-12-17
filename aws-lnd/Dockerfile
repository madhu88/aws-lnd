FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/aws-lnd-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} aws-lnd-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","aws-lnd-0.0.1-SNAPSHOT.jar"]