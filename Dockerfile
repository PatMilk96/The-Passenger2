FROM openjdk:15
COPY . /tmp
WORKDIR /tmp
CMD java -jar Passenger2-1.0-SNAPSHOT.jar
VOLUME /my/project/dir:/passenger