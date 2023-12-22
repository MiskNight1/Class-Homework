/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80034 (8.0.34)
 Source Host           : localhost:3306
 Source Schema         : ordersystem

 Target Server Type    : MySQL
 Target Server Version : 80034 (8.0.34)
 File Encoding         : 65001

 Date: 22/12/2023 19:53:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `admin_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `isdelete` int NULL DEFAULT NULL,
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('SKK11', 'xxxc', '123456', 0);
INSERT INTO `admin` VALUES ('SKK12', 'xxxb', '1234567', 0);
INSERT INTO `admin` VALUES ('SKK121', 'xxxb', '1234562', 0);
INSERT INTO `admin` VALUES ('SKK123', 'xxxb', '1234567', 0);

-- ----------------------------
-- Table structure for food
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food`  (
  `food_id` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `food_name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `introduction` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `photo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  `isdelete` int NULL DEFAULT NULL,
  PRIMARY KEY (`food_id`, `food_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES ('(116) 026 3734', 'Hui Kwok Kuen', NULL, NULL, 213.45, 0);
INSERT INTO `food` VALUES ('(121) 606 8975', 'Ma Yuning', NULL, NULL, 725.74, 0);
INSERT INTO `food` VALUES ('(1223) 54 5176', 'Ku Lai Yan', NULL, NULL, 533.40, 0);
INSERT INTO `food` VALUES ('1', '1', 'j9Ungou6Qa', 'RyBCD53tvZ', 787.47, 156);
INSERT INTO `food` VALUES ('10', '10', 'qHIsd1HtEy', 'rR6FxAAkj5', 974.21, 883);
INSERT INTO `food` VALUES ('10-172-4890', 'Cheryl Roberts', NULL, NULL, 811.08, 0);
INSERT INTO `food` VALUES ('11', '11', 'nHZTmyM9Wr', 'LKj4P7ysv4', 220.60, 561);
INSERT INTO `food` VALUES ('11-932-5443', 'Wei Zhennan', NULL, NULL, 364.48, 0);
INSERT INTO `food` VALUES ('12', '12', 'xab1p4a1wi', 'ISNstEAbsi', 929.90, 851);
INSERT INTO `food` VALUES ('13', '13', 'jL2BsiJdln', 'aWC4gmbjjY', 249.34, 89);
INSERT INTO `food` VALUES ('137-4312-5056', 'Carl West', NULL, NULL, 188.83, 0);
INSERT INTO `food` VALUES ('14', '14', '29MxgBTPcI', 'JLxZutfnyS', 87.09, 3);
INSERT INTO `food` VALUES ('15', '15', 'RwCJtQvjPl', 'CdDdyF62LA', 565.83, 438);
INSERT INTO `food` VALUES ('16', '16', 'yVmwJR4rni', '5U0SfAwNtX', 793.70, 682);
INSERT INTO `food` VALUES ('17', '17', 'DnuBS2GkSF', '7bxGFtTvs5', 399.71, 916);
INSERT INTO `food` VALUES ('18', '18', 'BrsGBSnxYX', '3Y2TPZosgh', 470.97, 477);
INSERT INTO `food` VALUES ('19', '19', 'nhGN0tBQjw', 'OooGRu2c0C', 295.92, 741);
INSERT INTO `food` VALUES ('2', '2', 'Ywu8l9uPJ5', 'yzvhXwJM6A', 246.18, 552);
INSERT INTO `food` VALUES ('20', '20', 'ML62qy0LFZ', 'O8iSStyulJ', 981.48, 37);
INSERT INTO `food` VALUES ('212-216-1962', 'Lu Yuning', NULL, NULL, 432.43, 0);
INSERT INTO `food` VALUES ('212-324-5162', 'Ishii Daisuke', NULL, NULL, 375.54, 0);
INSERT INTO `food` VALUES ('212-915-0158', 'Nicholas Hunt', NULL, NULL, 64.17, 0);
INSERT INTO `food` VALUES ('212-930-4532', 'Cheung Hiu Tung', NULL, NULL, 361.48, 0);
INSERT INTO `food` VALUES ('213-171-7688', 'Sasaki Daichi', NULL, NULL, 441.26, 0);
INSERT INTO `food` VALUES ('213-499-0300', 'Tang Yun Fat', NULL, NULL, 917.60, 0);
INSERT INTO `food` VALUES ('213-732-6719', 'Arai Hana', NULL, NULL, 195.68, 0);
INSERT INTO `food` VALUES ('213-949-3195', 'Yan Anqi', NULL, NULL, 867.11, 0);
INSERT INTO `food` VALUES ('3', '3', '55el1TWHdn', 'pUPSZSZNho', 287.26, 276);
INSERT INTO `food` VALUES ('312-440-0988', 'Arimura Kasumi', NULL, NULL, 377.51, 0);
INSERT INTO `food` VALUES ('330-894-4327', 'Watanabe Sara', NULL, NULL, 704.98, 0);
INSERT INTO `food` VALUES ('340519313064063', 'Nakayama Ayato', NULL, NULL, 304.84, 0);
INSERT INTO `food` VALUES ('346685362708985', 'Kwong Suk Yee', NULL, NULL, 881.90, 0);
INSERT INTO `food` VALUES ('3586226010172820', 'Christina Lee', NULL, NULL, 26.98, 0);
INSERT INTO `food` VALUES ('375017502183701', 'Chiang Ming', NULL, NULL, 203.92, 0);
INSERT INTO `food` VALUES ('375685568519453', 'Anne Gibson', NULL, NULL, 85.33, 0);
INSERT INTO `food` VALUES ('4', '4', 'B4cevBtDWG', '8bgSoVrd05', 132.48, 219);
INSERT INTO `food` VALUES ('4271037455944849', 'Hsuan Tin Lok', NULL, NULL, 90.87, 0);
INSERT INTO `food` VALUES ('4325409050411456', 'Du Jiehong', NULL, NULL, 437.49, 0);
INSERT INTO `food` VALUES ('4448294511106891', 'Yuen Ming', NULL, NULL, 77.58, 0);
INSERT INTO `food` VALUES ('4741093134967240', 'Nakamura Hikaru', NULL, NULL, 98.02, 0);
INSERT INTO `food` VALUES ('4903951445868031', 'Miu Yun Fat', NULL, NULL, 729.74, 0);
INSERT INTO `food` VALUES ('4954637639633939', 'Xie Xiaoming', NULL, NULL, 73.00, 0);
INSERT INTO `food` VALUES ('5', '5', 'mOHAcNTbOh', 'OiI6K7fbHh', 442.55, 825);
INSERT INTO `food` VALUES ('5190003504075196', 'Mo Zhennan', NULL, NULL, 702.69, 0);
INSERT INTO `food` VALUES ('5307636917372179', 'Nancy Parker', NULL, NULL, 677.69, 0);
INSERT INTO `food` VALUES ('5455868557197604', 'Ng Ka Keung', NULL, NULL, 86.35, 0);
INSERT INTO `food` VALUES ('5484507773665193', 'Wang Jiehong', NULL, NULL, 494.44, 0);
INSERT INTO `food` VALUES ('6', '6', 'Z9m3SoITAV', 'SqXd5dm6cv', 973.63, 698);
INSERT INTO `food` VALUES ('6246511961152169', 'Miyazaki Sakura', NULL, NULL, 364.26, 0);
INSERT INTO `food` VALUES ('6263758246119624', 'Choi Lai Yan', NULL, NULL, 376.67, 0);
INSERT INTO `food` VALUES ('6267132198319127', 'Pak Tsz Hin', NULL, NULL, 233.97, 0);
INSERT INTO `food` VALUES ('6283635477934374', 'Frederick Williams', NULL, NULL, 356.96, 0);
INSERT INTO `food` VALUES ('6285170590980078', 'Yoshida Yuna', NULL, NULL, 985.76, 0);
INSERT INTO `food` VALUES ('7', '7', 'H4yOBDUyvE', '8UqjPuLc4q', 531.34, 274);
INSERT INTO `food` VALUES ('7080 372333', 'Hsuan Hiu Tung', NULL, NULL, 857.83, 0);
INSERT INTO `food` VALUES ('7555 317368', 'Carol Woods', NULL, NULL, 921.98, 0);
INSERT INTO `food` VALUES ('7710 335208', 'Johnny Rogers', NULL, NULL, 931.82, 0);
INSERT INTO `food` VALUES ('8', '8', 'TJZbFh4L0M', 'IJWEcdVBKG', 937.87, 726);
INSERT INTO `food` VALUES ('80-7287-4009', 'Lok Sze Kwan', NULL, NULL, 126.17, 0);
INSERT INTO `food` VALUES ('9', '9', 'P3ATmfhGE2', 'Ux3Jqn42jy', 460.90, 794);
INSERT INTO `food` VALUES ('sss', '饺子', 'ok', NULL, 123.00, 0);
INSERT INTO `food` VALUES ('sys123', '云吞', '好吃的食物', NULL, 20.00, 0);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `user_name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phonenumber` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `isdelete` int NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE,
  INDEX `phonenumber`(`phonenumber` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('13714226383', '宋铠轩', '13714226383', '123456', 0);
INSERT INTO `user` VALUES ('SKX', NULL, NULL, '123546', 0);
INSERT INTO `user` VALUES ('SKX12', 'handsome boy', NULL, '123546', 0);

-- ----------------------------
-- Table structure for 订单表
-- ----------------------------
DROP TABLE IF EXISTS `订单表`;
CREATE TABLE `订单表`  (
  `order_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `status` int NULL DEFAULT NULL,
  `total_price` decimal(10, 2) NULL DEFAULT NULL,
  `order_time` datetime NULL DEFAULT NULL,
  `order_place` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `user_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `isDelete` int NULL DEFAULT NULL,
  `phonenumber` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE,
  INDEX `user_id`(`user_id` ASC) USING BTREE,
  INDEX `phonenumber`(`phonenumber` ASC) USING BTREE,
  CONSTRAINT `phonenumber` FOREIGN KEY (`phonenumber`) REFERENCES `user` (`phonenumber`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of 订单表
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
