drop procedure ABC
DELIMITER //

CREATE PROCEDURE ABC()
BEGIN 
declare i int;
set i=0;
XYZ: loop
set i=i+1;
select i;
if i>=10 then 
leave XYZ;
end if;
end loop;
END
//
DELIMITER ;
CALL ABC()