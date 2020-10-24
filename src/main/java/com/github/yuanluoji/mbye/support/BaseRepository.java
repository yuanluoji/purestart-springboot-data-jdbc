package com.github.yuanluoji.mbye.support;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.core.JdbcAggregateOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * Copyright (c) 2020. All Rights Reserved.
 *
 * @author yuanluoji
 * @Description TODO
 * @date 2020/10/19
 */
public abstract class BaseRepository {
    /**
     * 高度封装的JDBC操作，可直接保存实体
     */
    @Getter
    @Autowired
    private JdbcAggregateOperations operations;
    /**
     * 普通命名的JDBC查询和操作，可使用 {@link org.springframework.jdbc.core.BeanPropertyRowMapper}
     * 完成高级自动装配，可自动完成驼峰和下划线的自动映射
     */
    @Getter
    @Autowired
    private NamedParameterJdbcTemplate template;
}
