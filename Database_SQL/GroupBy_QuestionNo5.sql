-- Determine the total revenue generated by each store.
delimiter //
create procedure Revenue_ForStore(in Stores_id int)
begin
select store.store_id, sum(amount) from store join customer on store.store_id= customer.store_id
join payment on customer.customer_id = payment.customer_id group by store.store_id; 
end

//
delimiter 
call REvenue_Forstore(23)