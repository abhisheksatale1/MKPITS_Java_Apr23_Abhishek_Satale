-- Retrieve the film titles rented by the customer with customer_id 100.
select customer_id, title from customer join inventory on film.film_id=inventory.film_id
join rental on inventory.inventory_id