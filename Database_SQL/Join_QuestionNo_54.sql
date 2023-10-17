-- Retrieve the rental date and return date for each rental made by customer "Laura Martinez".
select first_name,last_name,rental_date,return_date from customer 
join rental on customer.customer_id=rental.customer_id where customer.first_name='Laura Martinez'