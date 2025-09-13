# syntax=docker/dockerfile:1

FROM eclipse-temurin:17-jdk-jammy
ADD build/libs/demo-0.0.1-SNAPSHOT.jar  languages.jar
EXPOSE 8080
CMD java -jar languages.jar
