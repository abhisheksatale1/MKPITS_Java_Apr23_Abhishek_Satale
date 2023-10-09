 -- Display the rental date and return date for each rental along with the customer's first name and last name.
 select rental_date, return_date, first_name, last_name from rental join payment on rental.rental_id=payment.rental_id
 join customer on customer.customer_id=customer.customer_id
 