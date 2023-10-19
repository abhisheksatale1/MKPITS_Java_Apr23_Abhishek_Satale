-- 2. Customers with many rentals:
-- Identify customers who have rented more than 30 films.
 delimiter //
create procedure Rented_more_than_30()
begin 
select customer.customer_id, count(rental_id) as "rented_film" 
from film
join inventory
on film.film_id = inventory.film_id
join rental 
on inventory.inventory_id=rental.inventory_id
join customer
on rental.customer_id=customer.customer_id
group by  customer.customer_id
having rented_film>30;
end
//
delimiter ;
drop procedure Rented_more_than_30
call Rented_more_than_30();