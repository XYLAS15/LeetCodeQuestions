# Write your MySQL query statement below
select customer_id, COUNT(visit_id) AS count_no_trans  from 
Visits LEFT JOIN Transactions using(visit_id)
WHERE transaction_id is NULL 
GROUP BY customer_id