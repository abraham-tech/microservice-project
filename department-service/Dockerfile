FROM eclipse-temurin:17
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn package -DskipTests
EXPOSE 8081
CMD ["java", "-jar", "target/department-service-0.0.1-SNAPSHOT.jar"]