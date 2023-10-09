-- List the film titles and rental dates for all rentals made by the customer with customer_id 200
SELECT Films.title, Rentals.rental_date
FROM Customers
INNER JOIN Rentals ON Customers.customer_id = Rentals.customer_id
INNER JOIN Films ON Rentals.film_id = Films.film_id
WHERE Customers.customer_id = 200;