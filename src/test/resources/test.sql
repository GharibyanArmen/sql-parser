SELECT Student_ID FROM STUDENT;
	
SELECT * FROM STUDENT;
	
SELECT EMP_ID, NAME FROM EMPLOYEE_TBL WHERE EMP_ID = '0000';

SELECT EMP_ID, LAST_NAME FROM EMPLOYEE
WHERE CITY = 'Seattle' ORDER BY EMP_ID;

SELECT EMP_ID, LAST_NAME FROM EMPLOYEE_TBL
WHERE CITY = 'INDIANAPOLIS' ORDER BY EMP_ID asc;
	
SELECT Name, Age FROM Patients WHERE Age > 40
GROUP BY Name, Age ORDER BY Name;

SELECT COUNT(price), price FROM orders 
WHERE price < 70 GROUP BY price ORDER BY price;

SELECT COUNT(CustomerID), Country FROM Customers GROUP BY Country;

SELECT SUM(Salary)FROM Employee WHERE Emp_Age < 30;

SELECT AVG(Price)FROM Products;

SELECT * From Customers WHERE Name LIKE 'Herb%';

SELECT ID FROM Orders WHERE
Date BETWEEN ‘01/12/2018’ AND ‘01/13/2018’;

SELECT ID FROM Customers INNER
JOIN Orders ON Customers.ID = Orders.ID;

SELECT Item AS item_description FROM Orders;



SELECT Name, Birthday, Phone, 
Address, Zip FROM Customers;

SELECT Name FROM Customers WHERE EXISTS 
(SELECT Item FROM Orders 
WHERE Customers.ID = Orders.ID AND Price < 50);

SELECT Name FROM Customers WHERE Customers.Item in 
(SELECT Item FROM Orders 
WHERE Customers.ID = Orders.ID AND Price < 50);

SELECT COUNT(ID), Region
FROM Customers
GROUP BY Region
HAVING COUNT(ID) > 0;


select * from (Select * from Employee A order by rowid desc) where rownum <=8;

SELECT eno,
       empname,
       dtno,
       salary,
       MIN(salary)  AS min_result
FROM   employee;

SELECT price
FROM   sales_order
ORDER BY price;

SELECT STDDEV(salary) AS stddev_salary,
       STDDEV_POP(salary) AS pop_salary,
       STDDEV_SAMP(salary) AS samp_salary
FROM   employee;

select  * 
from 
(
     select * 
     from dbo.transaction_unrated 
        where transaction_date >= '2012/05/01' 
            and transaction_date < '2012/06/01' 
) rsQuery1  
 JOIN 
(
     select * 
     from dbo.transaction_rated 
        where transaction_date >= '2012/05/01' 
            and transaction_date < '2012/06/01' 
            and mapping_entity_id = 1
) rsQuery2 ON rsQuery1.cst_id = rsQuery2.unrated_transaction_id ;







