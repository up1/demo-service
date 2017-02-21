# Demo of spring boot with mysql database

Step 1 :: Start service at port 9001
```
$cd user-service
$mvn clean install  && java -jar ./target/user-service.jar
```

Step 2 :: Start web application at port 9000
```
$cd user-service
$mvn spring-boot:run -Dserver.port=9000
```
