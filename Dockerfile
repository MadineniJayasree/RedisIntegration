# Use the official OpenJDK image (Java 21 or 22)
FROM openjdk:22-jdk

# Set working directory inside the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/redisIntegration-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8090
EXPOSE 8090

# Command to run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
