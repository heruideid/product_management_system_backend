package com.nostalgia.layui_project_backend.service.impl;

import com.nostalgia.layui_project_backend.entity.Product;
import com.nostalgia.layui_project_backend.mapper.ProductMapper;
import com.nostalgia.layui_project_backend.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nostalgia.layui_project_backend.vo.ProductVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author nostalgia
 * @since 2020-07-11
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductVO> findAllProductVO(Integer page,Integer limit) {
        return productMapper.findAllProductVO((page-1)*limit,limit);
    }
}
