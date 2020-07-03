/*
SQLyog Community v13.1.5  (64 bit)
MySQL - 8.0.18 : Database - hotelms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hotelms` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `hotelms`;

/*Table structure for table `guest` */

DROP TABLE IF EXISTS `guest`;

CREATE TABLE `guest` (
  `GuestUsername` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `GuestPassword` varchar(40) DEFAULT NULL,
  `RealName` char(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `PassportID` varchar(25) DEFAULT NULL,
  `PhoneNum` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Email` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`GuestUsername`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `guest` */

insert  into `guest`(`GuestUsername`,`GuestPassword`,`RealName`,`PassportID`,`PhoneNum`,`Email`) values 
('bhbhb','123','ggk','101110021','135781012','222@qq.com'),
('DW','123','DwyaneWade','100111013','123454321','3311@163.com'),
('jhkjhkh','123','yihjj','10011100','123456789','1111@163.com'),
('LBJ','123','LebronJames','100111023','8765678','1234@163.com');

/*Table structure for table `meal` */

DROP TABLE IF EXISTS `meal`;

CREATE TABLE `meal` (
  `Name` varchar(10) DEFAULT NULL,
  `chef` varchar(20) DEFAULT NULL,
  `avaliable_time` varchar(10) DEFAULT NULL,
  `Order_roomID` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `meal` */

insert  into `meal`(`Name`,`chef`,`avaliable_time`,`Order_roomID`) values 
('shrimp sou','Karen_Adam','Mon-Fri',NULL),
('chicken ma','Hari_Philip','Wen-Sun',NULL),
('salmon sas','Thalia_Hensley','Mon,Thu an',NULL),
('black pepp','Nisha_Moss','Tue,Sat an',NULL);

/*Table structure for table `room` */

DROP TABLE IF EXISTS `room`;

CREATE TABLE `room` (
  `Room_ID` varchar(5) NOT NULL,
  `Room_Type` varchar(20) DEFAULT NULL,
  `Floor` varchar(5) DEFAULT NULL,
  `Book_time` varchar(10) DEFAULT NULL,
  `Check_in_time` varchar(10) DEFAULT NULL,
  `Check_out_time` varchar(10) DEFAULT NULL,
  `Status` varchar(8) DEFAULT NULL,
  `guest_Tel` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Room_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `room` */

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `ID` varchar(5) DEFAULT NULL,
  `Username` varchar(10) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `Tel` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `staff` */

insert  into `staff`(`ID`,`Username`,`password`,`Tel`) values 
('1','Flash','111','98764442'),
('2','Davis','222','97687542'),
('3','Dr.Dre','333','97687654'),
('4','Ironman','444','65654533');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
