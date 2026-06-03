-- 코드를 입력하세요
SELECT
    dr_name, dr_id, mcdp_cd, hire_ymd
FROM
    doctor
WHERE 
    MCDP_CD IN ('CS', 'GS')
ORDER BY
    hire_ymd desc, dr_name asc;