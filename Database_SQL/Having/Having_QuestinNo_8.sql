-- 8. Long rentals:
-- List films with an average rental duration of more than 7 days.
select * from rental
select film.title, avg(rental_duration),rental_id from film join inventory on film.film_id=inventory.film_id
join rental on inventory.inventory_id=rental.inventory_id
group by rental_id
having  avg(rental_duration)<7;

