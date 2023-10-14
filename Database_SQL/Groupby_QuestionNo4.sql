 -- Find the total revenue generated for each month.
delimiter //
create procedure Revenue_Generated(in amount int)

begin 
select  month(payment_date), sum(amount) from payment group by month(payment_date);
end

//
delimiter ;

call Revenue_Generated(234)
