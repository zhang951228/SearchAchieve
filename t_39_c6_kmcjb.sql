/*
Navicat MySQL Data Transfer

Source Server         : MySql80
Source Server Version : 80018
Source Host           : 127.0.0.1:3306
Source Database       : db_9004

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2019-12-26 16:17:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_39_c6_kmcjb`
-- ----------------------------
DROP TABLE IF EXISTS `t_39_c6_kmcjb`;
CREATE TABLE `t_39_c6_kmcjb` (
  `KSID` varchar(32) DEFAULT NULL,
  `KSH` varchar(32) NOT NULL,
  `BMH` varchar(32) DEFAULT NULL,
  `XM` varchar(16) DEFAULT NULL,
  `ZZDM` varchar(10) DEFAULT NULL,
  `KC` varchar(16) DEFAULT NULL,
  `ZH` varchar(16) DEFAULT NULL,
  `NJDM` varchar(4) DEFAULT NULL,
  `ZYDM` varchar(32) DEFAULT NULL,
  `BJ` varchar(32) DEFAULT NULL,
  `JXB` varchar(32) DEFAULT NULL,
  `RKJS` varchar(32) DEFAULT NULL,
  `PM` int(11) DEFAULT NULL,
  `XXPM` int(11) DEFAULT NULL,
  `BJPM` int(11) DEFAULT NULL,
  `KMCJ` decimal(6,2) DEFAULT NULL,
  `KGTCJ` decimal(6,2) DEFAULT NULL,
  `ZGTCJ` decimal(6,2) DEFAULT NULL,
  `QKBZ` char(1) NOT NULL DEFAULT '0',
  `WJBZ` char(1) NOT NULL DEFAULT '0',
  `OMR` varchar(1000) DEFAULT NULL,
  `OMRKXD` varchar(1000) DEFAULT NULL,
  `OCR` varchar(1000) DEFAULT NULL,
  `OCRKXD` varchar(1000) DEFAULT NULL,
  `SMSJ` datetime DEFAULT NULL,
  `SMIP` varchar(32) DEFAULT NULL,
  `SMMAC` varchar(32) DEFAULT NULL,
  `SMYH` varchar(32) DEFAULT NULL,
  `QFBZ` char(1) NOT NULL DEFAULT '0',
  `ZTCSBZ` char(1) NOT NULL DEFAULT '0',
  `SMYC` char(1) NOT NULL DEFAULT '0',
  `SMZT` char(1) NOT NULL DEFAULT '0',
  `QKZJR` varchar(32) DEFAULT NULL,
  `QKZJSJ` datetime DEFAULT NULL,
  `WJZJR` varchar(32) DEFAULT NULL,
  `WJZJSJ` datetime DEFAULT NULL,
  `OMRZJBZ` char(1) NOT NULL DEFAULT '0',
  `OMRZJR` varchar(32) DEFAULT NULL,
  `OMRZJSJ` datetime DEFAULT NULL,
  `GJZZJBZ` char(1) NOT NULL DEFAULT '0',
  `GJZZJR` varchar(32) DEFAULT NULL,
  `GJZZJSJ` datetime DEFAULT NULL,
  `OMRCJBZ` char(1) NOT NULL DEFAULT '0',
  `OMRCJR` varchar(32) DEFAULT NULL,
  `OMRCJSJ` datetime DEFAULT NULL,
  `ZTCJBZ` char(1) NOT NULL DEFAULT '0',
  `ZTCJR` varchar(32) DEFAULT NULL,
  `ZTCJSJ` datetime DEFAULT NULL,
  `OCRZJBZ` char(1) NOT NULL DEFAULT '0',
  `OCRZJR` varchar(32) DEFAULT NULL,
  `OCRZJSJ` datetime DEFAULT NULL,
  `OCRCJBZ` char(1) NOT NULL DEFAULT '0',
  `OCRCJR` varchar(32) DEFAULT NULL,
  `OCRCJSJ` datetime DEFAULT NULL,
  `SJZS` int(11) DEFAULT '0',
  `QFTSL` int(11) DEFAULT '0',
  `SFCX` char(1) DEFAULT '0',
  `KGTXX_12` varchar(10) DEFAULT NULL,
  `KGTXX_13` varchar(10) DEFAULT NULL,
  `KGTDF_12` decimal(6,2) DEFAULT NULL,
  `KGTDF_13` decimal(6,2) DEFAULT NULL,
  `ZGT_4` decimal(6,2) DEFAULT NULL,
  `ZGT_4_1` decimal(6,2) DEFAULT NULL,
  `ZGT_4_2` decimal(6,2) DEFAULT NULL,
  `ZGT_4_3` decimal(6,2) DEFAULT NULL,
  `ZGT_4_4` decimal(6,2) DEFAULT NULL,
  `ZGT_4_5` decimal(6,2) DEFAULT NULL,
  `SFPC` char(1) DEFAULT '0',
  `DZDABZ` char(1) DEFAULT '0',
  PRIMARY KEY (`KSH`),
  UNIQUE KEY `KSID_UQ` (`KSID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_39_c6_kmcjb
-- ----------------------------
INSERT INTO `t_39_c6_kmcjb` VALUES ('201330093', '201330093', '2051805170320210047', '袁新瑜', '1', '02', '16', null, null, '高三01', null, null, '3', '3', '1', '6.00', '6.00', '0.00', '0', '0', null, null, null, null, null, null, null, null, '0', '0', '0', '1', null, null, null, null, '0', null, null, '0', null, null, '0', null, null, '0', null, null, '0', null, null, '0', null, null, '0', '0', '0', 'B', 'C', '3.00', '3.00', null, null, null, null, null, null, '0', '0');
