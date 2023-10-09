-- (9) 	Get the first name, last name, and email of customers who have rented more than 15 films.

   select* from customer
   select* from rental 
   select*from inventory 
   select*from film
  select first_name,last_name,email,count(rental_id) from customer 
  join rental on customer.customer_id=rental.customer_id group by customer.customer_id
  having count(rental_id)>15