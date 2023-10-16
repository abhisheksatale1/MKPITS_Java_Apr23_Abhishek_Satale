-- calculate BMI (Body Mass Index)
-- Create a user-defined function that takes a 
-- person's weight (in kilograms) and height (in meters) as input and calculates their BMI.
delimiter //
create function Calculate_BMI(weight int, height double(5,2))
returns double(5,2)
deterministic
begin
declare BMI double(5,2);
set BMI = weight/(height*height); 
return BMI;
end 
//
delimiter ;
select Calculate_BMI(50,1.70);
drop function Calculate_BMI;

