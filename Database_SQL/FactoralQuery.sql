DROP PROCEDURE ABCD
DELIMITER //
CREATE PROCEDURE ABCD(N INT )
BEGIN
declare f int;
declare i int;
set f=1;
set i=1;
factor: loop
set f=f*i;
set i=i+1;
if i>N then 
leave factor;
end if;
end loop;
select f;
END
//
DELIMITER ;

CALL ABCD(5); -- --basic while and repetent 
