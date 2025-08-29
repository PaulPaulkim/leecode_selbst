create database leecode181;
use leecode181;

create table Employee(
	id	int,
    emp_name	varchar(255),
    salary	int,
    managerId	int
    );

insert into Employee values
(1, 'Joe', 70000, 3),
(2, 'Henry', 80000, 4),
(3, 'Sam', 60000, null),
(4, 'Max', 90000, null);

select e.emp_name as Employee
from Employee as e
Join Employee as m
on	e.managerId = m.id
where e.salary>m.salary;

