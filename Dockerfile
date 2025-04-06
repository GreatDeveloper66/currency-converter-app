# ---- Stage 1: Build ----
    FROM maven:3.9-eclipse-temurin-21 AS build
    WORKDIR /app
    
    # Copy the pom.xml and download dependencies first (use Docker layer caching)
    COPY pom.xml .
    RUN mvn dependency:go-offline
    
    # Copy the rest of the source code
    COPY src ./src
    
    # Package the application
    RUN mvn clean package -DskipTests
    
    # ---- Stage 2: Runtime ----
    FROM eclipse-temurin:21-jdk
    WORKDIR /app
    
    # Copy only the JAR from the build stage
    COPY --from=build /app/target/*.jar app.jar
    
    # Expose the default Spring Boot port
    EXPOSE 8080
    
    # Run the application
    CMD ["java", "-jar", "app.jar"]
    