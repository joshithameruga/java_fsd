use hexaware_db;
create table account(accnt_num int , amount decimal(10,2));
set @sum=0;
create trigger  ins_sum before insert on account
for each row set @sum=@sum+new.amount;
insert into account values(122,440.99);
select @sum;
set @data='';
create trigger update_dept after update on dept
for each row set @data='dept record updated..';
update dept set location='delhi' where dno=70;
select @data;

create view emp_info as
select * from employees where job in ('developer','tester');

select * from emp_info;

create view salary_info as
select ename,salary,comm from employees ;

select * from salary_info;

