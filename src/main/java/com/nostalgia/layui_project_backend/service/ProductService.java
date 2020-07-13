package com.nostalgia.layui_project_backend.service;

import com.nostalgia.layui_project_backend.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nostalgia.layui_project_backend.vo.ProductVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author nostalgia
 * @since 2020-07-11
 */
public interface ProductService extends IService<Product> {
    public List<ProductVO> findAllProductVO(Integer page,Integer limit);
}
