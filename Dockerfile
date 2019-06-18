#Alpine Image Base
FROM alpine:latest

#User used
USER root

#Get Updated the platform
RUN apk update
RUN apk fetch openjdk8
RUN apk add openjdk8

#Setting The Working Directory
WORKDIR ~/java

#Coping The Necesary Files
COPY target/customers-0.1.jar customers-0.1.jar

#Run the Java Jar
CMD ["java","-jar","customers-0.1.jar"]


