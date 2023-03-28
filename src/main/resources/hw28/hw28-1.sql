-- Add a new Customer who is supported by manager "Jennings Leslie". Also, add an order for him with a product - '1996 Moto Guzzi 1100i'

SELECT e.employeeNumber INTO @employeeNumber FROM employees e
WHERE e.lastName='Jennings' AND e.firstName='Leslie';

INSERT INTO customers (customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, city, country, salesRepEmployeeNumber, creditLimit) 
VALUES (666, 'SergeyKo', 'Kovalenko', 'Serhii', '0963899999', 'Address', 'Dnipro', 'Ukraine', @employeeNumber, 0.0);

INSERT INTO orders (orderNumber, orderDate, requiredDate, status, customerNumber)
VALUES (11111, '2023-03-28', '2023-04-07', 'In Process', 666);

SELECT p.productCode INTO @productCode FROM products p
WHERE p.productName LIKE '1996 Moto Guzzi 1100i';

INSERT INTO orderdetails (orderNumber, productCode, quantityOrdered, priceEach, orderLineNumber)
VALUES (11111, @productCode, 5, 66.66, 1);