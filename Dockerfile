FROM openjdk:17
MAINTAINER habib-wahid
COPY target/spring-docker-demo-0.0.1-SNAPSHOT.jar spring-docker-demo-1.0.jar
ENTRYPOINT ["java", "-jar", "spring-docker-demo-1.0.jar"]