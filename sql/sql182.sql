create database leecode182;
use leecode182;


create table Person(
	id int,
    email varchar(255)
);

insert into Person values
(1, 'a@b.com'),
(2, 'c@d.com'),
(3, 'a@b.com');

select email AS Email
from Person
group by email
having count(*) > 1;