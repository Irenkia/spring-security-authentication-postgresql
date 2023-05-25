-- INSERT IGNORE INTO roles(name) VALUES('ROLE_USER');
-- INSERT IGNORE INTO roles(name) VALUES('ROLE_ADMIN');
-- INSERT IGNORE INTO roles(name) VALUES('ROLE_MODERATOR');

CREATE TYPE e_role AS ENUM ('role_user','role_moderator','role_admin');

CREATE TABLE roles(
id integer primary key,
name e_role length=20);

CREATE TABLE users(
id bigint primary key,
username varchar(20),
email varchar(50),
password varchar(120)
);

CREATE TABLE user_roles(
role_id integer  not null,
user_id bigint not null,
CONSTRAINT FK_ROLE_ID FOREIGN KEY (role_id)
      REFERENCES roles (id),
CONSTRAINT FK_USER_ID FOREIGN KEY (user_id)
      REFERENCES users (id)
);

SELECT * FROM roles;
SELECT * FROM users;
SELECT * FROM user_roles;

INSERT INTO users
VALUES(1,'Iryna','iryna@gmail.com','12345'),
(2,'Irina','irina@gmail.com','23456');

-- DROP table roles;
-- DROP table users;
-- DROP table users_roles;

