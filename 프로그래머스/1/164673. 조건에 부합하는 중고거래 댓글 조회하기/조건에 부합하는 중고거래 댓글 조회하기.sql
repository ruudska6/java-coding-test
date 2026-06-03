-- 코드를 입력하세요
SELECT
    ugb.title, ugb.board_id, ugr.reply_id, ugr.writer_id, ugr.contents, DATE_FORMAT(ugr.created_date, '%Y-%m-%d') AS CREATED_DATE
FROM 
    used_goods_board ugb
JOIN
    used_goods_reply ugr ON ugb.board_id = ugr.board_id
WHERE
    YEAR(ugb.created_date) = 2022 AND MONTH(ugb.created_date) = 10
ORDER BY
    ugr.created_date asc, title asc;
    

    