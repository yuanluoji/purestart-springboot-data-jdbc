CREATE TABLE `goods_basic` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(255) NOT NULL DEFAULT '' COMMENT '编码，不可重复；',
  `barcode` varchar(255) NOT NULL COMMENT '69开头的13位标准码',
  `short_name` varchar(255)  NOT NULL COMMENT '商品名称',
  `photos` json DEFAULT NULL COMMENT '商品图片',
  `properties` json NOT NULL COMMENT '商品属性，或者规格',
  `unit` varchar(8)  NOT NULL COMMENT '单位;最多8个字节',
  `state` tinyint NOT NULL DEFAULT '1',
  `created` datetime NOT NULL COMMENT '创建时间',
  `modified` datetime NOT NULL COMMENT '更新时间',
  `version` bigint NOT NULL DEFAULT '0' COMMENT '乐观锁版本号',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_account_role` (`code`,`barcode`) USING BTREE
) ;