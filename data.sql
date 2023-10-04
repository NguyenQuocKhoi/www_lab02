
USE Lab_2

INSERT INTO `lab_2`.`employee` (`emp_id`, `address`, `dob`, `email`, `full_name`, `phone`, `status`) 
VALUES (1, 'tphcm', '2002-09-27', 'met@gmail.com', 'met', '1203445', 1);
INSERT INTO `lab_2`.`employee` (`emp_id`, `address`, `dob`, `email`, `full_name`, `phone`, `status`) 
VALUES (2, 'tphcm', '2003-09-27', 'teo@gmail.com', 'teo', '1203445', 1);
INSERT INTO `lab_2`.`employee` (`emp_id`, `address`, `dob`, `email`, `full_name`, `phone`, `status`) 
VALUES (3, 'tphcm', '2004-09-27', 'than@gmail.com', 'than', '1203445', 1);

INSERT INTO `lab_2`.`customer` (`address`, `cust_name`, `email`, `phone`) 
VALUES ('tphcm', 'khoi', 'khoi@gmail.com', '0909');

INSERT INTO `lab_2`.`customer` (`address`, `cust_name`, `email`, `phone`) 
VALUES ('tphcm', 'thanh', 'thanh@gmail.com', '0909');

INSERT INTO `lab_2`.`product` (`description`, `manufacturer_name`, `name`, `status`) 
VALUES ('chua co', 'teo1', 'Dua hau', 0);

INSERT INTO `lab_2`.`product_price` (`price_date_time`, `NOTE`, `PRICE`, `product_id`) 
VALUES ('2023-10-04 14:07:45.000000', 'chua co', 50000, 1);
