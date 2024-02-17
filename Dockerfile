FROM maven:3.8.3-openjdk-17 AS builder

WORKDIR /app
COPY pom.xml .
RUN mvn -B dependency:go-offline
COPY src ./src
RUN mvn clean
RUN mvn deploy -DskipTests=true -DaltDeploymentRepository=internal.repo::default::file:/root/.m2/repository

FROM openjdk:17-jdk-alpine
WORKDIR /app

COPY --from=builder /app/target/proyecto-reactivo.jar /app/proyecto-reactivo.jar

CMD ["java", "-jar", "proyecto-reactivo.jar"]
