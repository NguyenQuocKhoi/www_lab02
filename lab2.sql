-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               11.1.2-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping data for table lab_2.customer: ~3 rows (approximately)
INSERT INTO `customer` (`cust_id`, `address`, `cust_name`, `email`, `phone`) VALUES
	(1, 'tphcm', 'khoi', 'khoi@gmail.com', '0909'),
	(2, 'tphcm', 'khoi1', 'khoi@gmail.com', '09091'),
	(3, 'Hanoi', 'Ha', 'ha@gmail.com', '123456');

-- Dumping data for table lab_2.employee: ~4 rows (approximately)
INSERT INTO `employee` (`emp_id`, `address`, `dob`, `email`, `full_name`, `phone`, `status`) VALUES
	(1, 'tphcm', '2023-09-27', 'teo@gmail.com', 'teo', '1203445', 1),
	(2, 'tphcm', '2002-10-04', 'met@gmail.com', 'met', '0909', 1),
	(3, 'tphcm', '2023-09-27', 'teo@gmail.com', 'teo', '1203445', 1),
	(4, 'tphcm', '2023-09-27', 'teo@gmail.com', 'teo', '1203445', 1);

-- Dumping data for table lab_2.orders: ~3 rows (approximately)
INSERT INTO `orders` (`order_id`, `order_date`, `cust_id`, `emp_id`) VALUES
	(1, '2023-11-30 22:34:29.000000', 1, 2),
	(2, '2023-11-30 22:34:55.000000', 2, 2),
	(3, '2023-11-30 22:35:08.000000', 1, 4);

-- Dumping data for table lab_2.order_detail: ~0 rows (approximately)

-- Dumping data for table lab_2.product: ~5 rows (approximately)
INSERT INTO `product` (`product_id`, `description`, `manufacturer_name`, `name`, `status`, `unit`) VALUES
	(1, 'chua co', 'met1', 'Dua chuot', 0, 'kg'),
	(2, 'chua co', 'teo1', 'Dua hau', 0, 'kg'),
	(3, 'an duoc', 'thao', 'Ca chua', 0, 'kg'),
	(4, 'an duoc', 'teo1', 'Cu cai', 0, 'kg'),
	(5, NULL, 'met1', 'Ca chua bi', 0, 'kg\r\n');

-- Dumping data for table lab_2.product_image: ~0 rows (approximately)

-- Dumping data for table lab_2.product_price: ~0 rows (approximately)
INSERT INTO `product_price` (`price_date_time`, `NOTE`, `PRICE`, `product_id`) VALUES
	('2023-10-04 14:07:45.000000', 'chua co', 50000, 1);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
