/*
Navicat MySQL Data Transfer

Source Server         : LocalHost
Source Server Version : 50711
Source Host           : localhost:3307
Source Database       : corendsexamjuly2016

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-08-15 23:42:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `departments`
-- ----------------------------
DROP TABLE IF EXISTS `departments`;
CREATE TABLE `departments` (
  `dept_no` char(4) NOT NULL,
  `dept_name` varchar(40) NOT NULL,
  PRIMARY KEY (`dept_no`),
  UNIQUE KEY `dept_name` (`dept_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of departments
-- ----------------------------
INSERT INTO `departments` VALUES ('2', 'Accounts');
INSERT INTO `departments` VALUES ('3', 'HR');
INSERT INTO `departments` VALUES ('1', 'IT Solution');

-- ----------------------------
-- Table structure for `dept_emp`
-- ----------------------------
DROP TABLE IF EXISTS `dept_emp`;
CREATE TABLE `dept_emp` (
  `emp_no` int(11) NOT NULL,
  `dept_no` char(4) NOT NULL,
  `from_date` date NOT NULL,
  `to_date` date NOT NULL,
  PRIMARY KEY (`emp_no`,`dept_no`),
  KEY `dept_no` (`dept_no`),
  CONSTRAINT `dept_emp_ibfk_1` FOREIGN KEY (`emp_no`) REFERENCES `employees` (`emp_no`) ON DELETE CASCADE,
  CONSTRAINT `dept_emp_ibfk_2` FOREIGN KEY (`dept_no`) REFERENCES `departments` (`dept_no`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of dept_emp
-- ----------------------------
INSERT INTO `dept_emp` VALUES ('101', '1', '2016-07-01', '2016-08-30');
INSERT INTO `dept_emp` VALUES ('102', '1', '2016-08-15', '2016-08-15');

-- ----------------------------
-- Table structure for `dept_manager`
-- ----------------------------
DROP TABLE IF EXISTS `dept_manager`;
CREATE TABLE `dept_manager` (
  `emp_no` int(11) NOT NULL,
  `dept_no` char(4) NOT NULL,
  `from_date` date NOT NULL,
  `to_date` date NOT NULL,
  PRIMARY KEY (`emp_no`,`dept_no`),
  KEY `dept_no` (`dept_no`),
  CONSTRAINT `dept_manager_ibfk_1` FOREIGN KEY (`emp_no`) REFERENCES `employees` (`emp_no`) ON DELETE CASCADE,
  CONSTRAINT `dept_manager_ibfk_2` FOREIGN KEY (`dept_no`) REFERENCES `departments` (`dept_no`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of dept_manager
-- ----------------------------
INSERT INTO `dept_manager` VALUES ('101', '1', '2016-08-15', '2016-08-15');

-- ----------------------------
-- Table structure for `employees`
-- ----------------------------
DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `emp_no` int(11) NOT NULL,
  `birth_date` date NOT NULL,
  `first_name` varchar(14) NOT NULL,
  `last_name` varchar(16) NOT NULL,
  `gender` enum('M','F') NOT NULL,
  `hire_date` date NOT NULL,
  `emp_status` int(4) DEFAULT '1',
  PRIMARY KEY (`emp_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of employees
-- ----------------------------
INSERT INTO `employees` VALUES ('101', '1987-08-15', 'Tanvir', 'Ahmmed', 'M', '2000-08-15', '1');
INSERT INTO `employees` VALUES ('102', '1998-08-15', 'Tanzir', 'Ahmmed', 'M', '2011-08-03', '1');
INSERT INTO `employees` VALUES ('110', '1981-01-07', 'Kamrul', 'Hasan', 'M', '2000-10-20', '1');
INSERT INTO `employees` VALUES ('111', '1981-01-07', 'Kamrul', 'Hasan', 'M', '2000-10-20', '1');
INSERT INTO `employees` VALUES ('112', '1981-01-07', 'Kamrul', 'Hasan', 'M', '2000-10-20', '1');
INSERT INTO `employees` VALUES ('113', '1981-01-07', 'Kamrul', 'Hasan', 'M', '2000-10-20', '1');
INSERT INTO `employees` VALUES ('114', '1981-01-07', 'Kamrul', 'Hasan', 'M', '2000-10-20', '1');
INSERT INTO `employees` VALUES ('115', '1981-01-07', 'Kamrul', 'Hasan', 'M', '2000-10-20', '1');
INSERT INTO `employees` VALUES ('116', '1981-01-07', 'Kamrul', 'Hasan', 'M', '2000-10-20', '1');
INSERT INTO `employees` VALUES ('117', '1981-01-07', 'Kamrul', 'Hasan', 'M', '2000-10-20', '1');
INSERT INTO `employees` VALUES ('120', '1981-01-07', 'Kamrul', 'Hasan', 'M', '2000-10-20', '1');
INSERT INTO `employees` VALUES ('121', '1981-01-07', 'Kamrul', 'Hasan', 'M', '2000-10-20', '1');
INSERT INTO `employees` VALUES ('122', '1981-01-07', 'Kamrul', 'Hasan', 'M', '2000-10-20', '1');

-- ----------------------------
-- Table structure for `salaries`
-- ----------------------------
DROP TABLE IF EXISTS `salaries`;
CREATE TABLE `salaries` (
  `emp_no` int(11) NOT NULL,
  `salary` int(11) NOT NULL,
  `from_date` date NOT NULL,
  `to_date` date NOT NULL,
  PRIMARY KEY (`emp_no`,`from_date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of salaries
-- ----------------------------
INSERT INTO `salaries` VALUES ('101', '25000', '2016-08-15', '2016-08-16');

-- ----------------------------
-- Table structure for `tbl_bubblesort`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_bubblesort`;
CREATE TABLE `tbl_bubblesort` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SortingNumbers` bigint(20) DEFAULT NULL,
  `ExecutionTime` varchar(255) DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_bubblesort
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_bucketsort`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_bucketsort`;
CREATE TABLE `tbl_bucketsort` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SortingNumbers` bigint(20) DEFAULT NULL,
  `ExecutionTime` varchar(255) DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_bucketsort
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_datareader`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_datareader`;
CREATE TABLE `tbl_datareader` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TextData` text NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_datareader
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_heapsort`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_heapsort`;
CREATE TABLE `tbl_heapsort` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SortingNumbers` bigint(20) DEFAULT NULL,
  `ExecutionTime` varchar(255) DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_heapsort
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_insertionsort`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_insertionsort`;
CREATE TABLE `tbl_insertionsort` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SortingNumbers` bigint(20) DEFAULT NULL,
  `ExecutionTime` varchar(255) DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_insertionsort
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_map_data`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_map_data`;
CREATE TABLE `tbl_map_data` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MapKey` text,
  `MapValue` text,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_map_data
-- ----------------------------
INSERT INTO `tbl_map_data` VALUES ('1', 'USA', '[NY, CO, LA]');
INSERT INTO `tbl_map_data` VALUES ('2', 'UK', '[London, Kent, Manchester]');
INSERT INTO `tbl_map_data` VALUES ('3', 'Bangladesh', '[Dhaka, Comilla, Sylhet]');
INSERT INTO `tbl_map_data` VALUES ('4', 'USA', '[NY, CO, LA]');
INSERT INTO `tbl_map_data` VALUES ('5', 'UK', '[London, Kent, Manchester]');
INSERT INTO `tbl_map_data` VALUES ('6', 'Bangladesh', '[Dhaka, Comilla, Sylhet]');
INSERT INTO `tbl_map_data` VALUES ('7', 'USA', '[NY, CO, LA]');
INSERT INTO `tbl_map_data` VALUES ('8', 'UK', '[London, Kent, Manchester]');
INSERT INTO `tbl_map_data` VALUES ('9', 'Bangladesh', '[Dhaka, Comilla, Sylhet]');

-- ----------------------------
-- Table structure for `tbl_mergesort`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_mergesort`;
CREATE TABLE `tbl_mergesort` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SortingNumbers` bigint(20) DEFAULT NULL,
  `ExecutionTime` varchar(255) DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_mergesort
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_pattern`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_pattern`;
CREATE TABLE `tbl_pattern` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PatternNumbers` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_pattern
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_primenumber`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_primenumber`;
CREATE TABLE `tbl_primenumber` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PNumbers` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_primenumber
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_quicksort`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_quicksort`;
CREATE TABLE `tbl_quicksort` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SortingNumbers` bigint(20) DEFAULT NULL,
  `ExecutionTime` varchar(255) DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_quicksort
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_shellsort`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_shellsort`;
CREATE TABLE `tbl_shellsort` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SortingNumbers` bigint(20) DEFAULT NULL,
  `ExecutionTime` varchar(255) DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_shellsort
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_student`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_student`;
CREATE TABLE `tbl_student` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `StudentDetails` text,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_student
-- ----------------------------
INSERT INTO `tbl_student` VALUES ('1', 'Student(id= 1)\"Marc\" \"Carp\"  Grade = B');
INSERT INTO `tbl_student` VALUES ('2', 'Student(id= 2)\"Israt\" \"Khan\"  Grade = A');
INSERT INTO `tbl_student` VALUES ('3', 'Student(id= 3)\"Mohi\" \"Uddin\"  Grade = A');
INSERT INTO `tbl_student` VALUES ('4', 'Student(id= 4)\"Abrar\" \"Hossain\"  Grade = B');
INSERT INTO `tbl_student` VALUES ('5', 'Student(id= 5)\"Abida\" \"Sultana\"  Grade = C');
INSERT INTO `tbl_student` VALUES ('6', 'Student(id= 1)\"Marc\" \"Carp\"  Grade = B');
INSERT INTO `tbl_student` VALUES ('7', 'Student(id= 2)\"Israt\" \"Khan\"  Grade = A');
INSERT INTO `tbl_student` VALUES ('8', 'Student(id= 3)\"Mohi\" \"Uddin\"  Grade = A');
INSERT INTO `tbl_student` VALUES ('9', 'Student(id= 4)\"Abrar\" \"Hossain\"  Grade = B');
INSERT INTO `tbl_student` VALUES ('10', 'Student(id= 5)\"Abida\" \"Sultana\"  Grade = C');
INSERT INTO `tbl_student` VALUES ('11', 'Student(id= 1)\"Marc\" \"Carp\"  Grade = B');
INSERT INTO `tbl_student` VALUES ('12', 'Student(id= 2)\"Israt\" \"Khan\"  Grade = A');
INSERT INTO `tbl_student` VALUES ('13', 'Student(id= 3)\"Mohi\" \"Uddin\"  Grade = A');
INSERT INTO `tbl_student` VALUES ('14', 'Student(id= 4)\"Abrar\" \"Hossain\"  Grade = B');
INSERT INTO `tbl_student` VALUES ('15', 'Student(id= 5)\"Abida\" \"Sultana\"  Grade = C');
INSERT INTO `tbl_student` VALUES ('16', 'Student(id= 1)\"Marc\" \"Carp\"  Grade = B');
INSERT INTO `tbl_student` VALUES ('17', 'Student(id= 2)\"Israt\" \"Khan\"  Grade = A');
INSERT INTO `tbl_student` VALUES ('18', 'Student(id= 3)\"Mohi\" \"Uddin\"  Grade = A');
INSERT INTO `tbl_student` VALUES ('19', 'Student(id= 4)\"Abrar\" \"Hossain\"  Grade = B');
INSERT INTO `tbl_student` VALUES ('20', 'Student(id= 5)\"Abida\" \"Sultana\"  Grade = C');

-- ----------------------------
-- Table structure for `titles`
-- ----------------------------
DROP TABLE IF EXISTS `titles`;
CREATE TABLE `titles` (
  `emp_no` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `from_date` date NOT NULL,
  `to_date` date DEFAULT NULL,
  PRIMARY KEY (`emp_no`,`title`,`from_date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of titles
-- ----------------------------
INSERT INTO `titles` VALUES ('101', 'Software Engineer', '2016-08-15', '2016-08-15');
