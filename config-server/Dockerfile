# Use the Eclipse Temurin base image
FROM eclipse-temurin:17

# Set the working directory
WORKDIR /app

# Install Maven
RUN apt-get update && apt-get install -y maven && rm -rf /var/lib/apt/lists/*

# Copy the Maven configuration (pom.xml) into the container
COPY pom.xml .

# Download dependencies for offline use
RUN mvn dependency:go-offline -B

# Copy the source code into the container
COPY src ./src

# Build the application, skipping tests
RUN mvn package -DskipTests

# Expose the application port
EXPOSE 8888

# Specify the command to run the application
CMD ["java", "-jar", "target/config-server-0.0.1-SNAPSHOT.jar"]
