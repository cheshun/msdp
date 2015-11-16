/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : msdp

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2015-06-01 07:56:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `channel_registersource`
-- ----------------------------
DROP TABLE IF EXISTS `channel_registersource`;
CREATE TABLE `channel_registersource` (
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `ts` varchar(255) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `pk_registersource` varchar(20) NOT NULL,
  `registersource` int(30) DEFAULT NULL,
  `sourcename` varchar(30) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pk_registersource`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of channel_registersource
-- ----------------------------
INSERT INTO `channel_registersource` VALUES (null, null, null, null, null, null, '0', '0001AA100000000000DX', '10', '百米注册用户查询', null);
INSERT INTO `channel_registersource` VALUES (null, null, null, null, null, null, '0', '0001AA100000000000IT', '13', '微信订阅号', null);
INSERT INTO `channel_registersource` VALUES (null, null, null, null, null, null, '0', '0001AA100000000000JU', '12', '百度推广（新）', null);
INSERT INTO `channel_registersource` VALUES (null, null, null, null, null, null, '0', '0001AA100000000000KR', '19', '微信自媒体注册新', null);
INSERT INTO `channel_registersource` VALUES (null, null, null, null, null, null, '0', '0001AA100000000000NH', '14', '百度移动推广（新）', null);
INSERT INTO `channel_registersource` VALUES (null, null, null, null, null, null, '0', '0001AA100000000000OX', '15', '360猜你喜欢', null);

-- ----------------------------
-- Table structure for `pkrecover`
-- ----------------------------
DROP TABLE IF EXISTS `pkrecover`;
CREATE TABLE `pkrecover` (
  `pk` char(20) NOT NULL,
  `ts` datetime DEFAULT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pkrecover
-- ----------------------------
INSERT INTO `pkrecover` VALUES ('0001AA100000000000IU', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000IV', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000IW', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000IX', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000IY', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000IZ', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000J0', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000J1', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000J2', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000J3', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000J4', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000J5', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000J6', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000J7', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000J8', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000J9', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000OY', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000P5', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000P6', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000P7', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000P8', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000P9', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000PA', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000PB', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000PC', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000PD', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000PE', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000PF', null);
INSERT INTO `pkrecover` VALUES ('0001AA100000000000YA', null);
INSERT INTO `pkrecover` VALUES ('0001AA1000000000010I', null);
INSERT INTO `pkrecover` VALUES ('0001AA1000000000010J', null);
INSERT INTO `pkrecover` VALUES ('0001AA1000000000010O', null);
INSERT INTO `pkrecover` VALUES ('0001AA1000000000010P', null);
INSERT INTO `pkrecover` VALUES ('0001AA1000000000010Q', null);
INSERT INTO `pkrecover` VALUES ('0001AA1000000000010R', null);
INSERT INTO `pkrecover` VALUES ('0001AA1000000000010S', null);
INSERT INTO `pkrecover` VALUES ('0001AA1000000000010T', null);
INSERT INTO `pkrecover` VALUES ('0001AA1000000000010U', null);
INSERT INTO `pkrecover` VALUES ('0001AA1000000000010V', null);
INSERT INTO `pkrecover` VALUES ('0001AA1000000000010W', null);
INSERT INTO `pkrecover` VALUES ('0001AA1000000000010X', null);

-- ----------------------------
-- Table structure for `pub_metadata`
-- ----------------------------
DROP TABLE IF EXISTS `pub_metadata`;
CREATE TABLE `pub_metadata` (
  `pk_metadata` char(20) NOT NULL,
  `pk_metadata_type` char(20) DEFAULT NULL,
  `metadata_name` varchar(30) DEFAULT NULL,
  `metadata_code` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk_metadata`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pub_metadata
-- ----------------------------
INSERT INTO `pub_metadata` VALUES ('0001AA100000000000YR', '0001AA100000000000YK', '管理员用户', 'admin', null, null, null, null, null, null, '2014-10-07 15:50:09', '0');
INSERT INTO `pub_metadata` VALUES ('0001AA100000000000YS', '0001AA100000000000YK', '普通用户', 'normal', null, null, null, null, null, null, '2014-10-07 15:50:25', '0');
INSERT INTO `pub_metadata` VALUES ('0001AA100000000000YT', '0001AA100000000000YK', 'vip', 'vip', null, null, null, null, null, null, '2014-10-07 15:50:37', '0');
INSERT INTO `pub_metadata` VALUES ('0001AA100000000000YU', '0001AA100000000000YK', '测试用户', 'test', null, null, null, null, null, null, '2014-10-07 15:50:50', '0');
INSERT INTO `pub_metadata` VALUES ('0001AA100000000000YV', '0001AA100000000000YK', '用户类型一', 'u1', null, null, null, null, null, null, '2014-10-07 15:51:02', '0');
INSERT INTO `pub_metadata` VALUES ('0001AA100000000000YW', '0001AA100000000000YK', '用户类型二', 'u2', null, null, null, null, null, null, '2014-10-07 15:51:13', '0');
INSERT INTO `pub_metadata` VALUES ('0001AA100000000000YX', '0001AA100000000000YK', '用户类型三', 'u3', null, null, null, null, null, null, '2014-10-07 15:51:23', '0');
INSERT INTO `pub_metadata` VALUES ('0001AA100000000000YY', '0001AA100000000000YK', '用户类型四', 'u4', null, null, null, null, null, null, '2014-10-07 15:51:32', '0');

-- ----------------------------
-- Table structure for `pub_metadata_type`
-- ----------------------------
DROP TABLE IF EXISTS `pub_metadata_type`;
CREATE TABLE `pub_metadata_type` (
  `pk_metadata_type` char(20) NOT NULL,
  `type_name` varchar(50) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `type_code` varchar(30) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `ts` varchar(255) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk_metadata_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pub_metadata_type
-- ----------------------------
INSERT INTO `pub_metadata_type` VALUES ('0001AA100000000000YK', '用户类型', '121212', 'user_type', '', '', '', '', '', '2015-03-16 17:10:36', '0');

-- ----------------------------
-- Table structure for `pub_oid`
-- ----------------------------
DROP TABLE IF EXISTS `pub_oid`;
CREATE TABLE `pub_oid` (
  `oid` varchar(20) NOT NULL DEFAULT '',
  `ts` varchar(19) DEFAULT NULL,
  `pk_corp` varchar(4) NOT NULL,
  `dr` int(11) DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pub_oid
-- ----------------------------
INSERT INTO `pub_oid` VALUES ('1000000000017E', '2015-06-01 07:48:59', '0001', '0');

-- ----------------------------
-- Table structure for `pub_task`
-- ----------------------------
DROP TABLE IF EXISTS `pub_task`;
CREATE TABLE `pub_task` (
  `pk_taskunit` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `priority` varchar(255) DEFAULT NULL,
  `period` varchar(255) DEFAULT NULL,
  `period_unit` varchar(255) DEFAULT NULL,
  `delay` varchar(255) DEFAULT NULL,
  `taskplugin` varchar(255) DEFAULT NULL,
  `startTime` varchar(255) DEFAULT NULL,
  `runnable` varchar(255) DEFAULT NULL,
  `ts` varchar(255) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk_taskunit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pub_task
-- ----------------------------
INSERT INTO `pub_task` VALUES ('0001AA1000000000ABCT', 'cleanUpDB', 'low', '2', 'SECOND', '0', 'cheng.pipp.business.task.CleanUpDBTask', '0', 'true', null, '0');

-- ----------------------------
-- Table structure for `pub_taskdeploy`
-- ----------------------------
DROP TABLE IF EXISTS `pub_taskdeploy`;
CREATE TABLE `pub_taskdeploy` (
  `pk_taskdeploy` varchar(20) NOT NULL,
  `pk_taskplugin` varchar(20) DEFAULT NULL,
  `taskname` varchar(128) DEFAULT NULL,
  `taskdescription` varchar(256) DEFAULT NULL,
  `priority` varchar(20) DEFAULT NULL,
  `period` varchar(20) DEFAULT NULL,
  `period_unit` varchar(20) DEFAULT NULL,
  `delay` varchar(20) DEFAULT NULL,
  `startTime` varchar(20) DEFAULT NULL,
  `overTime` varchar(20) DEFAULT NULL,
  `runnable` varchar(20) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pk_taskdeploy`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pub_taskdeploy
-- ----------------------------
INSERT INTO `pub_taskdeploy` VALUES ('0001AA1000000000ABCE', '0001AA1000000000ABCD', '数据库数据清理任务', '测试任务描述', 'high', '10', 'SECOND', '12', '2014-03-16 20:51:29', '2014-04-12 17:30:40', 'Y', '0', '2014-04-12 17:25:10');
INSERT INTO `pub_taskdeploy` VALUES ('0001AA1000000000ABCR', '0001AA1000000000ABCD', '12', '122', 'normal', '1', 'SECOND', '12', '2014-02-03 09:05:00', null, 'N', '0', null);

-- ----------------------------
-- Table structure for `pub_taskplugin`
-- ----------------------------
DROP TABLE IF EXISTS `pub_taskplugin`;
CREATE TABLE `pub_taskplugin` (
  `pk_taskplugin` char(20) NOT NULL,
  `pluginname` varchar(50) DEFAULT NULL,
  `pluginclass` char(50) DEFAULT NULL,
  `plugindescription` varchar(255) DEFAULT NULL,
  `plugintype` varchar(30) DEFAULT NULL,
  `belong_system` varchar(30) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pk_taskplugin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pub_taskplugin
-- ----------------------------

-- ----------------------------
-- Table structure for `sm_button`
-- ----------------------------
DROP TABLE IF EXISTS `sm_button`;
CREATE TABLE `sm_button` (
  `pk_button` char(20) NOT NULL,
  `pk_node` char(20) DEFAULT NULL,
  `btn_class` varchar(255) DEFAULT NULL,
  `btn_code` varchar(255) DEFAULT NULL,
  `btn_href` varchar(255) DEFAULT NULL,
  `btn_name` varchar(255) DEFAULT NULL,
  `btn_status` char(11) DEFAULT 'Y',
  `btn_type` varchar(20) DEFAULT NULL,
  `btn_target` varchar(255) DEFAULT NULL,
  `btn_index` int(10) DEFAULT NULL,
  `actionclass` varchar(255) DEFAULT NULL,
  `btn_title` varchar(255) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  `ts` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pk_button`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_button
-- ----------------------------
INSERT INTO `sm_button` VALUES ('0001AA1000000000000Q', '0001AA10000000000005', 'add', 'add', '/management/ui/card/add', '添加下级节点', 'Y', 'N', 'dialog', '1', 'cheng.pipp.sys.conf.NodeSaveAction', '添加下级节点', '0', '2014-02-17 22:46:10');
INSERT INTO `sm_button` VALUES ('0001AA1000000000000R', '0001AA10000000000005', 'edit', 'edit', '/management/ui/card/edit', '修改节点', 'Y', 'Y', 'dialog', '2', 'cheng.pipp.sys.conf.NodeSaveAction', '修改节点信息', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button` VALUES ('0001AA1000000000000S', '0001AA10000000000005', 'delete', 'delete', '/management/ui/singletable/delete', '删除节点', 'Y', 'Y', 'ajaxTodo', '3', null, '确定要删除吗?', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button` VALUES ('0001AA1000000000001U', '0001AA1000000000000X', 'add', 'add', '/management/ui/card/add', '增加系统类型', 'Y', 'N', 'dialog', '1', '', '', '0', '2014-02-21 22:45:35');
INSERT INTO `sm_button` VALUES ('0001AA1000000000001V', '0001AA1000000000000X', 'edit', 'edit', '/management/ui/card/edit', '修改系统类型', 'Y', 'Y', 'dialog', '2', '', '', '0', '2014-02-21 22:46:35');
INSERT INTO `sm_button` VALUES ('0001AA1000000000002M', '0001AA1000000000000X', 'add', '121', '12321', '121', 'Y', 'Y', 'dialog', '2', '', '123', '1', '2014-03-02 23:34:39');
INSERT INTO `sm_button` VALUES ('0001AA1000000000002W', '0001AA1000000000000X', 'add', '12', '12', '12', 'Y', 'Y', 'dialog', null, '', '221', '1', '2014-03-02 23:39:24');
INSERT INTO `sm_button` VALUES ('0001AA1000000000003R', '0001AA1000000000001W', 'add', 'add', '/management/ui/card/add', '添加参照', 'Y', 'N', 'dialog', '1', '', '', '0', '2014-03-04 22:32:20');
INSERT INTO `sm_button` VALUES ('0001AA1000000000003S', '0001AA1000000000001W', 'edit', 'edit', '/management/ui/card/edit', '修改参照', 'Y', 'Y', 'dialog', '2', '', '', '0', '2014-03-04 22:32:44');
INSERT INTO `sm_button` VALUES ('0001AA1000000000003V', '0001AA1000000000000Y', 'add', 'add', '/management/ui/card/add', '添加表', 'Y', 'N', 'dialog', '1', 'cheng.pipp.sys.conf.DataDictSaveAction', '', '0', '2014-03-23 11:54:58');
INSERT INTO `sm_button` VALUES ('0001AA1000000000003W', '0001AA1000000000000Y', 'edit', 'edit', '/management/ui/card/edit', '修改数据表', 'Y', 'Y', 'dialog', '2', 'cheng.pipp.sys.conf.DataDictSaveAction', '', '0', '2014-03-28 21:39:42');
INSERT INTO `sm_button` VALUES ('0001AA10000000000049', '0001AA10000000000048', 'add', 'add', '/management/ui/card/add', '添加页签', 'Y', 'N', 'dialog', '1', '', '', '0', '2014-03-04 22:32:44');
INSERT INTO `sm_button` VALUES ('0001AA1000000000004A', '0001AA10000000000048', 'edit', 'edit', '/management/ui/card/edit', '修改页签', 'Y', 'Y', 'dialog', null, '', '', '0', '2014-03-04 22:32:44');
INSERT INTO `sm_button` VALUES ('0001AA1000000000004Z', '0001AA10000000000005', 'add', 'add', '/management/ui/card/add', '添加页签', 'Y', 'Y', 'dialog', '1', 'cheng.pipp.sys.conf.TabSaveAction', '', '0', '2014-05-07 12:59:16');
INSERT INTO `sm_button` VALUES ('0001AA10000000000056', '0001AA1000000000004W', 'add', 'add', '/management/ui/card/add', '添加字段', 'Y', 'N', 'dialog', '1', '', '', '0', '2014-03-16 10:34:54');
INSERT INTO `sm_button` VALUES ('0001AA10000000000057', '0001AA1000000000004W', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '2', '', '', '0', '2014-03-16 10:35:27');
INSERT INTO `sm_button` VALUES ('0001AA1000000000005P', '0001AA1000000000000Y', 'icon', 'create', '/management/sys/ui/compselect', '界面生产', 'Y', 'Y', 'dialog', '3', '', '', '0', '2014-03-19 19:57:54');
INSERT INTO `sm_button` VALUES ('0001AA10000000000085', '0001AA1000000000005D', 'add', 'add', '/management/ui/card/add', '添加', 'Y', 'N', 'dialog', '0', null, '增加', '0', '2014-03-27 21:33:39');
INSERT INTO `sm_button` VALUES ('0001AA10000000000086', '0001AA1000000000005D', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '1', '', '修改', '0', '2014-03-28 20:47:49');
INSERT INTO `sm_button` VALUES ('0001AA10000000000087', '0001AA1000000000005D', 'delete', 'delete', '/management/ui/singletable/delete', '删除', 'Y', 'Y', 'ajaxTodo', '2', null, '删除', '0', '2014-03-27 21:33:39');
INSERT INTO `sm_button` VALUES ('0001AA10000000000088', '0001AA1000000000005D', 'icon', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '3', null, '查询', '0', '2014-03-27 21:33:39');
INSERT INTO `sm_button` VALUES ('0001AA10000000000092', '0001AA1000000000005E', 'add', 'add', '/management/ui/card/add', '增加', 'Y', 'N', 'dialog', '0', 'cheng.pipp.task.conf.DeploySaveAction', '增加', '0', '2014-04-14 20:34:30');
INSERT INTO `sm_button` VALUES ('0001AA10000000000093', '0001AA1000000000005E', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '1', 'cheng.pipp.task.conf.DeploySaveAction', '修改', '0', '2014-04-15 22:07:12');
INSERT INTO `sm_button` VALUES ('0001AA10000000000094', '0001AA1000000000005E', 'delete', 'delete', '/management/ui/singletable/delete', '删除', 'Y', 'Y', 'ajaxTodo', '2', null, '删除', '0', '2014-03-30 22:44:02');
INSERT INTO `sm_button` VALUES ('0001AA10000000000095', '0001AA1000000000005E', 'icon', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '3', null, '查询', '0', '2014-03-30 22:44:02');
INSERT INTO `sm_button` VALUES ('0001AA100000000000CY', '0001AA100000000000AC', 'add', 'add', '/management/ui/card/add', '增加', 'Y', 'N', 'dialog', '0', null, '增加', '0', '2014-05-10 20:38:50');
INSERT INTO `sm_button` VALUES ('0001AA100000000000CZ', '0001AA100000000000AC', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '1', null, '修改', '0', '2014-05-10 20:38:50');
INSERT INTO `sm_button` VALUES ('0001AA100000000000D0', '0001AA100000000000AC', 'delete', 'delete', '/management/ui/singletable/delete', '删除', 'Y', 'Y', 'ajaxTodo', '2', null, '删除', '0', '2014-05-10 20:38:50');
INSERT INTO `sm_button` VALUES ('0001AA100000000000D1', '0001AA100000000000AC', 'icon', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '3', null, '查询', '0', '2014-05-10 20:38:50');
INSERT INTO `sm_button` VALUES ('0001AA100000000000E2', '0001AA100000000000BZ', 'add', 'add', '/management/ui/card/add', '增加', 'Y', 'N', 'dialog', '0', null, '增加', '0', '2014-05-10 20:34:08');
INSERT INTO `sm_button` VALUES ('0001AA100000000000E3', '0001AA100000000000BZ', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '1', null, '修改', '0', '2014-05-10 20:34:08');
INSERT INTO `sm_button` VALUES ('0001AA100000000000E4', '0001AA100000000000BZ', 'delete', 'delete', '/management/ui/singletable/delete', '删除', 'Y', 'Y', 'ajaxTodo', '2', null, '删除', '0', '2014-05-10 20:34:08');
INSERT INTO `sm_button` VALUES ('0001AA100000000000E5', '0001AA100000000000BZ', 'icon', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '3', null, '查询', '0', '2014-05-10 20:34:08');
INSERT INTO `sm_button` VALUES ('0001AA100000000000IP', '0001AA100000000000AJ', 'add', 'add', '/management/ui/card/add', '增加', 'Y', 'N', 'dialog', '0', null, '增加', '0', '2014-05-24 13:10:19');
INSERT INTO `sm_button` VALUES ('0001AA100000000000IQ', '0001AA100000000000AJ', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '1', null, '修改', '0', '2014-05-24 13:10:19');
INSERT INTO `sm_button` VALUES ('0001AA100000000000IR', '0001AA100000000000AJ', 'delete', 'delete', '/management/ui/singletable/delete', '删除', 'Y', 'Y', 'ajaxTodo', '2', null, '删除', '0', '2014-05-24 13:10:19');
INSERT INTO `sm_button` VALUES ('0001AA100000000000IS', '0001AA100000000000AJ', 'icon', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '3', '', '查询', '0', '2014-10-10 21:17:33');
INSERT INTO `sm_button` VALUES ('0001AA100000000000JQ', '0001AA100000000000GF', 'add', 'add', '/management/ui/card/add', '增加', 'Y', 'N', 'dialog', '0', null, '增加', '0', '2014-05-24 13:27:43');
INSERT INTO `sm_button` VALUES ('0001AA100000000000JR', '0001AA100000000000GF', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '1', null, '修改', '0', '2014-05-24 13:27:43');
INSERT INTO `sm_button` VALUES ('0001AA100000000000JS', '0001AA100000000000GF', 'delete', 'delete', '/management/ui/singletable/delete', '删除', 'Y', 'Y', 'ajaxTodo', '2', null, '删除', '0', '2014-05-24 13:27:43');
INSERT INTO `sm_button` VALUES ('0001AA100000000000JT', '0001AA100000000000GF', 'icon', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '3', null, '查询', '0', '2014-05-24 13:27:43');
INSERT INTO `sm_button` VALUES ('0001AA100000000000KN', '0001AA100000000000GH', 'add', 'add', '/management/ui/card/add', '增加', 'Y', 'N', 'dialog', '0', null, '增加', '0', '2014-05-24 13:27:57');
INSERT INTO `sm_button` VALUES ('0001AA100000000000KO', '0001AA100000000000GH', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '1', null, '修改', '0', '2014-05-24 13:27:57');
INSERT INTO `sm_button` VALUES ('0001AA100000000000KP', '0001AA100000000000GH', 'delete', 'delete', '/management/ui/singletable/delete', '删除', 'Y', 'Y', 'ajaxTodo', '2', null, '删除', '0', '2014-05-24 13:27:57');
INSERT INTO `sm_button` VALUES ('0001AA100000000000KQ', '0001AA100000000000GH', 'icon', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '3', null, '查询', '0', '2014-05-24 13:27:57');
INSERT INTO `sm_button` VALUES ('0001AA100000000000ND', '0001AA100000000000GG', 'add', 'add', '/management/ui/card/add', '增加', 'Y', 'N', 'dialog', '0', null, '增加', '0', '2014-05-24 13:35:18');
INSERT INTO `sm_button` VALUES ('0001AA100000000000NE', '0001AA100000000000GG', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '1', null, '修改', '0', '2014-05-24 13:35:18');
INSERT INTO `sm_button` VALUES ('0001AA100000000000NF', '0001AA100000000000GG', 'delete', 'delete', '/management/ui/singletable/delete', '删除', 'Y', 'Y', 'ajaxTodo', '2', null, '删除', '0', '2014-05-24 13:35:18');
INSERT INTO `sm_button` VALUES ('0001AA100000000000NG', '0001AA100000000000GG', 'icon', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '3', null, '查询', '0', '2014-05-24 13:35:18');
INSERT INTO `sm_button` VALUES ('0001AA100000000000OT', '0001AA100000000000BX', 'add', 'add', '/management/ui/card/add', '增加', 'Y', 'N', 'dialog', '0', null, '增加', '0', '2014-05-25 18:41:36');
INSERT INTO `sm_button` VALUES ('0001AA100000000000OU', '0001AA100000000000BX', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '1', null, '修改', '0', '2014-05-25 18:41:36');
INSERT INTO `sm_button` VALUES ('0001AA100000000000OV', '0001AA100000000000BX', 'delete', 'delete', '/management/ui/singletable/delete', '删除', 'Y', 'Y', 'ajaxTodo', '2', null, '删除', '0', '2014-05-25 18:41:36');
INSERT INTO `sm_button` VALUES ('0001AA100000000000OW', '0001AA100000000000BX', 'icon', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '3', null, '查询', '0', '2014-05-25 18:41:36');
INSERT INTO `sm_button` VALUES ('0001AA100000000000QP', '0001AA1000000000005F', 'add', 'add', '/management/ui/card/add', '增加', 'Y', 'N', 'dialog', '0', null, '增加', '0', '2014-05-30 14:12:25');
INSERT INTO `sm_button` VALUES ('0001AA100000000000QQ', '0001AA1000000000005F', 'icon', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '1', null, '查询', '0', '2014-05-30 14:12:25');
INSERT INTO `sm_button` VALUES ('0001AA100000000000WP', '0001AA100000000000W4', 'add', 'add', '/management/ui/card/add', '增加', 'Y', 'N', 'dialog', '0', null, '增加', '0', '2014-08-31 12:04:14');
INSERT INTO `sm_button` VALUES ('0001AA100000000000WQ', '0001AA100000000000W4', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '1', null, '修改', '0', '2014-08-31 12:04:14');
INSERT INTO `sm_button` VALUES ('0001AA100000000000WR', '0001AA100000000000W4', 'delete', 'delete', '/management/ui/singletable/delete', '删除', 'Y', 'Y', 'ajaxTodo', '2', null, '删除', '0', '2014-08-31 12:04:14');
INSERT INTO `sm_button` VALUES ('0001AA100000000000WS', '0001AA100000000000W4', 'icon', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '3', null, '查询', '0', '2014-08-31 12:04:14');
INSERT INTO `sm_button` VALUES ('0001AA100000000000XO', '0001AA100000000000XG', 'add', 'add', '/management/ui/card/add', '增加', 'Y', 'N', 'dialog', '0', 'cheng.pipp.sys.conf.ParamsSaveAction', '增加', '0', '2014-09-07 17:12:12');
INSERT INTO `sm_button` VALUES ('0001AA100000000000XP', '0001AA100000000000XG', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '1', 'cheng.pipp.sys.conf.ParamsSaveAction', '修改', '0', '2014-09-07 17:12:22');
INSERT INTO `sm_button` VALUES ('0001AA100000000000XQ', '0001AA100000000000XG', 'delete', 'delete', '/management/ui/singletable/delete', '删除', 'Y', 'Y', 'ajaxTodo', '2', 'cheng.pipp.sys.conf.ParamsSaveAction', '删除', '0', '2014-09-07 17:12:30');
INSERT INTO `sm_button` VALUES ('0001AA100000000000XR', '0001AA100000000000XG', 'icon', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '3', 'cheng.pipp.sys.conf.ParamsSaveAction', '查询', '0', '2014-09-07 17:12:37');
INSERT INTO `sm_button` VALUES ('0001AA100000000000Z0', '0001AA100000000000AJ', 'icon', 'sysn', '2123123', '同步', 'Y', 'Y', 'ajaxTodo', '5', '', '同步到微信', '0', '2014-10-10 21:17:06');
INSERT INTO `sm_button` VALUES ('0001AA1000000000010F', '0001AA100000000000BY', 'add', 'add', '/management/ui/card/add', '添加', 'Y', 'N', 'dialog', '0', '', '', '0', '2015-01-02 23:44:48');
INSERT INTO `sm_button` VALUES ('0001AA1000000000010G', '0001AA100000000000BY', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '0', '', '', '0', '2015-01-02 23:45:10');
INSERT INTO `sm_button` VALUES ('0001AA10000000000123', '0001AA100000000000C2', 'add', 'add', '/management/ui/card/add', '增加', 'Y', 'N', 'dialog', '0', null, '增加', '0', '2015-05-03 19:35:04');
INSERT INTO `sm_button` VALUES ('0001AA10000000000124', '0001AA100000000000C2', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '1', null, '修改', '0', '2015-05-03 19:35:04');
INSERT INTO `sm_button` VALUES ('0001AA10000000000125', '0001AA100000000000C2', 'delete', 'delete', '/management/ui/singletable/delete', '删除', 'Y', 'Y', 'ajaxTodo', '2', null, '删除', '0', '2015-05-03 19:35:04');
INSERT INTO `sm_button` VALUES ('0001AA10000000000126', '0001AA100000000000C2', 'icon', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '3', '', '查询', '0', '2015-05-05 22:17:47');
INSERT INTO `sm_button` VALUES ('0001AA1000000000013K', '0001AA100000000000GI', 'edit', 'edit', '/management/ui/card/edit', '修改', 'Y', 'Y', 'dialog', '0', '', '修改', '0', '2015-05-12 23:06:33');
INSERT INTO `sm_button` VALUES ('0001AA1000000000013L', '0001AA100000000000GI', 'icon', 'query', '/management/ui/singletable/search', '查询', 'N', 'N', 'dialog', '1', '', '查询', '0', '2015-05-12 23:06:43');
INSERT INTO `sm_button` VALUES ('0001AA1000000000015Q', '0001AA100000000000C3', 'add', 'update', '', '更新token', 'Y', 'Y', 'ajaxTodo', '1', '', '更新token', '0', '2015-05-17 08:42:05');
INSERT INTO `sm_button` VALUES ('0001AA1000000000017D', '0001AA100000000000GJ', 'query', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '0', null, '查询', '0', '2015-06-01 07:33:01');
INSERT INTO `sm_button` VALUES ('0001AA1000000000017E', '0001AA100000000000GK', 'query', 'query', '/management/ui/singletable/search', '查询', 'Y', 'N', 'dialog', '0', null, '查询', '0', '2015-06-01 07:46:07');

-- ----------------------------
-- Table structure for `sm_buttonnoderole`
-- ----------------------------
DROP TABLE IF EXISTS `sm_buttonnoderole`;
CREATE TABLE `sm_buttonnoderole` (
  `pk_buttonnoderole` char(20) NOT NULL DEFAULT '',
  `pk_button` char(20) DEFAULT NULL,
  `pk_node` char(20) DEFAULT NULL,
  `pk_user` char(20) DEFAULT NULL,
  `pk_role` char(20) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  PRIMARY KEY (`pk_buttonnoderole`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_buttonnoderole
-- ----------------------------

-- ----------------------------
-- Table structure for `sm_button_copy`
-- ----------------------------
DROP TABLE IF EXISTS `sm_button_copy`;
CREATE TABLE `sm_button_copy` (
  `pk_button` char(20) NOT NULL,
  `btn_class` varchar(255) DEFAULT NULL,
  `btn_code` varchar(255) DEFAULT NULL,
  `btn_href` varchar(255) DEFAULT NULL,
  `pk_templet` char(20) DEFAULT NULL,
  `btn_name` varchar(255) DEFAULT NULL,
  `btn_status` varchar(255) DEFAULT NULL,
  `isbusi` char(1) DEFAULT NULL,
  `btn_target` varchar(255) DEFAULT NULL,
  `btn_index` int(10) DEFAULT NULL,
  `beforeacionclass` varchar(255) DEFAULT NULL,
  `btn_title` varchar(255) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  `ts` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pk_button`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_button_copy
-- ----------------------------
INSERT INTO `sm_button_copy` VALUES ('0001AA10000000000001', 'add', 'add', '/management/ui/card/add', '0001AA10000000000007', '添加下级节点', '', 'N', 'dialog', '1', '', '添加下级节点', '0', '2014-02-17 22:46:10');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABCF', 'edit', 'edit', '/management/ui/card/edit', '0001AA1000000000ABCH', '修改', null, 'Y', 'dialog', null, null, '修改节点信息', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABCG', 'add', 'add', '/management/ui/card/add', '0001AA1000000000ABCH', '增加', null, 'N', 'dialog', null, null, '增加节点', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABCH', 'delete', 'delete', '/management/ui/singletable/delete', '0001AA1000000000ABCH', '删除', null, 'Y', 'ajaxTodo', null, null, '确定要删除吗?', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABCI', 'search', 'search', '/management/ui/singletable/search', '0001AA1000000000ABCH', '查询', null, 'N', 'dialog', null, null, '查询数据', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABCJ', 'edit', 'edit', '/management/ui/card/edit', '0001AA1000000000ABDV', '修改', null, 'Y', 'dialog', null, 'cheng.pipp.sys.node.NodeSaveAction', '修改节点信息', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABCK', 'add', 'add', '/management/ui/card/add', '0001AA1000000000ABDV', '增加', null, 'Y', 'dialog', null, 'cheng.pipp.sys.node.NodeSaveAction', '增加下级节点', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABCL', 'delete', 'delete', '/management/ui/singletable/delete', '0001AA1000000000ABDV', '删除', null, 'Y', 'ajaxTodo', null, null, '确定要删除吗?', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABCM', 'edit', 'edit', '/management/ui/card/edit', '0001AA1000000000ABDU', '修改', null, 'Y', 'dialog', null, null, '单据模板item管理', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABCN', 'icon', 'item', '/management/ui/template/item', '0001AA1000000000ABDU', '模板item', null, 'Y', 'dialog', null, null, '修改单据模板', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABCO', 'search', 'search', '/management/ui/singletable/search', '0001AA1000000000ABDU', '查询', null, 'N', 'dialog', null, null, '查询单据模板', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABCP', 'delete', 'delete', '/management/ui/singletable/delete', '0001AA1000000000ABDU', '删除', null, 'Y', 'ajaxTodo', null, null, '删除单据模板', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABCQ', 'add', 'add', '/management/ui/card/add', '0001AA1000000000ABDU', '增加', null, 'N', 'dialog', null, null, '增加单据模板', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABCR', 'icon', 'button', '/management/ui/template/button', '0001AA1000000000ABDU', '模板按钮', null, 'Y', 'dialog', null, null, '单据模板button管理', '0', '2013-09-27 13:45:56');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABF5', '', '123123', '', '0001AA1000000000ABCH', '122312', '', 'N', '', null, '', '', '0', '2014-02-16 16:53:49');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABF6', '', '2312', '', '0001AA1000000000ABCH', '12', '', 'N', '', null, '', '', '0', '2014-02-16 16:53:45');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABFA', '', '123', '', '0001AA1000000000ABCH', '212', '', 'N', '', null, '', '', '0', '2014-02-16 16:53:37');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABFB', '', '1231231231', '', '0001AA1000000000ABCH', '23123123', '', 'N', '', null, '', '', '0', '2014-02-16 16:53:25');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABFC', '', '23123', '', '0001AA1000000000ABCH', '321312', '', 'N', '', null, '', '', '0', '2014-02-16 15:55:11');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABFM', '123', '123123', '', '0001AA1000000000ABCH', '123123', '', 'N', '', null, '', '', '0', '2014-02-16 16:21:08');
INSERT INTO `sm_button_copy` VALUES ('0001AA1000000000ABFT', 'add', 'add', '', '0001AA1000000000ABFR', '添加系统模块', '', 'Y', '', '1', '', '', '0', '2014-02-16 22:37:37');

-- ----------------------------
-- Table structure for `sm_node`
-- ----------------------------
DROP TABLE IF EXISTS `sm_node`;
CREATE TABLE `sm_node` (
  `pk_node` char(20) NOT NULL,
  `pk_parent_node` char(20) DEFAULT NULL,
  `fun_name` varchar(255) DEFAULT NULL,
  `fun_desc` varchar(255) DEFAULT NULL,
  `fun_level` int(10) DEFAULT NULL,
  `fun_type` varchar(255) DEFAULT NULL,
  `isseaf` char(1) DEFAULT NULL,
  `url_name` varchar(255) DEFAULT NULL,
  `treedata` varchar(255) DEFAULT NULL,
  `disp_code` varchar(255) DEFAULT NULL,
  `fun_code` varchar(255) DEFAULT NULL,
  `fun_property` varchar(255) DEFAULT NULL,
  `modelclass` varchar(255) DEFAULT NULL,
  `help_name` varchar(255) DEFAULT NULL,
  `ts` varchar(255) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  PRIMARY KEY (`pk_node`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_node
-- ----------------------------
INSERT INTO `sm_node` VALUES ('0001AA10000000000001', '', '开发平台', null, '1', 'node', 'N', null, null, null, '10', '0', null, null, '2014-02-17 22:11:47', '0');
INSERT INTO `sm_node` VALUES ('0001AA10000000000002', '0001AA10000000000001', '模板管理', null, '2', 'node', 'N', null, null, null, '1010', '0', null, null, '2014-02-17 22:12:19', '0');
INSERT INTO `sm_node` VALUES ('0001AA10000000000003', '0001AA10000000000002', '单据模板管理', null, '3', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.ui.conf.BillTemplateTreeManagerData', null, '101010', '0', 'cheng.pipp.ui.model.UITempletModel', null, '2014-02-17 22:12:29', '0');
INSERT INTO `sm_node` VALUES ('0001AA10000000000004', '0001AA10000000000001', '系统管理', null, '2', 'node', 'N', '', null, null, '1020', '0', '', null, '2014-02-17 22:12:31', '0');
INSERT INTO `sm_node` VALUES ('0001AA10000000000005', '0001AA10000000000004', '功能节点注册', null, '2', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.sys.conf.NodeManagerData', null, '102010', '0', 'cheng.pipp.sys.model.NodeModel', null, '2014-02-17 22:12:38', '0');
INSERT INTO `sm_node` VALUES ('0001AA10000000000006', '0001AA10000000000001', '权限管理', null, '2', 'node', 'N', null, null, null, '1030', '0', null, null, '2014-02-17 22:15:48', '0');
INSERT INTO `sm_node` VALUES ('0001AA1000000000000T', '0001AA10000000000006', '用户管理', '用户管理', '0', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.access.conf.UserTreeDataManager', '103010', '103010', '0', '', '', '2014-02-17 22:54:44', '0');
INSERT INTO `sm_node` VALUES ('0001AA1000000000000U', '0001AA10000000000006', '角色管理', '', '0', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.access.conf.RoleTreeDataManager', '', '', '0', '', '', '2014-02-17 22:55:45', '0');
INSERT INTO `sm_node` VALUES ('0001AA1000000000000V', '0001AA10000000000002', '按钮管理', '', '0', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.ui.conf.ButtonTreeManageData', '', '', '0', 'cheng.pipp.ui.model.ButtonModel', '', '2014-02-27 20:44:13', '0');
INSERT INTO `sm_node` VALUES ('0001AA1000000000000W', '0001AA10000000000006', '权限分配', '', '2', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.access.conf.AccessTreeData', '', '', '0', '', '', '2014-02-23 21:15:56', '0');
INSERT INTO `sm_node` VALUES ('0001AA1000000000000X', '0001AA10000000000004', '系统模块定义', '', '2', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.sys.conf.SysModulesManagerData', '', '', '0', 'cheng.pipp.sys.model.ModuleModel', '', '2014-02-21 22:32:26', '0');
INSERT INTO `sm_node` VALUES ('0001AA1000000000000Y', '0001AA10000000000004', '数据字典管理', '', '0', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.sys.conf.DataDicTreeData', '', '', '0', 'cheng.pipp.sys.model.DataDictModel', '', '2014-03-05 22:38:23', '0');
INSERT INTO `sm_node` VALUES ('0001AA1000000000000Z', '0001AA10000000000002', '查询模板管理', '', '2', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.ui.conf.QueryTemplateTreeManagerData', '', '', '0', 'cheng.pipp.ui.model.QueryTemplateModel', '', '2014-05-10 12:17:42', '0');
INSERT INTO `sm_node` VALUES ('0001AA10000000000010', '0001AA10000000000002', '报表模板管理', '', '0', 'node', 'N', '/management/ui/tree/index', 'cheng.pipp.ui.conf.ReportTemplateTreeManagerData', '', '', '0', '', '', '2014-02-17 22:59:09', '0');
INSERT INTO `sm_node` VALUES ('0001AA1000000000001M', '0001AA10000000000001', '基础数据管理', '', '0', 'node', 'N', '', '', '', 'base_data', '0', '', '', '2014-02-21 21:55:22', '0');
INSERT INTO `sm_node` VALUES ('0001AA1000000000001W', '0001AA1000000000001M', '参照管理', '', '0', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.ui.conf.RefTreeData', '', 'ref_man', '0', 'cheng.pipp.basic.model.RefModel', '', '2014-02-21 23:09:28', '0');
INSERT INTO `sm_node` VALUES ('0001AA10000000000026', '0001AA10000000000002', '模板分配', '', '0', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.ui.conf.TemplateAssignmentManagerData', '', '', '0', '', '', '2014-02-21 23:32:30', '0');
INSERT INTO `sm_node` VALUES ('0001AA10000000000048', '0001AA10000000000004', '页签管理', '212', '0', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.ui.conf.TabTreeDataManage', '', '1232132', '0', 'cheng.pipp.sys.model.NodeModel', '', '2014-02-21 23:32:30', '1');
INSERT INTO `sm_node` VALUES ('0001AA1000000000004W', '0001AA1000000000000Y', '数据表字段管理', null, '4', 'tab', 'Y', '/management/ui/singletable/index', null, null, 'datatablefield', null, 'cheng.pipp.sys.model.DataDictItemModel', null, '2014-02-21 23:32:30', '0');
INSERT INTO `sm_node` VALUES ('0001AA1000000000005C', '0001AA10000000000001', '任务中心', '', '0', 'node', 'N', '', '', '', 'task', '0', '', '', '2014-03-16 15:44:54', '0');
INSERT INTO `sm_node` VALUES ('0001AA1000000000005D', '0001AA1000000000005C', '任务注册', '', '0', 'node', 'Y', '/management/ui/singletable/index', '', '', 'taskregister', '0', 'cheng.pipp.task.model.TaskpluginModel', '', '2014-04-22 20:26:55', '0');
INSERT INTO `sm_node` VALUES ('0001AA1000000000005E', '0001AA1000000000005C', '任务部署', '', '0', 'node', 'Y', '/management/ui/singletable/index', '', '', 'taskdeploy', '0', 'cheng.pipp.task.model.TaskdeployModel', '', '2014-04-22 20:32:47', '0');
INSERT INTO `sm_node` VALUES ('0001AA1000000000005F', '0001AA1000000000005C', '任务日志', '', '2', 'node', 'Y', '/management/ui/singletable/index', '', '', 'tasklog', '0', 'cheng.pipp.task.model.TaskLogModel', '', '2014-06-03 18:55:24', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000AC', '0001AA1000000000001M', '元数据类型管理', '一些和业务无关的数据', '4', 'node', 'Y', '/management/ui/singletable/index', '', '', 'MetaDataTypeModel', '0', 'cheng.pipp.basic.model.MetaDataTypeModel', '', '2015-03-16 17:15:56', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000AI', '', '渠道平台', '', '1', 'node', 'N', '', '', '', 'weixin', '0', '', '', '2014-05-07 18:31:22', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000AJ', '0001AA100000000000BD', '用户注册明细', '', '5', 'report', 'Y', '/management/ui/report/index', 'cheng.channel.conf.UserReportConf', '', 'wew', '0', 'cheng.channel.vo.UserInfoVO', '', '2014-11-18 21:59:05', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000BD', '0001AA100000000000AI', '用户管理', '', '0', 'node', 'N', '', '', '', 'seting', '0', '', '', '2014-05-08 18:01:07', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000BE', '0001AA100000000000AI', '充值管理', '', '0', 'node', 'N', '', '', '', '12wq', '0', '', '', '2014-05-08 18:02:51', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000BX', '0001AA100000000000BE', '充值明细', '', '3', 'node', 'Y', '/management/ui/report/index', 'cheng.channel.conf.RechareLogConf', '', 'recharge', '0', 'cheng.channel.vo.RechareInfoVO', '', '2014-11-18 22:00:53', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000BY', '0001AA1000000000001M', '元数据管理', '一些和业务无关的数据', '1', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.ui.conf.MetaDataTreeData', '', 'metadata', '0', 'cheng.pipp.basic.model.MetaDataModel', '', '2015-03-16 17:15:44', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000BZ', '0001AA100000000000AI', '注册来源管理', '', '1', 'node', 'Y', '/management/ui/singletable/index', '', '', 'RegisterSourceVO', '0', 'cheng.channel.vo.RegisterSourceVO', '', '2014-05-10 22:01:58', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000C0', '0001AA100000000000BD', '用户注册汇总', '', '0', 'report', 'Y', '/management/ui/report/index', 'cheng.channel.conf.ChannelReportConf', '', 'ChannelVO', '0', 'cheng.channel.vo.ChannelVO', '', '2014-05-10 12:16:12', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000C1', '', '微信开发平台', '', '0', 'node', 'Y', '', '', '', '', '0', '', '', '2014-05-10 12:16:39', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000C2', '0001AA100000000000C1', '微信公众号管理', '', '0', 'node', 'Y', '/management/ui/singletable/index', '', '', '', '0', 'cheng.wechat.model.AccountModel', '', '2015-05-03 22:36:35', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000C3', '0001AA100000000000C1', '微信token管理', '', '1', 'node', 'Y', '/management/ui/tree/index', 'cheng.wechat.conf.TokenTree', '', 'TokenTree', '0', 'cheng.wechat.model.TokenModel', '', '2015-05-16 23:15:10', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000GF', '0001AA100000000000C1', '微信菜单管理', '', '2', 'node', 'Y', '/management/ui/singletable/index', '', '', '', '0', 'cheng.wechat.model.MenuModel', '', '2015-05-16 21:36:17', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000GG', '0001AA100000000000C1', '微信事件管理', '', '3', 'node', 'Y', '/management/ui/singletable/index', '', '', '', '0', 'cheng.wechat.model.EventhandleModel', '', '2015-05-24 11:46:55', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000GH', '0001AA100000000000C1', '微信消息管理', '', '2', 'node', 'Y', '/management/ui/singletable/index', '', '', '', '0', 'cheng.wechat.model.MsghandleModel', '', '2015-05-24 10:23:25', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000GI', '0001AA100000000000C1', '微信用户管理', '', '1', 'node', 'N', '/management/ui/singletable/index', '', '', '', '0', 'cheng.wechat.model.UserModel', '', '2015-05-12 22:51:42', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000GJ', '0001AA100000000000C1', '微信用户地理位置', '', '4', 'node', 'Y', '/management/ui/singletable/index', '', '', '', '0', 'cheng.wechat.model.UserlocationModel', '', '2015-06-01 07:33:01', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000GK', '0001AA100000000000C1', '微信用户行为', '', '4', 'node', 'Y', '/management/ui/singletable/index', '', '', '', '0', 'cheng.wechat.model.UserbehaviorModel', '', '2015-06-01 07:46:07', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000T6', '0001AA10000000000006', '资源权限', '', '2', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.access.conf.ResourceTreeDataManager', '', '123123', '0', '', '', '2014-06-05 19:10:34', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000W4', '0001AA10000000000004', '缓存管理', '', '2', 'node', 'N', '/management/ui/tree/index', 'cheng.pipp.sys.conf.CacheTableTreeData', '', 'cachemanager', '0', 'cheng.pipp.sys.model.CacheTableModel', '', '2014-08-31 12:10:53', '0');
INSERT INTO `sm_node` VALUES ('0001AA100000000000XG', '0001AA10000000000004', '参数管理', '', '2', 'node', 'Y', '/management/ui/tree/index', 'cheng.pipp.sys.conf.ParamsTreeData', '', 'param', '0', 'cheng.pipp.sys.model.ParamsModel', '', '2014-09-07 16:04:13', '0');

-- ----------------------------
-- Table structure for `sm_queryconditiontemplate`
-- ----------------------------
DROP TABLE IF EXISTS `sm_queryconditiontemplate`;
CREATE TABLE `sm_queryconditiontemplate` (
  `pk_queryconditiontemplate` char(20) NOT NULL DEFAULT '',
  `pk_querytemplate` char(20) DEFAULT NULL,
  `itemkey` varchar(50) DEFAULT NULL,
  `defaultshowname` varchar(30) DEFAULT NULL,
  `operatecode` varchar(30) DEFAULT NULL,
  `defaultvalue` varchar(30) DEFAULT NULL,
  `itempos` int(10) DEFAULT NULL,
  `datatype` varchar(30) DEFAULT NULL,
  `csstype` varchar(30) DEFAULT NULL,
  `reftype` varchar(60) DEFAULT NULL,
  `isedit` char(1) DEFAULT NULL,
  `isuse` char(1) DEFAULT NULL,
  `isnull` char(1) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  PRIMARY KEY (`pk_queryconditiontemplate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_queryconditiontemplate
-- ----------------------------
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000007X', '0001AA1000000000007W', 'pk_taskplugin', '主键', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-03-27 20:48:18', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000007Y', '0001AA1000000000007W', 'pluginname', '插件名称', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-03-27 20:48:18', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000007Z', '0001AA1000000000007W', 'pluginclass', '任务插件类', 'CV;=,等于;like,包含', null, null, 'textarea', null, '', 'Y', 'Y', 'Y', '2014-03-27 20:48:18', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA10000000000080', '0001AA1000000000007W', 'plugindescription', '任务描述', 'CV;=,等于;like,包含', null, null, 'textarea', null, '', 'Y', 'Y', 'Y', '2014-03-27 20:48:18', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA10000000000081', '0001AA1000000000007W', 'plugintype', '插件类型', 'CV;=,等于;like,包含', null, null, 'select', null, 'CV;task,后台任务;alert,预警任务', 'Y', 'Y', 'Y', '2014-03-27 20:48:18', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA10000000000082', '0001AA1000000000007W', 'belong_system', '所属模块', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-03-27 20:48:18', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA10000000000083', '0001AA1000000000007W', 'dr', 'dr', 'CV;=,等于;like,包含', null, null, 'digits', null, '', 'Y', 'Y', 'Y', '2014-03-27 20:48:18', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA10000000000084', '0001AA1000000000007W', 'ts', 'ts', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-03-27 20:48:18', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000009P', '0001AA1000000000009O', 'vdef1', '自定义项1', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'N', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000009Q', '0001AA1000000000009O', 'vdef2', '自定义项2', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'N', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000009R', '0001AA1000000000009O', 'vdef3', '自定义项3', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'N', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000009S', '0001AA1000000000009O', 'vdef4', '自定义项4', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'N', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000009T', '0001AA1000000000009O', 'vdef5', '自定义项5', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'N', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000009U', '0001AA1000000000009O', 'ts', 'ts', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'N', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000009V', '0001AA1000000000009O', 'dr', 'dr', 'CV;=,等于;like,包含', null, null, 'digits', null, '', 'Y', 'N', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000009W', '0001AA1000000000009O', 'pk_taskdeploy', '主键', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'N', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000009X', '0001AA1000000000009O', 'pk_taskplugin', '任务插件主键', 'CV;=,等于;like,包含', null, null, 'ref', null, 'user', 'Y', 'N', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000009Y', '0001AA1000000000009O', 'taskname', '任务名称', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000009Z', '0001AA1000000000009O', 'taskdescription', '任务描述', 'CV;=,等于;like,包含', null, null, 'textarea', null, '', 'Y', 'Y', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000A0', '0001AA1000000000009O', 'priority', '优先级', 'CV;=,等于;like,包含', null, null, 'select', null, '', 'Y', 'Y', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000A1', '0001AA1000000000009O', 'period', '周期_数字', 'CV;=,等于;like,包含', null, null, 'digits', null, '', 'Y', 'Y', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000A2', '0001AA1000000000009O', 'period_unit', '周期_单位', 'CV;=,等于;like,包含', null, null, 'select', null, '', 'Y', 'Y', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000A3', '0001AA1000000000009O', 'delay', '延迟时间', 'CV;=,等于;like,包含', null, null, 'digits', null, '', 'Y', 'Y', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000A4', '0001AA1000000000009O', 'startTime', '开始时间', 'CV;=,等于;like,包含', null, null, 'date', null, '', 'Y', 'Y', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000A5', '0001AA1000000000009O', 'overTime', '结束时间', 'CV;=,等于;like,包含', null, null, 'date', null, '', 'Y', 'Y', 'Y', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000DJ', '0001AA100000000000DI', 'vdef1', '自定义项1', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-10 20:38:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000DK', '0001AA100000000000DI', 'vdef2', '自定义项2', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-10 20:38:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000DL', '0001AA100000000000DI', 'vdef3', '自定义项3', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-10 20:38:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000DM', '0001AA100000000000DI', 'vdef4', '自定义项4', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-10 20:38:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000DN', '0001AA100000000000DI', 'vdef5', '自定义项5', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-10 20:38:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000DO', '0001AA100000000000DI', 'ts', 'ts', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-10 20:38:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000DP', '0001AA100000000000DI', 'dr', 'dr', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-10 20:38:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000DQ', '0001AA100000000000DI', 'weixin_publicid', '账户主键', 'CV;=,等于;like,包含', '', null, 'text', 'text', '', 'Y', 'Y', 'Y', '2014-05-23 23:22:52', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000DR', '0001AA100000000000DI', 'accountcode', '微信公众号', 'CV;=,等于;like,包含', '', null, 'text', 'text', '', 'Y', 'Y', 'Y', '2014-05-23 23:23:31', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000DS', '0001AA100000000000DI', 'accountname', '公众号名称', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-10 20:38:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000DT', '0001AA100000000000DI', 'appid', '开发者appid', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-10 20:38:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000DU', '0001AA100000000000DI', 'appsecret', '开发者AppSecret', 'CV;=,等于;like,包含', null, null, 'textarea', null, '', 'Y', 'Y', 'Y', '2014-05-10 20:38:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000DV', '0001AA100000000000DI', 'email', '注册邮箱', 'CV;=,等于;like,包含', null, null, '', null, '', 'Y', 'Y', 'Y', '2014-05-10 20:38:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000DW', '0001AA100000000000DI', 'oauth2url', '微信oauth认证链接', 'CV;=,等于;like,包含', '', null, 'text', 'text', '', 'Y', 'Y', 'Y', '2014-05-23 23:24:08', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000EC', '0001AA100000000000EB', 'vdef1', '自定义项1', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-10 21:43:40', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000ED', '0001AA100000000000EB', 'vdef2', '自定义项2', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-10 21:43:40', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000EE', '0001AA100000000000EB', 'vdef3', '自定义项3', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-10 21:43:40', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000EF', '0001AA100000000000EB', 'vdef4', '自定义项4', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-10 21:43:40', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000EG', '0001AA100000000000EB', 'vdef5', '自定义项5', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-10 21:43:40', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000EH', '0001AA100000000000EB', 'ts', 'ts', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-10 21:43:40', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000EI', '0001AA100000000000EB', 'dr', 'dr', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-10 21:43:40', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000EJ', '0001AA100000000000EB', 'pk_weixinaccesstoken', '主键', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'N', 'Y', '2014-05-10 21:43:40', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000EK', '0001AA100000000000EB', 'access_token', 'access_token', 'CV;=,等于;like,包含', null, null, 'textarea', null, '', 'Y', 'Y', 'Y', '2014-05-10 21:43:40', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000EL', '0001AA100000000000EB', 'expires_in', '有效时间', 'CV;=,等于;like,包含', null, null, 'digits', null, '', 'Y', 'Y', 'Y', '2014-05-10 21:43:40', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000EM', '0001AA100000000000EB', 'get_time', '获取时间', 'CV;=,等于;like,包含', null, null, 'datetime', null, '', 'Y', 'Y', 'Y', '2014-05-10 21:43:40', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000EN', '0001AA100000000000EB', 'expire_time', '失效时间', 'CV;=,等于;like,包含', null, null, 'datetime', null, '', 'Y', 'Y', 'Y', '2014-05-10 21:43:40', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000GN', '0001AA100000000000DI', 'weixinpushurl', '微信推送链接', '', '', null, 'text', 'text', '', 'Y', 'Y', 'Y', '2014-05-23 23:24:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000GO', '0001AA100000000000DI', 'token', '微信token', '', '', null, 'text', 'text', '', 'Y', 'Y', 'Y', '2014-05-23 23:24:52', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000GP', '0001AA100000000000DI', 'weixinpushurl', '微信推送链接', '', '', null, 'text', 'text', '', 'Y', 'Y', 'Y', '2014-05-23 23:26:23', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JB', '0001AA100000000000JA', 'vdef1', '自定义项1', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JC', '0001AA100000000000JA', 'vdef2', '自定义项2', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JD', '0001AA100000000000JA', 'vdef3', '自定义项3', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JE', '0001AA100000000000JA', 'vdef4', '自定义项4', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JF', '0001AA100000000000JA', 'vdef5', '自定义项5', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JG', '0001AA100000000000JA', 'ts', 'ts', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JH', '0001AA100000000000JA', 'dr', 'dr', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JI', '0001AA100000000000JA', 'pk_weixin_menu', '主键', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JJ', '0001AA100000000000JA', 'weixin_publicid', '公众号', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JK', '0001AA100000000000JA', 'btn_name', '菜单名称', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JL', '0001AA100000000000JA', 'btn_code', '菜单编码', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JM', '0001AA100000000000JA', 'btn_type', '菜单类型', 'CV;=,等于;like,包含', null, null, 'select', null, 'CV;dir,虚拟;click,点击;view,视图', 'Y', 'Y', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JN', '0001AA100000000000JA', 'btn_key', '菜单key', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JO', '0001AA100000000000JA', 'handleclass', '处理类', 'CV;=,等于;like,包含', null, null, 'textarea', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000JP', '0001AA100000000000JA', 'remark', '备注', 'CV;=,等于;like,包含', null, null, 'textarea', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:10:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000KA', '0001AA100000000000K9', 'vdef1', '自定义项1', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:27:44', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000KB', '0001AA100000000000K9', 'vdef2', '自定义项2', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:27:44', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000KC', '0001AA100000000000K9', 'vdef3', '自定义项3', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:27:44', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000KD', '0001AA100000000000K9', 'vdef4', '自定义项4', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:27:44', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000KE', '0001AA100000000000K9', 'vdef5', '自定义项5', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:27:44', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000KF', '0001AA100000000000K9', 'ts', 'ts', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:27:44', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000KG', '0001AA100000000000K9', 'dr', 'dr', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:27:44', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000KH', '0001AA100000000000K9', 'pk_wechat_account', '公众号', 'CV;=,等于', '', '0', 'ref', 'ref', 'wechat_wechat_account_ref', 'Y', 'Y', 'Y', '2015-05-16 22:36:33', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000KI', '0001AA100000000000K9', 'menutype', '菜单类型', 'CV;=,等于;like,包含', '', '0', 'text', 'text', '', 'Y', 'Y', 'Y', '2015-05-16 22:33:13', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000KJ', '0001AA100000000000K9', 'menuname', '菜单名称', 'CV;=,等于;like,包含', '', '0', 'text', 'text', '', 'Y', 'Y', 'Y', '2015-05-16 22:33:41', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000KK', '0001AA100000000000K9', 'keyvalue', 'keyvalue', 'CV;=,等于;like,包含', '', '0', 'text', 'text', '', 'Y', 'Y', 'Y', '2015-05-16 22:34:53', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000KL', '0001AA100000000000K9', 'keyname', 'keyname', 'CV;=,等于;like,包含', '', '0', 'text', 'text', '', 'Y', 'Y', 'Y', '2015-05-16 22:35:14', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000KM', '0001AA100000000000K9', 'url', '链接', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:27:44', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000L6', '0001AA100000000000L5', 'vdef1', '自定义项1', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:27:57', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000L7', '0001AA100000000000L5', 'vdef2', '自定义项2', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:27:57', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000L8', '0001AA100000000000L5', 'vdef3', '自定义项3', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:27:57', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000L9', '0001AA100000000000L5', 'vdef4', '自定义项4', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:27:57', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000LA', '0001AA100000000000L5', 'vdef5', '自定义项5', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:27:57', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000LB', '0001AA100000000000L5', 'ts', 'ts', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:27:57', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000LC', '0001AA100000000000L5', 'dr', 'dr', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:27:57', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000LD', '0001AA100000000000L5', 'pk_wechat_msghandle', '主键', 'CV;=,等于;like,包含', '', '0', 'text', 'text', '', 'Y', 'Y', 'Y', '2015-05-24 10:42:33', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000LE', '0001AA100000000000L5', 'pk_wechat_account', '公众号', 'CV;=,等于;like,包含', '', '0', 'ref', 'ref', 'wechat_wechat_account_ref', 'Y', 'Y', 'Y', '2015-05-24 10:44:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000LF', '0001AA100000000000L5', 'msgtype', '消息类型', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:27:57', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000LG', '0001AA100000000000L5', 'handleclass', '处理类', 'CV;=,等于;like,包含', null, null, 'textarea', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:27:57', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000LH', '0001AA100000000000L5', 'remark', '备注', 'CV;=,等于;like,包含', null, null, 'textarea', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:27:57', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000NX', '0001AA100000000000NW', 'vdef1', '自定义项1', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:43:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000NY', '0001AA100000000000NW', 'vdef2', '自定义项2', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:43:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000NZ', '0001AA100000000000NW', 'vdef3', '自定义项3', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:43:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000O0', '0001AA100000000000NW', 'vdef4', '自定义项4', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:43:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000O1', '0001AA100000000000NW', 'vdef5', '自定义项5', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:43:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000O2', '0001AA100000000000NW', 'ts', 'ts', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:43:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000O3', '0001AA100000000000NW', 'dr', 'dr', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-24 13:43:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000O4', '0001AA100000000000NW', 'pk_weixin_eventhandle', '主键', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:43:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000O5', '0001AA100000000000NW', 'weixin_publicid', '公众号', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:43:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000O6', '0001AA100000000000NW', 'eventype', '事件类型', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:43:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000O7', '0001AA100000000000NW', 'handleclass', '处理类', 'CV;=,等于;like,包含', null, null, 'textarea', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:43:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000O8', '0001AA100000000000NW', 'remark', '备注', 'CV;=,等于;like,包含', null, null, '', null, '', 'Y', 'Y', 'Y', '2014-05-24 13:43:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PI', '0001AA100000000000PH', 'vdef1', '自定义项1', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PJ', '0001AA100000000000PH', 'vdef2', '自定义项2', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PK', '0001AA100000000000PH', 'vdef3', '自定义项3', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PL', '0001AA100000000000PH', 'vdef4', '自定义项4', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PM', '0001AA100000000000PH', 'vdef5', '自定义项5', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PN', '0001AA100000000000PH', 'ts', 'ts', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'N', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PO', '0001AA100000000000PH', 'dr', 'dr', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PP', '0001AA100000000000PH', 'pk_weixin_user', '微信用户主键', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PQ', '0001AA100000000000PH', 'weixin_publicid', '微信公众号', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PR', '0001AA100000000000PH', 'openid', '用户openid', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PS', '0001AA100000000000PH', 'headimgurl', '头像', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PT', '0001AA100000000000PH', 'nickname', '微信昵称', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PU', '0001AA100000000000PH', 'sex', '性别', 'CV;=,等于;like,包含', null, null, 'select', null, 'CV;1,男;2,女', 'Y', 'Y', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PV', '0001AA100000000000PH', 'province', '省', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PW', '0001AA100000000000PH', 'city', '市', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PX', '0001AA100000000000PH', 'country', '国家', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PY', '0001AA100000000000PH', 'language', '语言', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000PZ', '0001AA100000000000PH', 'subscribe_time', '订阅时间', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000R6', '0001AA100000000000R5', 'vdef1', '自定义项1', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-30 14:12:25', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000R7', '0001AA100000000000R5', 'vdef2', '自定义项2', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-30 14:12:25', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000R8', '0001AA100000000000R5', 'vdef3', '自定义项3', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-30 14:12:25', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000R9', '0001AA100000000000R5', 'vdef4', '自定义项4', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-30 14:12:25', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000RA', '0001AA100000000000R5', 'vdef5', '自定义项5', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-30 14:12:25', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000RB', '0001AA100000000000R5', 'ts', 'ts', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-30 14:12:25', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000RC', '0001AA100000000000R5', 'dr', 'dr', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-05-30 14:12:25', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000RD', '0001AA100000000000R5', 'pk_task_tasklog', '任务日志主键', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'Y', 'Y', '2014-05-30 14:12:25', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000RE', '0001AA100000000000R5', 'pk_taskdeploy', '任务插件', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-30 14:12:25', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000RF', '0001AA100000000000R5', 'returnstr', '返回字符串', 'CV;=,等于;like,包含', null, null, 'textarea', null, '', 'Y', 'Y', 'Y', '2014-05-30 14:12:25', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000RG', '0001AA100000000000R5', 'issuccess', '是否成功', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-30 14:12:25', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000RH', '0001AA100000000000R5', 'runtime', '运行时间', 'CV;=,等于;like,包含', null, null, 'datetime', null, '', 'Y', 'Y', 'Y', '2014-05-30 14:12:25', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000RI', '0001AA100000000000R5', 'runserver', '运行服务器', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-05-30 14:12:25', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000SS', '0001AA100000000000R5', 'vdef1', '自定义项1', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-06-03 18:54:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000ST', '0001AA100000000000R5', 'vdef2', '自定义项2', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-06-03 18:54:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000SU', '0001AA100000000000R5', 'vdef3', '自定义项3', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-06-03 18:54:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000SV', '0001AA100000000000R5', 'vdef4', '自定义项4', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-06-03 18:54:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000SW', '0001AA100000000000R5', 'vdef5', '自定义项5', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-06-03 18:54:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000SX', '0001AA100000000000R5', 'ts', 'ts', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-06-03 18:54:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000SY', '0001AA100000000000R5', 'dr', 'dr', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'N', 'Y', '2014-06-03 18:54:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000SZ', '0001AA100000000000R5', 'pk_task_tasklog', '任务日志主键', 'CV;=,等于;like,包含', null, null, 'text', null, null, 'Y', 'Y', 'Y', '2014-06-03 18:54:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000T0', '0001AA100000000000R5', 'pk_taskdeploy', '任务插件', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-06-03 18:54:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000T1', '0001AA100000000000R5', 'returnstr', '返回字符串', 'CV;=,等于;like,包含', null, null, 'textarea', null, '', 'Y', 'Y', 'Y', '2014-06-03 18:54:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000T2', '0001AA100000000000R5', 'issuccess', '是否成功', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-06-03 18:54:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000T3', '0001AA100000000000R5', 'runtime', '运行时间', 'CV;=,等于;like,包含', null, null, 'datetime', null, '', 'Y', 'Y', 'Y', '2014-06-03 18:54:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000T4', '0001AA100000000000R5', 'runserver', '运行服务器', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'Y', 'Y', '2014-06-03 18:54:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000T5', '0001AA100000000000R5', 'vdef6', 'vdef6', 'CV;=,等于;like,包含', null, null, 'text', null, '', 'Y', 'N', 'Y', '2014-06-03 18:54:20', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000VW', '0001AA100000000000VV', 'nickname', '用户昵称', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2014-08-03 18:45:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000VX', '0001AA100000000000VV', 'longitude', '经度', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2014-08-03 18:45:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000VY', '0001AA100000000000VV', 'latitude', '维度', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2014-08-03 18:45:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000VZ', '0001AA100000000000VV', 'reportdate', '日期', 'CV;=,等于;like,包含', null, '0', 'date', null, '', 'Y', 'Y', 'Y', '2014-08-03 18:45:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000W0', '0001AA100000000000VV', 'vdef1', '自定义项1', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'N', 'Y', '2014-08-03 18:45:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000W1', '0001AA100000000000VV', 'vdef2', 'vdef2', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'N', 'Y', '2014-08-03 18:45:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000W2', '0001AA100000000000VV', 'vdef3', 'vdef3', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'N', 'Y', '2014-08-03 18:45:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000W3', '0001AA100000000000VV', 'openid', '用户openid', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2014-08-03 18:45:58', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000X4', '0001AA100000000000X3', 'vdef1', '自定义项1', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2014-08-31 12:04:15', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000X5', '0001AA100000000000X3', 'vdef2', '自定义项2', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2014-08-31 12:04:15', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000X6', '0001AA100000000000X3', 'vdef3', '自定义项3', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2014-08-31 12:04:15', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000X7', '0001AA100000000000X3', 'vdef4', '自定义项4', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2014-08-31 12:04:15', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000X8', '0001AA100000000000X3', 'vdef5', '自定义项5', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2014-08-31 12:04:15', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000X9', '0001AA100000000000X3', 'ts', 'ts', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2014-08-31 12:04:15', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000XA', '0001AA100000000000X3', 'dr', 'dr', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2014-08-31 12:04:15', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000XB', '0001AA100000000000X3', 'pk_cachetable', '缓存数据表主键', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'Y', 'Y', '2014-08-31 12:04:15', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000Y1', '0001AA100000000000XU', 'pk_params', '主键', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2014-09-07 16:03:09', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000Y2', '0001AA100000000000XU', 'paramname', '参数名称', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2014-09-07 16:03:09', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000Y3', '0001AA100000000000XU', 'paramcode', '参数编码', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2014-09-07 16:03:09', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000Y4', '0001AA100000000000XU', 'paramvalue', '参数值', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2014-09-07 16:03:09', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000Y5', '0001AA100000000000XU', 'remark', '备注', 'CV;=,等于;like,包含', null, '0', 'textarea', null, '', 'Y', 'Y', 'Y', '2014-09-07 16:03:09', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA100000000000Y6', '0001AA100000000000XU', 'vdef1', 'vdef1', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'N', 'Y', '2014-09-07 16:03:09', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000012O', '0001AA1000000000012N', 'vdef1', '自定义项1', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000012P', '0001AA1000000000012N', 'vdef2', '自定义项2', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000012Q', '0001AA1000000000012N', 'vdef3', '自定义项3', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000012R', '0001AA1000000000012N', 'vdef4', '自定义项4', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000012S', '0001AA1000000000012N', 'vdef5', '自定义项5', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000012T', '0001AA1000000000012N', 'ts', 'ts', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000012U', '0001AA1000000000012N', 'dr', 'dr', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'N', 'Y', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000012V', '0001AA1000000000012N', 'pk_wechat_account', '微信公众号主键', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'Y', 'Y', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000012W', '0001AA1000000000012N', 'appid', 'appid', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000012X', '0001AA1000000000012N', 'appsecret', 'appsecret', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000012Y', '0001AA1000000000012N', 'accountcode', '微信号', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000012Z', '0001AA1000000000012N', 'accountname', '微信名称', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA10000000000130', '0001AA1000000000012N', 'ghid', '原始id', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA10000000000131', '0001AA1000000000012N', 'encrypttoken', '加密token', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA10000000000146', '0001AA10000000000145', 'vdef1', '自定义项1', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA10000000000147', '0001AA10000000000145', 'vdef2', '自定义项2', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA10000000000148', '0001AA10000000000145', 'vdef3', '自定义项3', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA10000000000149', '0001AA10000000000145', 'vdef4', '自定义项4', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000014A', '0001AA10000000000145', 'vdef5', '自定义项5', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000014B', '0001AA10000000000145', 'ts', 'ts', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'N', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000014C', '0001AA10000000000145', 'dr', 'dr', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'N', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000014D', '0001AA10000000000145', 'pk_wechat_user', '微信用户主键', 'CV;=,等于;like,包含', null, '0', 'text', null, null, 'Y', 'Y', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000014E', '0001AA10000000000145', 'openid', 'openid', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000014F', '0001AA10000000000145', 'unionid', 'unionid', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000014G', '0001AA10000000000145', 'nickname', '昵称', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000014H', '0001AA10000000000145', 'headimgurl', '头像', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000014I', '0001AA10000000000145', 'province', '省', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000014J', '0001AA10000000000145', 'city', '市', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000014K', '0001AA10000000000145', 'country', '区县', 'CV;=,等于;like,包含', null, '0', 'text', null, '', 'Y', 'Y', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000014L', '0001AA10000000000145', 'sex', '性别', 'CV;=,等于;like,包含', null, '0', 'select', null, 'CV;1:男;2:女', 'Y', 'Y', 'Y', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_queryconditiontemplate` VALUES ('0001AA1000000000014M', '0001AA10000000000145', 'subscribe_time', '订阅时间', 'CV;=,等于;like,包含', null, '0', 'datetime', null, '', 'Y', 'Y', 'Y', '2015-05-11 20:44:38', '0');

-- ----------------------------
-- Table structure for `sm_querytemplate`
-- ----------------------------
DROP TABLE IF EXISTS `sm_querytemplate`;
CREATE TABLE `sm_querytemplate` (
  `pk_node` char(20) DEFAULT NULL,
  `pk_querytemplate` char(20) NOT NULL DEFAULT '',
  `name` varchar(40) DEFAULT NULL,
  `code` varchar(40) DEFAULT NULL,
  `templatetypecode` varchar(40) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  PRIMARY KEY (`pk_querytemplate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_querytemplate
-- ----------------------------
INSERT INTO `sm_querytemplate` VALUES ('0001AA1000000000005D', '0001AA1000000000007W', '任务注册', 'taskplugin', 'SYSTEM', '', '2014-03-27 20:48:18', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA1000000000005E', '0001AA1000000000009O', '任务部署', 'taskdeploy', 'SYSTEM', '', '2014-03-30 22:44:02', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA100000000000AC', '0001AA100000000000DI', '微信工作号', 'weixinaccount', 'SYSTEM', '', '2014-05-10 20:38:58', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA100000000000AC', '0001AA100000000000DM', '微信工作号121', 'weixinaccount', '1212', '', '2014-05-10 20:32:36', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA100000000000BZ', '0001AA100000000000EB', '微信accesstoken', 'accesstoken', 'SYSTEM', '', '2014-05-10 21:43:40', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA100000000000AJ', '0001AA100000000000JA', '微信菜单', 'weixin_menu', 'SYSTEM', '', '2014-05-24 13:10:19', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA100000000000GF', '0001AA100000000000K9', '微信菜单', 'wechat_menu', 'SYSTEM', '', '2015-05-16 22:27:31', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA100000000000GH', '0001AA100000000000L5', '微信消息转发', 'wechat_msghandle', 'SYSTEM', '', '2015-05-24 10:41:45', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA100000000000GG', '0001AA100000000000NW', '微信事件转发', 'weixin_eventhandle', 'SYSTEM', '', '2014-05-24 13:43:38', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA100000000000BX', '0001AA100000000000PH', '微信用户', 'weixin_user', 'SYSTEM', '', '2014-05-25 18:41:39', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA1000000000005F', '0001AA100000000000R5', '任务日志', 'task_tasklog', 'SYSTEM', '', '2014-05-30 14:12:25', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA100000000000GJ', '0001AA100000000000VV', '微信用户地理位置', 'user_location', 'SYSTEM', '', '2014-08-03 18:45:49', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA100000000000W4', '0001AA100000000000X3', '缓存数据表', 'sys_cachetable', 'SYSTEM', '', '2014-08-31 12:04:15', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA100000000000XG', '0001AA100000000000XU', '参数管理表', 'params', 'SYSTEM', '', '2014-09-07 14:49:41', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA100000000000C2', '0001AA1000000000012N', '微信公众号', 'wechat_account', 'SYSTEM', '', '2015-05-03 19:35:04', '0');
INSERT INTO `sm_querytemplate` VALUES ('0001AA100000000000GI', '0001AA10000000000145', '微信用户', 'wechat_user', 'SYSTEM', '', '2015-05-11 20:44:38', '0');

-- ----------------------------
-- Table structure for `sm_querytemplatenoderole`
-- ----------------------------
DROP TABLE IF EXISTS `sm_querytemplatenoderole`;
CREATE TABLE `sm_querytemplatenoderole` (
  `pk_querytemplatenoderole` char(20) NOT NULL DEFAULT '',
  `pk_querytemplate` char(20) DEFAULT NULL,
  `pk_user` char(20) DEFAULT NULL,
  `pk_node` char(20) DEFAULT NULL,
  `pk_role` char(20) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  PRIMARY KEY (`pk_querytemplatenoderole`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_querytemplatenoderole
-- ----------------------------

-- ----------------------------
-- Table structure for `sm_ref`
-- ----------------------------
DROP TABLE IF EXISTS `sm_ref`;
CREATE TABLE `sm_ref` (
  `pk_module` char(20) DEFAULT NULL,
  `pk_ref` varchar(255) NOT NULL,
  `refname` varchar(255) DEFAULT NULL,
  `reftype` varchar(255) DEFAULT NULL,
  `pk_field` varchar(255) DEFAULT NULL,
  `showfield` varchar(255) DEFAULT NULL,
  `field_codenames` varchar(255) DEFAULT NULL,
  `modelclass` varchar(255) DEFAULT NULL,
  `datatablename` varchar(255) DEFAULT NULL,
  `isaccesscontrol` char(1) DEFAULT NULL,
  `ts` varchar(255) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk_ref`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_ref
-- ----------------------------
INSERT INTO `sm_ref` VALUES ('0001AA1000000000005B', '0001AA1000000000003T', '任务插件参照', 'taskplugin', 'pk_taskplugin', 'pluginname', 'pluginname:名称;pluginclass:类名;plugindescription:描述', 'cheng.pipp.task.model.TaskpluginModel', 'task_taskplugin', 'N', '2014-03-31 21:46:12', '0');
INSERT INTO `sm_ref` VALUES ('0001AA100000000000A9', '0001AA100000000000AA', '功能节点参照', 'SYS_NODE', 'pk_node', 'fun_name', 'fun_name:节点名称;fun_code:节点编码;fun_desc:节点描述', 'cheng.pipp.sys.model.NodeModel', 'sm_node', 'N', '2014-07-11 18:56:52', '0');
INSERT INTO `sm_ref` VALUES ('0001AA100000000000A8', '0001AA100000000000D2', '注册来源参照', 'channel_registersource', 'pk_registersource', 'sourcename', 'sourcename:来源名称;registersource:来源标示;remark:备注', 'cheng.channel.vo.RegisterSourceVO', 'channel_registersource', 'Y', '2014-11-19 22:08:26', '0');
INSERT INTO `sm_ref` VALUES ('0001AA100000000000A9', '0001AA100000000000WT', '缓存数据表参照', 'sys_cachetable_ref', 'pk_cachetable', 'tablename', 'pk_cachetable:缓存数据表主键;pk_module:所属模块;tablename:数据表名;iscache:是否缓存', 'cheng.pipp.sys.model.CachetableModel', 'sys_cachetable', 'N', '2014-08-31 12:25:30', '0');
INSERT INTO `sm_ref` VALUES ('0001AA1000000000001M', '0001AA100000000000ZT', '系统角色参照', 'SYS_ROLE', 'pk_role', 'role_name', 'pk_role:主键;role_name:角色名称;role_code:角色编码;role_remark:备注', 'cheng.pipp.access.model.RoleModel', 'sm_role', 'N', '2015-01-02 20:49:01', '0');
INSERT INTO `sm_ref` VALUES ('0001AA1000000000010E', '0001AA1000000000010F', '元数据类型参照', 'PUB_METADATA_TYPE', 'pk_metadata_type', 'type_name', 'pk_metadata_type:主键;type_name:角色名称;type_code:角色编码;remark:备注', 'cheng.pipp.basic.model.MetaDataTypeModel', 'pub_metadata_type', 'N', '2015-01-02 23:28:28', '0');
INSERT INTO `sm_ref` VALUES ('0001AA1000000000011N', '0001AA10000000000127', '微信公众号', 'wechat_wechat_account_ref', 'pk_wechat_account', 'accountname', 'pk_wechat_account:微信公众号主键;appid:appid;appsecret:appsecret;accountcode:微信号;accountname:微信名称;ghid:原始id;encrypttoken:加密token', 'cheng.wechat.model.AccountModel', '', 'N', '2015-05-05 22:32:36', '0');
INSERT INTO `sm_ref` VALUES ('0001AA1000000000011N', '0001AA1000000000013M', null, 'wechat_wechat_user_ref', 'pk_wechat_user', null, 'pk_wechat_user:微信用户主键;openid:openid;unionid:unionid;nickname:昵称;headimgurl:头像;province:省;city:市;country:区县;sex:性别;subscribe_time:订阅时间', 'cheng.wechat.model.UserModel', 'wechat_user', 'N', '2015-05-11 20:44:38', '0');
INSERT INTO `sm_ref` VALUES ('0001AA1000000000011N', '0001AA1000000000016T', null, 'wechat_wechat_userlocation_ref', 'pk_wechat_userlocation', null, 'pk_wechat_userlocation:微信用户地理主键;pk_wechat_account:公众号;pk_wechat_user:用户;w_latitude:地理位置纬度;w_longitude:地理位置经度;w_precision:地理位置精度;reportdate:上报日期', 'cheng.wechat.model.UserlocationModel', 'wechat_userlocation', 'N', '2015-05-31 22:29:40', '0');

-- ----------------------------
-- Table structure for `sm_reportitemtemplate`
-- ----------------------------
DROP TABLE IF EXISTS `sm_reportitemtemplate`;
CREATE TABLE `sm_reportitemtemplate` (
  `pk_reportitemtemplate` char(20) NOT NULL DEFAULT '',
  `pk_reporttemplate` char(20) DEFAULT NULL,
  `itemname` varchar(30) DEFAULT NULL,
  `itemcode` varchar(30) DEFAULT NULL,
  `showorder` int(11) DEFAULT NULL,
  `datatype` varchar(30) DEFAULT NULL,
  `islistshow` char(1) DEFAULT NULL,
  `islist` char(1) DEFAULT NULL,
  `istotal` char(1) DEFAULT NULL,
  `width` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `vdef6` varchar(255) DEFAULT NULL,
  `vdef7` varchar(255) DEFAULT NULL,
  `vdef8` varchar(255) DEFAULT NULL,
  `vdef9` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk_reportitemtemplate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_reportitemtemplate
-- ----------------------------
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000VN', '0001AA100000000000VM', '序号', 'index', '1', 'text', 'Y', 'Y', null, '150', null, null, null, null, null, null, null, null, null, null, '2014-08-03 18:45:29', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000VO', '0001AA100000000000VM', '渠道', 'channel', '8', 'text', 'N', 'Y', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2015-03-17 15:25:03', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000VP', '0001AA100000000000VM', '总注册数', 'totaluser', '3', 'text', 'Y', 'Y', null, '150', null, null, null, null, null, null, null, null, null, null, '2014-08-03 18:45:29', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000VQ', '0001AA100000000000VM', '充值总数', 'totalrecharge', '4', 'text', 'N', 'Y', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2015-03-17 15:00:26', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000VR', '0001AA100000000000VM', '投资总数', 'totalinvest', '5', 'text', 'N', 'Y', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2015-03-17 15:00:42', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000VS', '0001AA100000000000VM', '注册渠道', 'vdef3', '2', 'text', 'Y', 'Y', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2015-03-17 15:25:34', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000VT', '0001AA100000000000VM', '投资总金额', 'vdef2', '7', 'text', 'Y', 'Y', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2015-03-17 15:00:16', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000VU', '0001AA100000000000VM', '充值总金额', 'vdef1', '6', 'text', 'Y', 'Y', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2015-03-17 14:59:59', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000Z2', '0001AA100000000000Z1', '序号', 'index', '1', 'text', 'Y', 'N', 'N', '20', null, null, null, null, null, null, null, null, null, null, '2014-11-18 22:23:27', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000Z3', '0001AA100000000000Z1', '用户名称', 'username', '2', 'text', 'Y', 'N', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2014-11-18 22:23:58', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000Z4', '0001AA100000000000Z1', '用户手机', 'phone', '3', 'text', 'Y', 'N', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2014-11-18 22:24:15', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000Z5', '0001AA100000000000Z1', '充值总额', 'recharemoney', '4', 'text', 'Y', 'N', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2014-11-18 22:25:05', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000Z6', '0001AA100000000000Z1', '充值投资', 'investmoney', '5', 'text', 'Y', 'N', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2014-11-18 22:25:43', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000Z7', '0001AA100000000000Z1', '提现总额', 'withdrawmoney', '6', 'text', 'Y', 'N', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2014-11-18 22:26:34', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000Z8', '0001AA100000000000Z1', '注册时间', 'registertime', '7', 'text', 'Y', 'N', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2014-11-18 22:27:02', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000ZA', '0001AA100000000000Z9', '序号', 'index', '1', 'text', 'Y', 'Y', 'N', '20', null, null, null, null, null, null, null, null, null, null, '2014-11-18 22:30:12', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000ZB', '0001AA100000000000Z9', '用户', 'username', '2', 'text', 'Y', 'Y', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2014-11-18 22:30:29', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000ZC', '0001AA100000000000Z9', '充值金额', 'recharemoney', '3', 'text', 'Y', 'Y', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2014-11-18 22:30:53', '0');
INSERT INTO `sm_reportitemtemplate` VALUES ('0001AA100000000000ZD', '0001AA100000000000Z9', '充值时间', 'recharetime', '4', 'text', 'Y', 'Y', 'N', '150', null, null, null, null, null, null, null, null, null, null, '2014-11-18 22:31:33', '0');

-- ----------------------------
-- Table structure for `sm_reporttemplate`
-- ----------------------------
DROP TABLE IF EXISTS `sm_reporttemplate`;
CREATE TABLE `sm_reporttemplate` (
  `pk_reporttemplate` char(20) NOT NULL DEFAULT '',
  `pk_node` char(20) DEFAULT NULL,
  `templatename` varchar(30) DEFAULT NULL,
  `templatecode` varchar(30) DEFAULT NULL,
  `templatetypecode` varchar(30) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pk_reporttemplate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_reporttemplate
-- ----------------------------
INSERT INTO `sm_reporttemplate` VALUES ('0001AA100000000000VM', '0001AA100000000000C0', '用户汇总信息默认模板', 'qqwq', 'SYSTEM', '用户汇总信息默认模板', null, null, null, null, null, '0', '2014-08-03 18:44:12');
INSERT INTO `sm_reporttemplate` VALUES ('0001AA100000000000Z1', '0001AA100000000000AJ', '用户信息默认模板', 'yserywue', 'SYSTEM', '用户信息默认模板', '', '', '', '', '', '0', '2014-11-18 22:17:17');
INSERT INTO `sm_reporttemplate` VALUES ('0001AA100000000000Z9', '0001AA100000000000BX', '充值记录默认模板', 'wdds', 'SYSTEM', '充值记录默认模板', '', '', '', '', '', '0', '2014-11-18 22:29:24');

-- ----------------------------
-- Table structure for `sm_resourcerole`
-- ----------------------------
DROP TABLE IF EXISTS `sm_resourcerole`;
CREATE TABLE `sm_resourcerole` (
  `pk_resourcerole` char(20) NOT NULL DEFAULT '',
  `pk_role` char(20) DEFAULT NULL,
  `pk_user` char(20) DEFAULT NULL,
  `pk_resourcetype` char(20) DEFAULT NULL,
  `pk_resource` char(20) DEFAULT NULL,
  `resourcetype` varchar(255) DEFAULT NULL,
  `resourcetable` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `vdef6` varchar(255) DEFAULT NULL,
  `vdef7` varchar(255) DEFAULT NULL,
  `vdef8` varchar(255) DEFAULT NULL,
  `vdef9` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pk_resourcerole`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_resourcerole
-- ----------------------------
INSERT INTO `sm_resourcerole` VALUES ('0001AA100000000000T8', '0001AA1000000000001K', null, '0001AA1000000000003T', '0001AA10000000000089', null, null, '2014-07-05 17:47:33', '0', null, null, null, null, null, null, null, null, null);
INSERT INTO `sm_resourcerole` VALUES ('0001AA100000000000ZO', '0001AA1000000000001L', null, '0001AA100000000000D2', '0001AA100000000000DX', null, null, '2014-11-20 11:22:39', '0', null, null, null, null, null, null, null, null, null);
INSERT INTO `sm_resourcerole` VALUES ('0001AA100000000000ZS', '0001AA1000000000001K', null, '0001AA100000000000D2', '0001AA100000000000KR', null, null, '2014-11-20 13:21:13', '0', null, null, null, null, null, null, null, null, null);
INSERT INTO `sm_resourcerole` VALUES ('0001AA1000000000010Y', '0001AA1000000000001I', null, '0001AA100000000000D2', '0001AA100000000000IT', null, null, '2015-01-04 18:07:42', '0', null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `sm_role`
-- ----------------------------
DROP TABLE IF EXISTS `sm_role`;
CREATE TABLE `sm_role` (
  `pk_parent_role` char(20) DEFAULT NULL,
  `pk_role` char(20) NOT NULL DEFAULT '',
  `role_name` varchar(30) DEFAULT NULL,
  `role_code` varchar(30) DEFAULT NULL,
  `role_remark` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  PRIMARY KEY (`pk_role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_role
-- ----------------------------
INSERT INTO `sm_role` VALUES (null, '0001AA1000000000000O', '管理员', 'admin', '开发管理员', '2011-11-11 11:22:22', '0');
INSERT INTO `sm_role` VALUES ('', '0001AA1000000000001I', '微信订阅号（13）', 'd_1', '', '2015-01-04 18:03:25', '0');
INSERT INTO `sm_role` VALUES ('', '0001AA1000000000001J', '待定2', 'd_2', '', '2015-01-02 21:11:28', '0');
INSERT INTO `sm_role` VALUES ('', '0001AA1000000000001K', '微信自媒体查询（19）', 'wechat_19', '', '2015-01-02 21:09:53', '0');
INSERT INTO `sm_role` VALUES ('', '0001AA1000000000001L', '百米注册查询(10)', 'baimi_10', '', '2015-01-02 21:10:36', '0');

-- ----------------------------
-- Table structure for `sm_role_node`
-- ----------------------------
DROP TABLE IF EXISTS `sm_role_node`;
CREATE TABLE `sm_role_node` (
  `pk_role_node` char(20) NOT NULL DEFAULT '',
  `pk_role` char(20) DEFAULT NULL,
  `pk_node` char(20) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  PRIMARY KEY (`pk_role_node`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_role_node
-- ----------------------------
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000011', '0001AA1000000000000O', '0001AA10000000000001', '2015-03-16 16:51:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000012', '0001AA1000000000000O', '0001AA10000000000002', '2015-03-16 16:51:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000013', '0001AA1000000000000O', '0001AA10000000000003', '2015-01-12 21:34:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000014', '0001AA1000000000000O', '0001AA10000000000004', '2015-03-16 16:51:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000015', '0001AA1000000000000O', '0001AA10000000000005', '2015-01-12 21:34:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000016', '0001AA1000000000000O', '0001AA10000000000006', '2015-03-16 16:51:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000017', '0001AA1000000000000O', '0001AA10000000000010', '2015-03-16 16:51:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000018', '0001AA1000000000000O', '0001AA1000000000000Z', '2015-01-12 21:34:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000019', '0001AA1000000000000O', '0001AA1000000000000Y', '2015-01-12 21:34:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000001A', '0001AA1000000000000O', '0001AA1000000000000X', '2015-01-12 21:34:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000001B', '0001AA1000000000000O', '0001AA1000000000000W', '2015-01-12 21:34:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000001C', '0001AA1000000000000O', '0001AA1000000000000V', '2015-01-12 21:34:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000001D', '0001AA1000000000000O', '0001AA1000000000000U', '2015-01-12 21:34:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000001E', '0001AA1000000000000O', '0001AA1000000000000T', '2015-01-12 21:34:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000002I', '0001AA1000000000000O', '0001AA10000000000026', '2015-01-12 21:34:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000002J', '0001AA1000000000000O', '0001AA1000000000001M', '2015-03-16 16:51:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000002K', '0001AA1000000000000O', '0001AA1000000000001W', '2015-01-12 21:34:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000BF', '0001AA1000000000001K', '0001AA100000000000AI', '2014-11-20 13:12:56', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000BG', '0001AA1000000000001K', '0001AA100000000000BD', '2014-11-20 13:12:56', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000BH', '0001AA1000000000001K', '0001AA100000000000AC', '2014-11-20 13:12:56', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000BI', '0001AA1000000000001K', '0001AA100000000000AJ', '2014-11-20 13:12:56', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000BJ', '0001AA1000000000001K', '0001AA100000000000BE', '2014-11-20 13:12:56', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000BV', '0001AA1000000000001K', '0001AA10000000000001', '2014-11-20 13:12:56', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000BW', '0001AA1000000000001K', '0001AA1000000000005C', '2014-11-20 13:12:56', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000TI', '0001AA1000000000001K', '0001AA1000000000005D', '2014-11-20 13:12:56', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000TJ', '0001AA1000000000001K', '0001AA1000000000005E', '2014-11-20 13:12:56', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000TK', '0001AA1000000000001K', '0001AA1000000000005F', '2014-11-20 13:12:56', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000TT', '0001AA1000000000001L', '0001AA10000000000001', '2014-11-19 22:41:23', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000TU', '0001AA1000000000001L', '0001AA1000000000005C', '2014-11-19 22:41:23', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000TV', '0001AA1000000000001L', '0001AA1000000000005D', '2014-11-19 22:41:23', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000TW', '0001AA1000000000001L', '0001AA1000000000005E', '2014-11-19 22:41:23', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000TX', '0001AA1000000000001L', '0001AA1000000000005F', '2014-11-19 22:41:23', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000ZE', '0001AA1000000000001L', '0001AA100000000000AI', '2014-11-19 22:41:23', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000ZF', '0001AA1000000000001L', '0001AA100000000000BD', '2014-11-19 22:41:23', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000ZG', '0001AA1000000000001L', '0001AA100000000000AJ', '2014-11-19 22:41:23', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000ZH', '0001AA1000000000001L', '0001AA100000000000BE', '2014-11-19 22:41:23', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000ZI', '0001AA1000000000001L', '0001AA100000000000BX', '2014-11-19 22:41:23', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA100000000000ZR', '0001AA1000000000001K', '0001AA100000000000BX', '2014-11-20 13:12:55', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000010Z', '0001AA1000000000001I', '0001AA100000000000AI', '2015-01-04 18:11:25', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000110', '0001AA1000000000001I', '0001AA100000000000BD', '2015-01-04 18:11:25', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000111', '0001AA1000000000001I', '0001AA100000000000AJ', '2015-01-04 18:11:25', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000112', '0001AA1000000000001I', '0001AA100000000000BE', '2015-01-04 18:11:25', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000113', '0001AA1000000000001I', '0001AA100000000000BX', '2015-01-04 18:11:25', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000114', '0001AA1000000000000O', '0001AA1000000000004W', '2015-01-12 21:34:14', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000115', '0001AA1000000000000O', '0001AA100000000000W4', '2015-03-16 16:51:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000116', '0001AA1000000000000O', '0001AA100000000000XG', '2015-01-12 21:34:15', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000117', '0001AA1000000000000O', '0001AA100000000000T6', '2015-01-12 21:34:15', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000118', '0001AA1000000000000O', '0001AA100000000000BY', '2015-01-12 21:34:15', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA10000000000119', '0001AA1000000000000O', '0001AA1000000000005C', '2015-03-16 16:51:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000011A', '0001AA1000000000000O', '0001AA1000000000005D', '2015-01-12 21:34:15', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000011B', '0001AA1000000000000O', '0001AA1000000000005E', '2015-01-12 21:34:15', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000011C', '0001AA1000000000000O', '0001AA1000000000005F', '2015-01-12 21:34:15', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000011D', '0001AA1000000000000O', '0001AA100000000000AI', '2015-03-16 16:51:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000011E', '0001AA1000000000000O', '0001AA100000000000BD', '2015-01-12 21:34:15', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000011F', '0001AA1000000000000O', '0001AA100000000000AJ', '2015-01-12 21:34:15', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000011G', '0001AA1000000000000O', '0001AA100000000000BE', '2015-03-16 16:51:17', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000011H', '0001AA1000000000000O', '0001AA100000000000BX', '2015-01-12 21:34:15', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000011I', '0001AA1000000000000O', '0001AA100000000000AC', '2015-03-16 16:40:16', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000011J', '0001AA1000000000000O', '0001AA100000000000BZ', '2015-03-16 17:00:13', '0');
INSERT INTO `sm_role_node` VALUES ('0001AA1000000000011K', '0001AA1000000000000O', '0001AA100000000000C0', '2015-03-16 18:06:17', '0');

-- ----------------------------
-- Table structure for `sm_templet`
-- ----------------------------
DROP TABLE IF EXISTS `sm_templet`;
CREATE TABLE `sm_templet` (
  `pk_node` char(20) DEFAULT NULL,
  `pk_templet` char(20) NOT NULL,
  `templetuiname` varchar(255) DEFAULT NULL,
  `templatetypecode` varchar(255) DEFAULT NULL,
  `templetuicaption` varchar(255) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `vdef6` varchar(255) DEFAULT NULL,
  `vdef7` varchar(255) DEFAULT NULL,
  `vdef8` varchar(255) DEFAULT NULL,
  `vdef9` varchar(255) DEFAULT NULL,
  `ts` varchar(255) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  PRIMARY KEY (`pk_templet`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_templet
-- ----------------------------
INSERT INTO `sm_templet` VALUES ('0001AA10000000000005', '0001AA10000000000007', '功能节点单据模板', 'SYSTEM', '功能节点单据模板', '', '', '', '', '', '', '', '', '', '2014-02-17 22:21:06', '0');
INSERT INTO `sm_templet` VALUES ('0001AA1000000000000X', '0001AA1000000000001O', '系统模块定义模板', 'SYSTEM', '系统模块定义模板', '', '', '', '', '', '', '', '', '', '2014-02-21 22:41:21', '0');
INSERT INTO `sm_templet` VALUES ('0001AA1000000000001W', '0001AA1000000000003B', '元数据管理默认单据模板', 'SYSTEM', '', '', '', '', '', '', '', '', '', '', '2015-01-02 22:47:38', '0');
INSERT INTO `sm_templet` VALUES ('0001AA1000000000000Y', '0001AA1000000000003X', '数据字典默认模板', 'SYSTEM', '', '', '', '', '', '', '', '', '', '', '2014-3-8 22:33:55', '0');
INSERT INTO `sm_templet` VALUES ('0001AA10000000000048', '0001AA1000000000004B', '页签默认模板', 'SYSTEM', '', '', '', '', '', '', '', '', '', '', '2014-3-9 16:25:53', '0');
INSERT INTO `sm_templet` VALUES ('0001AA1000000000004W', '0001AA10000000000051', '数据字典子表默认模板', 'SYSTEM', '', '', '', '', '', '', '', '', '', '', '2014-03-14 23:36:27', '0');
INSERT INTO `sm_templet` VALUES ('0001AA1000000000005D', '0001AA1000000000007N', '任务注册默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, '2014-03-27 20:48:18', '0');
INSERT INTO `sm_templet` VALUES ('0001AA1000000000005E', '0001AA10000000000096', '任务部署默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, '2014-03-30 22:44:02', '0');
INSERT INTO `sm_templet` VALUES ('0001AA100000000000AC', '0001AA100000000000D3', '元数据类型默认模板121212', 'SYSTEM', '', '', '', '', '', '', '', '', '', '', '2015-05-03 22:56:28', '0');
INSERT INTO `sm_templet` VALUES ('0001AA100000000000BZ', '0001AA100000000000DY', '微信accesstoken默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, '2014-05-10 21:43:37', '0');
INSERT INTO `sm_templet` VALUES ('0001AA100000000000GF', '0001AA100000000000JV', '微信菜单信息默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:43', '0');
INSERT INTO `sm_templet` VALUES ('0001AA100000000000GH', '0001AA100000000000KS', '微信消息转发默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:57', '0');
INSERT INTO `sm_templet` VALUES ('0001AA100000000000GG', '0001AA100000000000NI', '微信事件转发默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, '2014-05-24 13:35:18', '0');
INSERT INTO `sm_templet` VALUES ('0001AA1000000000005F', '0001AA100000000000QR', '任务日志默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, '2014-05-30 14:12:25', '0');
INSERT INTO `sm_templet` VALUES ('0001AA100000000000W4', '0001AA100000000000WU', '缓存数据表默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, '2014-08-31 12:04:14', '0');
INSERT INTO `sm_templet` VALUES ('0001AA100000000000XG', '0001AA100000000000XT', '参数管理表默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, '2014-09-07 14:49:40', '0');
INSERT INTO `sm_templet` VALUES ('0001AA100000000000BY', '0001AA10000000000100', '元数据默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sm_templet` VALUES ('0001AA100000000000C2', '0001AA10000000000128', '微信公众号默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, '2015-05-03 19:35:04', '0');
INSERT INTO `sm_templet` VALUES ('0001AA100000000000GI', '0001AA1000000000013N', '微信用户默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet` VALUES ('0001AA100000000000C3', '0001AA1000000000015G', '微信token默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, '2015-05-16 23:15:10', '0');
INSERT INTO `sm_templet` VALUES ('0001AA100000000000GK', '0001AA1000000000016U', '微信用户行为默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, '2015-05-31 22:32:19', '0');
INSERT INTO `sm_templet` VALUES ('0001AA100000000000GJ', '0001AA10000000000173', '微信用户地理默认模板', 'SYSTEM', null, null, null, null, null, null, null, null, null, null, '2015-05-31 22:33:51', '0');

-- ----------------------------
-- Table structure for `sm_templet_item`
-- ----------------------------
DROP TABLE IF EXISTS `sm_templet_item`;
CREATE TABLE `sm_templet_item` (
  `pk_templet_item` char(20) NOT NULL,
  `group_code` varchar(30) DEFAULT NULL,
  `tabcode` varchar(30) DEFAULT NULL,
  `pk_templet` char(20) DEFAULT NULL,
  `defaultshowname` varchar(255) DEFAULT NULL,
  `datatype` varchar(255) DEFAULT NULL,
  `itemkey` varchar(255) DEFAULT NULL,
  `editformula` varchar(255) DEFAULT NULL,
  `iscard` char(1) DEFAULT NULL,
  `iscardshow` char(1) DEFAULT NULL,
  `isedit` char(1) DEFAULT NULL,
  `islist` char(1) DEFAULT NULL,
  `islistshow` char(1) DEFAULT NULL,
  `islock` char(1) DEFAULT NULL,
  `isnull` char(1) DEFAULT NULL,
  `istotal` char(1) DEFAULT NULL,
  `itemcolor` varchar(255) DEFAULT NULL,
  `itempos` int(10) DEFAULT NULL,
  `loadformula` varchar(255) DEFAULT NULL,
  `reftype` varchar(255) DEFAULT NULL,
  `showorder` int(10) DEFAULT NULL,
  `inputlength` int(10) DEFAULT NULL,
  `defaultvalue` varchar(255) DEFAULT NULL,
  `validateformula` varchar(255) DEFAULT NULL,
  `csstype` varchar(255) DEFAULT NULL,
  `width` int(10) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `vdef6` varchar(255) DEFAULT NULL,
  `vdef7` varchar(255) DEFAULT NULL,
  `vdef8` varchar(255) DEFAULT NULL,
  `vdef9` varchar(255) DEFAULT NULL,
  `ts` varchar(255) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  PRIMARY KEY (`pk_templet_item`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_templet_item
-- ----------------------------
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000008', '', null, '0001AA10000000000007', '节点主键', 'text', 'pk_node', '', 'Y', 'N', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', '', '1', '', '', '1', null, '', '', 'text', '50', null, null, null, null, null, null, null, null, null, '2014-02-21 23:33:10', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000009', '', null, '0001AA10000000000007', '父节点主键', 'text', 'pk_parent_node', '', 'Y', 'N', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', '', '1', '', '', '2', null, '', '', 'text', '50', null, null, null, null, null, null, null, null, null, '2014-02-21 23:33:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000000A', '', null, '0001AA10000000000007', '显示编码', 'text', 'disp_code', '', 'Y', 'N', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', '', '1', '', '', '3', null, '', '', 'text', '50', null, null, null, null, null, null, null, null, null, '2014-02-17 22:28:12', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000000B', '', null, '0001AA10000000000007', '节点编码', 'text', 'fun_code', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', '', '1', '', '', '4', null, '', '', 'text', '50', null, null, null, null, null, null, null, null, null, '2014-02-17 22:29:46', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000000C', null, null, '0001AA10000000000007', '节点描述', 'textarea', 'fun_desc', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', null, '1', null, null, '5', null, null, null, null, '50', null, null, null, null, null, null, null, null, null, '2013-09-29 21:06:03', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000000D', '', null, '0001AA10000000000007', '节点级别', 'digits', 'fun_level', '', 'Y', 'N', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '6', null, '', '', '', '50', null, null, null, null, null, null, null, null, null, '2014-02-16 19:02:37', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000000E', '', null, '0001AA10000000000007', '节点名称', 'text', 'fun_name', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '1', null, '', '', '', '50', null, null, null, null, null, null, null, null, null, '2014-02-17 23:04:47', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000000F', '', null, '0001AA10000000000007', '节点属性', 'text', 'fun_property', '', 'Y', 'N', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '8', null, '', '', '', '50', null, null, null, null, null, null, null, null, null, '2014-02-16 19:02:59', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000000G', null, null, '0001AA10000000000007', '节点链接', 'textarea', 'url_name', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', null, '1', null, null, '9', null, null, null, null, '50', null, null, null, null, null, null, null, null, null, '2013-09-29 21:06:03', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000000H', '', null, '0001AA10000000000007', '节点动作链接', 'textarea', 'actionurl', '', 'Y', 'N', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '10', null, '', '', '', '50', null, null, null, null, null, null, null, null, null, '2014-02-16 19:03:15', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000000I', null, null, '0001AA10000000000007', '节点帮助链接', 'textarea', 'help_name', null, 'Y', 'N', 'Y', 'Y', 'Y', 'N', 'Y', 'N', null, '1', null, null, '11', null, null, null, null, '50', null, null, null, null, null, null, null, null, null, '2013-09-29 21:06:03', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000000J', null, null, '0001AA10000000000007', '节点类名称', 'textarea', 'modelclass', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', null, '1', null, null, '12', null, null, null, null, '50', null, null, null, null, null, null, null, null, null, '2013-09-29 21:06:03', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000000K', null, null, '0001AA10000000000007', '是否叶子节点', 'select', 'isseaf', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', null, '1', null, 'CV;Y,是;N,否', '13', null, null, null, null, '50', null, null, null, null, null, null, null, null, null, '2013-09-29 21:06:03', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000000L', '', '', '0001AA10000000000007', '节点数据类', 'textarea', 'treedata', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', 'CV;Y,是;N,否', '14', '0', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-07-29 22:40:29', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000000M', null, null, '0001AA10000000000007', 'ts', 'text', 'ts', null, 'Y', 'N', 'Y', 'Y', 'Y', 'N', 'Y', 'N', null, '1', null, null, '15', null, null, null, null, '50', null, null, null, null, null, null, null, null, null, '2013-09-29 21:06:03', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000000N', null, null, '0001AA10000000000007', 'dr', 'text', 'dr', null, 'Y', 'N', 'Y', 'Y', 'Y', 'N', 'Y', 'N', null, '1', null, null, '16', null, null, null, null, '50', null, null, null, null, null, null, null, null, null, '2013-09-29 21:06:03', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000001P', '', '', '0001AA1000000000001O', '主键', 'text', 'pk_module', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '1', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 14:51:22', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000001Q', '', null, '0001AA1000000000001O', '模块编码', 'text', 'module_code', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '2', null, '', '', 'text', '50', null, null, null, null, null, null, null, null, null, '2014-02-21 22:43:02', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000001R', '', null, '0001AA1000000000001O', '模块名称', 'text', 'module_name', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '3', null, '', '', 'text', '50', null, null, null, null, null, null, null, null, null, '2014-02-21 22:43:24', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000001T', '', '', '0001AA1000000000001O', '备注', 'text', 'module_remark', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '4', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 14:48:46', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000002L', '', '', '0001AA1000000000001O', '自定义项', 'text', 'vdef1', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', '', '1', '', '', '5', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 14:49:01', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000036', '', '', '0001AA1000000000001O', 'dr', 'digits', 'dr', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '6', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 14:50:37', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000037', '', '', '0001AA1000000000001O', 'ts', 'text', 'ts', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '7', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 14:51:08', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000003C', '', '', '0001AA1000000000003B', '外键', 'text', 'pk_module', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', null, null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-05 20:40:42', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000003D', '', '', '0001AA1000000000003B', '主键', 'text', 'pk_ref', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', null, null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-30 19:23:42', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000003G', '', '', '0001AA1000000000003B', '参照类型', 'text', 'reftype', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '3', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-31 02:24:15', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000003L', '', '', '0001AA1000000000003B', '显示字段', 'text', 'showfield', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '2', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-31 02:24:06', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000003M', '', '', '0001AA1000000000003B', '参照界面字段', 'textarea', 'field_codenames', '', 'Y', 'Y', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '4', '0', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2015-05-05 22:41:36', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000003N', '', '', '0001AA1000000000003B', '模型类', 'text', 'modelclass', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '5', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-31 02:25:01', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000003O', '', '', '0001AA1000000000003B', '表名', 'text', 'datatablename', '', 'Y', 'Y', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', null, null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-31 02:22:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000003P', '', '', '0001AA1000000000003B', 'ts', 'text', 'ts', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', null, null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-30 19:23:08', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000003Q', '', '', '0001AA1000000000003B', 'dr', 'text', 'dr', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', null, null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-30 19:23:20', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000003Y', '', '', '0001AA1000000000003X', '模块主键', 'text', 'pk_module', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '1', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 10:50:06', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000003Z', '', '', '0001AA1000000000003X', '主键', 'text', 'pk_datadict', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '2', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 10:50:21', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000040', '', '', '0001AA1000000000003X', '数据表名称', 'text', 'datatablename', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '3', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 10:05:59', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000042', '', '', '0001AA1000000000003X', '数据表编码', 'text', 'datatablecode', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '4', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 10:06:10', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000045', '', '', '0001AA1000000000003X', '备注', 'text', 'datatableremark', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '5', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 10:06:18', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000046', '', '', '0001AA1000000000003X', 'ts', 'text', 'ts', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '6', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 13:49:41', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000047', '', '', '0001AA1000000000003X', 'dr', 'digits', 'dr', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '7', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 13:49:55', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004C', '', null, '0001AA1000000000003X', 'vdef1', 'text', 'vdef1', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', null, '', '', '8', null, '', '', 'text', '50', null, null, null, null, null, null, null, null, null, '2014-3-9 16:26:27', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004F', '', null, '0001AA1000000000003X', 'vdef2', 'text', 'vdef2', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', null, '', '', '9', null, '', '', 'text', '50', null, null, null, null, null, null, null, null, null, '2014-3-9 16:27:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004G', '', null, '0001AA1000000000003X', 'vdef3', 'text', 'vdef3', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', null, '', '', '10', null, '', '', 'text', '50', null, null, null, null, null, null, null, null, null, '2014-3-9 16:28:23', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004H', '', null, '0001AA1000000000003X', 'vdef4', 'text', 'vdef4', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', null, '', '', '11', null, '', '', 'text', '50', null, null, null, null, null, null, null, null, null, '2014-3-9 16:28:42', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004I', '', '', '0001AA10000000000051', '数据表主键', 'text', 'pk_datadict', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '0', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 13:55:55', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004J', '', '', '0001AA10000000000051', '数据表字表主键', 'text', 'pk_datadictitem', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '0', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 13:56:10', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004K', '', '', '0001AA10000000000051', '字段名称', 'text', 'itemname', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', null, '', '', '1', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 13:51:21', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004L', '', '', '0001AA10000000000051', '字段编码', 'text', 'itemcode', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', null, '', '', '2', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 13:51:30', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004M', '', '', '0001AA10000000000007', 'vdef1', 'text', 'vdef1', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '17', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-07 12:56:55', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004N', '', '', '0001AA10000000000007', 'vdef2', 'text', 'vdef2', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '18', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-07 12:57:06', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004O', '', '', '0001AA10000000000007', 'vdef3', 'text', 'vdef3', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '19', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-07 12:57:15', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004P', '', '', '0001AA10000000000007', 'vdef4', 'text', 'vdef4', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '20', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-07 12:57:30', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004Q', '', '', '0001AA10000000000007', 'vdef5', 'text', 'vdef5', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '21', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-07 12:57:40', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004R', '', '', '0001AA10000000000007', 'vdef6', 'text', 'vdef6', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '22', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-07 12:57:48', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004S', '', '', '0001AA10000000000007', 'vdef7', 'text', 'vdef7', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '23', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-07 12:58:04', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004T', '', '', '0001AA10000000000007', 'vdef8', 'text', 'vdef8', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '24', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-07 12:58:14', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004U', '', '', '0001AA10000000000007', 'vdef9', 'text', 'vdef9', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '25', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-07 12:58:28', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004V', '', '', '0001AA10000000000007', '节点类型', 'select', 'fun_type', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '0', '', 'CV;node,虚节点;node,功能节点;report,报表节点', '3', '0', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-07-29 22:37:53', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000004X', '', '', '0001AA10000000000051', '字段数据类型', 'select', 'datatype', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '2', '', 'CV;int,整形;decimal,小数;varchar,可变字符;char,不可变字符', '3', null, 'varchar', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-24 11:08:01', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000050', '', '', '0001AA10000000000051', '字段长度', 'text', 'length', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', null, '', '', '4', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 13:53:00', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000052', '', '', '0001AA10000000000051', '备注', 'text', 'itemremark', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '5', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 13:53:23', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000053', '', '', '0001AA10000000000051', 'ts', 'text', 'ts', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '6', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 13:56:32', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000054', '', '', '0001AA10000000000051', 'dr', 'text', 'dr', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '7', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-16 13:56:43', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000005Q', '', '', '0001AA1000000000003X', '关联的节点', 'ref', 'pk_node', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', 'SYS_NODE', null, null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-05 20:47:50', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000005S', '', '', '0001AA10000000000051', '界面类型', 'select', 'uitype', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', 'CV;text,文本;date,日期;datetime,日期时间;password,密码;digits,整数;number,小数;textarea,大文本;select,下拉;ref,参照', '4', null, 'text', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-24 11:07:32', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000005T', '', '', '0001AA10000000000051', '类型数据', 'textarea', 'typedata', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '4', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-19 21:23:08', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000005U', '', '', '0001AA10000000000051', '是否是主键', 'select', 'isprimary', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', 'CV;Y,是;N,否', null, null, 'N', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-08 16:25:35', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000005V', '', '', '0001AA10000000000051', '是否可以为空', 'select', 'isnull', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', 'CV;Y,是;N,否', null, null, 'Y', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-08 16:25:09', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000005W', '', '', '0001AA10000000000051', '是否同步表', 'select', 'isTablesyn', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', 'CV;Y,是;N,否', null, null, 'N', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-08 16:25:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000005X', '', '', '0001AA10000000000051', '是否已经同步单据模板', 'select', 'isBilltemplatesyn', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', 'CV;Y,是;N,否', '0', '0', 'N', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-09-07 15:57:17', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000005Y', '', '', '0001AA10000000000051', '是否已经同步查询模板', 'select', 'isQueryTemplatesyn', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', 'CV;Y,是;N,否', '0', '0', 'N', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-09-07 15:57:30', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000005Z', '', '', '0001AA10000000000051', 'vdef1', 'text', 'vdef1', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', null, null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-08 16:26:55', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000060', '', '', '0001AA10000000000051', 'vdef2', 'text', 'vdef2', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', null, null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-08 16:29:24', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000061', '', '', '0001AA10000000000051', 'vdef3', 'text', 'vdef3', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', null, null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-08 16:29:33', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000062', '', '', '0001AA10000000000051', 'vdef4', 'text', 'vdef4', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', null, null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-08 16:29:41', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000063', '', '', '0001AA10000000000051', 'vdef5', 'text', 'vdef5', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', null, null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-08 16:29:50', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000064', '', '', '0001AA1000000000003X', '是否业务表', 'select', 'isbusi', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', 'CV;Y,是;N,否', null, null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-03-27 19:35:34', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000007O', '', '', '0001AA1000000000007N', '主键', 'text', 'pk_taskplugin', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '0', '', '', '1', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-07-27 21:34:24', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000007P', null, null, '0001AA1000000000007N', '插件名称', 'text', 'pluginname', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '2', '50', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-03-27 20:48:18', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000007Q', null, null, '0001AA1000000000007N', '任务插件类', 'textarea', 'pluginclass', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '3', '50', null, null, 'char', '50', null, null, null, null, null, null, null, null, null, '2014-03-27 20:48:18', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000007R', null, null, '0001AA1000000000007N', '任务描述', 'textarea', 'plugindescription', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '4', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-03-27 20:48:18', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000007S', null, null, '0001AA1000000000007N', '插件类型', 'select', 'plugintype', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, 'CV;task,后台任务;alert,预警任务', '5', '30', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-03-27 20:48:18', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000007T', null, null, '0001AA1000000000007N', '所属模块', 'text', 'belong_system', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '6', '30', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-03-27 20:48:18', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000007U', null, null, '0001AA1000000000007N', 'dr', 'digits', 'dr', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '7', '11', null, null, 'int', '50', null, null, null, null, null, null, null, null, null, '2014-03-27 20:48:18', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000007V', null, null, '0001AA1000000000007N', 'ts', 'text', 'ts', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '8', '20', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-03-27 20:48:18', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000097', '', '', '0001AA10000000000096', '自定义项1', 'text', 'vdef1', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '21', '255', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-04-02 22:49:08', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000098', '', '', '0001AA10000000000096', '自定义项2', 'text', 'vdef2', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '22', '255', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-04-02 22:47:30', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000099', '', '', '0001AA10000000000096', '自定义项3', 'text', 'vdef3', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '3', '255', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-04-02 22:47:42', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000009A', '', '', '0001AA10000000000096', '自定义项4', 'text', 'vdef4', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '4', '255', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-04-02 22:47:51', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000009B', '', '', '0001AA10000000000096', '自定义项5', 'text', 'vdef5', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '5', '255', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-04-02 22:48:00', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000009C', '', '', '0001AA10000000000096', 'ts', 'text', 'ts', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '6', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-04-02 22:49:20', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000009D', '', '', '0001AA10000000000096', 'dr', 'digits', 'dr', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', null, '', '', '7', '11', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-04-03 20:26:51', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000009E', '', '', '0001AA10000000000096', '主键', 'text', 'pk_taskdeploy', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '8', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-04-02 22:46:44', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000009F', null, null, '0001AA10000000000096', '任务插件主键', 'ref', 'pk_taskplugin', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, 'taskplugin', '9', '20', null, null, 'char', '50', null, null, null, null, null, null, null, null, null, '2014-03-30 22:44:02', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000009G', null, null, '0001AA10000000000096', '任务名称', 'text', 'taskname', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '10', '40', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-03-30 22:44:02', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000009H', null, null, '0001AA10000000000096', '任务描述', 'textarea', 'taskdescription', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '11', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-03-30 22:44:02', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000009I', '', '', '0001AA10000000000096', '优先级', 'select', 'priority', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', null, '', 'CV;high,高;normal,一般;low,低', '12', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-04-01 20:58:13', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000009J', null, null, '0001AA10000000000096', '周期_数字', 'digits', 'period', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '13', '10', null, null, 'int', '50', null, null, null, null, null, null, null, null, null, '2014-03-30 22:44:02', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000009K', '', '', '0001AA10000000000096', '周期_单位', 'select', 'period_unit', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', null, '', 'CV;SECOND,秒;MINUTE,分;HOUR,时;DAY,天;WEEK,周;MONTH,月;YEAR,年', '14', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-04-01 20:56:33', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000009L', null, null, '0001AA10000000000096', '延迟时间', 'digits', 'delay', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '15', '10', null, null, 'int', '50', null, null, null, null, null, null, null, null, null, '2014-03-30 22:44:02', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000009M', '', '', '0001AA10000000000096', '开始时间', 'datetime', 'startTime', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', null, '', '', '16', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-04-01 21:37:44', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000009N', '', '', '0001AA10000000000096', '结束时间', 'datetime', 'overTime', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', null, '', '', '17', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-04-01 21:37:53', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000A7', '', '', '0001AA10000000000096', '是否可以', 'text', 'runnable', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', null, null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-04-03 20:25:52', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000AB', '', '', '0001AA1000000000003B', '主键字段(返回字段)', 'text', 'pk_field', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '1', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-06-07 10:48:13', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000D4', null, null, '0001AA100000000000D3', '自定义项1', 'text', 'vdef1', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '1', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 20:38:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000D5', null, null, '0001AA100000000000D3', '自定义项2', 'text', 'vdef2', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '2', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 20:38:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000D6', null, null, '0001AA100000000000D3', '自定义项3', 'text', 'vdef3', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '3', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 20:38:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000D7', null, null, '0001AA100000000000D3', '自定义项4', 'text', 'vdef4', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '4', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 20:38:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000D8', null, null, '0001AA100000000000D3', '自定义项5', 'text', 'vdef5', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '5', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 20:38:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000D9', null, null, '0001AA100000000000D3', 'ts', 'text', 'ts', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '6', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 20:38:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000DA', '', '', '0001AA100000000000D3', 'dr', 'text', 'dr', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', null, '', '', '7', '0', '', '', null, '500', null, null, null, null, null, null, null, null, null, '2014-07-06 14:39:35', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000DH', '', '', '0001AA100000000000D3', '备注', 'text', 'remark', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', null, '', '', '14', '30', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-23 23:20:47', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000DZ', null, null, '0001AA100000000000DY', '自定义项1', 'text', 'vdef1', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '1', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 21:43:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000E0', null, null, '0001AA100000000000DY', '自定义项2', 'text', 'vdef2', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '2', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 21:43:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000E1', null, null, '0001AA100000000000DY', '自定义项3', 'text', 'vdef3', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '3', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 21:43:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000E2', null, null, '0001AA100000000000DY', '自定义项4', 'text', 'vdef4', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '4', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 21:43:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000E3', null, null, '0001AA100000000000DY', '自定义项5', 'text', 'vdef5', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '5', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 21:43:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000E4', null, null, '0001AA100000000000DY', 'ts', 'text', 'ts', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '6', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 21:43:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000E5', null, null, '0001AA100000000000DY', 'dr', 'text', 'dr', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '7', '0', null, null, 'int', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 21:43:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000E6', '', '', '0001AA100000000000DY', '主键', 'text', 'pk_registersource', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '0', '', '', '8', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2015-05-05 22:52:22', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000E7', '', '', '0001AA100000000000DY', '备注', 'textarea', 'remark', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '0', '', '', '12', '512', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2015-05-05 22:52:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000E8', null, null, '0001AA100000000000DY', '来源标示', 'digits', 'registersource', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '10', '10', null, null, 'int', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 21:43:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000E9', null, null, '0001AA100000000000DY', '来源名称', 'text', 'sourcename', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '11', '20', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-10 21:43:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000EA', '', '', '0001AA1000000000016U', '用户', 'ref', 'pk_wechat_user', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '0', '', 'wechat_wechat_user_ref', '5', '20', '', '', null, '120', null, null, null, null, null, null, null, null, null, '2015-06-01 07:56:03', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000GL', '', '', '0001AA100000000000D3', '元数据类型编码', 'text', 'type_code', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '15', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-23 23:45:03', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000GM', '', '', '0001AA100000000000D3', '元数据类型名称', 'text', 'type_name', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '16', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-05-23 23:45:12', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000JW', null, null, '0001AA100000000000JV', '自定义项1', 'text', 'vdef1', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '1', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:44', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000JX', null, null, '0001AA100000000000JV', '自定义项2', 'text', 'vdef2', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '2', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:44', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000JY', null, null, '0001AA100000000000JV', '自定义项3', 'text', 'vdef3', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '3', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:44', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000JZ', null, null, '0001AA100000000000JV', '自定义项4', 'text', 'vdef4', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '4', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:44', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000K0', null, null, '0001AA100000000000JV', '自定义项5', 'text', 'vdef5', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '5', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:44', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000K1', null, null, '0001AA100000000000JV', 'ts', 'text', 'ts', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '6', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:44', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000K2', null, null, '0001AA100000000000JV', 'dr', 'text', 'dr', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '7', '0', null, null, 'int', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:44', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000K3', '', '', '0001AA100000000000JV', 'vdef6', 'text', 'vdef6', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '0', '', '', '8', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2015-05-16 22:32:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000K4', '', '', '0001AA100000000000JV', '主键', 'text', 'pk_wechat_menu', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '0', '', '', '9', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2015-05-16 21:49:54', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000K5', '', '', '0001AA100000000000JV', '菜单类型', 'text', 'menutype', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '0', '', '', '10', '30', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2015-05-16 22:01:30', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000K6', '', '', '0001AA100000000000JV', '菜单名称', 'text', 'menuname', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '0', '', '', '11', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2015-05-16 22:11:59', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000K7', '', '', '0001AA100000000000JV', 'keyname', 'text', 'keyname', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '0', '', '', '12', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2015-05-16 22:11:26', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000K8', '', '', '0001AA100000000000JV', 'keyvalue', 'text', 'keyvalue', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '0', '', '', '13', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2015-05-16 22:11:49', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000KT', null, null, '0001AA100000000000KS', '自定义项1', 'text', 'vdef1', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '1', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000KU', null, null, '0001AA100000000000KS', '自定义项2', 'text', 'vdef2', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '2', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000KV', null, null, '0001AA100000000000KS', '自定义项3', 'text', 'vdef3', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '3', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000KW', null, null, '0001AA100000000000KS', '自定义项4', 'text', 'vdef4', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '4', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000KX', null, null, '0001AA100000000000KS', '过滤器', 'text', 'msgfilter', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '5', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000KY', null, null, '0001AA100000000000KS', 'ts', 'text', 'ts', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '6', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000KZ', null, null, '0001AA100000000000KS', 'dr', 'text', 'dr', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '7', '0', null, null, 'int', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000L0', null, null, '0001AA100000000000KS', '微信消息处理主键', 'text', 'pk_wechat_msghandle', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '8', '20', null, null, 'char', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000L1', '', '', '0001AA100000000000KS', '公众号', 'ref', 'pk_wechat_account', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '0', '', 'wechat_wechat_account_ref', '9', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2015-05-24 10:37:51', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000L2', null, null, '0001AA100000000000KS', '消息类型', 'text', 'msgtype', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '10', '20', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000L3', null, null, '0001AA100000000000KS', '处理类', 'textarea', 'handleclass', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '11', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000L4', null, null, '0001AA100000000000KS', '备注', 'textarea', 'remark', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '12', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:27:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000NJ', null, null, '0001AA100000000000NI', '自定义项1', 'text', 'vdef1', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '1', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:35:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000NK', null, null, '0001AA100000000000NI', '自定义项2', 'text', 'vdef2', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '2', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:35:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000NL', null, null, '0001AA100000000000NI', '自定义项3', 'text', 'vdef3', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '3', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:35:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000NM', null, null, '0001AA100000000000NI', '自定义项4', 'text', 'vdef4', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '4', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:35:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000NN', null, null, '0001AA100000000000NI', '过滤器', 'text', 'eventfilter', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '5', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:35:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000NO', null, null, '0001AA100000000000NI', 'ts', 'text', 'ts', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '6', '0', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:35:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000NP', null, null, '0001AA100000000000NI', 'dr', 'text', 'dr', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '7', '0', null, null, 'int', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:35:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000NQ', null, null, '0001AA100000000000NI', '主键', 'text', 'pk_wechat_eventhandle', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '8', '20', null, null, 'char', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:35:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000NR', '', '', '0001AA100000000000NI', '公众号', 'ref', 'pk_wechat_account', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '0', '', 'wechat_wechat_account_ref', '9', '20', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-09-26 21:14:01', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000NS', null, null, '0001AA100000000000NI', '事件类型', 'text', 'eventype', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '10', '30', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:35:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000NT', null, null, '0001AA100000000000NI', '处理类', 'textarea', 'handleclass', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '11', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:35:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000NU', null, null, '0001AA100000000000NI', '备注', 'text', 'remark', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '12', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-24 13:35:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000QS', null, null, '0001AA100000000000QR', '自定义项1', 'text', 'vdef1', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '1', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-30 14:12:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000QT', null, null, '0001AA100000000000QR', '自定义项2', 'text', 'vdef2', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '2', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-30 14:12:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000QU', null, null, '0001AA100000000000QR', '自定义项3', 'text', 'vdef3', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '3', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-30 14:12:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000QV', null, null, '0001AA100000000000QR', '自定义项4', 'text', 'vdef4', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '4', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-30 14:12:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000QW', null, null, '0001AA100000000000QR', '自定义项5', 'text', 'vdef5', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '5', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-30 14:12:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000QX', null, null, '0001AA100000000000QR', 'ts', 'text', 'ts', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '6', '20', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-30 14:12:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000QY', null, null, '0001AA100000000000QR', 'dr', 'text', 'dr', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, null, '7', '0', null, null, 'int', '50', null, null, null, null, null, null, null, null, null, '2014-05-30 14:12:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000QZ', null, null, '0001AA100000000000QR', '任务日志主键', 'text', 'pk_task_tasklog', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, null, '8', '20', null, null, 'char', '50', null, null, null, null, null, null, null, null, null, '2014-05-30 14:12:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000R0', null, null, '0001AA100000000000QR', '任务插件', 'text', 'pk_taskdeploy', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '9', '20', null, null, 'char', '50', null, null, null, null, null, null, null, null, null, '2014-05-30 14:12:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000R1', null, null, '0001AA100000000000QR', '返回字符串', 'textarea', 'returnstr', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '10', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-30 14:12:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000R2', null, null, '0001AA100000000000QR', '是否成功', 'text', 'issuccess', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '11', '1', null, null, 'char', '50', null, null, null, null, null, null, null, null, null, '2014-05-30 14:12:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000R3', null, null, '0001AA100000000000QR', '运行时间', 'datetime', 'runtime', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '12', '20', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-30 14:12:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000R4', null, null, '0001AA100000000000QR', '运行服务器', 'text', 'runserver', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, null, null, '', '13', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-05-30 14:12:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000SR', null, null, '0001AA100000000000QR', 'vdef6', 'text', 'vdef6', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, null, null, '', '14', '255', null, null, 'varchar', '50', null, null, null, null, null, null, null, null, null, '2014-06-03 18:54:18', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000T7', '', '', '0001AA1000000000003B', '参照名称', 'text', 'refname', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '4', null, '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-06-07 10:49:22', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000TY', '', '', '0001AA1000000000003B', '是否启用权限', 'select', 'isaccesscontrol', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', 'CV;Y,是;N,否;', null, null, 'N', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-07-05 22:20:42', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000WV', null, null, '0001AA100000000000WU', '自定义项1', 'text', 'vdef1', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '1', '255', null, null, 'varchar', '0', null, null, null, null, null, null, null, null, null, '2014-08-31 12:04:14', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000WW', null, null, '0001AA100000000000WU', '自定义项2', 'text', 'vdef2', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '2', '255', null, null, 'varchar', '0', null, null, null, null, null, null, null, null, null, '2014-08-31 12:04:14', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000WX', null, null, '0001AA100000000000WU', '自定义项3', 'text', 'vdef3', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '3', '255', null, null, 'varchar', '0', null, null, null, null, null, null, null, null, null, '2014-08-31 12:04:14', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000WY', null, null, '0001AA100000000000WU', '自定义项4', 'text', 'vdef4', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '4', '255', null, null, 'varchar', '0', null, null, null, null, null, null, null, null, null, '2014-08-31 12:04:14', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000WZ', null, null, '0001AA100000000000WU', '自定义项5', 'text', 'vdef5', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '5', '255', null, null, 'varchar', '0', null, null, null, null, null, null, null, null, null, '2014-08-31 12:04:14', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000X0', null, null, '0001AA100000000000WU', 'ts', 'text', 'ts', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '6', '20', null, null, 'varchar', '0', null, null, null, null, null, null, null, null, null, '2014-08-31 12:04:14', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000X1', null, null, '0001AA100000000000WU', 'dr', 'text', 'dr', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '7', '0', null, null, 'int', '0', null, null, null, null, null, null, null, null, null, '2014-08-31 12:04:14', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000X2', null, null, '0001AA100000000000WU', '缓存数据表主键', 'text', 'pk_cachetable', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, null, '8', '20', null, null, 'char', '50', null, null, null, null, null, null, null, null, null, '2014-08-31 12:04:14', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000XC', '', '', '0001AA100000000000WU', '所属模块', 'text', 'pk_module', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '9', '0', '', '', null, '42', null, null, null, null, null, null, null, null, null, '2014-08-31 12:14:35', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000XD', '', '', '0001AA100000000000WU', '数据表名', 'text', 'tablename', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '10', '0', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-08-31 12:15:03', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000XE', '', '', '0001AA100000000000WU', '是否缓存', 'text', 'iscache', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '11', '0', '', '', null, '50', null, null, null, null, null, null, null, null, null, '2014-08-31 12:15:25', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000XV', '', '', '0001AA100000000000XT', '主键', 'text', 'pk_params', '', 'N', 'N', 'Y', 'N', 'N', 'N', 'Y', 'N', '', '0', '', '', '1', '20', '', '', null, '120', null, null, null, null, null, null, null, null, null, '2014-09-07 16:53:54', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000XW', null, null, '0001AA100000000000XT', '参数名称', 'text', 'paramname', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '2', '30', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2014-09-07 16:02:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000XX', null, null, '0001AA100000000000XT', '参数编码', 'text', 'paramcode', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '3', '30', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2014-09-07 16:02:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000XY', null, null, '0001AA100000000000XT', '参数值', 'text', 'paramvalue', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '4', '255', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2014-09-07 16:02:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000XZ', null, null, '0001AA100000000000XT', '备注', 'textarea', 'remark', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '5', '255', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2014-09-07 16:02:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000Y0', null, null, '0001AA100000000000XT', 'vdef1', 'text', 'vdef1', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, '', '6', '255', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2014-09-07 16:02:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA100000000000Y9', '', '', '0001AA100000000000D3', '主键', 'text', 'pk_metadata_type', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '17', '0', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2014-09-13 16:09:22', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000102', '', '', '0001AA10000000000100', '类型主键', 'ref', 'pk_metadata_type', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', 'PUB_METADATA_TYPE', '1', '0', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-01-02 23:39:16', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000103', '', '', '0001AA10000000000100', '主键', 'text', 'pk_metadata', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '2', '0', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-01-02 23:37:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000104', '', '', '0001AA10000000000100', '元数据名称', 'text', 'metadata_name', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '0', '0', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-01-02 23:17:53', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000105', '', '', '0001AA10000000000100', '元数据编码', 'text', 'metadata_code', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '0', '0', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-01-02 23:18:09', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000106', '', '', '0001AA10000000000100', '备注', 'text', 'remark', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '0', '0', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-01-02 23:18:22', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000107', '', '', '0001AA10000000000100', 'ts', 'text', 'ts', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '0', '0', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-01-02 23:21:16', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000108', '', '', '0001AA10000000000100', 'dr', 'text', 'dr', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '0', '0', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-01-02 23:21:36', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000109', '', '', '0001AA10000000000100', 'vdef1', 'text', 'vdef1', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '0', '0', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-01-02 23:23:41', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000010A', '', '', '0001AA10000000000100', 'vdef2', 'text', 'vdef2', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '0', '0', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-01-02 23:23:48', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000010B', '', '', '0001AA10000000000100', 'vdef3', 'text', 'vdef3', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '0', '0', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-01-02 23:23:54', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000010C', '', '', '0001AA10000000000100', 'vdef4', 'text', 'vdef4', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '0', '0', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-01-02 23:24:02', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000010D', '', '', '0001AA10000000000100', 'vdef5', 'text', 'vdef5', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '1', '', '', '0', '0', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-01-02 23:24:09', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000129', null, null, '0001AA10000000000128', '自定义项1', 'text', 'vdef1', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '1', '255', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-03 19:35:04', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000012A', null, null, '0001AA10000000000128', '自定义项2', 'text', 'vdef2', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '2', '255', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-03 19:35:04', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000012B', null, null, '0001AA10000000000128', '自定义项3', 'text', 'vdef3', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '3', '255', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-03 19:35:04', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000012C', null, null, '0001AA10000000000128', '自定义项4', 'text', 'vdef4', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '4', '255', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-03 19:35:04', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000012D', null, null, '0001AA10000000000128', '自定义项5', 'text', 'vdef5', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '5', '255', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-03 19:35:04', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000012E', null, null, '0001AA10000000000128', 'ts', 'text', 'ts', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '6', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-03 19:35:04', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000012F', null, null, '0001AA10000000000128', 'dr', 'text', 'dr', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, '', '7', '11', null, null, 'int', '120', null, null, null, null, null, null, null, null, null, '2015-05-03 19:35:04', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000012G', '', '', '0001AA10000000000128', '微信公众号主键', 'text', 'pk_wechat_account', '', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', '', '0', '', '', '8', '20', '', '', null, '120', null, null, null, null, null, null, null, null, null, '2015-05-05 22:26:53', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000012H', null, null, '0001AA10000000000128', 'appid', 'text', 'appid', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '9', '50', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-03 19:35:04', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000012I', null, null, '0001AA10000000000128', 'appsecret', 'text', 'appsecret', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '10', '100', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-03 19:35:04', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000012J', null, null, '0001AA10000000000128', '微信号', 'text', 'accountcode', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '11', '50', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-03 19:35:04', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000012K', null, null, '0001AA10000000000128', '微信名称', 'text', 'accountname', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '12', '50', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-03 19:35:04', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000012L', null, null, '0001AA10000000000128', '原始id', 'text', 'ghid', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '13', '50', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-03 19:35:04', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000012M', null, null, '0001AA10000000000128', '加密token', 'text', 'encrypttoken', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '14', '100', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-03 19:35:04', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000013O', null, null, '0001AA1000000000013N', '自定义项1', 'text', 'vdef1', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '1', '255', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000013P', null, null, '0001AA1000000000013N', '自定义项2', 'text', 'vdef2', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '2', '255', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000013Q', null, null, '0001AA1000000000013N', '自定义项3', 'text', 'vdef3', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '3', '255', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000013R', null, null, '0001AA1000000000013N', '自定义项4', 'text', 'vdef4', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '4', '255', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000013S', null, null, '0001AA1000000000013N', '自定义项5', 'text', 'vdef5', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '5', '255', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000013T', null, null, '0001AA1000000000013N', 'ts', 'text', 'ts', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '6', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000013U', null, null, '0001AA1000000000013N', 'dr', 'text', 'dr', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, '', '7', '11', null, null, 'int', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000013V', null, null, '0001AA1000000000013N', '微信用户主键', 'text', 'pk_wechat_user', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, null, '8', '20', null, null, 'char', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000013W', null, null, '0001AA1000000000013N', 'openid', 'text', 'openid', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '9', '100', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000013X', null, null, '0001AA1000000000013N', 'unionid', 'text', 'unionid', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '10', '100', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000013Y', null, null, '0001AA1000000000013N', '昵称', 'text', 'nickname', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '11', '100', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000013Z', null, null, '0001AA1000000000013N', '头像', 'text', 'headimgurl', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '12', '500', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000140', null, null, '0001AA1000000000013N', '省', 'text', 'province', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '13', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000141', null, null, '0001AA1000000000013N', '市', 'text', 'city', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '14', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000142', null, null, '0001AA1000000000013N', '区县', 'text', 'country', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '15', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000143', null, null, '0001AA1000000000013N', '性别', 'select', 'sex', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, 'CV;1:男;2:女', '16', '2', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000144', null, null, '0001AA1000000000013N', '订阅时间', 'datetime', 'subscribe_time', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '17', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-11 20:44:38', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000152', '', '', '0001AA100000000000JV', '上级菜单', 'text', 'pk_parent', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '0', '20', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-05-16 22:13:46', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000153', '', '', '0001AA100000000000JV', '排序', 'digits', 'morder', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', '', '0', '11', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-05-16 22:14:41', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000156', '', '', '0001AA1000000000013N', '公众号', 'ref', 'pk_wechat_account', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', 'wechat_wechat_account_ref', '0', '20', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-05-16 22:24:50', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000157', '', '', '0001AA100000000000JV', '公众号', 'ref', 'pk_wechat_account', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', 'wechat_wechat_account_ref', '0', '20', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-05-16 22:24:37', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000015H', null, null, '0001AA1000000000015G', 'ts', 'text', 'ts', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '1', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-16 23:15:10', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000015I', null, null, '0001AA1000000000015G', 'dr', 'text', 'dr', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '2', '11', null, null, 'int', '120', null, null, null, null, null, null, null, null, null, '2015-05-16 23:15:10', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000015J', null, null, '0001AA1000000000015G', '微信token主键', 'text', 'pk_wechat_token', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, null, '3', '20', null, null, 'char', '120', null, null, null, null, null, null, null, null, null, '2015-05-16 23:15:10', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000015K', null, null, '0001AA1000000000015G', 'token类型', 'select', 'tokentype', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, 'CV;1:accesstoken;2:jsticket', '4', '2', null, null, 'int', '120', null, null, null, null, null, null, null, null, null, '2015-05-16 23:15:10', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000015L', null, null, '0001AA1000000000015G', 'token值', 'textarea', 'tokenvalue', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '5', '1024', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-16 23:15:10', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000015M', null, null, '0001AA1000000000015G', '创建时间', 'datetime', 'getdatetime', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '6', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-16 23:15:10', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000015N', null, null, '0001AA1000000000015G', '失效时间', 'datetime', 'expiredatetime', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '7', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-16 23:15:10', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000015P', '', '', '0001AA1000000000015G', '公众号', 'ref', 'pk_wechat_account', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '1', '', 'wechat_wechat_account_ref', '3', '0', '', '', null, '0', null, null, null, null, null, null, null, null, null, '2015-05-16 23:20:57', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000016V', null, null, '0001AA1000000000016U', 'ts', 'text', 'ts', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '1', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-31 22:32:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000016W', null, null, '0001AA1000000000016U', 'dr', 'text', 'dr', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '2', '11', null, null, 'int', '120', null, null, null, null, null, null, null, null, null, '2015-05-31 22:32:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000016X', null, null, '0001AA1000000000016U', '微信用户行为主键', 'text', 'pk_wechat_userbehavior', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, null, '3', '20', null, null, 'char', '120', null, null, null, null, null, null, null, null, null, '2015-05-31 22:32:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000016Y', '', '', '0001AA1000000000016U', '公众号', 'text', 'pk_wechat_account', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '0', '', 'wechat_wechat_account_ref', '4', '20', '', '', null, '120', null, null, null, null, null, null, null, null, null, '2015-06-01 07:47:40', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000016Z', null, null, '0001AA1000000000016U', '消息类型', 'text', 'msgtype', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '5', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-31 22:32:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000170', null, null, '0001AA1000000000016U', '事件类型', 'text', 'eventtype', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '6', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-31 22:32:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000171', null, null, '0001AA1000000000016U', '事件值', 'text', 'eventkey', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '7', '1000', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-31 22:32:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000172', null, null, '0001AA1000000000016U', '创建日期', 'date', 'createdate', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '8', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-31 22:32:19', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000174', null, null, '0001AA10000000000173', 'ts', 'text', 'ts', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '1', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-31 22:33:51', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000175', null, null, '0001AA10000000000173', 'dr', 'text', 'dr', null, 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', null, null, '0', null, null, '2', '11', null, null, 'int', '120', null, null, null, null, null, null, null, null, null, '2015-05-31 22:33:51', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000176', null, null, '0001AA10000000000173', '微信用户地理主键', 'text', 'pk_wechat_userlocation', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, null, '3', '20', null, null, 'char', '120', null, null, null, null, null, null, null, null, null, '2015-05-31 22:33:51', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000177', '', '', '0001AA10000000000173', '公众号', 'ref', 'pk_wechat_account', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '0', '', 'wechat_wechat_account_ref', '4', '20', '', '', null, '120', null, null, null, null, null, null, null, null, null, '2015-06-01 07:47:02', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000178', '', '', '0001AA10000000000173', '用户', 'ref', 'pk_wechat_user', '', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', '', '0', '', 'wechat_wechat_user_ref', '5', '20', '', '', null, '120', null, null, null, null, null, null, null, null, null, '2015-06-01 07:55:50', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA10000000000179', null, null, '0001AA10000000000173', '地理位置纬度', 'number', 'w_latitude', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '6', '20', null, null, 'decimal', '120', null, null, null, null, null, null, null, null, null, '2015-05-31 22:33:51', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000017A', null, null, '0001AA10000000000173', '地理位置经度', 'number', 'w_longitude', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '7', '20', null, null, 'decimal', '120', null, null, null, null, null, null, null, null, null, '2015-05-31 22:33:51', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000017B', null, null, '0001AA10000000000173', '地理位置精度', 'number', 'w_precision', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '8', '20', null, null, 'decimal', '120', null, null, null, null, null, null, null, null, null, '2015-05-31 22:33:51', '0');
INSERT INTO `sm_templet_item` VALUES ('0001AA1000000000017C', null, null, '0001AA10000000000173', '上报日期', 'date', 'reportdate', null, 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', null, null, '0', null, '', '9', '20', null, null, 'varchar', '120', null, null, null, null, null, null, null, null, null, '2015-05-31 22:33:51', '0');

-- ----------------------------
-- Table structure for `sm_templet_tab`
-- ----------------------------
DROP TABLE IF EXISTS `sm_templet_tab`;
CREATE TABLE `sm_templet_tab` (
  `pk_node` char(20) DEFAULT NULL,
  `pk_templet_tab` char(20) NOT NULL DEFAULT '',
  `pk_parent_tab` char(20) DEFAULT NULL,
  `tabcode` varchar(50) DEFAULT NULL,
  `tabname` varchar(50) DEFAULT NULL,
  `tabModel` varchar(50) DEFAULT NULL,
  `taburl` varchar(50) DEFAULT NULL,
  `tabpos` int(11) DEFAULT NULL,
  `tabindex` int(11) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `vdef6` varchar(255) DEFAULT NULL,
  `vdef7` varchar(255) DEFAULT NULL,
  `vdef8` varchar(255) DEFAULT NULL,
  `vdef9` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk_templet_tab`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_templet_tab
-- ----------------------------
INSERT INTO `sm_templet_tab` VALUES ('0001AA1000000000000Y', '0001AA1000000000004W', '', 'datatablefield', '数据表字段', '', '', '0', '0', '', '', '', '', '', '', '', '', '', '2014-3-9 17:04:53', '0');

-- ----------------------------
-- Table structure for `sm_temple_node_role`
-- ----------------------------
DROP TABLE IF EXISTS `sm_temple_node_role`;
CREATE TABLE `sm_temple_node_role` (
  `pk_temple_node_role` char(20) NOT NULL DEFAULT '',
  `pk_user` char(20) DEFAULT NULL,
  `pk_temple` char(20) DEFAULT NULL,
  `pk_node` char(20) DEFAULT NULL,
  `pk_role` char(20) DEFAULT NULL,
  `templeType` varchar(30) DEFAULT NULL,
  `ts` varchar(19) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  PRIMARY KEY (`pk_temple_node_role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_temple_node_role
-- ----------------------------
INSERT INTO `sm_temple_node_role` VALUES ('0001AA1000000000000P', null, '0001AA10000000000007', '0001AA10000000000005', '0001AA1000000000000O', 'role', '2013-09-27 13:45:56', '0');

-- ----------------------------
-- Table structure for `sm_user`
-- ----------------------------
DROP TABLE IF EXISTS `sm_user`;
CREATE TABLE `sm_user` (
  `pk_role` char(20) DEFAULT NULL,
  `pk_user` char(20) NOT NULL DEFAULT '',
  `user_type` varchar(30) DEFAULT NULL,
  `user_code` varchar(30) DEFAULT NULL,
  `user_name` varchar(30) DEFAULT NULL,
  `user_password` varchar(250) DEFAULT NULL,
  `user_phone` varchar(30) DEFAULT NULL,
  `user_mail` varchar(30) DEFAULT NULL,
  `user_note` varchar(255) DEFAULT NULL,
  `birthDate` varchar(20) DEFAULT NULL,
  `disable_date` varchar(20) DEFAULT NULL,
  `able_date` varchar(20) DEFAULT NULL,
  `locked_tag` varchar(1) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(2) DEFAULT NULL,
  PRIMARY KEY (`pk_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_user
-- ----------------------------
INSERT INTO `sm_user` VALUES ('0001AA1000000000001L', '0001AA1000000000001F', null, '15986757937', '百米查询用户（10）', 'cejjpjafmalglpnnldmjedlaiacpoape', '15986757937', 'chsdensdsd1@163.com', '百米查询用户', '2014-02-13', '2014-03-07', '2014-01-15', '1', '2015-01-04 18:03:55', '0');
INSERT INTO `sm_user` VALUES ('0001AA1000000000001I', '0001AA1000000000001H', null, '13810634149', '微信订阅号（13）', 'omgndcnnedffhbfgepcnbcehoadbpoif', '13810634149', '', '市场部自己的渠道', '2014-02-21', '2014-02-28', '2014-02-21', null, '2015-01-04 18:09:58', '0');
INSERT INTO `sm_user` VALUES ('0001AA1000000000001K', '0001AA100000000000BK', null, '15618365655', '微信自媒体查询用户（19）', 'nlaliplgneigcphclhpochcfpailcbjg', '15618365655', 'chsdd11@163.com', '金融王帅微信推广', '2014-02-13', '2014-03-07', '2014-01-15', '1', '2015-01-04 18:04:16', '0');
INSERT INTO `sm_user` VALUES ('0001AA1000000000000O', '0001AA100000000000BL', null, 'cheng', '成应生', 'kgbonamdipbiecfl', '18610493841', 'chengcm2011@163.com', '管理员账户--成应生', '2014-02-13', '2014-03-07', '2014-01-15', '1', '2015-02-08 17:44:25', '0');

-- ----------------------------
-- Table structure for `sm_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `sm_user_role`;
CREATE TABLE `sm_user_role` (
  `pk_user_role` char(20) NOT NULL DEFAULT '',
  `pk_user` char(20) DEFAULT NULL,
  `pk_role` char(20) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  PRIMARY KEY (`pk_user_role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_user_role
-- ----------------------------
INSERT INTO `sm_user_role` VALUES ('0001AA1000000000001G', '0001AA1000000000001F', '0001AA1000000000000O', '2011-11-11 11:22:22', '1');
INSERT INTO `sm_user_role` VALUES ('0001AA10000000000027', '0001AA1000000000001F', '0001AA1000000000001I', '2014-02-23 18:35:09', '1');
INSERT INTO `sm_user_role` VALUES ('0001AA10000000000028', '1001AA1000000000001F', '0001AA1000000000000O', '2014-02-23 18:35:39', '1');
INSERT INTO `sm_user_role` VALUES ('0001AA10000000000029', '0001AA1000000000001H', '0001AA1000000000000O', '2014-02-23 20:15:15', '1');
INSERT INTO `sm_user_role` VALUES ('0001AA1000000000002A', '0001AA1000000000001H', '0001AA1000000000001I', '2014-02-23 20:15:15', '0');
INSERT INTO `sm_user_role` VALUES ('0001AA1000000000002B', '0001AA1000000000001H', '0001AA1000000000001J', '2014-02-23 20:15:15', '1');
INSERT INTO `sm_user_role` VALUES ('0001AA1000000000002C', '0001AA1000000000001H', '0001AA1000000000001K', '2014-02-23 20:15:15', '1');
INSERT INTO `sm_user_role` VALUES ('0001AA1000000000002D', '0001AA1000000000001F', '0001AA1000000000001I', '2014-02-23 20:21:29', '1');
INSERT INTO `sm_user_role` VALUES ('0001AA1000000000002E', '0001AA1000000000001F', '0001AA1000000000001J', '2014-02-23 20:21:29', '1');
INSERT INTO `sm_user_role` VALUES ('0001AA1000000000002F', '0001AA1000000000001F', '0001AA1000000000001J', '2014-02-23 20:21:29', '1');
INSERT INTO `sm_user_role` VALUES ('0001AA1000000000002G', '0001AA1000000000001F', '0001AA1000000000001K', '2014-02-23 20:21:29', '1');
INSERT INTO `sm_user_role` VALUES ('0001AA1000000000002H', '0001AA1000000000001F', '0001AA1000000000001K', '2014-02-23 20:21:29', '1');
INSERT INTO `sm_user_role` VALUES ('0001AA100000000000TS', '0001AA1000000000001F', '0001AA1000000000001L', '2014-07-05 18:42:22', '0');
INSERT INTO `sm_user_role` VALUES ('0001AA100000000000ZQ', '0001AA100000000000BK', '0001AA1000000000001K', '2014-11-20 13:12:35', '0');

-- ----------------------------
-- Table structure for `sys_cachetable`
-- ----------------------------
DROP TABLE IF EXISTS `sys_cachetable`;
CREATE TABLE `sys_cachetable` (
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `pk_cachetable` char(20) NOT NULL,
  `pk_module` char(20) DEFAULT NULL,
  `tablename` varchar(30) DEFAULT NULL,
  `iscache` char(1) DEFAULT NULL,
  PRIMARY KEY (`pk_cachetable`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_cachetable
-- ----------------------------
INSERT INTO `sys_cachetable` VALUES (null, null, null, null, null, '2014-08-31 12:21:53', '0', '0001AA100000000000XF', '0001AA100000000000A9', 'sys_cachetable', 'Y');
INSERT INTO `sys_cachetable` VALUES (null, null, null, null, null, '2014-09-07 14:49:39', '0', '0001AA100000000000XS', '0001AA100000000000A9', 'sys_cachetable', 'Y');

-- ----------------------------
-- Table structure for `sys_datadict`
-- ----------------------------
DROP TABLE IF EXISTS `sys_datadict`;
CREATE TABLE `sys_datadict` (
  `pk_module` char(20) DEFAULT NULL,
  `pk_node` char(20) DEFAULT NULL,
  `pk_datadict` char(20) NOT NULL DEFAULT '',
  `datatablename` varchar(40) DEFAULT NULL,
  `datatablecode` varchar(40) DEFAULT NULL,
  `datatableremark` varchar(255) DEFAULT NULL,
  `isbusi` varchar(2) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  `ts` varchar(19) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  PRIMARY KEY (`pk_datadict`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_datadict
-- ----------------------------
INSERT INTO `sys_datadict` VALUES ('0001AA1000000000005B', '0001AA1000000000005D', '0001AA1000000000004Y', '任务注册', 'taskplugin', '', 'Y', '', '', '', '', '2014-03-27 19:36:03', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA1000000000005B', '0001AA1000000000005E', '0001AA1000000000008K', '任务部署', 'taskdeploy', '', 'N', '', '', '', '', '2014-03-28 21:41:26', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA100000000000A8', '0001AA100000000000AC', '0001AA100000000000AT', '微信工作号', 'weixinaccount', '', 'N', '', '', '', '', '2014-05-08 16:17:58', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA100000000000A8', '0001AA100000000000BZ', '0001AA100000000000C4', '微信accesstoken', 'accesstoken', '', 'N', '', '', '', '', '2014-05-10 15:49:28', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA100000000000A8', '0001AA100000000000AJ', '0001AA100000000000H5', '微信菜单', 'weixin_menu', '', 'N', '', '', '', '', '2014-05-24 10:32:08', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA100000000000A8', '0001AA100000000000GF', '0001AA100000000000HD', '微信菜单信息', 'weixin_menumsg', '', 'N', '', '', '', '', '2014-05-24 10:43:36', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA100000000000A8', '0001AA100000000000GH', '0001AA100000000000HL', '微信消息转发', 'weixin_msghandle', '', 'N', '', '', '', '', '2014-05-24 10:44:25', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA100000000000A8', '0001AA100000000000GG', '0001AA100000000000HT', '微信事件转发', 'weixin_eventhandle', '', 'N', '', '', '', '', '2014-05-24 10:45:01', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA100000000000A8', '0001AA100000000000BX', '0001AA100000000000O9', '微信用户', 'weixin_user', '', 'N', '', '', '', '', '2014-05-25 18:18:50', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA1000000000005B', '0001AA1000000000005F', '0001AA100000000000QA', '任务日志', 'task_tasklog', '', 'N', '', '', '', '', '2014-05-30 12:22:53', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA1000000000003A', '0001AA10000000000010', '0001AA100000000000TZ', '报表模板', 'sm_reporttemplate', '', 'N', '', '', '', '', '2014-07-16 22:32:20', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA100000000000A8', '0001AA100000000000GJ', '0001AA100000000000VD', '微信用户地理位置', 'user_location', '', 'N', '', '', '', '', '2014-08-03 17:40:11', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA100000000000A9', '0001AA100000000000W4', '0001AA100000000000W5', '缓存数据表', 'sys_cachetable', '', 'N', '', '', '', '', '2014-08-31 11:59:00', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA100000000000A9', '0001AA100000000000XG', '0001AA100000000000XH', '参数管理表', 'sys_params', '', 'N', '', '', '', '', '2014-09-07 15:58:34', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA1000000000011N', '0001AA100000000000C2', '0001AA1000000000011O', '微信公众号', 'wechat_account', '', 'N', '', '', '', '', '2015-05-03 19:15:54', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA1000000000011N', '0001AA100000000000GI', '0001AA10000000000132', '微信用户', 'wechat_user', '', 'N', '', '', '', '', '2015-05-11 20:12:22', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA1000000000011N', '0001AA100000000000GF', '0001AA1000000000014N', '微信菜单', 'wechat_menu', '', 'N', '', '', '', '', '2015-05-13 22:49:27', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA1000000000011N', '0001AA100000000000C3', '0001AA10000000000158', '微信token', 'wechat_token', '', 'N', '', '', '', '', '2015-05-16 23:05:09', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA1000000000011N', '0001AA100000000000GH', '0001AA1000000000015R', '微信消息处理', 'wechat_msghandle', '', 'N', '', '', '', '', '2015-05-24 10:12:22', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA1000000000011N', '0001AA100000000000GG', '0001AA10000000000161', '微信事件处理', 'wechat_eventhandle', '', 'N', '', '', '', '', '2015-05-24 11:39:38', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA1000000000011N', '0001AA100000000000GJ', '0001AA1000000000016A', '微信用户地理', 'wechat_userlocation', '', 'N', '', '', '', '', '2015-05-31 21:40:13', '0');
INSERT INTO `sys_datadict` VALUES ('0001AA1000000000011N', '0001AA100000000000GK', '0001AA1000000000016K', '微信用户行为', 'wechat_userbehavior', '', 'N', '', '', '', '', '2015-05-31 22:09:38', '0');

-- ----------------------------
-- Table structure for `sys_datadictitem`
-- ----------------------------
DROP TABLE IF EXISTS `sys_datadictitem`;
CREATE TABLE `sys_datadictitem` (
  `pk_datadict` char(20) DEFAULT NULL,
  `pk_datadictitem` char(20) NOT NULL DEFAULT '',
  `itemname` varchar(30) DEFAULT NULL,
  `itemcode` varchar(30) DEFAULT NULL,
  `datatype` varchar(30) DEFAULT NULL,
  `uitype` varchar(30) DEFAULT NULL,
  `typedata` varchar(255) DEFAULT NULL,
  `length` int(11) DEFAULT NULL,
  `isprimary` varchar(2) DEFAULT NULL,
  `isnull` varchar(2) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `isTablesyn` varchar(2) DEFAULT NULL,
  `itemremark` varchar(255) DEFAULT NULL,
  `isBilltemplatesyn` varchar(2) DEFAULT NULL,
  `isQueryTemplatesyn` varchar(2) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pk_datadictitem`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_datadictitem
-- ----------------------------
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000004Y', '0001AA10000000000058', '主键', 'pk_taskplugin', 'char', 'text', '', '20', 'Y', 'N', '0', null, '', null, null, null, null, null, null, null, '2014-03-19 21:30:31');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000004Y', '0001AA10000000000059', '插件名称', 'pluginname', 'varchar', 'text', '', '50', 'N', 'N', '0', null, '', null, null, null, null, null, null, null, '2014-03-19 21:30:39');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000004Y', '0001AA1000000000005A', '任务插件类', 'pluginclass', 'char', 'textarea', '', '50', 'N', 'N', '0', null, '', null, null, null, null, null, null, null, '2014-03-19 21:30:48');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000004Y', '0001AA1000000000005G', '任务描述', 'plugindescription', 'varchar', 'textarea', '', '255', 'N', 'N', '0', null, '', null, null, null, null, null, null, null, '2014-03-19 21:30:54');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000004Y', '0001AA1000000000005H', '插件类型', 'plugintype', 'varchar', 'select', 'CV;task,后台任务;alert,预警任务', '30', 'N', 'N', '0', null, '', null, null, null, null, null, null, null, '2014-03-19 21:31:59');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000004Y', '0001AA1000000000005I', '所属模块', 'belong_system', 'varchar', 'text', '', '30', 'N', 'N', '0', null, '', null, null, null, null, null, null, null, '2014-03-19 21:32:07');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000004Y', '0001AA1000000000005J', 'dr', 'dr', 'int', 'digits', '', '11', 'N', 'N', '0', null, '', null, null, null, null, null, null, null, '2014-03-19 21:32:19');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000004Y', '0001AA1000000000005K', 'ts', 'ts', 'varchar', 'text', '', '20', 'N', 'N', '0', null, '', null, null, null, null, null, null, null, '2014-03-19 21:32:30');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008L', '自定义项1', 'vdef1', 'varchar', 'text', '', '255', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-30 22:02:10');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008M', '自定义项2', 'vdef2', 'varchar', 'text', '', '255', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-30 22:02:24');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008N', '自定义项3', 'vdef3', 'varchar', 'text', '', '255', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-30 22:01:53');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008O', '自定义项4', 'vdef4', 'varchar', 'text', '', '255', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-30 22:01:41');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008P', '自定义项5', 'vdef5', 'varchar', 'text', '', '255', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-30 22:01:28');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008Q', 'ts', 'ts', 'varchar', 'text', '', '20', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-30 22:00:48');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008R', 'dr', 'dr', 'int', 'digits', '', '11', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-30 22:01:10');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008S', '主键', 'pk_taskdeploy', 'char', 'text', '', '20', 'Y', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-28 23:14:48');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008T', '任务插件主键', 'pk_taskplugin', 'char', 'ref', 'user', '20', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-28 23:17:51');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008U', '任务名称', 'taskname', 'varchar', 'text', '', '40', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-28 23:21:00');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008V', '任务描述', 'taskdescription', 'varchar', 'textarea', '', '255', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-28 23:21:28');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008W', '优先级', 'priority', 'varchar', 'select', '', '20', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-28 23:22:22');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008X', '周期_数字', 'period', 'int', 'digits', '', '10', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-28 23:23:11');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008Y', '周期_单位', 'period_unit', 'varchar', 'select', 'CV;SECOND,秒;MINUTE,分;HOUR,时;DAY,天;WEEK,周;MONTH,月;YEAR,年', '20', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-04-01 20:57:08');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA1000000000008Z', '延迟时间', 'delay', 'int', 'digits', '', '10', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-28 23:33:00');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA10000000000090', '开始时间', 'startTime', 'varchar', 'date', '', '20', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-28 23:33:53');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000008K', '0001AA10000000000091', '结束时间', 'overTime', 'varchar', 'date', '', '20', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-03-28 23:34:21');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000AT', '0001AA100000000000AU', '自定义项1', 'vdef1', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-08 16:17:58');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000AT', '0001AA100000000000AV', '自定义项2', 'vdef2', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-08 16:17:58');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000AT', '0001AA100000000000AW', '自定义项3', 'vdef3', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-08 16:17:58');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000AT', '0001AA100000000000AX', '自定义项4', 'vdef4', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-08 16:17:58');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000AT', '0001AA100000000000AY', '自定义项5', 'vdef5', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-08 16:17:58');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000AT', '0001AA100000000000AZ', 'ts', 'ts', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-08 16:17:58');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000AT', '0001AA100000000000B0', 'dr', 'dr', 'int', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-08 16:17:58');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000AT', '0001AA100000000000B1', '账户主键', 'pk_weixinaccount', 'char', 'text', '', '20', 'Y', 'N', '0', 'Y', '', 'Y', 'Y', '', '', '', '', '', '2014-05-08 16:20:13');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000AT', '0001AA100000000000B2', '账户原始id', 'weixin_ghid', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'Y', '', '', '', '', '', '2014-05-08 16:22:32');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000AT', '0001AA100000000000B3', '公众号名称', 'accountname', 'varchar', 'text', '', '30', 'N', 'Y', '0', 'Y', '', 'Y', 'Y', '', '', '', '', '', '2014-05-08 17:25:06');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000AT', '0001AA100000000000B4', '开发者appid', 'appid', 'varchar', 'text', '', '50', 'N', 'Y', '0', 'N', '', 'Y', 'Y', '', '', '', '', '', '2014-05-08 16:27:50');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000AT', '0001AA100000000000B5', '开发者AppSecret', 'appsecret', 'varchar', 'textarea', '', '255', 'N', 'Y', '0', 'N', '', 'Y', 'Y', '', '', '', '', '', '2014-05-10 22:37:31');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000AT', '0001AA100000000000B6', '注册邮箱', 'email', 'varchar', '', '', '30', 'N', 'Y', '0', 'N', '', 'Y', 'Y', '', '', '', '', '', '2014-05-08 17:25:36');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000AT', '0001AA100000000000B7', '微信号', 'accountcode', 'varchar', 'text', '', '30', 'N', 'Y', '0', 'N', '', 'Y', 'Y', '', '', '', '', '', '2014-05-08 17:26:36');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000C4', '0001AA100000000000C5', '自定义项1', 'vdef1', 'varchar', 'text', '', '255', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-10 21:46:55');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000C4', '0001AA100000000000C6', '自定义项2', 'vdef2', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-10 15:49:28');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000C4', '0001AA100000000000C7', '自定义项3', 'vdef3', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-10 15:49:28');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000C4', '0001AA100000000000C8', '自定义项4', 'vdef4', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-10 15:49:28');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000C4', '0001AA100000000000C9', '自定义项5', 'vdef5', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-10 15:49:28');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000C4', '0001AA100000000000CA', 'ts', 'ts', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-10 15:49:28');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000C4', '0001AA100000000000CB', 'dr', 'dr', 'int', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-10 15:49:28');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000C4', '0001AA100000000000CC', '主键', 'pk_weixinaccesstoken', 'char', 'text', '', '20', 'Y', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-10 21:47:04');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000C4', '0001AA100000000000CD', 'access_token', 'access_token', 'varchar', 'textarea', '', '512', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-10 15:53:19');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000C4', '0001AA100000000000CE', '有效时间', 'expires_in', 'int', 'digits', '', '10', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-10 15:54:19');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000C4', '0001AA100000000000CF', '获取时间', 'get_time', 'varchar', 'datetime', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-10 16:02:14');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000C4', '0001AA100000000000CG', '失效时间', 'expire_time', 'varchar', 'datetime', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-10 16:02:21');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000H6', '自定义项1', 'vdef1', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:32:13');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000H7', '自定义项2', 'vdef2', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:32:13');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000H8', '自定义项3', 'vdef3', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:32:13');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000H9', '自定义项4', 'vdef4', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:32:13');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000HA', '自定义项5', 'vdef5', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:32:13');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000HB', 'ts', 'ts', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:32:13');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000HC', 'dr', 'dr', 'int', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:32:13');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HD', '0001AA100000000000HE', '自定义项1', 'vdef1', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:43:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HD', '0001AA100000000000HF', '自定义项2', 'vdef2', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:43:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HD', '0001AA100000000000HG', '自定义项3', 'vdef3', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:43:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HD', '0001AA100000000000HH', '自定义项4', 'vdef4', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:43:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HD', '0001AA100000000000HI', '自定义项5', 'vdef5', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:43:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HD', '0001AA100000000000HJ', 'ts', 'ts', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:43:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HD', '0001AA100000000000HK', 'dr', 'dr', 'int', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:43:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HL', '0001AA100000000000HM', '自定义项1', 'vdef1', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:44:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HL', '0001AA100000000000HN', '自定义项2', 'vdef2', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:44:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HL', '0001AA100000000000HO', '自定义项3', 'vdef3', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:44:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HL', '0001AA100000000000HP', '自定义项4', 'vdef4', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:44:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HL', '0001AA100000000000HQ', '自定义项5', 'vdef5', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:44:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HL', '0001AA100000000000HR', 'ts', 'ts', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:44:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HL', '0001AA100000000000HS', 'dr', 'dr', 'int', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:44:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HT', '0001AA100000000000HU', '自定义项1', 'vdef1', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:45:01');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HT', '0001AA100000000000HV', '自定义项2', 'vdef2', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:45:01');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HT', '0001AA100000000000HW', '自定义项3', 'vdef3', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:45:01');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HT', '0001AA100000000000HX', '自定义项4', 'vdef4', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:45:01');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HT', '0001AA100000000000HY', '自定义项5', 'vdef5', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:45:01');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HT', '0001AA100000000000HZ', 'ts', 'ts', 'varchar', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:45:01');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HT', '0001AA100000000000I0', 'dr', 'dr', 'int', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-24 10:45:01');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HT', '0001AA100000000000I1', '主键', 'pk_weixin_eventhandle', 'char', 'text', '', '20', 'Y', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 10:52:49');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HT', '0001AA100000000000I2', '公众号', 'weixin_publicid', 'char', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 10:53:30');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HT', '0001AA100000000000I3', '事件类型', 'eventype', 'varchar', 'text', '', '30', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 10:54:05');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HT', '0001AA100000000000I4', '处理类', 'handleclass', 'varchar', 'textarea', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 10:54:40');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HT', '0001AA100000000000I5', '备注', 'remark', 'varchar', 'textarea', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 10:54:59');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HL', '0001AA100000000000I6', '主键', 'pk_weixin_msghandle', 'char', 'text', '', '20', 'Y', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:00:40');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HL', '0001AA100000000000I7', '公众号', 'weixin_publicid', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:01:09');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HL', '0001AA100000000000I8', '消息类型', 'msgtype', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:01:35');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HL', '0001AA100000000000I9', '处理类', 'handleclass', 'varchar', 'textarea', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:01:59');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HL', '0001AA100000000000IA', '备注', 'remark', 'varchar', 'textarea', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:02:22');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000IB', '主键', 'pk_weixin_menu', 'char', 'text', '', '20', 'Y', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:04:42');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000IC', '公众号', 'weixin_publicid', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:08:45');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000ID', '菜单名称', 'btn_name', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:09:09');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000IE', '菜单编码', 'btn_code', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:09:28');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000IF', '菜单类型', 'btn_type', 'varchar', 'select', 'CV;dir,虚拟;click,点击;view,视图', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:13:44');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000IG', '菜单key', 'btn_key', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:14:13');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000IH', '处理类', 'handleclass', 'varchar', 'textarea', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:14:34');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000H5', '0001AA100000000000II', '备注', 'remark', 'varchar', 'textarea', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:14:52');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HD', '0001AA100000000000IJ', '外键', 'pk_weixin_menu', 'char', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:43:04');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HD', '0001AA100000000000IK', '主键', 'pk_weixin_menumsg', 'char', 'text', '', '20', 'Y', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:42:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HD', '0001AA100000000000IL', '标题', 'title', 'varchar', 'text', '', '30', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:43:31');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HD', '0001AA100000000000IM', '描述', 'description', 'varchar', 'textarea', '', '1024', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:44:03');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HD', '0001AA100000000000IN', '图片地址', 'picurl', 'varchar', 'textarea', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:44:29');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000HD', '0001AA100000000000IO', '链接', 'url', 'varchar', 'text', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-24 11:44:50');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OA', '自定义项1', 'vdef1', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-25 18:18:50');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OB', '自定义项2', 'vdef2', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-25 18:18:50');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OC', '自定义项3', 'vdef3', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-25 18:18:50');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OD', '自定义项4', 'vdef4', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-25 18:18:50');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OE', '自定义项5', 'vdef5', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-25 18:18:50');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OF', 'ts', 'ts', 'varchar', 'text', '', '20', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-25 18:19:26');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OG', 'dr', 'dr', 'int', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-25 18:18:50');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OH', '微信用户主键', 'pk_weixin_user', 'char', 'text', '', '20', 'Y', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-25 18:19:15');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OJ', '微信公众号', 'weixin_publicid', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-25 18:23:10');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OK', '用户openid', 'openid', 'varchar', 'text', '', '50', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-25 18:24:01');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OL', '头像', 'headimgurl', 'varchar', 'text', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-25 18:24:59');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OM', '微信昵称', 'nickname', 'varchar', 'text', '', '50', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-25 18:25:22');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000ON', '性别', 'sex', 'varchar', 'select', 'CV;1,男;2,女', '2', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-25 18:26:33');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OO', '省', 'province', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-25 18:26:55');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OP', '市', 'city', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-25 18:27:16');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OQ', '国家', 'country', 'varchar', 'text', '', '30', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-25 18:27:35');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OR', '语言', 'language', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-25 18:27:55');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000O9', '0001AA100000000000OS', '订阅时间', 'subscribe_time', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-25 18:28:33');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000QA', '0001AA100000000000QB', '自定义项1', 'vdef1', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-30 12:22:53');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000QA', '0001AA100000000000QC', '自定义项2', 'vdef2', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-30 12:22:53');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000QA', '0001AA100000000000QD', '自定义项3', 'vdef3', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-30 12:22:53');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000QA', '0001AA100000000000QE', '自定义项4', 'vdef4', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-30 12:22:53');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000QA', '0001AA100000000000QF', '自定义项5', 'vdef5', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-30 12:22:53');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000QA', '0001AA100000000000QG', 'ts', 'ts', 'varchar', 'text', null, '20', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-30 12:22:53');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000QA', '0001AA100000000000QH', 'dr', 'dr', 'int', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-30 12:22:53');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000QA', '0001AA100000000000QI', '任务日志主键', 'pk_task_tasklog', 'char', 'text', null, '20', 'Y', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-05-30 12:22:53');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000QA', '0001AA100000000000QK', '任务插件', 'pk_taskdeploy', 'char', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-30 12:27:06');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000QA', '0001AA100000000000QL', '返回字符串', 'returnstr', 'varchar', 'textarea', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-30 12:27:32');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000QA', '0001AA100000000000QM', '是否成功', 'issuccess', 'char', 'text', '', '1', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-30 12:28:00');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000QA', '0001AA100000000000QN', '运行时间', 'runtime', 'varchar', 'datetime', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-30 12:28:28');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000QA', '0001AA100000000000QO', '运行服务器', 'runserver', 'varchar', 'text', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-05-30 14:10:51');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000QA', '0001AA100000000000SD', 'vdef6', 'vdef6', 'varchar', 'text', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-06-03 18:44:27');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000TZ', '0001AA100000000000U0', '自定义项1', 'vdef1', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-07-16 22:32:20');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000TZ', '0001AA100000000000U1', '自定义项2', 'vdef2', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-07-16 22:32:20');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000TZ', '0001AA100000000000U2', '自定义项3', 'vdef3', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-07-16 22:32:20');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000TZ', '0001AA100000000000U3', '自定义项4', 'vdef4', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-07-16 22:32:20');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000TZ', '0001AA100000000000U4', '自定义项5', 'vdef5', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-07-16 22:32:20');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000TZ', '0001AA100000000000U5', 'ts', 'ts', 'varchar', 'text', null, '20', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-07-16 22:32:20');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000TZ', '0001AA100000000000U6', 'dr', 'dr', 'int', 'text', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-07-16 22:32:20');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000TZ', '0001AA100000000000U7', '报表模板主键', 'pk_sm_reporttemplate', 'char', 'text', null, '20', 'Y', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-07-16 22:32:20');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000VD', '0001AA100000000000VE', '用户昵称', 'nickname', 'varchar', 'text', '', '255', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-08-03 18:06:37');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000VD', '0001AA100000000000VF', '经度', 'longitude', 'varchar', 'text', '', '255', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-08-03 18:15:22');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000VD', '0001AA100000000000VG', '维度', 'latitude', 'varchar', 'text', '', '255', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-08-03 18:11:03');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000VD', '0001AA100000000000VH', '日期', 'reportdate', 'varchar', 'date', '', '255', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-08-03 18:17:35');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000VD', '0001AA100000000000VI', '自定义项1', 'vdef1', 'varchar', 'text', '', '255', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-08-03 18:18:12');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000VD', '0001AA100000000000VJ', 'vdef2', 'vdef2', 'varchar', 'text', '', '20', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-08-03 18:18:29');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000VD', '0001AA100000000000VK', 'vdef3', 'vdef3', 'int', 'text', '', '0', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-08-03 18:18:45');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000VD', '0001AA100000000000VL', '用户openid', 'openid', 'varchar', 'text', '', '30', 'Y', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-08-03 18:06:09');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000W5', '0001AA100000000000W6', '自定义项1', 'vdef1', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-08-31 00:02:42');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000W5', '0001AA100000000000W7', '自定义项2', 'vdef2', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-08-31 00:02:42');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000W5', '0001AA100000000000W8', '自定义项3', 'vdef3', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-08-31 00:02:42');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000W5', '0001AA100000000000W9', '自定义项4', 'vdef4', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-08-31 00:02:42');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000W5', '0001AA100000000000WA', '自定义项5', 'vdef5', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-08-31 00:02:42');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000W5', '0001AA100000000000WB', 'ts', 'ts', 'varchar', 'text', null, '20', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-08-31 00:02:42');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000W5', '0001AA100000000000WC', 'dr', 'dr', 'int', 'digits', null, '0', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-08-31 00:02:42');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000W5', '0001AA100000000000WD', '缓存数据表主键', 'pk_cachetable', 'char', 'text', null, '20', 'Y', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2014-08-31 00:02:42');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000W5', '0001AA100000000000WE', '所属模块', 'pk_module', 'char', 'ref', '', '20', 'N', 'Y', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2014-08-31 11:41:10');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000W5', '0001AA100000000000WF', '数据表名', 'tablename', 'varchar', 'text', '', '30', 'N', 'Y', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2014-08-31 11:42:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000W5', '0001AA100000000000WG', '是否缓存', 'iscache', 'char', 'select', '', '1', 'N', 'Y', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2014-08-31 11:43:27');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000XH', '0001AA100000000000XI', '主键', 'pk_params', 'char', 'text', '', '20', 'Y', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-09-07 14:41:00');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000XH', '0001AA100000000000XJ', '参数名称', 'paramname', 'varchar', 'text', '', '30', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-09-07 14:42:29');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000XH', '0001AA100000000000XK', '参数编码', 'paramcode', 'varchar', 'text', '', '30', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-09-07 14:43:07');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000XH', '0001AA100000000000XL', '参数值', 'paramvalue', 'varchar', 'text', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-09-07 14:43:57');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000XH', '0001AA100000000000XM', '备注', 'remark', 'varchar', 'textarea', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-09-07 14:44:32');
INSERT INTO `sys_datadictitem` VALUES ('0001AA100000000000XH', '0001AA100000000000XN', 'vdef1', 'vdef1', 'varchar', 'text', '', '255', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2014-09-07 14:46:46');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000011O', '0001AA1000000000011P', '自定义项1', 'vdef1', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2015-05-03 19:17:24');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000011O', '0001AA1000000000011Q', '自定义项2', 'vdef2', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2015-05-03 19:17:24');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000011O', '0001AA1000000000011R', '自定义项3', 'vdef3', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2015-05-03 19:17:24');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000011O', '0001AA1000000000011S', '自定义项4', 'vdef4', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2015-05-03 19:17:24');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000011O', '0001AA1000000000011T', '自定义项5', 'vdef5', 'varchar', 'text', null, '255', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2015-05-03 19:17:24');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000011O', '0001AA1000000000011U', 'ts', 'ts', 'varchar', 'text', null, '20', 'N', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2015-05-03 19:17:24');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000011O', '0001AA1000000000011V', 'dr', 'dr', 'int', 'text', '', '11', 'N', 'N', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2015-05-03 19:27:39');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000011O', '0001AA1000000000011W', '微信公众号主键', 'pk_wechat_account', 'char', 'text', null, '20', 'Y', 'N', '0', 'N', null, 'N', 'N', null, null, null, null, null, '2015-05-03 19:17:24');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000011O', '0001AA1000000000011X', 'appid', 'appid', 'varchar', 'text', '', '50', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2015-05-03 19:28:24');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000011O', '0001AA1000000000011Y', 'appsecret', 'appsecret', 'varchar', 'text', '', '100', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2015-05-03 19:28:15');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000011O', '0001AA1000000000011Z', '微信号', 'accountcode', 'varchar', 'text', '', '50', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2015-05-03 19:29:10');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000011O', '0001AA10000000000120', '微信名称', 'accountname', 'varchar', 'text', '', '50', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2015-05-03 19:29:32');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000011O', '0001AA10000000000121', '原始id', 'ghid', 'varchar', 'text', '', '50', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2015-05-03 19:30:05');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000011O', '0001AA10000000000122', '加密token', 'encrypttoken', 'varchar', 'text', '', '100', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2015-05-03 19:31:31');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA10000000000133', '自定义项1', 'vdef1', 'varchar', 'text', null, '255', 'N', 'N', '0', 'Y', null, 'Y', 'Y', null, null, null, null, null, '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA10000000000134', '自定义项2', 'vdef2', 'varchar', 'text', null, '255', 'N', 'N', '0', 'Y', null, 'Y', 'Y', null, null, null, null, null, '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA10000000000135', '自定义项3', 'vdef3', 'varchar', 'text', null, '255', 'N', 'N', '0', 'Y', null, 'Y', 'Y', null, null, null, null, null, '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA10000000000136', '自定义项4', 'vdef4', 'varchar', 'text', null, '255', 'N', 'N', '0', 'Y', null, 'Y', 'Y', null, null, null, null, null, '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA10000000000137', '自定义项5', 'vdef5', 'varchar', 'text', null, '255', 'N', 'N', '0', 'Y', null, 'Y', 'Y', null, null, null, null, null, '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA10000000000138', 'ts', 'ts', 'varchar', 'text', null, '20', 'N', 'N', '0', 'Y', null, 'Y', 'Y', null, null, null, null, null, '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA10000000000139', 'dr', 'dr', 'int', 'text', '', '11', 'N', 'N', '0', 'Y', '', 'Y', 'Y', '', '', '', '', '', '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA1000000000013A', '微信用户主键', 'pk_wechat_user', 'char', 'text', null, '20', 'Y', 'N', '0', 'Y', null, 'Y', 'Y', null, null, null, null, null, '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA1000000000013B', 'openid', 'openid', 'varchar', 'text', '', '100', 'N', 'Y', '0', 'Y', '', 'Y', 'Y', '', '', '', '', '', '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA1000000000013C', 'unionid', 'unionid', 'varchar', 'text', '', '100', 'N', 'Y', '0', 'Y', '', 'Y', 'Y', '', '', '', '', '', '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA1000000000013D', '昵称', 'nickname', 'varchar', 'text', '', '100', 'N', 'Y', '0', 'Y', '', 'Y', 'Y', '', '', '', '', '', '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA1000000000013E', '头像', 'headimgurl', 'varchar', 'text', '', '500', 'N', 'Y', '0', 'Y', '', 'Y', 'Y', '', '', '', '', '', '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA1000000000013F', '省', 'province', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'Y', '', '', '', '', '', '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA1000000000013G', '市', 'city', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'Y', '', '', '', '', '', '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA1000000000013H', '区县', 'country', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'Y', '', '', '', '', '', '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA1000000000013I', '性别', 'sex', 'varchar', 'select', 'CV;1:男;2:女', '2', 'N', 'Y', '0', 'Y', '', 'Y', 'Y', '', '', '', '', '', '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA1000000000013J', '订阅时间', 'subscribe_time', 'varchar', 'datetime', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'Y', '', '', '', '', '', '2015-05-11 20:44:38');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA1000000000014O', '自定义项1', 'vdef1', 'varchar', 'text', null, '255', 'N', 'N', '0', 'Y', null, 'N', 'N', null, null, null, null, null, '2015-05-13 23:11:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA1000000000014P', '自定义项2', 'vdef2', 'varchar', 'text', null, '255', 'N', 'N', '0', 'Y', null, 'N', 'N', null, null, null, null, null, '2015-05-13 23:11:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA1000000000014Q', '自定义项3', 'vdef3', 'varchar', 'text', null, '255', 'N', 'N', '0', 'Y', null, 'N', 'N', null, null, null, null, null, '2015-05-13 23:11:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA1000000000014R', '自定义项4', 'vdef4', 'varchar', 'text', null, '255', 'N', 'N', '0', 'Y', null, 'N', 'N', null, null, null, null, null, '2015-05-13 23:11:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA1000000000014S', '自定义项5', 'vdef5', 'varchar', 'text', null, '255', 'N', 'N', '0', 'Y', null, 'N', 'N', null, null, null, null, null, '2015-05-13 23:11:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA1000000000014T', 'ts', 'ts', 'varchar', 'text', null, '20', 'N', 'N', '0', 'Y', null, 'N', 'N', null, null, null, null, null, '2015-05-13 23:11:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA1000000000014U', 'dr', 'dr', 'int', 'digits', '', '11', 'N', 'N', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2015-05-16 21:35:51');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA1000000000014V', '微信菜单主键', 'pk_wechat_menu', 'char', 'text', null, '20', 'Y', 'N', '0', 'Y', null, 'N', 'N', null, null, null, null, null, '2015-05-13 23:11:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA1000000000014W', '菜单类型', 'menutype', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2015-05-16 21:56:15');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA1000000000014X', '菜单名称', 'menuname', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2015-05-16 21:56:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA1000000000014Y', 'keyname', 'keyname', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2015-05-13 23:11:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA1000000000014Z', 'keyvalue', 'keyvalue', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2015-05-13 23:11:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA10000000000150', '上级菜单', 'pk_parent', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2015-05-13 23:11:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA10000000000151', '排序', 'morder', 'int', 'digits', '', '11', 'N', 'Y', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2015-05-16 21:36:00');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000014N', '0001AA10000000000154', '公众号主键', 'pk_wechat_account', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2015-05-16 22:20:06');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000132', '0001AA10000000000155', '公众号主键', 'pk_wechat_account', 'char', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2015-05-16 22:21:01');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000158', '0001AA10000000000159', 'ts', 'ts', 'varchar', 'text', null, '20', 'N', 'N', '0', 'Y', null, 'Y', 'N', null, null, null, null, null, '2015-05-16 23:15:10');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000158', '0001AA1000000000015A', 'dr', 'dr', 'int', 'text', null, '11', 'N', 'N', '0', 'Y', null, 'Y', 'N', null, null, null, null, null, '2015-05-16 23:15:10');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000158', '0001AA1000000000015B', '微信token主键', 'pk_wechat_token', 'char', 'text', null, '20', 'Y', 'N', '0', 'Y', null, 'Y', 'N', null, null, null, null, null, '2015-05-16 23:15:10');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000158', '0001AA1000000000015C', 'token类型', 'tokentype', 'int', 'select', 'CV;1:accesstoken;2:jsticket', '2', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-16 23:15:10');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000158', '0001AA1000000000015D', 'token值', 'tokenvalue', 'varchar', 'textarea', '', '1024', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-16 23:15:10');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000158', '0001AA1000000000015E', '创建时间', 'getdatetime', 'varchar', 'datetime', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-16 23:15:10');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000158', '0001AA1000000000015F', '失效时间', 'expiredatetime', 'varchar', 'datetime', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-16 23:15:10');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000158', '0001AA1000000000015O', '公众号', 'pk_wechat_account', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'N', '', 'N', 'N', '', '', '', '', '', '2015-05-16 23:19:30');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000015R', '0001AA1000000000015S', 'ts', 'ts', 'varchar', 'text', null, '20', 'N', 'N', '0', 'Y', null, 'Y', 'N', null, null, null, null, null, '2015-05-24 10:23:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000015R', '0001AA1000000000015T', 'dr', 'dr', 'int', 'text', null, '11', 'N', 'N', '0', 'Y', null, 'Y', 'N', null, null, null, null, null, '2015-05-24 10:23:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000015R', '0001AA1000000000015U', '微信消息处理主键', 'pk_wechat_msghandle', 'char', 'text', null, '20', 'Y', 'N', '0', 'Y', null, 'Y', 'N', null, null, null, null, null, '2015-05-24 10:23:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000015R', '0001AA1000000000015V', '消息类型', 'msgtype', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-24 10:23:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000015R', '0001AA1000000000015W', '处理类', 'handleclass', 'varchar', 'textarea', '', '150', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-24 10:23:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000015R', '0001AA1000000000015X', '过滤器', 'msgfilter', 'varchar', 'textarea', '', '500', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-24 10:23:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000015R', '0001AA1000000000015Y', 'vdef1', 'vdef1', 'varchar', 'text', '', '255', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-24 10:23:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000015R', '0001AA1000000000015Z', '公众号', 'pk_wechat_account', 'char', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-24 10:23:25');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000161', '0001AA10000000000162', 'ts', 'ts', 'varchar', 'text', null, '20', 'N', 'N', '0', 'Y', null, 'N', 'N', null, null, null, null, null, '2015-05-24 11:46:55');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000161', '0001AA10000000000163', 'dr', 'dr', 'int', 'digits', '', '11', 'N', 'N', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2015-05-24 11:46:55');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000161', '0001AA10000000000164', '微信事件处理主键', 'pk_wechat_eventhandle', 'char', 'text', null, '20', 'Y', 'N', '0', 'Y', null, 'N', 'N', null, null, null, null, null, '2015-05-24 11:46:55');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000161', '0001AA10000000000165', '公众号', 'pk_wechat_account', 'char', 'ref', 'wechat_wechat_account_ref', '20', 'N', 'Y', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2015-05-24 11:46:55');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000161', '0001AA10000000000166', '事件类型', 'eventype', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2015-05-24 11:46:55');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000161', '0001AA10000000000167', '处理类', 'handleclass', 'varchar', 'text', '', '100', 'N', 'Y', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2015-05-24 11:46:55');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000161', '0001AA10000000000168', '过滤器', 'eventfilter', 'varchar', 'text', '', '255', 'N', 'Y', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2015-05-24 11:46:55');
INSERT INTO `sys_datadictitem` VALUES ('0001AA10000000000161', '0001AA10000000000169', '备注', 'remark', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'N', 'N', '', '', '', '', '', '2015-05-24 11:46:55');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016A', '0001AA1000000000016B', 'ts', 'ts', 'varchar', 'text', null, '20', 'N', 'N', '0', 'Y', null, 'Y', 'N', null, null, null, null, null, '2015-05-31 22:33:51');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016A', '0001AA1000000000016C', 'dr', 'dr', 'int', 'text', null, '11', 'N', 'N', '0', 'Y', null, 'Y', 'N', null, null, null, null, null, '2015-05-31 22:33:51');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016A', '0001AA1000000000016D', '微信用户地理主键', 'pk_wechat_userlocation', 'char', 'text', null, '20', 'Y', 'N', '0', 'Y', null, 'Y', 'N', null, null, null, null, null, '2015-05-31 22:33:51');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016A', '0001AA1000000000016E', '公众号', 'pk_wechat_account', 'char', 'ref', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-31 22:33:51');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016A', '0001AA1000000000016F', '用户', 'pk_wechat_user', 'char', 'ref', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-31 22:33:51');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016A', '0001AA1000000000016G', '地理位置纬度', 'w_latitude', 'decimal', 'number', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-31 22:33:51');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016A', '0001AA1000000000016H', '地理位置经度', 'w_longitude', 'decimal', 'number', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-31 22:33:51');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016A', '0001AA1000000000016I', '地理位置精度', 'w_precision', 'decimal', 'number', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-31 22:33:51');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016A', '0001AA1000000000016J', '上报日期', 'reportdate', 'varchar', 'date', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-31 22:33:51');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016K', '0001AA1000000000016L', 'ts', 'ts', 'varchar', 'text', null, '20', 'N', 'N', '0', 'Y', null, 'Y', 'N', null, null, null, null, null, '2015-05-31 22:32:19');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016K', '0001AA1000000000016M', 'dr', 'dr', 'int', 'text', null, '11', 'N', 'N', '0', 'Y', null, 'Y', 'N', null, null, null, null, null, '2015-05-31 22:32:19');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016K', '0001AA1000000000016N', '微信用户行为主键', 'pk_wechat_userbehavior', 'char', 'text', null, '20', 'Y', 'N', '0', 'Y', null, 'Y', 'N', null, null, null, null, null, '2015-05-31 22:32:19');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016K', '0001AA1000000000016O', '公众号', 'pk_wechat_account', 'char', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-31 22:32:19');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016K', '0001AA1000000000016P', '消息类型', 'msgtype', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-31 22:32:19');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016K', '0001AA1000000000016Q', '事件类型', 'eventtype', 'varchar', 'text', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-31 22:32:19');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016K', '0001AA1000000000016R', '事件值', 'eventkey', 'varchar', 'text', '', '1000', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-31 22:32:19');
INSERT INTO `sys_datadictitem` VALUES ('0001AA1000000000016K', '0001AA1000000000016S', '创建日期', 'createdate', 'varchar', 'date', '', '20', 'N', 'Y', '0', 'Y', '', 'Y', 'N', '', '', '', '', '', '2015-05-31 22:32:19');

