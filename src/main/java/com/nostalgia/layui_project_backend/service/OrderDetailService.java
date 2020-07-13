package com.nostalgia.layui_project_backend.service;

import com.nostalgia.layui_project_backend.entity.OrderDetail;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nostalgia.layui_project_backend.vo.BarVO;
import com.nostalgia.layui_project_backend.vo.ProductBarVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author nostalgia
 * @since 2020-07-11
 */
public interface OrderDetailService extends IService<OrderDetail> {
    public BarVO getBarChart();
    public List<ProductBarVO> getPieChart();
}
