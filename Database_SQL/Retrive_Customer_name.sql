-- TAKE AS A ARGUMNET CITY NAME AND FIND OUT THE CUSTOMER NAME FORM THAT CITY
select city from city
drop procedure retrive_customer_name
DELIMITER //
CREATE PROCEDURE Retrive_customer_name(in V_city char(50))
BEGIN 
select customer.first_name,customer.last_name,city.city,city.city_id from customer
join address
on customer.address_id=address.address_id
join city
on city.city_id=address.city_id where city.city=V_city;

END
//
DELIMITER ;
call Retrive_customer_name('kabul')
