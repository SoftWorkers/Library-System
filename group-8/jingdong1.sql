/*
Navicat MySQL Data Transfer

Source Server         : data
Source Server Version : 80022
Source Host           : localhost:3306
Source Database       : cc

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2021-04-27 17:27:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for jingdong
-- ----------------------------
DROP TABLE IF EXISTS `jingdong`;
CREATE TABLE `jingdong` (
  `id` int DEFAULT NULL,
  `书名` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `价格` double DEFAULT NULL,
  `出版社` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of jingdong
-- ----------------------------
INSERT INTO `jingdong` VALUES ('1', '三剑客：Python', '87.3', '人民邮电出版社');
INSERT INTO `jingdong` VALUES ('2', '从入门到实践第2版+快速上手第2版+极客', '37.5', '明日科技京东自营旗舰店');
INSERT INTO `jingdong` VALUES ('3', '（套装共3册）', '86.6', '电子工业出版社');
INSERT INTO `jingdong` VALUES ('4', 'JavaScript高级程序设计 第4版(图灵出品）', '59', '人民邮电出版社');
INSERT INTO `jingdong` VALUES ('5', '零基础学Python（', '49.5', '电子工业出版社');
INSERT INTO `jingdong` VALUES ('6', '入门 项目实践 同步视频）（Python3全彩版）', '79.3', '机械工业出版社自营官方旗舰店');
INSERT INTO `jingdong` VALUES ('7', 'C++ Primer（中文版 第5版）(博文视点出品)', '72', '机械工业出版社自营官方旗舰店');
INSERT INTO `jingdong` VALUES ('8', 'C++ Primer Plus 第6版 中文版(异步图书出品)', '54', '人民邮电出版社');
INSERT INTO `jingdong` VALUES (null, '【包邮】labuladong的算法小抄(Python Java C++零基础)(博文视点出品)', '82.9', '人民邮电出版社');
