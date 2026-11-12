
# ==========================
# Stage 1: Build Stage
# ==========================
FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /app

# Copy Maven project
COPY pom.xml .

# Download dependencies
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build Maven application
RUN mvn clean package -DskipTests


# ==========================
# Stage 2: Run Stage
# ==========================
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy generated JAR file
COPY --from=build /app/target/Calculator-0.0.1-SNAPSHOT.jar app.jar

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]
