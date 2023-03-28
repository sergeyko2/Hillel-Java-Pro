-- Update customerName = customerName +' Superstar' for customers that did more than 10 orders

UPDATE customers c
SET c.customerName = CONCAT(customerName, ' Superstar')
WHERE c.customerNumber <> 0 AND c.customerNumber IN 
(SELECT o.customerNumber FROM orders o
GROUP BY o.customerNumber
HAVING count(o.orderNumber) > 10);