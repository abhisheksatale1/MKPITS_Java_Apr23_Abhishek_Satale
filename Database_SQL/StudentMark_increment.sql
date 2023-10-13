-- retrive marks from students and the marks increment by 10
create database Student
create table Student_details(Student_name varchar(20),  )
delimiter //
create table MarksIncrement(roll_number int);
drop procedure MarksIncrement
create procedure MarksIncrement(RN_number char(50), increment int);
begin 
update MD set phy=phy+increment, 
			  chem=chem+increment,
              maths=maths+increment,
