# Use the official Maven image with OpenJDK 17
FROM maven:3.8.5-openjdk-17

# Set the working directory
WORKDIR /app

# Copy the Maven configuration (pom.xml) into the container
COPY pom.xml .

# Download dependencies for offline use
RUN mvn dependency:go-offline -B

# Copy the source code into the container
COPY src ./src

# Build the application, skipping tests
RUN mvn package -DskipTests

# Expose the application port
EXPOSE 8080
CMD ["java", "-jar", "target/department-service-0.0.1-SNAPSHOT.jar"]