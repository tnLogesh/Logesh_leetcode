# Write your MySQL query statement below
select i.unique_id,e.name from employees e left join employeeuni i
on e.id=i.id;