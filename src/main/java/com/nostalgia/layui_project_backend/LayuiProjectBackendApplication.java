package com.nostalgia.layui_project_backend;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nostalgia.layui_project_backend.mapper")
public class LayuiProjectBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LayuiProjectBackendApplication.class, args);
    }

}
