create table Purchase(purchase_id int, product_id int,prod_quenty int)
select * from purchase
insert into purchase values(1,101,5)
drop table purchase


create table Product_details(prod_id int,prod_name varchar(255),prod_price int ,prod_quantity int)
select * from product_details
insert  into product_details values (1,"shoes",202,30),
 (2,"Blanket",303,40),
     (3,"Earring",400,50),
 (4,"laptops",5000,60);  
drop table product_details
delimiter //
create trigger insert_data
after
insert on purchase
for each row
begin
update product_details
set prod_quantity=prod_quantity+new.prod_quenty
where prod_id=new.product_id;
end //
delimiter ;
drop trigger insert_data
