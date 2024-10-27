# Official openjdk image from Docker Hub
FROM openjdk:21

#copy jar file to container
COPY ./build/libs/sb-ecom-0.0.1-SNAPSHOT.jar sb-ecom-0.0.1-SNAPSHOT.jar

# port on which app will run
EXPOSE 9191

#command to run application
ENTRYPOINT ["java","-jar","sb-ecom-0.0.1-SNAPSHOT.jar"]