DESCRIBE employees;
+------------+---------------+------+-----+---------+----------------+
| Field      | Type          | Null | Key | Default | Extra          |
+------------+---------------+------+-----+---------+----------------+
| id         | int           | NO   | PRI | NULL    | auto_increment |
| name       | varchar(100)  | NO   |     | NULL    |                |
| email      | varchar(255)  | NO   | UNI | NULL    |                |
| location   | varchar(100)  | YES  |     | NULL    |                |
| salary     | decimal(10,2) | NO   |     | NULL    |                |
| manager_id | int           | YES  | MUL | NULL    |                |
+------------+---------------+------+-----+---------+----------------+

#RECORDS
SELECT * FROM employees;
+----+---------------+---------------------+-------------+----------+------------+
| id | name          | email               | location    | salary   | manager_id |
+----+---------------+---------------------+-------------+----------+------------+
|  1 | Alice Johnson | alice@example.com   | New York    | 75000.00 |       NULL |
|  2 | Bob Smith     | bob@example.com     | Los Angeles | 65000.00 |          1 |
|  3 | Charlie Brown | charlie@example.com | Chicago     | 70000.00 |          1 |
+----+---------------+---------------------+-------------+----------+------------+

-- CREATE TABLE
CREATE TABLE employees (
         id INT AUTO_INCREMENT PRIMARY KEY,
         name VARCHAR(100) NOT NULL,
         email VARCHAR(255) UNIQUE NOT NULL,
         location VARCHAR(100),
         salary DECIMAL(10,2) NOT NULL,
         manager_id INT,
         FOREIGN KEY (manager_id) REFERENCES employees(id) ON DELETE SET NULL
     );

#INSERT
INSERT INTO employees (name, email, location, salary, manager_id) VALUES
     ('Alice Johnson', 'alice@example.com', 'New York', 75000.00, NULL),
     ('Bob Smith', 'bob@example.com', 'Los Angeles', 65000.00, 1),
     ('Charlie Brown', 'charlie@example.com', 'Chicago', 70000.00, 1);

INSERT INTO employees (name, email, location, salary, manager_id) VALUES
     ('Alice Brown', 'alice@example.com', 'San Francisco', 85000.00, NULL);