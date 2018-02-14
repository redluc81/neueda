Docker version 17.12.0-ce on Ubuntu 16.04 LTS

- Launch the Maven goal using the docker maven plugin
     
      mvn clean package docker:build
     
- Build the image using the Dockerfile is (the . at the end is the current path) 
     
      docker build -t <image-name> .
     
- Publish the image in a repository you have to have an account on 
     
      https://hub.docker.com

- Login

      docker login

- Tag the image

      docker tag <image-name> <username>/<repository>:<tag>

- Push the image in the registry
 
      docker push <username>/<repository>:<tag>

- See all the images:

      docker images 

- Delete an image:

      docker rmi <image-id>

- See all containres
    
      docker container ps

- Stop a container
   
      docker stop <container-id>       


