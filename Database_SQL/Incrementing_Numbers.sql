delimiter //
create procedure valuesFRom200_300(in number int,in counter int)
begin
declare number int;
set number=600;
label : loop
 insert into Roll_number values (number);
 set number=number+1;
if number>counter then
leave label;
end if;
end loop;
end
//
delimiter ;

call valuesFRom200_300(600,1000);

drop procedure valuesFRom200_300