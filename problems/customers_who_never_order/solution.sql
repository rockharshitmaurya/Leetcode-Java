# Write your MySQL query statement below
select a.Name Customers from Customers a LEFT JOIN Orders b on(a.id=b.CustomerId) where b.Customerid is null;