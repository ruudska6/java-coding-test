-- 코드를 작성해주세요


SELECT fi.id as 'ID', fni.fish_name as 'FISH_NAME', fi.length as 'LENGTH'

FROM fish_info fi

JOIN fish_name_info fni
ON fi.fish_type = fni.fish_type

WHERE (fi.fish_type, fi.length) IN (SELECT fish_type, MAX(length) FROM fish_info GROUP BY fish_type)

ORDER BY id;
