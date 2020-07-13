package com.nostalgia.layui_project_backend.controller;


import com.nostalgia.layui_project_backend.vo.ProductVO;
import com.nostalgia.layui_project_backend.vo.ResultVO;
import com.nostalgia.layui_project_backend.entity.Product;
import com.nostalgia.layui_project_backend.enums.ResultEnum;
import com.nostalgia.layui_project_backend.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author nostalgia
 * @since 2020-07-11
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/index")
    public ResultVO index(Integer page,Integer limit){
        try {
            List<ProductVO> list=productService.findAllProductVO(page,limit);
            Integer count=productService.count();
            return new ResultVO(ResultEnum.SUCCESS,count,list);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultVO(ResultEnum.FAIL,0,new ArrayList());
        }
    }
}

