-- String Reversal
-- Design a user-defined function that takes a string as input and returns the reversed string.
delimiter //
create function Reversed_String(rev_str varchar(45))
returns varchar(45)
deterministic
begin
declare reversestring varchar(45);
set reversestring=rev_str;
return reverse(reversestring); -- for reversing the string 
end
//
delimiter ;
select Reversed_String("abhishek");

