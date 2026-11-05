select 
    YEAR(differentiation_date) as year, 
    (b.m - a.size_of_colony) as dev,
    a.id
from ecoli_data a 
join (
    SELECT YEAR(differentiation_date) as year, max(size_of_colony) as m
    FROM ecoli_data a
    GROUP BY YEAR(differentiation_date)
) b ON YEAR(differentiation_date) = b.year
ORDER BY
    year asc, dev asc




    