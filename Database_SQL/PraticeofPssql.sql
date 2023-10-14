-- Ps/sql
DELIMITER //
CREATE PROCEDURE Sp_GetMovies()
BEGIN
select title, description, release_year, rating from film;
END 
//
DELIMITER;
CALL SP_GetMovies()

use sakila 
DELIMITER //
CREATE PROCEDURE sp_GetMovies()
BEGIN
select title, description, release_year, rating from film;
END
//