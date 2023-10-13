--  Write a program repeat the number from 10 to 1
drop procedure Decrease_Whileloop
DELIMITER //
CREATE PROCEDURE INCREASE()
BEGIN
DECLARE counter int;
set counter = 10;

while counter<0 do
--  select counter; 
	set counter = counter-1;
    end while;
	SELECT counter;
	
    END;
    //
    DELIMITER ;
    CALL INCREASE();
 
 
 