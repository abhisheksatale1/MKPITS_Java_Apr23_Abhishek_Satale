-- Create the Product_details table
CREATE TABLE Product_details (
    Product_id INT,
    price INT,
    Product_name VARCHAR(255),
    Quantity INT
);

-- Insert data into the Product_details table
INSERT INTO Product_details (Product_id, price, Product_name, Quantity)
VALUES (1001, 500, 'kapda', 50);

INSERT INTO Product_details (Product_id, price, Product_name, Quantity)
VALUES (1002, 600, 'ghar', 55);

-- Drop the Product_details table
DROP TABLE Product_details;

-- Create the sale table
CREATE TABLE sale (
    sale_id INT,
    product_id INT,
    Quantity_stock INT
);

-- Insert data into the sale table
INSERT INTO sale VALUES (1, 1001, 60);
INSERT INTO sale VALUES (2, 1002, 70);

-- Drop the sale table
DROP TABLE sale;

-- Create the after_sale_trigger
DELIMITER //
CREATE TRIGGER after_sale_trigger
AFTER INSERT ON sale
FOR EACH ROW
BEGIN
    UPDATE Product_details
    SET Quantity = Quantity - NEW.Quantity_stock
    WHERE Product_id = NEW.product_id;
END;
//
DELIMITER ;

-- Select data from the Product_details table
SELECT * FROM Product_details;

-- Select data from the sale table
SELECT * FROM sale;

-- Drop the after_sale_trigger
DROP TRIGGER after_sale_trigger;
