use sakila
select customer.customer_id,first_name,count(rental_id) as Number_of_rental
from rental join customer
on rental.customer_id=customer.customer_id
group by customer_id  