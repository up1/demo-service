# User service

docker container run  -d --name mysql-user  -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=user  mysql:latest
docker container run  -d --name user-service --link mysql-user -p 9001:9001 user-service

# Order service

docker run  -d --name  mysql-order  -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=order  mysql:latest
docker container run  -d --name order-service --link mysql-order --link user-service -p 9002:9001 order-service