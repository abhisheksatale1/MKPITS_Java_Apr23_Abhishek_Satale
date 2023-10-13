-- GET TOTAL AMOUNT OF CUSTOMER FROM CUSTOMER_ID

DROP PROCEDURE SP_GETTOTALAMOUNTOFCUSTOMER
DELIMITER //
CREATE PROCEDURE SP_GETTOTALAMOUNTOFCUSTOMER(IN CUST_ID INT)
BEGIN 
SELECT SUM(AMOUNT) AS"TOTAL AMOUNT" FROM PAYMENT WHERE CUSTOMER_ID;
END
//
DELIMITER ;

CALL SP_GETTOTALAMOUNTOFCUSTOMER(2)
