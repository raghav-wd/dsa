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
