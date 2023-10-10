use sakila
select month(payment_date),sum(amount)
from payment
 group by month(payment_date)


