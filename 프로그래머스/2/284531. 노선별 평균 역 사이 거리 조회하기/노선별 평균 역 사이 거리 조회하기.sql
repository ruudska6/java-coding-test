SELECT
    route, 
    CONCAT(ROUND(sum(d_between_dist), 1), 'km') AS TOTAL_DISTANCE,
    CONCAT(ROUND(avg(d_between_dist), 2), 'km') AS AVERAGE_DISTANCE
FROM
    subway_distance
GROUP BY
    route
ORDER BY 
    SUM(d_between_dist) DESC;