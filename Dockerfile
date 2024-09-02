FROM openjdk:17-jdk-alpine

COPY target/spring-boot-practice-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]