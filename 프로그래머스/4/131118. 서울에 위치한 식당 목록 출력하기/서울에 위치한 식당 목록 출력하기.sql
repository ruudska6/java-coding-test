-- 코드를 입력하세요
SELECT ri.rest_id, rest_name, food_type, ri.favorites, ri.address, round(avg(rr.review_score), 2) as SCORE
FROM
    rest_info ri
JOIN
    rest_review rr
    ON ri.rest_id = rr.rest_id
WHERE
    ADDRESS LIKE '서울%'
GROUP BY
    ri.rest_id
ORDER BY
    SCORE desc, ri.favorites desc