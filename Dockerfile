FROM eclipse-temurin:21
WORKDIR /app
COPY target/javapplication-app-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
