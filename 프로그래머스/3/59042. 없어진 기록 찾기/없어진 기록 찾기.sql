-- 코드를 입력하세요
SELECT 
    outs.animal_id, outs.name
FROM
    animal_ins ins
RIGHT JOIN
    animal_outs outs on ins.animal_id = outs.animal_id
WHERE
    ins.animal_id IS NULL