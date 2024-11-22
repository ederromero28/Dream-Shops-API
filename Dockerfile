#IMAGE
FROM maven:3.8.5-openjdk-17 AS build
#JAR
COPY . .
#COMANDO DE INICIO
RUN mvn clean install -DskipTests
FROM openjdk:17-jdk-alpine
COPY --from=build target/dream-shops-0.0.1-SNAPSHOT.jar dream-shops-0.0.1-SNAPSHOT.jar
EXPOSE 9190
ENTRYPOINT ["java","-jar","/dream-shops-0.0.1-SNAPSHOT.jar"]