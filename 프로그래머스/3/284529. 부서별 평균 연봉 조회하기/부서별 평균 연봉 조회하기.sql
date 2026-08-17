SELECT hd.dept_id, dept_name_en, round(avg(sal), 0) as AVG_SAL
FROM
    hr_department hd
JOIN
    hr_employees he
    ON hd.dept_id = he.dept_id
GROUP BY
    dept_id
ORDER BY
    AVG_SAL desc;