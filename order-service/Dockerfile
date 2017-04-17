FROM frolvlad/alpine-oraclejdk8:slim
ADD  ./target/order-service.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar app.jar" ]