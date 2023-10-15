use sakila
 
 -- (9)  Retrieve the total revenue generated for each city.
  
    select* from payment -- customer_id, amount
    select* from customer -- address_id
    select* from address  -- city_id
    select* from city  -- city_id
  
   select city.city_id,sum(amount) as "Total revenue by each city"
   from payment join customer on customer.customer_id=payment.customer_id 
   join address on address.address_id=customer.address_id 
   join city on city.city_id=address.city_id
   group by city_id
  
