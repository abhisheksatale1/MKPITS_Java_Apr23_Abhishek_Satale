-- Get the titles of all films rented by the customer named "William Brown".
select title, first_name, last_name from film join inventory on film.film_id=inventory.film_id 
join rental on inventory.inventory_id=rental.inventory_id
join customer on rental.customer_id=customer.customer_id where first_name="william" || last_name="Brown"