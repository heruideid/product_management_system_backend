package com.nostalgia.layui_project_backend.vo;

import lombok.Data;

@Data
public class ProductVO {
    Integer id;
    String name;
    String description;
    Float price;
    Integer stock;
    String categorylevelone;
    String categoryleveltwo;
    String categorylevelthree;
    String fileName;

}
