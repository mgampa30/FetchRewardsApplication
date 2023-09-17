FROM openjdk:8
EXPOSE 8080
ADD target/fetch-rewards-docker.jar fetch-rewards-docker.jar
ENTRYPOINT ["java","-jar","/fetch-rewards-docker.jar"]