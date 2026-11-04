-- 코드를 작성해주세요
SELECT a.id, count(b.parent_id) 
FROM
    ecoli_data a
LEFT JOIN ecoli_data b
    ON a.id = b.parent_id
GROUP BY a.ID