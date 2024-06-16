# Write your MySQL query statement below
select product_name, year, price from
Sales LEFT JOIN Product using(product_id)