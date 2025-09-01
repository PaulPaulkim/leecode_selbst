create database leetcode196;
use leetcode196;

create table Person(
id int,
email varchar(255)
);

insert into Person values
(1, 'john@example.com'),
(2, 'bob@example.com'),
(3, 'john@example.com');

set SQL_SAFE_UPDATES = 0;
delete p1
from Person p1
join Person p2
on p1.email = p2.email 
and p1.id>p2.id;

select * from Person;