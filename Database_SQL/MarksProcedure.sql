drop procedure ABCde
DELIMITER //
CREATE PROCEDURE ABCde(IN MARKS Int)
BEGIN
if marks>=50 then
select "pass";
else 
if marks>50 and marks <60 then 
select "pass";
else 
select "Distinction";
end if;
end if;

END
//
DELIMITER ;
CALL ABCde(23)