package com.github.yuanluoji.mbye.config;

import com.github.yuanluoji.mbye.support.AbstractEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.relational.core.mapping.event.BeforeSaveCallback;

import java.util.Date;

/**
 * Copyright (c) 2020. All Rights Reserved.
 *
 * @author yuanluoji
 * @Description TODO
 * @date 2020/10/19
 */
@Configuration
public class DataJdbcConfiguration extends AbstractJdbcConfiguration {
    @Bean
    public BeforeSaveCallback<AbstractEntity> absEntityBeforeSet() {
        return (entity, aggregateChange) -> {
            entity.setModified(new Date());
            return entity;
        };
    }
}
