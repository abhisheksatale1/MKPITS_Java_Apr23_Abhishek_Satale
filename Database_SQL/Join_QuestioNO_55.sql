-- 55. Get the film titles and rental dates for all rentals made on September 5, 2005.
select title, rental_date from film join inventory on film.film_id= inventory.inventory_id
join rental on inventory.inventory_id=rental.inventory_id where rental.rental_date='2005-05-24 22:53:30'
select rental_date from rental