-- Show employees working in Paris and Tokyo
SELECT e.firstName, e.lastName, o.city FROM employees e
LEFT JOIN offices o ON o.officeCode=e.officeCode
WHERE o.city='Paris' OR o.city='Tokyo';

-- Show employees how many clients they supported (from 0 to ...)
SELECT e.firstName, e.lastName, count(c.customerNumber) as client FROM employees e
LEFT JOIN customers c ON c.salesRepEmployeeNumber = e.employeeNumber
GROUP BY e.firstName, e.lastName
ORDER BY client;

-- Show employees reported to Bondur Gerard
SELECT e.firstName, e.lastName FROM employees e
LEFT JOIN employees bg ON bg.employeeNumber = e.reportsTo
WHERE bg.firstName = 'Gerard' AND bg.lastName = 'Bondur';

-- Show employees that helped less than five clients
SELECT e.firstName, e.lastName, count(c.customerNumber) as client FROM employees e
LEFT JOIN customers c ON c.salesRepEmployeeNumber = e.employeeNumber
GROUP BY e.firstName, e.lastName
HAVING client <= 5
ORDER BY client;

-- Show all employees with not Shipped orders
SELECT e.firstName, e.lastName FROM employees e
LEFT JOIN customers c ON c.salesRepEmployeeNumber = e.employeeNumber
LEFT JOIN orders o ON o.customerNumber = c.customerNumber
WHERE o.status != 'Shipped'
GROUP BY e.firstName, e.lastName;

-- Show the best and the worst employees (by the count of the Shipped orders)
with t (firstName, lastName, c) as
(SELECT e.firstName, e.lastName, count(*) as c FROM employees e
LEFT JOIN customers c ON c.salesRepEmployeeNumber = e.employeeNumber
LEFT JOIN orders o ON o.customerNumber = c.customerNumber
WHERE o.status = 'Shipped'
GROUP BY e.firstName, e.lastName)
SELECT * FROM t
WHERE t.c = (SELECT MAX(t.c) FROM t)
UNION
SELECT * FROM t
WHERE t.c = (SELECT MIN(t.c) FROM t);



