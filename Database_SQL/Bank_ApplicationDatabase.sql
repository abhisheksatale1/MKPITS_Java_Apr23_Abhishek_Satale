create database Bank
use  Bank
create table Account_Details(
User_id varchar(50) primary key,
Password varchar(50),
Name varchar(50),
Address  varchar(50),
city varchar(50),
balance double
);
use Bank
select * from Account_Details
create table Transactions(
user_id varchar(20),
Transaction_date date,
Amount double,
Amount_type varchar(20),
FOREIGN KEY(user_id) REFERENCES Account_Details(user_id)

)
select * from Transactions
drop table Account_Details