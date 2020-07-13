package com.nostalgia.layui_project_backend.service.impl;

import com.nostalgia.layui_project_backend.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceImplTest {
    @Autowired
    ProductService productService;

    @Test
    public void test(){
        productService.list().forEach(System.out::println);
    }
}