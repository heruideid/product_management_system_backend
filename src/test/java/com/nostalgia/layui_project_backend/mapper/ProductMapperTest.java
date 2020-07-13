package com.nostalgia.layui_project_backend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ProductMapperTest {
    @Autowired
    ProductMapper productMapper;

    @Test
    void test(){
        System.out.println(productMapper.findAllProductVO(0,10));
    }

}