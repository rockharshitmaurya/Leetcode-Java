# Write your MySQL query statement below
select a.FirstName,a.Lastname,b.City,b.State from Person a LEFT JOIN Address b on(a.PersonId = b.PersonId);