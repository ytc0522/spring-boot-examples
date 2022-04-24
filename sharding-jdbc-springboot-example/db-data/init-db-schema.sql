
-- 创建数据库
create database if not exists `sharding-jdbc0`;
create database if not exists `sharding-jdbc1`;

use `sharding-jdbc0`;

DROP TABLE IF EXISTS `t_user0`;
CREATE TABLE `t_user0` (
                           `id` int(65) NOT NULL AUTO_INCREMENT COMMENT 'id',
                           `name` varchar(10) DEFAULT NULL COMMENT '姓名',
                           `age` int(2) DEFAULT NULL COMMENT '年龄',
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_user1
-- ----------------------------
DROP TABLE IF EXISTS `t_user1`;
CREATE TABLE `t_user1` (
                           `id` int(65) NOT NULL AUTO_INCREMENT COMMENT 'id',
                           `name` varchar(10) DEFAULT NULL COMMENT '姓名',
                           `age` int(2) DEFAULT NULL COMMENT '年龄',
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_user2
-- ----------------------------
DROP TABLE IF EXISTS `t_user2`;
CREATE TABLE `t_user2` (
                           `id` int(65) NOT NULL AUTO_INCREMENT COMMENT 'id',
                           `name` varchar(10) DEFAULT NULL COMMENT '姓名',
                           `age` int(2) DEFAULT NULL COMMENT '年龄',
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;


use `sharding-jdbc1`;
DROP TABLE IF EXISTS `t_user0`;
CREATE TABLE `t_user0` (
                           `id` int(65) NOT NULL AUTO_INCREMENT COMMENT 'id',
                           `name` varchar(10) DEFAULT NULL COMMENT '姓名',
                           `age` int(2) DEFAULT NULL COMMENT '年龄',
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_user1
-- ----------------------------
DROP TABLE IF EXISTS `t_user1`;
CREATE TABLE `t_user1` (
                           `id` int(65) NOT NULL AUTO_INCREMENT COMMENT 'id',
                           `name` varchar(10) DEFAULT NULL COMMENT '姓名',
                           `age` int(2) DEFAULT NULL COMMENT '年龄',
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_user2
-- ----------------------------
DROP TABLE IF EXISTS `t_user2`;
CREATE TABLE `t_user2` (
                           `id` int(65) NOT NULL AUTO_INCREMENT COMMENT 'id',
                           `name` varchar(10) DEFAULT NULL COMMENT '姓名',
                           `age` int(2) DEFAULT NULL COMMENT '年龄',
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;




























