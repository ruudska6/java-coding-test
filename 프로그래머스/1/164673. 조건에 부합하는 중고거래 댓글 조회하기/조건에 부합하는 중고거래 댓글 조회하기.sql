-- 코드를 입력하세요
SELECT ugb.title, ugb.board_id, reply_Id, ugr.writer_id, ugr.contents, ugr.created_date
FROM 
    used_goods_board ugb
JOIN
    used_goods_reply ugr
    ON ugb.board_id = ugr.board_id
WHERE
    YEAR(ugb.created_date) = 2022 AND MONTH(ugb.created_date) = 10
ORDER BY
    ugr.created_date asc, title asc