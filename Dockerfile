FROM eclipse-temurin:17-jdk-alpine
WORKDIR /usr/app
COPY target/fetch-rewards-app.jar /usr/app
EXPOSE 8080
CMD ["java","-jar","fetch-rewards-app.jar"]