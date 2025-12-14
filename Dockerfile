FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/docker-ci-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
