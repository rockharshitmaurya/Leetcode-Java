# Write your MySQL query statement below
SELECT DISTINCT a.Email FROM Person a , Person b
WHERE a.Id < b.Id AND a.Email = b.Email