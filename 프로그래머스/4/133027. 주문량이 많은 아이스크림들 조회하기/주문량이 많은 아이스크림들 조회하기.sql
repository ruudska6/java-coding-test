-- 코드를 입력하세요

select flavor
FROM
    (SELECT 
        fh.shipment_id,
        fh.flavor, 
        fh.total_order + sum(j.total_order) as total_order
    FROM
        first_half fh
    JOIN 
        july j
        ON fh.flavor = j.flavor
    GROUP BY 
        shipment_id
    ORDER BY 
        total_order desc
    LIMIT 3
    ) ranked




