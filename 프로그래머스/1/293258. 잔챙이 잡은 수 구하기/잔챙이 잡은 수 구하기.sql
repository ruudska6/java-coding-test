SELECT
    count(*) as FISH_COUNT
FROM
    fish_info
WHERE
    ISNULL(length);