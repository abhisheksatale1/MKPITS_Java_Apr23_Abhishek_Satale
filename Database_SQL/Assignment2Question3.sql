 use sakila
 -- (3) List the film titles and rental dates for all rentals made by customer "John Johnson".

   select* from customer
   select* from rental 
   select*from inventory 
   select*from actor
  select title,rental_date from customer join rental on customer.customer_id=rental.customer_id 
  join inventory on inventory.inventory_id=rental.inventory_id
  join film on film.film_id=inventory.film_id 
  where title="John Johnson"
