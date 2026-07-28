SELECT
    count(*), MONTH(TIME) AS MONTH
FROM 
    fish_info
GROUP BY
    MONTH
ORDER BY 
    MONTH