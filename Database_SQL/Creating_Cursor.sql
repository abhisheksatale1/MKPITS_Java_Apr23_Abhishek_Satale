CREATE TABLE Student_details (
    
    
    F_Name varchar(255),
    
    City_name varchar(255)
);
drop table Student_details
DELIMITER //
CREATE PROCEDURE Insert_name_city()
BEGIN
 declare f_name varchar(255);
 declare done integer;
 declare city_name varchar(255);
 
 declare myCursor cursor for
select first_name, city from city join address on
city.city_id = address.city_id join customer on
address.address_id = customer.address_id;
     
 declare continue handler for not found set done = 1;
 
 open myCursor;
insertDetails : loop
fetch myCursor into f_name, city_name;
insert into Student_details values(f_name,city_name);
if done = 1 then
leave insertDetails;
end if;
end loop;
 close myCursor;
END
//
DELIMITER ;
call Insert_name_city();
select * from Student_details
drop procedure Insert_name_city;