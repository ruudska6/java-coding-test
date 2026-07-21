-- 코드를 입력하세요
SELECT p.product_code, sum(p.price * o.sales_amount) as SALES
FROM 
    product p
JOIN
    offline_sale o on p.product_id = o.product_id
GROUP BY
    product_code
ORDER BY
    SALES desc, p.product_code asc