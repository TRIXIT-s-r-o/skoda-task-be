FROM maven:latest as builder
COPY pom.xml /build/pom.xml
RUN cd /build && ls -la && mvn dependency:resolve

FROM builder as compiler
COPY . /build
RUN cd /build && ls -la && mvn clean package -DskipTests

FROM openjdk
COPY --from=compiler /build/target/*.jar ./

EXPOSE 8080
ENTRYPOINT java -jar skoda-tendr-challenges-and-rewards-0.0.1-SNAPSHOT.jar