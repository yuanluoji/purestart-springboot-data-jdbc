package com.github.yuanluoji.mbye.modules.goods;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GoodsBasicRepositoryTest {

    @Autowired
    GoodsBasicRepository repository;

    @Test
    @Transactional
    void testSave() {
        GoodsBasic basic = new GoodsBasic();
        basic.setBarcode("006");
        basic.setCode("000");
        basic.setState(0);
        basic.setCreated(new Date());
        basic.setModified(new Date());
        basic.setShortName("yuanluoji");
        basic.setProperties("{\"a\":\"b\"}");
        basic.setUnit("Y");
//        basic = repository.save(basic);
        basic = repository.insert(basic);


        repository.delete(basic);

    }
}