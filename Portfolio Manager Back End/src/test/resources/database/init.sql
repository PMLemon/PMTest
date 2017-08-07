/*
SQLyog Ultimate v11.26 (32 bit)
MySQL - 5.6.10 : Database - portfolio_manager
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE IF NOT EXISTS `portfolio_manager` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `portfolio_manager`;

/*Table structure for table `bond` */

DROP TABLE IF EXISTS `bond`;

CREATE TABLE `bond` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `coupon` varchar(255) DEFAULT NULL,
  `issure` varchar(255) DEFAULT NULL,
  `maturity_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `bond` */

insert  into `bond`(`id`,`coupon`,`issure`,`maturity_date`) values (1,'0.07','SP and Moody corporate','2018-08-05'),(2,'0.12','City and County of San Francisco','2023-09-15'),(3,'0.06','Vanke','2019-10-23'),(4,'0.13','ICBC','2022-07-03'),(5,'0.06','U.S. Treasury Securities','2021-11-16'),(6,'0.07','U.S.','2018-08-15'),(7,'0.12','Kansas','2017-12-23'),(8,'0.35','South Carolina','2025-03-18'),(9,'0.03','Dutch East India Company','2020-11-29'),(10,'0.28','Moscow-Kiev-Voronezh railroad company','2038-09-24');

/*Table structure for table `equity` */

DROP TABLE IF EXISTS `equity`;

CREATE TABLE `equity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `symbol` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `equity` */

insert  into `equity`(`id`,`symbol`) values (1,'Apple'),(2,'Microsoft'),(3,'IBM'),(4,'Huawei'),(5,'Tencent'),(6,'Sansung'),(7,'Warmart'),(8,'Wangyi'),(9,'Toyota'),(10,'Siemens');

/*Table structure for table `etf` */

DROP TABLE IF EXISTS `etf`;

CREATE TABLE `etf` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `symbol` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `etf` */

insert  into `etf`(`id`,`symbol`) values (1,'Barclays Return on Disability ETN'),(2,'VanEck Vectors Rare Earth/Strategic Metals ETF'),(3,'Global X Copper Miners ETF'),(4,'iShares MSCI Brazil Small-Cap ETF'),(5,'Global X Brazil Consumer ETF'),(6,'Schwab US TIPS ETF'),(7,'iShares U.S. Real Estate ETF'),(8,'iShares Core MSCI Europe ETF'),(9,'Industrial Select Sector SPDR Fund'),(10,'iShares MSCI Brazil Capped ETF');

/*Table structure for table `fra` */

DROP TABLE IF EXISTS `fra`;

CREATE TABLE `fra` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `end` date DEFAULT NULL,
  `rate` double NOT NULL,
  `start` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `fra` */

insert  into `fra`(`id`,`end`,`rate`,`start`) values (1,'2017-07-01',8.08,'2017-01-01'),(2,'2018-01-13',6.17,'2017-07-13'),(3,'2018-04-10',7.14,'2016-04-10'),(4,'2017-12-15',8.22,'2015-09-15'),(5,'2019-11-16',9.23,'2017-06-16'),(6,'2017-12-19',5.16,'2016-12-19'),(7,'2018-02-02',3.28,'2015-02-02'),(8,'2018-08-08',11.23,'2008-08-08'),(9,'2019-05-17',9.24,'2013-11-17'),(10,'2018-03-31',19.32,'2017-03-31');

/*Table structure for table `fund_manager` */

DROP TABLE IF EXISTS `fund_manager`;

