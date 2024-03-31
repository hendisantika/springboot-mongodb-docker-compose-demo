FROM amazoncorretto:21-alpine-jdk
MAINTAINER Hendi Santika "hendisantika@yahoo.co.id"
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#FROM maven:3.9.6-eclipse-temurin-21-alpine AS build
#
#RUN mkdir /project
#
#COPY . /project
#
## Passed from Github Actions
#ARG GIT_VERSION_TAG=unspecified
#ARG GIT_COMMIT_MESSAGE=unspecified
#ARG GIT_VERSION_HASH=unspecified
#
#WORKDIR /project
#
## You can read these files for the information in your application
#RUN echo $GIT_VERSION_TAG > GIT_VERSION_TAG.txt
#RUN echo $GIT_COMMIT_MESSAGE > GIT_COMMIT_MESSAGE.txt
#RUN echo $GIT_VERSION_HASH > GIT_VERSION_HASH.txt
#
#RUN mvn clean package
#
##FROM adoptopenjdk/openjdk21:eclipse-temurin-21-alpine
##FROM bellsoft/liberica-openjdk-debian:21
##FROM openjdk:21-slim
#FROM amazoncorretto:21-alpine-jdk
#LABEL maintainer="hendisantika@yahoo.co.id"
#
#RUN mkdir /app
#
#RUN addgroup -g 1001 -S hendigroup
#
#RUN adduser -S hendi -u 1001
#
#COPY --from=build /project/target/body-mass-index-0.0.1.jar /app/bmi.jar
#
#WORKDIR /app
#
#RUN chown -R hendi:hendigroup /app
#
#CMD java $JAVA_OPTS -jar bmi.jar
