SELECT U.USER_ID,
    U.NICKNAME,
    CONCAT(U.CITY, ' ', U.STREET_ADDRESS1, ' ', U.STREET_ADDRESS2) AS 전체주소,
    CONCAT(SUBSTRING(U.TLNO, 1, 3), '-', SUBSTRING(U.TLNO, 4, 4), '-', SUBSTRING(U.TLNO, 8)) AS 전화번호
FROM USED_GOODS_USER U
INNER JOIN USED_GOODS_BOARD B ON U.USER_ID = B.WRITER_ID
GROUP BY U.USER_ID, U.NICKNAME, U.CITY, U.STREET_ADDRESS1, U.STREET_ADDRESS2, U.TLNO
HAVING COUNT(B.BOARD_ID) >= 3
ORDER BY U.USER_ID DESC;
