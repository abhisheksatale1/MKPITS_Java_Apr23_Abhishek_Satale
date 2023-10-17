DELIMITER //
CREATE PROCEDURE My_Cursor()
BEGIN
  DECLARE done INT DEFAULT 0;
  DECLARE first_name VARCHAR(255);
  DECLARE last_name VARCHAR(255);
  DECLARE done_handler INT DEFAULT 0;

  -- Create a cursor with the correct table name and schema
  DECLARE my_cursor CURSOR FOR
  SELECT first_name, last_name FROM sakila.actor; -- Replace "your_schema" and "your_table" with actual names

  DECLARE CONTINUE HANDLER FOR NOT FOUND SET done_handler = 1;

  OPEN my_cursor;

  my_loop: LOOP
    FETCH my_cursor INTO first_name, last_name;

    IF done_handler = 1 THEN
      LEAVE my_loop;
    END IF;

    -- Your processing logic goes here
    -- For example, you can print the values:
    -- SELECT CONCAT(first_name, ' ', last_name);

  END LOOP;

  CLOSE my_cursor;

END //
DELIMITER ;
drop procedure My_cursor
call MY_cursor();