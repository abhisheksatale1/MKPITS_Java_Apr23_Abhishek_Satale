-- 4. Stores with high revenue:
-- Find stores with total revenue exceeding $5000.
delimiter //
create procedure Total_revenue_exceeding_5000()
begin 
select store.store_id, sum(amount) as "total_revenue" from store join staff on store.store_id= staff.store_id
join payment on staff.staff_id=payment.staff_id
group by store.store_id
having total_revenue>5000;
end
//
delimiter ;
drop procedure Total_revenue_exceeding_5000
call Total_revenue_exceeding_5000();
