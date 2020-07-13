package com.nostalgia.layui_project_backend.mapper;

import com.nostalgia.layui_project_backend.entity.OrderDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nostalgia.layui_project_backend.vo.ProductBarVO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author nostalgia
 * @since 2020-07-11
 */
@Repository
public interface OrderDetailMapper extends BaseMapper<OrderDetail> {
    @Select("select p.name,sum(o.quantity) count from product p,order_detail o where p.id=o.product_id group by o.product_id order by count desc; ")
    public List<ProductBarVO> getSalesCondition();

}
