#using openjdk 10 as base image
FROM openjdk:10
COPY target/fundtransfer-service.jar /fundtransfer-service.jar
CMD ["java", "-jar","/fundtransfer-service.jar"]
EXPOSE 8005