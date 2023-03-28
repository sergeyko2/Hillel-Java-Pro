-- Delete customer "Diecast Collectables" and related data

SELECT c.customerNumber INTO @customerNumber FROM customers c
WHERE c.customerName = 'Diecast Collectables';

DELETE FROM orderdetails od
WHERE od.orderNumber IN
(SELECT o.orderNumber FROM orders o
WHERE o.customerNumber = @customerNumber);

DELETE FROM orders
WHERE orderNumber<>0 AND customerNumber = @customerNumber;

DELETE FROM payments
WHERE customerNumber = @customerNumber;

DELETE FROM customers
WHERE customerNumber = @customerNumber;