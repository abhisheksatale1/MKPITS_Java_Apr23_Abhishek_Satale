select staff.store_id,sum(amount)
from payment join staff
on payment.staff_id=staff.staff_id
join store 
on staff.store_id=store.store_id
group by store_id
