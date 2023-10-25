-- Highly rented films:
-- Identify films that have been rented more than 30 times.

select film.film_id, count(rental_id) from film join inventory on film.film_id=inventory.film_id
join rental on inventory.inventory_id=rental.inventory_id 
group by film_id
having count(rental_id)>30