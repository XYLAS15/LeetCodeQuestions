# Write your MySQL query statement below
select firstName, lastName, city , state from 
person AS p 
LEFT JOIN Address AS a
on p.personID = a.personID