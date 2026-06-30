SELECT 
    id AS ID, length AS LENGTH
FROM
    fish_info
ORDER BY 
    length desc, id asc
LIMIT 10;