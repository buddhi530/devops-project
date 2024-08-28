FROM openjdk:8-jdk
EXPOSE 8090
COPY target/devops-project.jar devops-project.jar
ENTRYPOINT ["java","-jar","/devops-project.jar"]
