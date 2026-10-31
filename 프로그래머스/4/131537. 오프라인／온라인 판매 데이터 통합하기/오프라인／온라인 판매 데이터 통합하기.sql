-- 코드를 입력하세요
SELECT 
    sales_date,
    product_id,
    user_id,
    sales_amount
FROM
    ONLINE_SALE
WHERE
    YEAR(sales_date) = 2022 AND MONTH(sales_date) = 3

UNION

SELECT 
    sales_date,
    product_id,
    NULL,
    sales_amount
FROM
    OFFLINE_SALE
    
WHERE
    YEAR(sales_date) = 2022 AND MONTH(sales_date) = 3
    
ORDER BY sales_date asc, product_id asc, user_id asc