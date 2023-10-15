use sakila
 
 -- (3)  Popular languages: List languages with more than 50 films.
  
   select* from rental -- inventory,staff_id,customer_id
   select* from inventory -- film_id
   select* from film -- language_id
   select* from language -- language_id
   
   select language.language_id,name,count(rental_id) as "count of rentals"
   from rental join inventory on inventory.inventory_id=rental.inventory_id
   join film on film.film_id=inventory.film_id 
   join language on language.language_id=film.language_id
   group by language_id
    
  
  

  
  
