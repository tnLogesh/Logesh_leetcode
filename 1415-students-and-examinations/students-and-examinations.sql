# Write your MySQL query statement below
select s.student_id,s.student_name,sj.subject_name,count(e.student_id) as attended_exams
from students s cross join subjects sj left join examinations e
on e.subject_name=sj.subject_name and e.student_id=s.student_id 
group by s.student_id,sj.subject_name
order by s.student_id,sj.subject_name