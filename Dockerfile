
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/java-devops-k8s-project-1.0.0.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

