use sakila
 
 -- (8)  Determine the count of rentals for each film.
   select* from rental
   select* from inventory
   select* from film
  
   select film.film_id,count(rental_id) as "no. of rentals"
   from rental join inventory on inventory.inventory_id=rental.inventory_id
   join film on film.film_id=inventory.film_id
   group by film_id
  