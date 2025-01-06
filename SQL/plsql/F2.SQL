create or replace function f2
return number
is
fcount number(2);
begin
select count(*) into fcount
from customer
where ccity like 'DELHI';
return fcount;
end;
/