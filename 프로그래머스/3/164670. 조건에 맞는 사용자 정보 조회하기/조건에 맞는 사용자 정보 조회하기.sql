-- 코드를 입력하세요
SELECT USER_ID	
     , NICKNAME
     , city ||' '|| STREET_ADDRESS1 ||' ' || STREET_ADDRESS2 as "전체주소"
     , substr(TLNO, 1, 3) || '-' || substr(TLNO, 4, 4) || '-' || substr(TLNO, 8, 4) as "전화번호"
  FROM USED_GOODS_USER B
WHERE USER_ID IN (SELECT WRITER_ID AS USER_ID
                     FROM USED_GOODS_BOARD
                    GROUP BY WRITER_ID
                   HAVING COUNT(*) >= 3)
ORDER BY USER_ID DESC