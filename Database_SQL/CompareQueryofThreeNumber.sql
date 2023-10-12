drop procedure ABCS
DELIMITER //
create procedure ABCS(IN num1 int, IN num2 int, IN num3 int)
BEGIN
if num1>=num2 and num2>=num3 then
 
 SELECT  num1;
else 
if num2>=num3 and num3>=num1 then
select num2;
else
if num3>=num1 and num1>=num2 then 
select num3;
end if;
end if;
end if;
END
//
DELIMITER ;

call ABCS(45,88,56)