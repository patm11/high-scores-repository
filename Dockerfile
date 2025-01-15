FROM openjdk:14
ARG JAR_FILE
COPY ${JAR_FILE} /usr/src/app.jar
WORKDIR /usr/src
CMD ["java", "-jar", "app.jar"]