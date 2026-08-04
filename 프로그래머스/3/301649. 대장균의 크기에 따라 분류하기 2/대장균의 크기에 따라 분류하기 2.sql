select ID,
    CASE grade
        WHEN 1 THEN 'CRITICAL'
        WHEN 2 THEN 'HIGH'
        WHEN 3 THEN 'MEDIUM'
        WHEN 4 THEN 'LOW'
    END AS COLONY_NAME
FROM (
    select 
        id,
        ntile(4) OVER (ORDER BY size_of_colony desc) AS grade 
    from
        ecoli_data
) ranked

ORDER BY id asc;