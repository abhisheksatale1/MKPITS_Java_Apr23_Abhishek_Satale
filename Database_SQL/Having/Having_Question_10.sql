-- 10. Customers with diverse film preferences:
-- Find customers who have rented films from at least 5 different categories.
select * from film
select * from rental
select category_id,rental.customer_id,first_name,last_name from customer join rental on customer.customer_id=rental.customer_id 
 join inventory on rental.inventory_id=inventory.inventory_id
join film on inventory.film_id=film.film_id
join film_category on film.film_id=film_category.film_id
group by category_id
having customer_id>=5