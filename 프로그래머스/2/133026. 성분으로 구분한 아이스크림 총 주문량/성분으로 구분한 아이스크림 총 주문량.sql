-- 코드를 입력하세요
SELECT 
    ingredient_type AS INGREDIENT_TYPE,
    sum(total_order) AS TOTAL_ORDER
FROM
    first_half fh
JOIN icecream_info ii ON fh.flavor = ii.flavor
GROUP BY
    ingredient_type
ORDER BY
    TOTAL_ORDER asc
