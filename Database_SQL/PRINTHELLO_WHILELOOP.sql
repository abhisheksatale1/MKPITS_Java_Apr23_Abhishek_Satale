-- print hello ten times 
DROP PROCEDURE PRINT_HELLO
DELIMITER //

CREATE PROCEDURE PRINT_HELLO()

BEGIN
DECLARE COUNTER INT;
SET COUNTER=0;
WHILE COUNTER<10 DO 
SELECT COUNTER ;
 
SELECT "HELLO";



END WHILE;

END
//
DELIMITER ;

CALL  PRINT_HELLO(); 