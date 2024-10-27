# Official openjdk image from Docker Hub
FROM openjdk:21

# working directory in container
#WORKDIR /app

#copy jar file to container
COPY ./sb-ecom/sb-ecom/build/libs/sb-ecom-0.0.1-SNAPSHOT.jar sb-ecom-0.0.1-SNAPSHOT.jar

# port on which app will run
EXPOSE 8080

#command to run application
ENTRYPOINT ["java","-jar","/sb-ecom-0.0.1-SNAPSHOT.jar"]