-- 코드를 입력하세요
SELECT sales_date, product_id, user_id, sales_amount
FROM (
    SELECT user_id, product_id, sales_amount, sales_date
    FROM
        online_sale
    UNION 

    select NULL, product_id, sales_amount, sales_date
    FROM 
        offline_sale
) AS sales

WHERE 
    YEAR(sales_date) = 2022 AND MONTH(sales_date) = 3 
ORDER BY
    sales_date asc, product_id asc, user_id asc 
