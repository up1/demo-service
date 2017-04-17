FROM frolvlad/alpine-oraclejdk8:slim
ADD  ./target/user-service.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar app.jar" ]