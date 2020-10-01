# FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
# COPY pom.xml /build/
# COPY src /build/src/
# WORKDIR /build/
# RUN mvn package



FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/product-ms1-0.0.1-SNAPSHOT.jar

WORKDIR /opt/app

# cp target/product-ms1-0.0.1-SNAPSHOT.jar /opt/app/app.jar
#COPY --from=MAVEN_BUILD /build/target/product-ms1-0.0.1-SNAPSHOT.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]


#docker build -t product-ms1:1.0 .
#docker run -d -p 8081:8080 -t product-ms1:1.0
#docker run -d -p 80:8080 -t product-ms1:1.0
#docker run -d -p 443:8443 -t product-ms1:1.0