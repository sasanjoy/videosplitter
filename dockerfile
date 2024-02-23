# Use an official OpenJDK 11 runtime as a base image
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory in the container
WORKDIR /app

# Copy the packaged Spring Boot JAR file into the container
COPY build/libs/videosplitter-0.0.1-SNAPSHOT.jar /app/videosplitter-0.0.1-SNAPSHOT.jar

# Expose the port your Spring Boot application will run on (adjust if necessary)
EXPOSE 7070

# Define environment variables if needed
# ENV SPRING_PROFILES_ACTIVE=production

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "videosplitter-0.0.1-SNAPSHOT.jar"]
