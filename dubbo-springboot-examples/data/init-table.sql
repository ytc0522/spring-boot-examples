CREATE TABLE `t_order`
(

    `id`             int(11) NOT NULL AUTO_INCREMENT,

    `order_no`       varchar(255)  DEFAULT NULL,

    `user_id`        varchar(255)  DEFAULT NULL,

    `commodity_code` varchar(255)  DEFAULT NULL,

    `count`          int(11)       DEFAULT '0',

    `amount`         double(14, 2) DEFAULT '0.00',

    PRIMARY KEY (`id`)

) ENGINE = InnoDB
  AUTO_INCREMENT = 38
  DEFAULT CHARSET = utf8;



CREATE TABLE `t_storage`
(

    `id`             int(11) NOT NULL AUTO_INCREMENT,

    `commodity_code` varchar(255) DEFAULT NULL,

    `name`           varchar(255) DEFAULT NULL,

    `count`          int(11)      DEFAULT '0',

    PRIMARY KEY (`id`),

    UNIQUE KEY `commodity_code` (`commodity_code`)

) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8;

# 另外还需要一个回滚日志表：

CREATE TABLE `undo_log`
(

    `id`            bigint(20)   NOT NULL AUTO_INCREMENT,

    `branch_id`     bigint(20)   NOT NULL,

    `xid`           varchar(100) NOT NULL,

    `rollback_info` longblob     NOT NULL,

    `log_status`    int(11)      NOT NULL,

    `log_created`   datetime     NOT NULL,

    `log_modified`  datetime     NOT NULL,

    `ext`           varchar(100) DEFAULT NULL,

    `context`       varchar(100) DEFAULT NULL,

    PRIMARY KEY (`id`),

    UNIQUE KEY `ux_undo_log` (`xid`, `branch_id`)

) ENGINE = InnoDB
  AUTO_INCREMENT = 67
  DEFAULT CHARSET = utf8;