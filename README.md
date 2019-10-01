# spring-boot-docker
create spring boot docker image and push


creating docker image for spring boot

1) create Dockerfile in root directory of ur spring-boot project.In Dockerfile contains following content
  
  Dockerfile following data

   FROM openjdk:8
   ADD target/spring-boot-docker.jar spring-boot-docker.jar
   EXPOSE 8085
   ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]

2) build the docker file
    
    docker build -f Dockerfile -t spring-boot-docker .
    
3) run docker image
   
   docker run -it -p 8089:8085 --name-ravi-spring-boot-docker spring-boot-docker

4) push docker image into your docker hub
    
    docker login
     Note : enter username and password for dockerhub

    docker tag spring-boot-docker jinkaravi504/spring-boot-docker
    
    docker push jinkaravi504/spring-boot-docker
    
 5)Sonarqube
  mvn sonar:sonar -Dsonar.host.url=http://localhost:8083 -Dsonar.login=8432c0bd97e175aea3a4f38ddca9c10c36a69001
   
