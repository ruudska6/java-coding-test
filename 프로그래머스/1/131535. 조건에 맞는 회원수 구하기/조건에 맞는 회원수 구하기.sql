-- 코드를 입력하세요
SELECT count(*) as USERS
FROM user_info
WHERE
    year(joined) = 2021 AND
    age >= 20 AND AGE <= 29;