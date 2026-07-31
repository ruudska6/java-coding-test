-- 코드를 입력하세요
SELECT
    animal_type,
    (CASE 
        WHEN name IS NULL THEN 'No name'
        ELSE name
        END
    ) as NAME,
    sex_upon_intake
FROM 
    animal_ins
    