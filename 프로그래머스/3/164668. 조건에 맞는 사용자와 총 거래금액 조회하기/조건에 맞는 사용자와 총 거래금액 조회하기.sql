SELECT u.user_id, u.nickname, sum(price) as total_sales
FROM used_goods_board b
JOIN used_goods_user u
    ON b.writer_id = u.user_id
WHERE status = 'DONE'
GROUP BY writer_id
HAVING total_sales >= 700000
ORDER BY
    total_sales asc;