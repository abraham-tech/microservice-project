FROM eclipse-temurin:17
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn package -DskipTests
EXPOSE 8761
CMD ["java", "-jar", "target/service-registry-0.0.1-SNAPSHOT.jar"]