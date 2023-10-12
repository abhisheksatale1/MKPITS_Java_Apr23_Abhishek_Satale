-- DELIMITER //
-- CREATE PROCEDURE sp_GetMovies()
-- begin
-- Select title, description, release_Year,rating from  film;
-- END
-- //
-- DELIMITER;
-- CALL sp_GetMovies()

select * from film
select * from rental

DELIMITER //
CREATE PROCEDURE sp_GetAvgDayofMovies()
begin
select film.film_id,title,round(avg(datediff(return_date,rental_date))) as AvgDays from film join inventory
on film.film_id=inventory.film_id join rental 
on inventory.inventory_id=rental.inventory_id  
group by film_id
order by AvgDays desc;
END
//
DELIMITER ;
CALL sp_GetAvgDayofMovies()
-- having AvgDays>=max(AvgDays)
