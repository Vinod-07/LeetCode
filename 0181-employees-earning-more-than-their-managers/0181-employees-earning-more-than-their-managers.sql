# Write your MySQL query statement below
SELECT E.NAME AS EMPLOYEE 
FROM EMPLOYEE E
JOIN EMPLOYEE E2 ON E.MANAGERID = E2.ID
WHERE E.SALARY > E2.SALARY
