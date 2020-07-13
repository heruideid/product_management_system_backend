package com.nostalgia.layui_project_backend.controller;


import com.nostalgia.layui_project_backend.service.OrderDetailService;
import com.nostalgia.layui_project_backend.vo.BarVO;
import com.nostalgia.layui_project_backend.vo.ProductBarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author nostalgia
 * @since 2020-07-11
 */
@Controller
@RequestMapping("/orderDetail")
public class OrderDetailController {
    @Autowired
    OrderDetailService orderDetailService;

    @GetMapping("/getBarChart")
    @ResponseBody
    public BarVO getBarChart(){
        return orderDetailService.getBarChart();
    }

    @GetMapping("/getPieChart")
    @ResponseBody
    public List<ProductBarVO> getPieChart(){
        return orderDetailService.getPieChart();
    }
}

