select score,
dense_rank()over(order by score desc) As 'rank'
from scores
order by score desc;