-- Ps/sql
DELIMITER //
CREATE PROCEDURE sp_GetMovies()
BEGIN
select title, description, release_year, rating from film;
END 
//

use sakila 
DELIMITER //
CREATE PROCEDURE sp_GetMovies()
BEGIN
select title, description, release_year, rating from film;
END
//