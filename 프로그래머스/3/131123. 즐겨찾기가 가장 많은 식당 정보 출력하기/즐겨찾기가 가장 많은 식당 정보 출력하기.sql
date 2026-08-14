-- 코드를 입력하세요
SELECT ri.food_type, ri.rest_id, ri.rest_name, ri.favorites
FROM rest_info ri
JOIN (
    SELECT food_type, max(favorites) as max_favorites
    FROM rest_info
    GROUP BY food_type
) max_ri
    ON ri.food_type = max_ri.food_type 
    AND ri.favorites = max_ri.max_favorites

ORDER BY
    ri.food_type desc;