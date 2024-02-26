FROM openjdk:17-jdk-slim-buster
WORKDIR /app

COPY build/libs/* build/lib/

COPY build/libs/k8s-order-management-application-1.0.0.jar build/

WORKDIR /app/build
EXPOSE 8080
ENTRYPOINT java -jar k8s-order-management-application-1.0.0.jar



#FROM tomcat:9-jdk17-openjdk-slim
#
## Copy the WAR file into the webapps directory of Tomcat
#COPY build/libs/k8s-ticket-booking-1.0.0.war /usr/local/tomcat/webapps/
#
## Expose the default Tomcat port (8080)
#EXPOSE 8080
#
## Start Tomcat when the container launches
#CMD ["catalina.sh", "run"]