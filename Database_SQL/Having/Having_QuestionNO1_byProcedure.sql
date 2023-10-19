-- 1. High revenue categories:
-- Find categories with an average rental revenue greater than $10.
use sakila
delimiter //
create  procedure Revenue_Greater_than_10()
begin
select rental.rental_id,avg(amount) 
from payment 
join rental 
on  rental.rental_id=payment.rental_id 
group by rental_id 
having avg(amount)>10 ;
end
//
delimiter ;
drop procedure Revenue_Greater_than_10
call Revenue_Greater_than_10();