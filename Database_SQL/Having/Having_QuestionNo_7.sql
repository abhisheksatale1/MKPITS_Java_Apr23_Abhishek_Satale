-- 7. Active customers:
-- Identify customers who have rented in the last 30 days.
select * from rental
delimiter //
create procedure rented_last_30Yrs()
begin 
select customer.first_name, customer.last_name,count(rental_id) as rented_customer from
customer join rental on customer.customer_id=rental.customer_id
group by customer.customer_id
having rented_customer > 30;
end
//
delimiter ;
drop procedure rented_last_30Yrs 
call rented_last_30yrs()
