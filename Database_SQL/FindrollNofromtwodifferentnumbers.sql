create table Rollnumber(roll_number int)
select *from Rollnumber



drop procedure InsertNumbers
drop table Rollnumber
DELIMITER //
CREATE PROCEDURE InsertNumbers(in counter int, in num int)
BEGIN
    DECLARE counter INT DEFAULT 0;
   
    WHILE counter <= num DO
        INSERT INTO Rollnumber (roll_number) VALUES (counter);
        SET counter = counter + 1;
        
    END WHILE;
   --  select counter;
END;
//
DELIMITER ;

 call InsertNumbers(5,500)


 select roll_number from Rollnumber
