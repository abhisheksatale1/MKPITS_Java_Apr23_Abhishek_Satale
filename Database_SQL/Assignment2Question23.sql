use sakila
 
 -- (23) List the rental date and rental duration for each rental made by customer "Amy Johnson".

   select* from customer
   select* from rental 
   select*from inventory 
   select*from film
   
  select rental_duration,rental_date from film join inventory on film.film_id=inventory.film_id 
  join rental on rental.inventory_id=inventory.inventory_id join customer 
  on customer.customer_id=rental.customer_id where first_name="Amy" and last_name="Johnson" 
