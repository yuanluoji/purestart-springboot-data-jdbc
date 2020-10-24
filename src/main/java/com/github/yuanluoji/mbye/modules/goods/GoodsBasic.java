package com.github.yuanluoji.mbye.modules.goods;

import com.github.yuanluoji.mbye.support.AbstractEntity;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

/**
 * Copyright (c) 2020. All Rights Reserved.
 *
 * @author yuanluoji
 * @Description TODO
 * @date 2020/10/16
 */
@Data
@Table("goods_basic")
public class GoodsBasic extends AbstractEntity {
    private String code;
    private String barcode;
    private String shortName;
    private String photos;
    private String properties;
    private String unit;
    private Integer state;
}
