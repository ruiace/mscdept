/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : clouddb03

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-08-08 18:40:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dept`
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '开发一部', 'clouddb03');
INSERT INTO `dept` VALUES ('2', '开发二部', 'clouddb03');
INSERT INTO `dept` VALUES ('3', '开发三部', 'clouddb03');
INSERT INTO `dept` VALUES ('4', '开发四部', 'clouddb03');
