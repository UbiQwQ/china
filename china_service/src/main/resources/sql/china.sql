/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50617
 Source Host           : localhost:3306
 Source Schema         : china

 Target Server Type    : MySQL
 Target Server Version : 50617
 File Encoding         : 65001

 Date: 12/07/2018 16:55:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for blct_sticker
-- ----------------------------
DROP TABLE IF EXISTS `blct_sticker`;
CREATE TABLE `blct_sticker`  (
  `stickerid` int(11) NOT NULL AUTO_INCREMENT,
  `message` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '留言',
  `createtime` datetime(0) DEFAULT NULL COMMENT '创建时间',
  `valid` tinyint(4) DEFAULT NULL COMMENT '是否有效0否1是',
  `nickname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '昵称',
  `userid` int(11) DEFAULT NULL COMMENT '用户编号',
  PRIMARY KEY (`stickerid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for blct_user
-- ----------------------------
DROP TABLE IF EXISTS `blct_user`;
CREATE TABLE `blct_user`  (
  `userid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `nickname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '昵称',
  `username` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '密码',
  `createtime` datetime(0) DEFAULT NULL COMMENT '创建时间',
  `qq` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT 'QQ',
  `wechat` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '微信',
  `valid` tinyint(4) DEFAULT NULL COMMENT '是否有效0否1是',
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
