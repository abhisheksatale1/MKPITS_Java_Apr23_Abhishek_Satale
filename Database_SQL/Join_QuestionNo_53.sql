-- 51. Get the names of customers who have rented the film titled "Golden Groove".
select first_name,last_name,title from customer join rental on customer.customer_id=rental.customer_id
join inventory on rental.inventory_id=inventory.inventory_id
join film on inventory.film_id=film.film_id where film.title='ANGELS LIFE'
select * from film