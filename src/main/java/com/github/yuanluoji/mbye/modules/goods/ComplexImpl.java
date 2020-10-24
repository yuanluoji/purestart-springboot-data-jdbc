package com.github.yuanluoji.mbye.modules.goods;

import com.github.yuanluoji.mbye.support.BaseRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright (c) 2020. All Rights Reserved.
 *
 * @author yuanluoji
 * @Description TODO
 * @date 2020/10/19
 */
public class ComplexImpl<T> extends BaseRepository implements Complex<T> {
    @Override
    public List<T> test(String code) {
        StringBuilder sb = new StringBuilder("select * from goods_basic");
        Map params = new HashMap();
        if (!StringUtils.isEmpty(code)) {
            sb.append(" where code=:code");
            params.put("code", code);
        }
        List x = getTemplate().query(sb.toString(), params, new BeanPropertyRowMapper<>(GoodsBasic.class));
        return x;
    }
}

