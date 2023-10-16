-- Calculate Age from Birthdate
-- Develop a user-defined function that takes a person's birthdate as input and 
-- calculates their current age in years.

delimiter // 
create function Current_age(age date)
returns date 
deterministic
begin
declare Birthdate date;
set Birthdate = current_date()-age;
return birthdate ;
end 
// delimiter ;
drop function Current_age;
select Current_age(2023-10-16) as current_ageof;
select  current_date;
