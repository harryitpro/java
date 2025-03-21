SELECT Employees.name, Employees.salary, Departments.name AS department
FROM Employees
JOIN Departments ON Employees.department = Departments.name;
