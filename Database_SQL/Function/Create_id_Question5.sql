-- Generate a Unique Customer ID
-- Design a user-defined function that generates a unique 
-- customer ID based on a predefined pattern and the customer's personal details.
DELIMITER //
CREATE FUNCTION GenerateCustomerID(firstName VARCHAR(50), mobilenumber int) 
RETURNS VARCHAR(100)
DETERMINISTIC
BEGIN
    DECLARE uniqueID VARCHAR(100); 

    -- Generate a unique ID based on the pattern and personal details
    SET uniqueID = CONCAT( LEFT(firstName, 3),right(mobilenumber,5));
    
    RETURN uniqueID;
END;
//
DELIMITER ;


-- Call the function to generate a unique customer ID
SELECT GenerateCustomerID('abhishek', '200087686') AS CustomerID;
drop function GenerateCustomerID;

