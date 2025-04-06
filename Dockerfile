# Stage 1: Build the application
FROM maven:3.8.6-openjdk-11-slim AS build

WORKDIR /app

# Copy the pom.xml and src/ to the container
COPY pom.xml .
COPY src /app/src

# Run Maven to build the application and produce the jar file
RUN mvn clean package -DskipTests

# Stage 2: Create the final image
FROM eclipse-temurin:11-jdk-slim

WORKDIR /app

# Copy the JAR file from the previous stage
COPY --from=build /app/target/currency-converter-app-0.0.1-SNAPSHOT.jar /app/currency-converter-app.jar

# Run the JAR file when the container starts
ENTRYPOINT ["java", "-jar", "currency-converter-app.jar"]
EXPOSE 8080