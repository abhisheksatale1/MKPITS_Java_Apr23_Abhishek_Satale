use  MyFirstdatabase
show tables
select * from actor
create database MyFirstdatabase
use MyFirstdatabase
create table srno(
srno char(10))
show tables
Insert into srno values('1')
select * from srno
drop tables srno
create table srno(
srno int,
fnames varchar(25),
mobileno int )

insert into srno values(1,'abhi',8888888)
insert into srno values(2,'abhishek',74994)
insert into srno values(3,'abhishrut',74994)

select * from srno
delete from srno where  fnames="dangore"