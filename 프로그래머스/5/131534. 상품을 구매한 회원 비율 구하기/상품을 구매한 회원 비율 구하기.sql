-- 코드를 입력하세요
SELECT TO_CHAR(A.SALES_DATE,'YYYY')             AS YEAR
     , TO_NUMBER(TO_CHAR(A.SALES_DATE,'MM'))    AS MONTH
     , COUNT(DISTINCT(USER_ID))                 AS PUCHASED_USERS
     , ROUND(COUNT(DISTINCT(USER_ID)) / (SELECT COUNT(USER_ID)
                                     FROM USER_INFO B -- 회원정보
                                    WHERE TO_CHAR(B.JOINED,'YYYY') = '2021'),1) AS PUCHASED_RATIO
                                
  FROM ONLINE_SALE  A   -- 판매정보
WHERE A.USER_ID IN (SELECT USER_ID
                      FROM USER_INFO B -- 회원정보
                     WHERE TO_CHAR(B.JOINED,'YYYY') = '2021')
GROUP BY TO_CHAR(A.SALES_DATE,'YYYY'), TO_CHAR(A.SALES_DATE,'MM')
ORDER BY YEAR, MONTH
;