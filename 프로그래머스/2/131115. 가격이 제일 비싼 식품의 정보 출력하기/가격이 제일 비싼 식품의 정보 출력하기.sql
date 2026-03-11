-- 코드를 입력하세요
SELECT *
FROM food_product
WHERE price = (select max(price) from food_product);
