use sakila
 
 -- (31) List the rental date and return date for all rentals made by customer "Kevin Johnson".

  
   select* from rental 
   select*from inventory 
   select*from film
   
  select rental_date,return_date from film join inventory on film.film_id=inventory.film_id 
  join rental on rental.inventory_id=inventory.inventory_id join customer on
  customer.customer_id=rental.customer_id where first_name="Kevin" and last_name="Johnson"
