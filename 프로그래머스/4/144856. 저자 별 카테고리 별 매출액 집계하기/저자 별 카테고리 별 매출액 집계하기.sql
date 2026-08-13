-- 코드를 입력하세요
SELECT a.author_id, author_name, category, sum(b.price * bs.sales) as TOTAL_SALES
FROM
    book b
JOIN
    author a
    ON b.author_id = a.author_id
JOIN
    book_sales bs
    ON b.book_id = bs.book_id

WHERE   
    YEAR(bs.sales_date) = '2022' AND
    MONTH(bs.sales_date) = '1'
GROUP BY
    a.author_id, b.category
ORDER BY
    a.author_id asc, b.category desc;
