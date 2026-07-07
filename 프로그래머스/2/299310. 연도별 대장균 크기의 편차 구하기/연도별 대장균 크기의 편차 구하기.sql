-- 코드를 작성해주세요
SELECT 
   year(e.differentiation_date) AS YEAR, m.MAX_SIZE - e.size_of_colony  AS YEAR_DEV, e.ID
FROM
    ecoli_data e
JOIN (
    SELECT max(size_of_colony) as MAX_SIZE, year(differentiation_date) as YEAR
    FROM ecoli_data
    GROUP BY YEAR(DIFFERENTIATION_DATE)
) m 

ON year(e.differentiation_date) = m.YEAR

ORDER BY
    year(e.differentiation_date) asc, YEAR_DEV asc;