create database leetcode197;
use leetcode197;

drop table if exists Weather;

create table Weather(
id int,
recordDate date,
temperature int
);

insert into Weather values
(1,'2015-01-01',10),
(2,'2015-01-02',25),
(3,'2015-01-03',20),
(4,'2015-01-04',30);

select w1.id
from Weather w1
join Weather w2
on datediff(w1.recordDate, w2.recordDate) = 1
where w1.temperature>w2.temperature;
