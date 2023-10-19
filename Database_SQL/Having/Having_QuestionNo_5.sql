-- 5. Actors in popular films:
-- Show actors who have appeared in more than 10 films.
select * from actor
select * from film
delimiter //
create procedure appeared_more_than_10()
begin
select actor.actor_id, first_name,last_name, from actor join film_actor on actor.actor_id=film_actor.actor_id
join film on film_actor.film_id=film.film_id
group by actor.actor_id
having count(film_actor.film_id)>10;
end 

//
delimiter ;
drop procedure appeared_more_than_10
call appeared_more_than_10