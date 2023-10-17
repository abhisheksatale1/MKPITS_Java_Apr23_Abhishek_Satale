-- 2. Customers with many rentals:
-- Identify customers who have rented more than 30 films.
select * from film
select * from customer
select * from inventory
select customer.customer_id, count(rental_id) as rented_film from customer join rental on
customer.customer_id = rental.customer_id join inventory on 
rental.inventory_id = inventory.inventory_id join film on 
inventory.film_id=film.film_id group by customer_id having rented_film>30

-- customers who have rented more than 30 films with film title
select customer.customer_id,title,first_name,last_name,count(rental_id) as rented_film from customer join rental on 
customer.customer_id = rental.customer_id join inventory on 
rental.inventory_id= inventory.inventory_id join film on 
inventory.film_id=film.film_id group by customer_id having rented_film>30