CREATE TABLE `fund_manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `portfolio` tinyblob,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `fund_manager` */

insert  into `fund_manager`(`id`,`email`,`first_name`,`last_name`,`portfolio`,`telephone`) values (1,'am6267@csdn.com','Abel','Martin','4','18809986267'),(2,'bb8980@sina.com','Baker','Brown','5','13336728980'),(3,'dj5678@qq.com','Damon','Johnson','1','15390345678'),(4,'fa9157@gmail.com','Felice','Anderson','10','17802179158'),(5,'hm6789@gmail.com','Hammer','Miller','7','17502156789'),(6,'rm7005@gmail.com','Randy','Williams','5','18803267005'),(7,'dd3226@sina.com','Dyer','Davis','2','13911633226'),(8,'vm5990@csdn.com','Vivian','Miller','1','13262555990'),(9,'jh4568@qq.com','Judy','Harris','7','17601234568'),(10,'gb9798@126.com','Grace','Baker','9','15003539798');

/*Table structure for table `future` */

DROP TABLE IF EXISTS `future`;

CREATE TABLE `future` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `symbol` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `future` */

insert  into `future`(`id`,`symbol`) values (1,'Coffee'),(2,'Gas Oil'),(3,'Corn'),(4,'Cotton'),(5,'Heating Oil'),(6,'WTI Crude'),(7,'Brent Oil'),(8,'Wheat'),(9,'Natural Gas'),(10,'Soybeans');

/*Table structure for table `portfolio` */

DROP TABLE IF EXISTS `portfolio`;

CREATE TABLE `portfolio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `position` tinyblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `portfolio` */

insert  into `portfolio`(`id`,`name`,`position`) values (1,'BEIJING SPC ENVIROMENT PROTECTION','1'),(2,'AVIC JONHON OPTRONIC TECHNOLOGY','4'),(3,'KANGDE XIN COMPOSITE MATERIAL','2'),(4,'WULIANGYE','9'),(5,'CHAOZHOU THREE-CIRCLE','10'),(6,'PING AN INSURANCE','4'),(7,'GREE ELECTRIC APPLIANCES','7'),(8,'KWEICHOW MOUTAI','3'),(9,'LUSHARE PRECISION','6'),(10,'SHENZHEN O-FILM TECH','8');

/*Table structure for table `positions` */

DROP TABLE IF EXISTS `positions`;

CREATE TABLE `positions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `quantity` int(11) NOT NULL,
  `security` tinyblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `positions` */

insert  into `positions`(`id`,`quantity`,`security`) values (1,4800,'2'),(2,5600,'4'),(3,7200,'5'),(4,4300,'7'),(5,10500,'9'),(6,5300,'3'),(7,6900,'6'),(8,8700,'8'),(9,12500,'10'),(10,9300,'1');

/*Table structure for table `price` */

DROP TABLE IF EXISTS `price`;

CREATE TABLE `price` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bid_price` double NOT NULL,
  `currency` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `offer_price` double NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `price` */

insert  into `price`(`id`,`bid_price`,`currency`,`date`,`offer_price`,`type`) values (1,13.45,'CNY','2017-07-23',13.46,NULL),(2,3.23,'CNY','2017-06-08',3.35,NULL),(3,6.2,'CNY','2017-05-18',6.26,NULL),(4,14.55,'CNY','2017-05-28',14.56,NULL),(5,7.74,'CNY','2017-03-13',7.78,NULL),(6,16.28,'CNY','2017-07-17',16.8,NULL),(7,7.5,'CNY','2017-05-19',8.25,NULL),(8,21.88,'CNY','2017-06-23',22.22,NULL),(9,18.5,'CNY','2017-03-29',18.69,NULL),(10,4.89,'CNY','2017-04-15',5.12,NULL);

/*Table structure for table `security` */

DROP TABLE IF EXISTS `security`;

CREATE TABLE `security` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `issn` varchar(255) DEFAULT NULL,
  `price` tinyblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `security` */

insert  into `security`(`id`,`issn`,`price`) values (1,'000100','3'),(2,'000513','5'),(3,'000527','6'),(4,'000534','8'),(5,'000504','9'),(6,'603938','1'),(7,'000528','4'),(8,'900926','8'),(9,'204182','9'),(10,'501019','6');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(20) NOT NULL COMMENT '登录账号',
  `password` varchar(20) NOT NULL COMMENT '登录密码',
  `name` varchar(10) NOT NULL COMMENT '用户姓名',
  `user_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`name`,`user_type`) values (1,'rex','123456','Rex','Administrator'),(2,'curry','123456','Curry','Administrator'),(3,'wind','123456','Wind','Administrator'),(4,'jeff','123456','Jeff','Administrator'),(5,'tony','123456','Tony','Administrator'),(6,'koby','123456','Koby','FundManager'),(7,'thomson','123456','Thomson','FundManager'),(8,'green','123456','Green','FundManager'),(9,'durante','123456','Durante','FundManager'),(10,'james','123456','James','FundManager');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
