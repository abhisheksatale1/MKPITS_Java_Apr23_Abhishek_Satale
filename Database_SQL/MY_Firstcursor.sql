show tables
use sakila
select * from actor 
 delimiter // 
create procedure My_Cursor() 
begin 
 declare f_name varchar(10);
 declare c_name varchar(10);
 declare MY_cursor cursor for select first_name,city 
 declare countinue handler for not found set done =1 
 open cursor;
 label : loop
 fetch MY_cursor into first_name, last_name; 
 if done =1 then 
 leave lable 
 end if 
 end loop 
close my_cursors

end 
// delimiter 
