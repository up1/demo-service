DROP TABLE IF EXISTS USERS;

CREATE TABLE USERS
(
    id int(11) NOT NULL AUTO_INCREMENT,
    firstname varchar(100) NOT NULL,
    lastname varchar(100) NOT NULL,
    PRIMARY KEY (id)
);