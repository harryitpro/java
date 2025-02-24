package SQL;

/**
 * SQL Query to Find the 2nd Highest Salary from an Employee Table
 * Given an Employee table with the following structure:
 *
 * Id	Name	Salary
 * 1	Alice	5000
 * 2	Bob	7000
 * 3	Carol	6000
 * 4	Dave	7000
 * 5	Eve	5500
 * We need to find the second highest salary.
 *
 * 1️⃣ Using LIMIT and DISTINCT (MySQL, PostgreSQL)
 * sql
 * Copy
 * Edit
 * SELECT DISTINCT Salary
 * FROM Employee
 * ORDER BY Salary DESC
 * LIMIT 1 OFFSET 1;
 * Explanation:
 * DISTINCT Salary → Ensures unique salary values.
 * ORDER BY Salary DESC → Sorts salaries in descending order.
 * LIMIT 1 OFFSET 1 → Skips the highest salary (OFFSET 1) and returns the second highest.
 * ✅ Works in MySQL and PostgreSQL
 */
public class LimitOffset {
    //DISTINCT
    //ORDER BY
    //LIMIT 1 OFFSET 1
    }
