package com.github.yuanluoji.mbye.modules.goods;


import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Copyright (c) 2020. All Rights Reserved.
 *
 * @author yuanluoji
 * @Description TODO
 * @date 2020/10/16
 */
public interface GoodsBasicRepository extends PagingAndSortingRepository<GoodsBasic, Integer>,
        Complex<GoodsBasic> {

    List<GoodsBasic> findByCode(String code);

    @Query("select * from goods_basic where code=:code")
    List<GoodsBasic> findByCode2(String code);
}
