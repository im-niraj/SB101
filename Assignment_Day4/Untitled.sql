CREATE DATABASE question1;
USE question1;
CREATE TABLE CITY(ID INT, NAME VARCHAR(17), COUNTRYCODE VARCHAR(3),DISTRICT VARCHAR(20),POPULATION INT);
INSERT INTO  CITY(ID,NAME,COUNTRYCODE,DISTRICT,POPULATION) VALUES(3878, 'Scottsdale', 'USA', 'Arizona', 202705);
INSERT INTO  CITY(ID,NAME,COUNTRYCODE,DISTRICT,POPULATION) VALUES(3965, 'Corona', 'USA', 'California', 90000),
																 (3973, 'Concord', 'USA', 'California', 121780),
                                                                 (3977, 'Cedar Rapids', 'USA', 'Iowa', 120758),
                                                                 (3982, 'Coral Springs', 'USA', 'Florida', 87456);

SELECT * FROM CITY WHERE POPULATION > 100000;


SELECT SUM(POPULATION) AS CITY_POPULATION FROM CITY WHERE DISTRICT = 'California';

SELECT ROUND(AVG(POPULATION)) AS AVERAGE FROM CITY;

