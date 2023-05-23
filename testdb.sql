INSERT IGNORE INTO roles(name) VALUES('ROLE_USER');
INSERT IGNORE INTO roles(name) VALUES('ROLE_ADMIN');

CREATE TABLE users(
id integer primary key,
username varchar(20),
email varchar(50),
password varchar(120)
);

INSERT INTO users
VALUES(1,'Iryna','iryna@gmail.com','12345'),
(2,'Irina','irina@gmail.com','23456');

SELECT * FROM users;
