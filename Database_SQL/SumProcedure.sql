drop procedure ABCd
DELIMITER //
CREATE PROCEDURE ABCde(num1 int,IN num2 int)
BEGIN
declare num int;
set num = num1+num2;
select num;
END
//
DELIMITER ;
CALL ABCde(76,34)