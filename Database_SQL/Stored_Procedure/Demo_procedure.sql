// DELIMITER 
create procedure sp_caseDemo()
begin
select staff_id,
case staff_id when 1 then 'nagpur'
				when 2 then 'pune'
                when 3 then 'Mumbai'
                else 'invalid' END
		from staff;
                  
// DELIMITER ;