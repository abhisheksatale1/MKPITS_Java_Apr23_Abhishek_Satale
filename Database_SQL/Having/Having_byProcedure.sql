-- 3. Popular languages:
-- List languages with more than 50 films.
delimiter //
create procedure Languages_more_than_50()
begin
select language.name, film_id from film join language on film.language_id= language.language_id
group by film.film_id
having film_id>50;
end
//
delimiter ;
call Languages_more_than_50;