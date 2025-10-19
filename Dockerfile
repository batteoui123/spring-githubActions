FROM openjdk:17-jdk-slim

WORKDIR /app

ARG jar_FILE=target/*.jar

COPY ${jar_FILE} /app/app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]


