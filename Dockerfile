FROM openjdk:15
COPY ./target/jmsproject-0.0.1-SNAPSHOT.jar /usr/src/jmsproject/
WORKDIR /usr/src/jmsproject
EXPOSE 8081
CMD ["java","-jar","jmsproject-0.0.1-SNAPSHOT.jar"]