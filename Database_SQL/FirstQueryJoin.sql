-- Retrieve the names of all customers and the titles of the films they have rented.
select * from customer
select first_name, title from customer join store on customer.store_id=store.store_id 
join inventory on store.store_id=inventory.store_id 
join film on inventory.film_id=film.film_id