//Creating and adding into the table
CREATE TABLE IF NOT EXISTS People(id int PRIMARY KEY AUTO_INCREMENT, Name varchar(255), Rating int);
TRUNCATE TABLE People;
INSERT INTO People(Name, Rating) VALUES('Raghav', 6);
INSERT INTO People(Name, Rating) VALUES('Isabel', 10);
SELECT * FROM People
