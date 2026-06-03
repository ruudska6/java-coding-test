-- 코드를 입력하세요
SELECT 
    flavor
FROM
    first_half
WHERE
    total_order >= 3000
    AND flavor IN (select flavor from icecream_info where INGREDIENT_TYPE = 'fruit_based');