

SELECT Item FROM Orders 
WHERE id = ALL
(SELECT ID FROM Orders
WHERE quantity > 50);

SELECT item -- single comment  
FROM Orders -- another single comment
WHERE id 
ALL = (SELECT ID FROM Orders
WHERE quantity > 25);

SELECT Item, Price * 
(QtyInStock + IFNULL(QtyOnOrder, 0)) 
FROM Orders;





