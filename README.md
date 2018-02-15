A Spring Boot app with Docker version 17.12.0-ce on Ubuntu 16.04 LTS

List of Docker commands:

- Launch the Maven goal using the docker spotify maven plugin
     
      mvn clean package docker:build
     
- Build the image using the Dockerfile is (the . at the end is the current path) 
     
      docker build -t <image-name> .
     
- To publish the image in a repository you have to have an account on 
     
      https://hub.docker.com

- Login and insert your credentials

      docker login

- Tag the image

      docker tag <image-name> <username>/<repository>:<tag>

- Push the image in the registry
 
      docker push <username>/<repository>:<tag>

- See all the images:

      docker images 

- Delete an image:

      docker rmi <image-id>
      
- Delete all images

       docker rmi $(docker images -q)

- See all containres
    
      docker container ps

- Stop a container
   
      docker stop <container-id> 
      
- Remove all containers

      docker rm $(docker ps -a -q) 
 
  
 - Make your machine a node manager
 
       docker swarm init
       
  - Deploy the services configured in a docker-compoose.yml
   
       docker stack deploy -c docker-compose.yml <app_name> 
   
   - See the services running
   
       docker service ls
   
   - Remove the service stack
   
       docker stack rm <app_name>
          
   -  Exit from the node manager
   
       docker swarm leave -f              


