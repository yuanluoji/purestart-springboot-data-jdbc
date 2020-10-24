package com.github.yuanluoji.mbye.support;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.util.Date;

/**
 * Copyright (c) 2020. All Rights Reserved.
 *
 * @author yuanluoji
 * @Description TODO
 * @date 2020/10/18 21:31
 */
@Data
public abstract class AbstractEntity {
    @Id
    private Long id;
    private Date created;
    private Date modified;
    @Version
    private Long version;
}
