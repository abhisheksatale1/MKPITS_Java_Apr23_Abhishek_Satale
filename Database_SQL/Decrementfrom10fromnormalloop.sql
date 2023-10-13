--  Write a program repeat the number from 10 to 1
drop procedure INCREASE
DELIMITER //
CREATE PROCEDURE INCREASE()
BEGIN
DECLARE counter int;

set counter = 10;

 Repeated: loop
 select counter; 
	set counter = counter-1;
    
    if counter<=0 THEN
    leave Repeated;
    END IF;
    END loop;
    SELECT counter;
 
    END;
    //
    DELIMITER ;
    CALL INCREASE();
 