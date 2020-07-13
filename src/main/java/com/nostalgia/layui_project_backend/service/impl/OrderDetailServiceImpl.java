package com.nostalgia.layui_project_backend.service.impl;

import com.nostalgia.layui_project_backend.entity.OrderDetail;
import com.nostalgia.layui_project_backend.mapper.OrderDetailMapper;
import com.nostalgia.layui_project_backend.service.OrderDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nostalgia.layui_project_backend.vo.ProductBarVO;
import com.nostalgia.layui_project_backend.vo.BarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

    @Autowired
    OrderDetailMapper orderDetailMapper;

    @Override
    public BarVO getBarChart() {
        List<ProductBarVO> list=orderDetailMapper.getSalesCondition();
        BarVO barVO =new BarVO();
        for (ProductBarVO productBarVO : list) {
            barVO.getName().add(productBarVO.getName());
            barVO.getCount().add(productBarVO.getCount());
        }
        return barVO;
    }

    @Override
    public List<ProductBarVO> getPieChart() {
        return orderDetailMapper.getSalesCondition();
    }
}
