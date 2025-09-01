drop database if exists leecode183;
create database leecode183;
use leecode183;

create table Customers(
id int,
c_name varchar(255)
);

create table Orders(
id int,
customerID int
);

insert into Customers values
(1, 'Joe'),
(2, 'Henry'),
(3, 'Sam'),
(4, 'Max');

insert into Orders values
(1, 3),
(2, 1);

select c_name
from Customers
where id not in (
	select customerID
    from Orders
);

