-- Retrieve the total revenue generated for each film category.
-- category joins film catoegory - film - inventory - rental - payment -(amount sum)
use sakila
select name, sum(amount) from category join film_category on category.category_id = film_category.category_id
join film on film_category.film_id = film.film_id
join inventory on film.film_id= inventory.film_id
join rental on inventory.inventory_id=rental.inventory_id
join payment on rental.rental_id=payment.rental_id group by name