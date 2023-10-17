-- Display the first name, last name, and email of customers who have rented the film titled "Flight Lies".
select first_name, last_name,email,title from customer join rental on customer.customer_id = rental.customer_id
join inventory on rental.inventory_id=inventory.inventory_id
join film on inventory.film_id=film.film_id where film.title='flight lies'