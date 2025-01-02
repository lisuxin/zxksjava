/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 80036
Source Host           : localhost:3306
Source Database       : zxkssjk

Target Server Type    : MYSQL
Target Server Version : 80036
File Encoding         : 65001

Date: 2024-12-31 20:51:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for zxkssjk
-- ----------------------------
DROP TABLE IF EXISTS `zxkssjk`;
CREATE TABLE `zxkssjk` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `date_of_birth` date NOT NULL,
  `gender` enum('Male','Female','Other','Prefer not to say') NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `address` text,
  `city` varchar(100) DEFAULT NULL,
  `postal_code` varchar(20) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `encrypted_password` varchar(255) NOT NULL,
  `ssn_hash` char(64) DEFAULT NULL,
  `profile_picture` longblob,
  `emergency_contact_name` varchar(100) DEFAULT NULL,
  `emergency_contact_phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of zxkssjk
-- ----------------------------
INSERT INTO `zxkssjk` VALUES ('1', 'Alice', 'Smith', '1985-03-15', 'Female', 'alice.smith@example.com', '+1234567890', '123 Elm Street', 'Springfield', '12345', 'USA', '2024-12-31 16:50:40', '2024-12-31 16:50:40', 'hashed_password_1', 'hashed_ssn_1', null, 'Bob Smith', '+0987654321');
INSERT INTO `zxkssjk` VALUES ('2', 'Bob', 'Johnson', '1990-07-22', 'Male', 'bob.johnson@example.com', '+2345678901', '456 Oak Avenue', 'Metropolis', '23456', 'USA', '2024-12-31 16:50:40', '2024-12-31 16:50:40', 'hashed_password_2', 'hashed_ssn_2', null, 'Alice Johnson', '+1234567890');
INSERT INTO `zxkssjk` VALUES ('3', 'Charlie', 'Brown', '1988-11-30', 'Male', 'charlie.brown@example.com', '+3456789012', '789 Pine Road', 'Gotham', '34567', 'USA', '2024-12-31 16:50:40', '2024-12-31 16:50:40', 'hashed_password_3', 'hashed_ssn_3', null, 'Sally Brown', '+2345678901');
INSERT INTO `zxkssjk` VALUES ('4', 'Diana', 'Prince', '1992-05-10', 'Female', 'diana.prince@example.com', '+4567890123', '1011 Birch Lane', 'Star City', '45678', 'USA', '2024-12-31 16:50:41', '2024-12-31 16:50:41', 'hashed_password_4', 'hashed_ssn_4', null, 'Clark Prince', '+3456789012');
INSERT INTO `zxkssjk` VALUES ('5', 'Edward', 'Leeds', '1987-09-05', 'Male', 'edward.leeds@example.com', '+5678901234', '1213 Cedar Drive', 'Central City', '56789', 'USA', '2024-12-31 16:50:41', '2024-12-31 16:50:41', 'hashed_password_5', 'hashed_ssn_5', null, 'Fiona Leeds', '+4567890123');
INSERT INTO `zxkssjk` VALUES ('6', 'Fiona', 'Green', '1995-02-14', 'Female', 'fiona.green@example.com', '+6789012345', '1415 Maple Court', 'Hub City', '67890', 'USA', '2024-12-31 16:50:41', '2024-12-31 16:50:41', 'hashed_password_6', 'hashed_ssn_6', null, 'George Green', '+5678901234');
INSERT INTO `zxkssjk` VALUES ('7', 'George', 'Hill', '1989-12-25', 'Male', 'george.hill@example.com', '+7890123456', '1617 Walnut Street', 'Emerald City', '78901', 'USA', '2024-12-31 16:50:41', '2024-12-31 16:50:41', 'hashed_password_7', 'hashed_ssn_7', null, 'Helen Hill', '+6789012345');
INSERT INTO `zxkssjk` VALUES ('8', 'Helen', 'Adams', '1993-08-18', 'Female', 'helen.adams@example.com', '+8901234567', '1819 Spruce Avenue', 'Mystic Town', '89012', 'USA', '2024-12-31 16:50:41', '2024-12-31 16:50:41', 'hashed_password_8', 'hashed_ssn_8', null, 'Ian Adams', '+7890123456');
INSERT INTO `zxkssjk` VALUES ('9', 'Ian', 'Brown', '1991-04-12', 'Male', 'ian.brown@example.com', '+9012345678', '2021 Ash Road', 'Riverdale', '90123', 'USA', '2024-12-31 16:50:41', '2024-12-31 16:50:41', 'hashed_password_9', 'hashed_ssn_9', null, 'Jenny Brown', '+8901234567');
INSERT INTO `zxkssjk` VALUES ('10', 'Jenny', 'Wilson', '1994-06-29', 'Female', 'jenny.wilson@example.com', '+0123456789', '2223 Birch Lane', 'Harbor City', '01234', 'USA', '2024-12-31 16:50:41', '2024-12-31 16:50:41', 'hashed_password_10', 'hashed_ssn_10', null, 'Kevin Wilson', '+9012345678');
INSERT INTO `zxkssjk` VALUES ('11', 'Kevin', 'Miller', '1986-01-07', 'Male', 'kevin.miller@example.com', '+1234567890', '2425 Cedar Drive', 'Baytown', '12345', 'USA', '2024-12-31 16:50:41', '2024-12-31 16:50:41', 'hashed_password_11', 'hashed_ssn_11', null, 'Laura Miller', '+0123456789');
INSERT INTO `zxkssjk` VALUES ('12', 'Laura', 'Taylor', '1990-03-21', 'Female', 'laura.taylor@example.com', '+2345678901', '2627 Maple Court', 'Sunset Beach', '23456', 'USA', '2024-12-31 16:50:41', '2024-12-31 16:50:41', 'hashed_password_12', 'hashed_ssn_12', null, 'Michael Taylor', '+1234567890');
INSERT INTO `zxkssjk` VALUES ('13', 'Michael', 'Davis', '1988-05-15', 'Male', 'michael.davis@example.com', '+3456789012', '2829 Walnut Street', 'Mountain View', '34567', 'USA', '2024-12-31 16:50:41', '2024-12-31 16:50:41', 'hashed_password_13', 'hashed_ssn_13', null, 'Nina Davis', '+2345678901');
INSERT INTO `zxkssjk` VALUES ('14', 'Nina', 'Anderson', '1992-07-30', 'Female', 'nina.anderson@example.com', '+4567890123', '3031 Spruce Avenue', 'Forest Hills', '45678', 'USA', '2024-12-31 16:50:41', '2024-12-31 16:50:41', 'hashed_password_14', 'hashed_ssn_14', null, 'Oliver Anderson', '+3456789012');
INSERT INTO `zxkssjk` VALUES ('15', 'Oliver', 'Thomas', '1987-09-10', 'Male', 'oliver.thomas@example.com', '+5678901234', '3233 Ash Road', 'Lakeview', '56789', 'USA', '2024-12-31 16:50:41', '2024-12-31 16:50:41', 'hashed_password_15', 'hashed_ssn_15', null, 'Patricia Thomas', '+4567890123');
INSERT INTO `zxkssjk` VALUES ('16', 'Patricia', 'Moore', '1995-11-25', 'Female', 'patricia.moore@example.com', '+6789012345', '3435 Birch Lane', 'Seaside', '67890', 'USA', '2024-12-31 16:50:41', '2024-12-31 16:50:41', 'hashed_password_16', 'hashed_ssn_16', null, 'Quincy Moore', '+5678901234');
INSERT INTO `zxkssjk` VALUES ('17', 'Quincy', 'Jackson', '1989-02-14', 'Male', 'quincy.jackson@example.com', '+7890123456', '3637 Cedar Drive', 'Desert Valley', '78901', 'USA', '2024-12-31 16:50:41', '2024-12-31 16:50:41', 'hashed_password_17', 'hashed_ssn_17', null, 'Rachel Jackson', '+6789012345');
