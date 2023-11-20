FROM openjdk:21-slim

RUN mkdir /myTest && chmod 777 /myTest

WORKDIR /myTest

COPY target/myTest-0.0.1-SNAPSHOT.jar myTest.jar

ENTRYPOINT ["java", "-jar", "myTest.jar"]
