FROM openjdk:17
WORKDIR /app
COPY target/springboot_example_docker-0.0.1-SNAPSHOT.jar springboot_example_docker-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD [ "java", "-jar", "springboot_example_docker-0.0.1-SNAPSHOTT.jar" ]