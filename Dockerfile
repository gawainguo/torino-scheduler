FROM openjdk:12
COPY target/*.jar scheduler.jar
ENTRYPOINT ["java", "-jar", "/scheduler.jar"]