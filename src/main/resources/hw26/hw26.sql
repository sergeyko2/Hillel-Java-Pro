SELECT * FROM offices o
where o.officeCode=4 or o.officeCode=5 or o.officeCode=6 or o.officeCode=7;

SELECT * FROM offices o
where o.officeCode IN (4,5,6,7);

SELECT * FROM offices o
where o.officeCode between 4 AND 7;


SELECT p.productName FROM products p
WHERE p.productName LIKE '1936%';

SELECT * FROM products p
WHERE (p.productVendor='Motor City Art Classics' OR p.productVendor='Exoto Designs') AND p.productScale='1:24';

SELECT * FROM orders o
WHERE o.shippedDate IS NULL;

SELECT * FROM offices o
ORDER BY o.city DESC;

SELECT distinct p.productVendor FROM products p
ORDER BY p.productVendor ASC; 