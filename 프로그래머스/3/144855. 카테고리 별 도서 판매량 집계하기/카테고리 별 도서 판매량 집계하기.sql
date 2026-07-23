-- 코드를 입력하세요
SELECT category AS CATEGORY, sum(sales) AS TOTAL_SALES
FROM 
    book b
JOIN
    book_sales bs 
    ON b.book_id = bs.book_id
WHERE 
    YEAR(sales_date) = 2022 AND MONTH(sales_date) = 1
GROUP BY
    category
ORDER BY 
    category asc;
