-- 코드를 입력하세요
SELECT hour(datetime) as HOUR, count(*)
FROM
    animal_outs
GROUP BY
    HOUR
HAVING
    HOUR >= 9 AND HOUR <= 19
ORDER BY 
    HOUR