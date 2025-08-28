CREATE DATABASE leetcode;
USE leetcode;

create table Person(
	PersonID INT,
    FirstName varchar(255),
    LastName varchar(255)
);

create table Address(
	AddressID INT,
    PersonID INT,
    City varchar(255),
    State varchar(255)
);

insert into Person (PersonID, FirstName, LastName) values
(1,'Allen','Wang'),
(2, 'Bob','Alice');

insert into Address (AddressID, PersonID, City, State) values
(1,2,'New York City','New York'),
(2, 3, 'Leetcode','California');


select Person.FirstName, Person.LastName, Address.City, Address.State
from Person
left join Address
	on Person.PersonID = Address.PersonID;