-- ----------------------------
-- Table structure for `sys_module`
-- ----------------------------
DROP TABLE IF EXISTS `sys_module`;
CREATE TABLE `sys_module` (
  `pk_module` char(20) NOT NULL DEFAULT '',
  `module_code` varchar(30) DEFAULT NULL,
  `module_name` varchar(30) DEFAULT NULL,
  `module_remark` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(10) DEFAULT NULL,
  PRIMARY KEY (`pk_module`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_module
-- ----------------------------
INSERT INTO `sys_module` VALUES ('0001AA1000000000001M', 'access', '权限模块', '权限模块1', '2014-03-03 23:51:34', '0');
INSERT INTO `sys_module` VALUES ('0001AA1000000000003A', 'template', '模板模块', '', '2014-07-11 18:53:40', '0');
INSERT INTO `sys_module` VALUES ('0001AA1000000000005B', 'task', '任务中心', '', '2014-03-16 14:48:15', '0');
INSERT INTO `sys_module` VALUES ('0001AA100000000000A8', 'channel', '渠道平台', '', '2014-11-19 21:53:31', '0');
INSERT INTO `sys_module` VALUES ('0001AA100000000000A9', 'sys', '系统管理', '', '2014-08-31 11:58:25', '0');
INSERT INTO `sys_module` VALUES ('0001AA1000000000010E', 'base', '基础数据管理', '', '2015-01-02 23:26:24', '0');
INSERT INTO `sys_module` VALUES ('0001AA1000000000011N', 'wechat', '微信模块', '', '2015-05-03 18:51:19', '0');

-- ----------------------------
-- Table structure for `sys_params`
-- ----------------------------
DROP TABLE IF EXISTS `sys_params`;
CREATE TABLE `sys_params` (
  `pk_params` char(20) NOT NULL,
  `pk_module` char(20) DEFAULT NULL,
  `paramname` varchar(30) DEFAULT NULL,
  `paramcode` varchar(30) DEFAULT NULL,
  `paramvalue` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pk_params`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_params
-- ----------------------------
INSERT INTO `sys_params` VALUES ('0001AA100000000000Y7', '0001AA100000000000A9', '模型保存位置', 'localtion', 'XXXX', '', '0', null, '');

-- ----------------------------
-- Table structure for `task_taskdeploy`
-- ----------------------------
DROP TABLE IF EXISTS `task_taskdeploy`;
CREATE TABLE `task_taskdeploy` (
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `pk_taskdeploy` char(20) NOT NULL,
  `pk_taskplugin` char(20) DEFAULT NULL,
  `taskname` varchar(40) DEFAULT NULL,
  `taskdescription` varchar(255) DEFAULT NULL,
  `priority` varchar(20) DEFAULT NULL,
  `period` int(10) DEFAULT NULL,
  `period_unit` varchar(20) DEFAULT NULL,
  `delay` int(10) DEFAULT NULL,
  `runnable` char(1) DEFAULT NULL,
  `startTime` varchar(20) DEFAULT NULL,
  `overTime` varchar(20) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pk_taskdeploy`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task_taskdeploy
-- ----------------------------
INSERT INTO `task_taskdeploy` VALUES ('2014-05-31 02:14:10', '0', '0001AA100000000000A6', '0001AA10000000000089', '测试任务', '', 'normal', '20', 'SECOND', '0', 'N', '2014-05-28 00:00:00', '2014-06-02 00:00:00', '', '', '', '', '');

-- ----------------------------
-- Table structure for `task_tasklog`
-- ----------------------------
DROP TABLE IF EXISTS `task_tasklog`;
CREATE TABLE `task_tasklog` (
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `pk_task_tasklog` char(20) NOT NULL,
  `pk_taskdeploy` char(20) DEFAULT NULL,
  `returnstr` varchar(255) DEFAULT NULL,
  `issuccess` char(1) DEFAULT NULL,
  `runtime` varchar(20) DEFAULT NULL,
  `runserver` varchar(255) DEFAULT NULL,
  `vdef6` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pk_task_tasklog`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task_tasklog
-- ----------------------------
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 14:20:41', '0', '0001AA100000000000RJ', '测试任务', '任务正在执行', 'Y', '2014-05-30 14:20:41', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 14:21:01', '0', '0001AA100000000000RK', '测试任务', '任务正在执行', 'Y', '2014-05-30 14:21:01', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:19:47', '0', '0001AA100000000000RL', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:19:47', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:20:07', '0', '0001AA100000000000RM', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:20:07', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:20:27', '0', '0001AA100000000000RN', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:20:27', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:20:47', '0', '0001AA100000000000RO', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:20:47', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:21:07', '0', '0001AA100000000000RP', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:21:07', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:21:27', '0', '0001AA100000000000RQ', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:21:27', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:21:47', '0', '0001AA100000000000RR', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:21:47', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:22:07', '0', '0001AA100000000000RS', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:22:07', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:22:27', '0', '0001AA100000000000RT', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:22:27', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:22:47', '0', '0001AA100000000000RU', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:22:47', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:23:07', '0', '0001AA100000000000RV', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:23:07', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:23:27', '0', '0001AA100000000000RW', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:23:27', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:23:47', '0', '0001AA100000000000RX', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:23:47', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:24:07', '0', '0001AA100000000000RY', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:24:07', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-30 19:24:27', '0', '0001AA100000000000RZ', '测试任务', '任务正在执行', 'Y', '2014-05-30 19:24:27', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-31 02:13:03', '0', '0001AA100000000000S0', '0001AA100000000000A6', '任务正在执行', 'Y', '1970-01-01 07:59:59', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-31 02:13:23', '0', '0001AA100000000000S1', '0001AA100000000000A6', '任务正在执行', 'Y', '1970-01-01 07:59:59', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-31 02:13:43', '0', '0001AA100000000000S2', '0001AA100000000000A6', '任务正在执行', 'Y', '1970-01-01 07:59:59', null, null);
INSERT INTO `task_tasklog` VALUES (null, null, null, null, null, '2014-05-31 02:14:03', '0', '0001AA100000000000S3', '0001AA100000000000A6', '任务正在执行', 'Y', '1970-01-01 07:59:59', null, null);

-- ----------------------------
-- Table structure for `task_taskplugin`
-- ----------------------------
DROP TABLE IF EXISTS `task_taskplugin`;
CREATE TABLE `task_taskplugin` (
  `pk_taskplugin` char(20) NOT NULL,
  `pluginname` varchar(50) DEFAULT NULL,
  `pluginclass` char(50) DEFAULT NULL,
  `plugindescription` varchar(255) DEFAULT NULL,
  `plugintype` varchar(30) DEFAULT NULL,
  `belong_system` varchar(30) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pk_taskplugin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task_taskplugin
-- ----------------------------
INSERT INTO `task_taskplugin` VALUES ('0001AA10000000000089', '清理数据服务', 'cheng.pipp.business.task.CleanUpDBTask', '数据库数据清理任务', 'task', 'uap', '0', '2014-03-28 20:46:26');

-- ----------------------------
-- Table structure for `wechat_account`
-- ----------------------------
DROP TABLE IF EXISTS `wechat_account`;
CREATE TABLE `wechat_account` (
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `pk_wechat_account` char(20) NOT NULL,
  `appid` varchar(50) DEFAULT NULL,
  `appsecret` varchar(100) DEFAULT NULL,
  `accountcode` varchar(50) DEFAULT NULL,
  `accountname` varchar(50) DEFAULT NULL,
  `ghid` varchar(50) DEFAULT NULL,
  `encrypttoken` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`pk_wechat_account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wechat_account
-- ----------------------------
INSERT INTO `wechat_account` VALUES ('', '', '', '', '', '2015-05-05 23:02:06', '0', '0001AA100000000000EQ', 'wxbab6b9fdded30500', 'ccd974956b9a7bffb353cf0227b42188', '', '尔雅凤凰文化传媒', 'gh_f72a18752610', 'fHM3fd');

-- ----------------------------
-- Table structure for `wechat_eventhandle`
-- ----------------------------
DROP TABLE IF EXISTS `wechat_eventhandle`;
CREATE TABLE `wechat_eventhandle` (
  `pk_wechat_account` char(20) DEFAULT NULL,
  `pk_wechat_eventhandle` char(20) NOT NULL,
  `eventype` varchar(20) DEFAULT NULL,
  `handleclass` varchar(100) DEFAULT NULL,
  `eventfilter` varchar(255) DEFAULT NULL,
  `remark` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT '0',
  `ts` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pk_wechat_eventhandle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wechat_eventhandle
-- ----------------------------
INSERT INTO `wechat_eventhandle` VALUES ('0001AA100000000000EQ', '0001AA100000000000DB', 'CLICK', null, null, null, '0', null);
INSERT INTO `wechat_eventhandle` VALUES ('0001AA100000000000EQ', '0001AA100000000000DC', 'subscribe', null, null, null, '0', null);
INSERT INTO `wechat_eventhandle` VALUES ('0001AA100000000000EQ', '0001AA100000000000DD', 'unsubscribe', null, null, null, '0', null);
INSERT INTO `wechat_eventhandle` VALUES ('0001AA100000000000EQ', '0001AA100000000000DE', 'SCAN', null, null, null, '0', null);
INSERT INTO `wechat_eventhandle` VALUES ('0001AA100000000000EQ', '0001AA100000000000DF', 'LOCATION', null, null, null, '0', null);
INSERT INTO `wechat_eventhandle` VALUES ('0001AA100000000000EQ', '0001AA100000000000DG', 'VIEW', null, null, null, '0', null);

-- ----------------------------
-- Table structure for `wechat_menu`
-- ----------------------------
DROP TABLE IF EXISTS `wechat_menu`;
CREATE TABLE `wechat_menu` (
  `pk_wechat_account` char(20) DEFAULT NULL,
  `pk_wechat_menu` char(20) NOT NULL,
  `pk_parent` varchar(20) DEFAULT NULL,
  `menuname` varchar(20) DEFAULT NULL,
  `menutype` varchar(20) DEFAULT NULL,
  `keyvalue` varchar(20) DEFAULT NULL,
  `keyname` varchar(20) DEFAULT NULL,
  `morder` int(11) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pk_wechat_menu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wechat_menu
-- ----------------------------
INSERT INTO `wechat_menu` VALUES ('0001AA100000000000EQ', '0001AA100000000000S5', null, null, null, null, null, null, null, '0', null, null, null, null, null);
INSERT INTO `wechat_menu` VALUES ('0001AA100000000000EQ', '0001AA100000000000S6', null, null, null, null, null, null, null, '0', null, null, null, null, null);
INSERT INTO `wechat_menu` VALUES ('0001AA100000000000EQ', '0001AA100000000000S7', null, null, null, null, null, null, null, '0', null, null, null, null, null);
INSERT INTO `wechat_menu` VALUES ('0001AA100000000000EQ', '0001AA100000000000S8', null, null, null, null, null, null, null, '0', null, null, null, null, null);
INSERT INTO `wechat_menu` VALUES ('0001AA100000000000EQ', '0001AA100000000000S9', null, null, null, null, null, null, null, '0', null, null, null, null, null);
INSERT INTO `wechat_menu` VALUES ('0001AA100000000000EQ', '0001AA100000000000SA', null, null, null, null, null, null, null, '0', null, null, null, null, null);
INSERT INTO `wechat_menu` VALUES ('0001AA100000000000EQ', '0001AA100000000000SC', null, null, null, null, null, null, null, '0', null, null, null, null, null);

-- ----------------------------
-- Table structure for `wechat_msghandle`
-- ----------------------------
DROP TABLE IF EXISTS `wechat_msghandle`;
CREATE TABLE `wechat_msghandle` (
  `pk_wechat_account` char(20) DEFAULT NULL,
  `pk_wechat_msghandle` char(20) NOT NULL,
  `msgtype` varchar(20) DEFAULT NULL,
  `handleclass` varchar(150) DEFAULT NULL,
  `msgfilter` varchar(500) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT '0',
  PRIMARY KEY (`pk_wechat_msghandle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wechat_msghandle
-- ----------------------------
INSERT INTO `wechat_msghandle` VALUES ('0001AA100000000000EQ', '0001AA100000000000YL', 'location', null, null, null, null, '0');
INSERT INTO `wechat_msghandle` VALUES ('0001AA100000000000EQ', '0001AA100000000000YM', 'video', null, null, null, null, '0');
INSERT INTO `wechat_msghandle` VALUES ('0001AA100000000000EQ', '0001AA100000000000YN', 'voice', null, null, null, null, '0');
INSERT INTO `wechat_msghandle` VALUES ('0001AA100000000000EQ', '0001AA100000000000YO', 'event', null, null, null, null, '0');
INSERT INTO `wechat_msghandle` VALUES ('0001AA100000000000EQ', '0001AA100000000000YP', 'image', null, null, null, null, '0');
INSERT INTO `wechat_msghandle` VALUES ('0001AA100000000000EQ', '0001AA100000000000YQ', 'text', null, null, null, null, '0');

-- ----------------------------
-- Table structure for `wechat_token`
-- ----------------------------
DROP TABLE IF EXISTS `wechat_token`;
CREATE TABLE `wechat_token` (
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `pk_wechat_token` char(20) NOT NULL,
  `pk_wechat_account` char(20) DEFAULT NULL,
  `tokentype` int(2) DEFAULT NULL,
  `tokenvalue` varchar(1024) DEFAULT NULL,
  `getdatetime` varchar(20) DEFAULT NULL,
  `expiredatetime` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pk_wechat_token`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wechat_token
-- ----------------------------

-- ----------------------------
-- Table structure for `wechat_user`
-- ----------------------------
DROP TABLE IF EXISTS `wechat_user`;
CREATE TABLE `wechat_user` (
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `pk_wechat_user` char(20) NOT NULL,
  `pk_wechat_account` char(20) DEFAULT NULL,
  `openid` varchar(100) DEFAULT NULL,
  `unionid` varchar(100) DEFAULT NULL,
  `nickname` varchar(100) DEFAULT NULL,
  `headimgurl` varchar(500) DEFAULT NULL,
  `province` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `country` varchar(20) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `subscribe_time` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pk_wechat_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wechat_user
-- ----------------------------

-- ----------------------------
-- Table structure for `wechat_userbehavior`
-- ----------------------------
DROP TABLE IF EXISTS `wechat_userbehavior`;
CREATE TABLE `wechat_userbehavior` (
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT '0',
  `pk_wechat_userbehavior` char(20) NOT NULL,
  `pk_wechat_account` char(20) DEFAULT NULL,
  `msgtype` varchar(20) DEFAULT NULL,
  `eventtype` varchar(20) DEFAULT NULL,
  `eventkey` varchar(1000) DEFAULT NULL,
  `createdate` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pk_wechat_userbehavior`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wechat_userbehavior
-- ----------------------------

-- ----------------------------
-- Table structure for `wechat_userlocation`
-- ----------------------------
DROP TABLE IF EXISTS `wechat_userlocation`;
CREATE TABLE `wechat_userlocation` (
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT '0',
  `pk_wechat_userlocation` char(20) NOT NULL,
  `pk_wechat_account` char(20) DEFAULT NULL,
  `pk_wechat_user` char(20) DEFAULT NULL,
  `w_latitude` decimal(20,0) DEFAULT NULL,
  `w_longitude` decimal(20,0) DEFAULT NULL,
  `w_precision` decimal(20,0) DEFAULT NULL,
  `reportdate` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pk_wechat_userlocation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wechat_userlocation
-- ----------------------------

-- ----------------------------
-- Table structure for `weixin_menu`
-- ----------------------------
DROP TABLE IF EXISTS `weixin_menu`;
CREATE TABLE `weixin_menu` (
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `pk_weixin_menu` char(20) NOT NULL,
  `pk_weixin_account` varchar(20) DEFAULT NULL,
  `btn_name` varchar(20) DEFAULT NULL,
  `btn_code` varchar(20) DEFAULT NULL,
  `btn_type` varchar(20) DEFAULT NULL,
  `btn_key` varchar(255) DEFAULT NULL,
  `handleclass` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pk_weixin_menu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of weixin_menu
-- ----------------------------
INSERT INTO `weixin_menu` VALUES ('', '', '', '', '', '2014-05-31 02:41:10', '0', '0001AA100000000000S5', '0001AA100000000000Y7', '我', 'account', 'dir', 'account', '', '');
INSERT INTO `weixin_menu` VALUES ('', '', '', '', '', '2014-05-31 02:42:04', '0', '0001AA100000000000S6', '0001AA100000000000Y7', '我的账户', 'home', 'click', 'home', '', '');
INSERT INTO `weixin_menu` VALUES ('', '', '', '', '', '2014-05-31 02:56:25', '0', '0001AA100000000000S7', '0001AA100000000000Y7', '我的记录', 'Report', 'click', 'Report', '', '');
INSERT INTO `weixin_menu` VALUES ('', '', '', '', '', '2014-05-31 02:57:10', '0', '0001AA100000000000S8', '0001AA100000000000Y7', '充值', 'recharge', 'click', 'recharge', '', '');
INSERT INTO `weixin_menu` VALUES ('', '', '', '', '', '2014-05-31 02:57:33', '0', '0001AA100000000000S9', '0001AA100000000000Y7', '投资', '投资', 'click', '', '', '');
INSERT INTO `weixin_menu` VALUES ('', '', '', '', '', '2014-05-31 02:58:09', '0', '0001AA100000000000SA', '0001AA100000000000Y7', '更多》', 'service', 'dir', 'service', '', '');
INSERT INTO `weixin_menu` VALUES ('', '', '', '', '', '2014-05-31 02:59:15', '0', '0001AA100000000000SC', '0001AA100000000000Y7', '用户中心', 'user', 'view', 'http://wsq.qq.com/reflow/186426204', '', '');

-- ----------------------------
-- Table structure for `weixin_menumsg`
-- ----------------------------
DROP TABLE IF EXISTS `weixin_menumsg`;
CREATE TABLE `weixin_menumsg` (
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `pk_weixin_menu` char(20) DEFAULT NULL,
  `pk_weixin_menumsg` char(20) NOT NULL,
  `title` varchar(30) DEFAULT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `picurl` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pk_weixin_menumsg`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of weixin_menumsg
-- ----------------------------

-- ----------------------------
-- Table structure for `weixin_msghandle`
-- ----------------------------
DROP TABLE IF EXISTS `weixin_msghandle`;
CREATE TABLE `weixin_msghandle` (
  `pk_weixin_msghandle` char(20) NOT NULL,
  `pk_weixin_account` varchar(20) DEFAULT NULL,
  `msgtype` varchar(20) DEFAULT NULL,
  `handleclass` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pk_weixin_msghandle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of weixin_msghandle
-- ----------------------------
INSERT INTO `weixin_msghandle` VALUES ('0001AA100000000000YL', '0001AA100000000000Y7', 'text', 'cheng.pipp.weixin.framework.impl.DefaultTextHandleImpl', '', '2014-10-07 13:36:18', '0', null, null, null, null, null);
INSERT INTO `weixin_msghandle` VALUES ('0001AA100000000000YM', '0001AA100000000000Y7', 'image', 'cheng.pipp.weixin.framework.impl.DefaultImagesHandleImpl', '', '2014-10-07 15:47:41', '0', null, null, null, null, null);
INSERT INTO `weixin_msghandle` VALUES ('0001AA100000000000YN', '0001AA100000000000Y7', 'event', 'cheng.pipp.weixin.framework.AbstractEventHandleImpl', '', '2014-10-07 15:48:02', '0', null, null, null, null, null);
INSERT INTO `weixin_msghandle` VALUES ('0001AA100000000000YO', '0001AA100000000000Y7', 'voice', 'cheng.pipp.weixin.framework.impl.DefaultVoiceHandleImpl', '', '2014-10-07 15:48:16', '0', null, null, null, null, null);
INSERT INTO `weixin_msghandle` VALUES ('0001AA100000000000YP', '0001AA100000000000Y7', 'video', '', '', '2014-10-07 15:48:29', '0', null, null, null, null, null);
INSERT INTO `weixin_msghandle` VALUES ('0001AA100000000000YQ', '0001AA100000000000Y7', 'location', 'cheng.pipp.weixin.framework.impl.DefaultLocationHandleImp', '', '2014-10-07 15:48:41', '0', null, null, null, null, null);

-- ----------------------------
-- Table structure for `weixin_user`
-- ----------------------------
DROP TABLE IF EXISTS `weixin_user`;
CREATE TABLE `weixin_user` (
  `pk_weixin_user` char(20) NOT NULL,
  `pk_weixin_account` varchar(20) DEFAULT NULL,
  `openid` varchar(50) DEFAULT NULL,
  `headimgurl` varchar(255) DEFAULT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `province` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `country` varchar(30) DEFAULT NULL,
  `language` varchar(20) DEFAULT NULL,
  `subscribe_time` varchar(20) DEFAULT NULL,
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `ts` varchar(20) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk_weixin_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of weixin_user
-- ----------------------------
INSERT INTO `weixin_user` VALUES ('0001AA100000000000YZ', '0001AA100000000000Y7', 'o6diJuBqVS3sbRF3Li9SX09OvydI', '', '朱思美', '2', '北京', '昌平', '中国', 'zh_CN', '2014-04-16 14:48:04', null, null, null, null, null, '2014-10-09 21:31:25', '0');

-- ----------------------------
-- Table structure for `weixin_weixinaccount`
-- ----------------------------
DROP TABLE IF EXISTS `weixin_weixinaccount`;
CREATE TABLE `weixin_weixinaccount` (
  `vdef1` varchar(255) DEFAULT NULL,
  `vdef2` varchar(255) DEFAULT NULL,
  `vdef3` varchar(255) DEFAULT NULL,
  `vdef4` varchar(255) DEFAULT NULL,
  `vdef5` varchar(255) DEFAULT NULL,
  `ts` varchar(255) DEFAULT NULL,
  `dr` int(11) DEFAULT NULL,
  `pk_weixinaccount` char(20) NOT NULL,
  `weixin_ghid` varchar(20) DEFAULT NULL,
  `accountname` varchar(30) DEFAULT NULL,
  `appid` varchar(50) DEFAULT NULL,
  `appsecret` varchar(255) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `accountcode` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`pk_weixinaccount`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of weixin_weixinaccount
-- ----------------------------
INSERT INTO `weixin_weixinaccount` VALUES ('', '', '', '', '', '2014-05-10 22:39:02', '0', '0001AA100000000000EQ', 'gh_914d9f7ab694', '北京汇投技术', 'wx7961296102ce920b', '4bef8cea3de1ab1976c5d4b4be3309a5', 'blackjack7972@sina.com', '');
