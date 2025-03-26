-- How do you find duplicate records in a table
SELECT email, COUNT(*)
FROM employees
GROUP BY email
HAVING COUNT(*) > 1;

/*
output:
+-------------------+----------+
| email             | COUNT(*) |
+-------------------+----------+
| alice@example.com |        2 |
+-------------------+----------+
1 row in set (0.00 sec)
*/