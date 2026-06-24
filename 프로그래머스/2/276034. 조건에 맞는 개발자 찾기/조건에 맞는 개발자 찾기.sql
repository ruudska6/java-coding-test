-- 코드를 작성해주세요
SELECT
    distinct(id), email, first_name, last_name
FROM 
    developers d
JOIN skillcodes s
    ON
        (d.skill_code & s.code) = s.code
WHERE
    s.name IN ('Python', 'C#')
ORDER BY
    ID ASC;