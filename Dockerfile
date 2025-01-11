FROM openjdk:21-jdk
WORKDIR /app
COPY target/tc-verificator-service-0.0.1-SNAPSHOT.jar /app/tc-verificator-service-0.0.1-SNAPSHOT.jar
COPY pom.xml /app/pom.xml
EXPOSE 8080
CMD ["java", "-jar", "tc-verificator-service-0.0.1-SNAPSHOT.jar"]