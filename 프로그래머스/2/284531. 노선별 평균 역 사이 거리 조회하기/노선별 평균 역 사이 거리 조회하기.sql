-- 누계거리 : 소수 둘째자리 반올림(첫째자리까지)
-- 평균거리 : 소수 셋째자리 반올림(둘째자리까지)
SELECT ROUTE, 
       CONCAT(ROUND(SUM(D_BETWEEN_DIST), 1), 'km') AS TOTAL_DISTANCE, 
       CONCAT(ROUND(AVG(D_BETWEEN_DIST), 2), 'km') AS AVERAGE_DISTANCE
FROM 
       SUBWAY_DISTANCE
GROUP BY 
       ROUTE
ORDER BY 
       SUM(D_CUMULATIVE) DESC