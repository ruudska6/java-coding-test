SELECT
    id,
    CASE 
        WHEN size_of_colony > 1000 THEN 'HIGH'
        WHEN size_of_colony > 100 THEN 'MEDIUM'
        WHEN size_of_colony <= 100 THEN 'LOW'
    END AS SIZE
FROM
    ecoli_data
ORDER BY id asc;
