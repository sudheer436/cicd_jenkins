FROM openjdk:17
ADD target/cicd-jenkins.jar cicd-jenkins.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "cicd-jenkins.jar"]