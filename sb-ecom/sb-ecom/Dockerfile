# Official openjdk image from Docker Hub
FROM openjdk:21

# working directory in container
WORKDIR /app

#copy jar file to container
COPY ./build/libs/sb-ecom-0.0.1-SNAPSHOT.jar /app

# port on which app will run
#EXPOSE 9191

#command to run application
CMD ["java","-jar","sb-ecom-0.0.1-SNAPSHOT.jar"]