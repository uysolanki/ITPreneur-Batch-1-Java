CREATE TABLE customer (
   cid  number(5) primary key,
   cname  varchar(20) NOT NULL,
   cphone  varchar(20) NOT NULL,
   ccity  varchar(20) NOT NULL,
   cgender  char(1) check(cgender in('m','f')));
   
   
   
INSERT INTO customer VALUES(1, 'AAKASH', '9999999999', 'DELHI', 'm');
INSERT INTO customer VALUES(2, 'AMAN', '9785463215', 'NOIDA', 'm');
INSERT INTO customer VALUES(3, 'NEHA', '9999999999', 'MUMBAI', 'f');
INSERT INTO customer VALUES(4, 'MEGHA', '9994562399', 'KOLKATA', 'f');
INSERT INTO customer VALUES(5, 'PULKIT', '7895999999', 'LUCKNOW', 'm');
INSERT INTO customer VALUES(6, 'VIRAT', '9890989065', 'DELHI', 'm');
INSERT INTO customer VALUES(7, 'ROHIT', '8888111222', 'MUMBAI', 'm');