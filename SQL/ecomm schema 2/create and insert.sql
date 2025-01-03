CREATE TABLE IF NOT EXISTS `category` (
  `cat_id` int(5) NOT NULL DEFAULT '0',
  `cat_name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cat_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;# MySQL returned an empty result set (i.e. zero rows).


INSERT INTO `category` (`cat_id`, `cat_name`) VALUES
(1, 'BOOKS'),
(2, 'GAMES'),
(3, 'GROCERIES'),
(4, 'ELECTRONIC'),
(5, 'CLOTHES');# 5 row(s) affected.


-- ------------------

CREATE TABLE IF NOT EXISTS `product` (
  `pro_id` int(5) NOT NULL DEFAULT '0',
  `pro_name` varchar(20) DEFAULT NULL,
  `pro_desc` varchar(60) DEFAULT NULL,
  `cat_id` int(5) DEFAULT NULL,
  PRIMARY KEY (`pro_id`),
  KEY `cat_id` (`cat_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;



INSERT INTO `product` (`pro_id`, `pro_name`, `pro_desc`, `cat_id`) VALUES
(1, 'GTA-V','Windows 7 and above',2),
(2, 'TSHIRT', 'SIZE-L with Black, Blue and White variations', 5),
(3, 'ROG LAPTOP', 'Windows 10 with 15inch screen, i7 processor, 1TB SSD', 4),
(4, 'OATS', 'Highly Nutritious from Nestle', 3),
(5, 'HARRY POTTER', 'Best Collection of all time by J.K Rowling', 1),
(6, 'MILK', '1L Toned MIlk', 3),
(7, 'Boat EarPhones', '1.5Meter long Dolby Atmos', 4),
(8, 'Jeans', 'Stretchable Denim Jeans with various sizes and color', 5),
(9, 'Project IGI', 'compatible with windows 7 and above', 2),
(10, 'Hoodie', 'Black GUCCI for 13 yrs and above', 5),
(11, 'Rich Dad Poor Dad', 'Written by RObert Kiyosaki', 1),
(12, 'Train Your Brain', 'By Shireen Stephen', 1);

-- -----------------

CREATE TABLE IF NOT EXISTS `supplier` (
  `supp_id` int(5) NOT NULL DEFAULT '0',
  `supp_name` varchar(20) DEFAULT NULL,
  `supp_city` varchar(20) DEFAULT NULL,
  `supp_phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`supp_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


INSERT INTO `supplier` (`supp_id`, `supp_name`, `supp_city`, `supp_phone`) VALUES
(1, 'Rajesh Retails', 'Delhi', '1234567890'),
(2, 'Appario Ltd.', 'Mumbai', '2589631470'),
(3, 'Knome products', 'Banglore', '9785462315'),
(4, 'Bansal Retails', 'Mumbai', '8975463285'),
(5, 'Mittal Ltd.', 'Delhi', '7898456532');


-- ---------------------

CREATE TABLE IF NOT EXISTS `supplier_pricing` (
  `pricing_id` int(5) NOT NULL DEFAULT '0',
  `pro_id` int(5) DEFAULT NULL,
  `supp_id` int(5) DEFAULT NULL,
  `supp_price` int(5) DEFAULT NULL,
  PRIMARY KEY (`pricing_id`),
  KEY `pro_id` (`pro_id`),
  KEY `supp_id` (`supp_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;# MySQL returned an empty result set (i.e. zero rows).


INSERT INTO `supplier_pricing` (`pricing_id`, `pro_id`, `supp_id`, `supp_price`) VALUES
(1, 1, 2, 1500),
(2, 3, 5, 30000),
(3, 5, 1, 3000),
(4, 2, 3, 2500),
(5, 4, 1, 1000),
(6, 12, 2, 780),
(7, 12, 4, 789),
(8, 3, 1, 31000),
(9, 1, 5, 1450),
(10, 4, 2, 999),
(11, 7, 3, 549),
(12, 7, 4, 529),
(13, 6, 2, 105),
(14, 6, 1, 99),
(15, 2, 5, 2999),
(16, 5, 2, 2999);

-- ----------------------------

CREATE TABLE IF NOT EXISTS `customer` (
  `cus_id` int(5) NOT NULL DEFAULT '0',
  `cus_name` varchar(20) DEFAULT NULL,
  `cus_phone` varchar(20) DEFAULT NULL,
  `cus_city` varchar(20) DEFAULT NULL,
  `cus_gender` char(1) DEFAULT NULL,
  PRIMARY KEY (`cus_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


INSERT INTO `customer` (`cus_id`, `cus_name`, `cus_phone`, `cus_city`, `cus_gender`) VALUES
(1, 'AAKASH', '9999999999', 'DELHI', 'M'),
(2, 'AMAN', '9785463215', 'NOIDA', 'M'),
(3, 'NEHA', '9999999999', 'MUMBAI', 'F'),
(4, 'MEGHA', '9994562399', 'KOLKATA', 'F'),
(5, 'PULKIT', '7895999999', 'LUCKNOW', 'M'),
(6, 'VIRAT', '9890989065', 'DELHI', 'M'),
(7, 'ROHIT', '8888111222', 'MUMBAI', 'M');


-- ------------------------

CREATE TABLE IF NOT EXISTS `delboy` (
  `db_id` int(5) NOT NULL DEFAULT '0',
  `db_name` varchar(20) DEFAULT NULL,
  `db_phone` varchar(20) DEFAULT NULL,
  `db_city` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`db_id`)
);


INSERT INTO `delboy` (`db_id`, `db_name`, `db_phone`, `db_city`) VALUES
(1, 'Pat', '9999999999', 'DELHI'),
(2, 'Starc', '9785463215', 'NOIDA'),
(3, 'Smith', '9999999999', 'MUMBAI'),
(4, 'Labu', '9994562399', 'KOLKATA'),
(5, 'Jim', '7895999999', 'LUCKNOW')

-- ------------------------------------


CREATE TABLE ordermaster(
ord_id int( 3 ) PRIMARY KEY AUTO_INCREMENT ,
ord_date date,
cus_id int( 3 ) ,
db_id int( 3 ) ,
ord_status char( 1 ) DEFAULT 'p',
FOREIGN KEY ( cus_id ) REFERENCES customer( cus_id ) ,
FOREIGN KEY ( db_id ) REFERENCES delboy( db_id )
)AUTO_INCREMENT = 101;

insert into ordermaster(ord_date,cus_id,db_id) values
('2024-12-15',2,1),
('2025-01-03',3,1),
('2025-01-03',2,2),
('2024-11-25',2,3),
('2024-10-25',3,1),
('2024-08-15',3,1),
('2024-12-28',3,3),
('2024-10-25',1,2),
('2024-08-15',1,2),
('2024-12-28',1,1),
('2024-10-25',4,1),
('2024-08-15',4,1),
('2024-12-28',4,2),
('2024-10-25',4,2),
('2024-08-15',4,3),
('2024-12-28',4,3);

-- -------------------------------

create table orderdetails(
ord_id int(5),
pricing_id int(5),
qty int(3),
FOREIGN KEY (ord_id ) REFERENCES ordermaster( ord_id ) ,
FOREIGN KEY (pricing_id ) REFERENCES supplier_pricing( pricing_id ),
primary key (ord_id,pricing_id));


insert into orderdetails(ord_id,pricing_id,qty) values
(101,1,2),
(101,7,1),

(102,4,2),
(102,3,1),
(102,6,2);

-- ----------------------------

create table rating(
rat_id int(3) primary key auto_increment,
ord_id int(3),
pricing_id int(3),
stars int(1) check (stars <=5),
FOREIGN KEY (ord_id, pricing_id ) REFERENCES orderdetails( ord_id,pricing_id ));

insert into rating(ord_id,pricing_id,stars) values
(101,1,5),
(101,7,3),

(102,4,4),
(102,3,4);



SELECT * , sum( qty * supp_price ) AS 'total', 0.18 * sum( qty * supp_price ) AS 'GST', 
FROM orderdetails
JOIN supplier_pricing
USING ( pricing_id )
WHERE ord_id =101


SELECT * , sum( qty * supp_price ) AS 'total', 0.18 * sum( qty * supp_price ) AS 'GST', sum( qty * supp_price ) + 0.18 * sum( qty * supp_price ) AS 'Payable'
FROM orderdetails
JOIN supplier_pricing
USING ( pricing_id )
WHERE ord_id =101


SELECT ord_id , sum( qty * supp_price ) AS 'total', 0.18 * sum( qty * supp_price ) AS 'GST', sum( qty * supp_price ) + 0.18 * sum( qty * supp_price ) AS 'Payable'
FROM orderdetails
JOIN supplier_pricing
USING ( pricing_id )
GROUP BY ord_id


SELECT supp_name
FROM rating
JOIN orderdetails
USING ( ord_id, pricing_id )
JOIN supplier_pricing
USING ( pricing_id )
JOIN supplier
USING ( supp_id )
WHERE stars =5
