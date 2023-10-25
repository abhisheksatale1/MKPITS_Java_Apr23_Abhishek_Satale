create table (roll_no int, Phy_marks int, )
create trigger trgTotalMarks after insert on markdetails
for each row
begin 
insert into totalmarks values (new.rollno,new.phy+new.chem+new.maths);
end;
//
delimiter
select * from markdetails
insert into markdetails values(1001,55,45,22)
select * from totalmarkscustomer
// delimiter