use sakila
 
 -- (7)  Compute the average rental rate for each film category.

   select* from film
   select* from film_category
    select* from category
   
   select film_category.category_id,avg(rental_rate) as "average rental rate"
   from film join film_category on film_category.film_id=film.film_id 
  --  join category on category.category_id=film_category.category_id
   group by category_id
