
# ==========================
# Stage 1: Build Stage
# ==========================
FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /app

# Copy Maven project files
COPY pom.xml .

# Download dependencies
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests


# ==========================
# Stage 2: Run Stage
# ==========================
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy generated JAR from build stage
COPY --from=build /app/target/Calculator-1.0-SNAPSHOT.jar app.jar

# Run Java application
ENTRYPOINT ["java", "-jar", "app.jar"]
