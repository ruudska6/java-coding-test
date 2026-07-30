-- 코드를 작성해주세요
select e1.id, count(e2.id)
from ecoli_data e1
left join ecoli_data e2
ON e1.id = e2.parent_id
GROUP BY e1.id
ORDER BY   
    e1.id asc;
