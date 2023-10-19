-- 6. Staff with high customer interactions:
-- List staff members who have handled more than 500 customer transactions.
use sakila
select * from staff
select * from payment
delimiter //
create procedure handled_customer()
begin
select staff.staff_id,payment_id from staff join payment on staff.staff_id=payment.staff_id
group by  payment.payment_id
having payment.payment_id>500;
end
//
delimiter ;
call handled_customer();
drop procedure handled_customer;