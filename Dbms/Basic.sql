-- //Creating and adding into the table
CREATE TABLE IF NOT EXISTS People(id int PRIMARY KEY AUTO_INCREMENT, Name varchar(255), Rating int);
TRUNCATE TABLE People;
INSERT INTO People(Name, Rating) VALUES('Raghav', 6);
INSERT INTO People(Name, Rating) VALUES('Lebasi', 10);
SELECT * FROM People

-- //Rank ( Rank= 1, 1, 3, 4, 4, 6 and DENSE_RANK= 1, 1, 2, 3, 3, 4)
SELECT Score, Rank() OVER (ORDER BY Score DESC) AS 'Rank' FROM Scores
SELECT Score, DENSE_Rank() OVER (ORDER BY Score DESC) AS 'Rank' FROM Scores 

-- Update
UPDATE People
SET Name = 'Devansh'
WHERE Name = 'Raghav'

-- Delete
DELETE FROM People -- Deletes all records while table structure, attributes, and indexes will be intact
DELETE FROM People WHERE Name = 'Raghav'

-- Check constraint (throws ER_CONSTRAINT_FAILED if inserted value is not in given contraint)
CREATE TABLE if NOT exists Employee(eid integer, ename varchar(40), rating integer, CHECK(rating<=13) );

-- IN The IN operator allows you to specify multiple values in a WHERE clause also a shorthand for multiple OR conditions
SELECT * FROM Customers -- selects all customers that are from the same countries as the suppliers
WHERE Country IN (SELECT Country FROM Suppliers);

-- Limit ( Limit <number1>(opt), <number2> => where number1 is index of row from beginning(starts from 0) and number2 is number of rows to be returned from number1 default is 0
SELECT * from employees ORDER by salary DESC limit 3 -- return first 3 rows
SELECT * from employees ORDER by salary DESC limit 0, 1 -- gets the first row

-- Window Functions ( Adding OVER, on aggregate function designates it as a window function) 
  -- SELECT coulmn_name1, window_function(cloumn_name2), OVER([PARTITION BY column_name1] [ORDER BY column_name3]) AS new_column FROM table_name;
SELECT sum(salary) over() from employees -- every row has sum
