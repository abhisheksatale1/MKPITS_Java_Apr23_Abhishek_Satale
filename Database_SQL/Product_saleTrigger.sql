CREATE TABLE Product_details (
       
    Product_id int,
    price int,
    Product_name varchar(255),
    Quentity int
);
insert into Product_details(Product_id, price, product_name, Quentity)
values(1001,500,'kapda',50);
insert into Product_details(Product_id, price, product_name, Quentity)
values(1002,600,'ghar',55);

drop table Product_details;
select * from product_details;
create table sale(
	sale_id int,
    product_id int,
    Quentity_stock int
    );
insert into sale value (1,101,60);
insert into sale value(2,102,70);
drop table sale
select * from sale

delimiter //
create trigger after_sale_trigger after insert on sale 
for each row
begin 
update Product_details
set Quentity=Quentity - new. Quentity_stock 
where product_id= new. product_id;
end;
//  delimiter ;
select * from product_details 
select * from sale
drop trigger after_sale_trigger 
 