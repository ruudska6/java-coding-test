-- 코드를 입력하세요
SELECT animal_type, COUNT(*)
FROM animal_ins
GROUP BY animal_type
ORDER BY
    CASE 
        WHEN animal_type = 'CAT' THEN 0
        WHEN animal_type = 'DOG' THEN 1
        END;
    