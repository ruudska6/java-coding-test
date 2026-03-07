-- OUT에있는 녀석이 IN에있으면 안됨

select 
    ins.name,
    ins.datetime
    
from animal_ins ins

LEFT JOIN animal_outs outs ON ins.animal_id = outs.animal_id

WHERE outs.animal_id IS NULL

ORDER BY ins.datetime asc

limit 3;