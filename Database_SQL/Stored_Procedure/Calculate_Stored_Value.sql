-- Calculate Total Order Value
-- Design a user-defined function that takes order quantity and unit price
 -- as input and calculates the total order value for each order.
 delimiter //
 create function Orverd_value(quantity int, amt int)
 returns integer deterministic
 begin 
 -- set totalorderprise = quantity*price;
 return quantity*amt;
 end//
 delimiter ;
 select  payment_id,amount,Orverd_value(3,2) from payment;
 drop function Orverd_value;