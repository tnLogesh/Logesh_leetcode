# Write your MySQL query statement below
select query_name,
round(avg(rating * 1.0 / position), 2) AS quality,
round(sum(rating<3)*100/count(query_name),2)as poor_query_percentage
from queries
group by query_name