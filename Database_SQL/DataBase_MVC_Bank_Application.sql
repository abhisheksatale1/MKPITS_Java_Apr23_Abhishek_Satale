drop database BankApplicationJSP_MVC

create database BankApplicationJSP_MVC
use  BankApplicationJSP_MVC
create table Account_Details(
Users_id varchar(30) primary key,
User_Password varchar(25),
User_Name varchar(60),
User_Address varchar(50),
User_City varchar(20),
User_Balance double
);


select * from Account_Details
create table User_Transactions(
LoginUser_id varchar(30) ,
Transaction_Date date,
Transaction_Amount double,
Transaction_Type varchar(20),
FOREIGN KEY(LoginUser_id) REFERENCES Account_Details(Users_id)
);
select * from User_Transactions
show tables 