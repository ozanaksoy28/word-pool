FROM openjdk:18
ADD target/word-pool.jar word-pool.jar
ENTRYPOINT ["java","-jar","word-pool.jar"]
EXPOSE 8080