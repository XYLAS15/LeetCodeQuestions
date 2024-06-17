# Write your MySQL query statement below
SELECT e.name,b.bonus FROM Employee AS e
LEFT JOIN Bonus AS b using (empId)
 WHERE  bonus < 1000 or bonus is null;