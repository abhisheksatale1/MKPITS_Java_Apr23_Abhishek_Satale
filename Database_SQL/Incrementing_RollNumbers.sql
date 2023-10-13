-- create a table roll_no and create a procedure to insert a roll number from 200 to 300
create table roll_number(roll_number int);
drop procedure valuesFrom200_300
delimiter //
create procedure valuesFrom200_300(in number int,in counter int)
begin
declare number int;
set number=600;
label : loop
insert into Roll_number value(number);
set number=number+1;
if number>counter then
leave label;
end if;
end loop;
end
//
delimiter ;

call valuesFrom200_300(600,1000); 
select * from roll_number
