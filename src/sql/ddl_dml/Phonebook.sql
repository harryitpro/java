-- create a new database
CREATE DATABASE phonebook_db;

-- DCL , create user
CREATE USER 'phonebook_user'@'localhost' IDENTIFIED BY 'password123';
GRANT ALL PRIVILEGES ON phonebook_db.* TO 'phonebook_user'@'localhost';
FLUSH PRIVILEGES;

--
