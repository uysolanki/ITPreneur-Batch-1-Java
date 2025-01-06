create or replace function f3(fcity in varchar)
return number
is
fcount number(2);
begin
select count(*) into fcount
from customer
where ccity like fcity;
return fcount;
end;
/


select f3('DELHI') from dual;