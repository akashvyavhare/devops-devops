FROM openjdk:11
EXPOSE 8080
ADD target/devops-devops.jar devops-devops.jar
ENTRYPOINT [ "java","-jar","devops-devops.jar" ]