-- 코드를 입력하세요
SELECT MONTH(start_date) as MONTH, car_id, count(*) AS RECORDS
FROM
    car_rental_company_rental_history
WHERE 
    month(start_date) >= 8 AND month(start_date) <= 10 
    AND year(start_date) = 2022
    AND car_id IN (
      SELECT car_id
      FROM car_rental_company_rental_history
      WHERE start_date >= '2022-08-01'
        AND start_date < '2022-11-01'
      GROUP BY car_id
      HAVING COUNT(*) >= 5
  )
GROUP BY 
    month(start_date), car_id
ORDER BY
    MONTH asc, car_id desc