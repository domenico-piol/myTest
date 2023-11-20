FROM openjdk:21-slim

COPY target/myTest-0.0.1-SNAPSHOT.jar myTest.jar

ENTRYPOINT ["java", "-jar", "/myTest.jar"]
