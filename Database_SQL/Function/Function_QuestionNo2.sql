-- Calculate Age from Birthdate
-- Develop a user-defined function that takes a person's birthdate as input and 
-- calculates their current age in years.

delimiter // 
create function Current_age(age date)
returns int 
deterministic
begin
declare Birthdate date;
-- set Birthdate = current_date()-age;
SET birthdate = DATE_FORMAT(FROM_DAYS(DATEDIFF(NOW(), date)), '%2023') + 1;
return birthdate ;
end 
// delimiter ;
drop function Current_age;
select Current_age(02-09-2000) as current_ageof;
select current_date;


