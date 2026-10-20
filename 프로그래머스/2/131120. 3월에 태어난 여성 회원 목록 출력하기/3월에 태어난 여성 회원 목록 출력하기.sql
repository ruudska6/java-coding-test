-- 코드를 입력하세요
SELECT member_id, member_name, gender, date_of_birth AS "DATE_OF_BIRTH"
FROM
    member_profile
WHERE
    month(date_of_birth) = 3 
    AND gender = 'W'
    AND TLNO IS NOT NULL
ORDER BY
    member_id