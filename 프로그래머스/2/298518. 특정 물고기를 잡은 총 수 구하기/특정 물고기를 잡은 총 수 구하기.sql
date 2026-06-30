SELECT 
    count(*) as FISH_COUNT
FROM
    fish_info fi 
JOIN
    fish_name_info fni on fi.fish_type = fni.fish_type
WHERE
    fish_name IN ('BASS', 'SNAPPER');