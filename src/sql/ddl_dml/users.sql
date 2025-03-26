DESC users;
+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| id    | int          | NO   | PRI | NULL    | auto_increment |
| email | varchar(255) | NO   |     | NULL    |                |
| name  | varchar(100) | NO   |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+

# RECORDS
SELECT * FROM users;
+----+----------------------+----------+
| id | email                | name     |
+----+----------------------+----------+
|  1 | john.doe@example.com | John Doe |
|  2 | jane.doe@example.com | Jane Doe |
|  3 | john.doe@example.com | John Doe |
|  4 | jane.doe@example.com | Jane Doe |
+----+----------------------+----------+

