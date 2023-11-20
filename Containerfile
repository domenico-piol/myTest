FROM openjdk:21-slim

RUN mkdir /myTest && \
    chmod 777 /myTest && \
    adduser \
      --no-create-home \
      --system \
      --shell /usr/sbin/nologin \
      mytest-user 

USER mytest-user

WORKDIR /myTest

COPY target/myTest-0.0.1-SNAPSHOT.jar myTest.jar

ENTRYPOINT ["java", "-jar", "myTest.jar"]
