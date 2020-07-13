package com.nostalgia.layui_project_backend.mapper;

import com.nostalgia.layui_project_backend.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nostalgia.layui_project_backend.vo.ProductVO;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
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
public interface ProductMapper extends BaseMapper<Product> {
    @Select({"select p.*,pc.name categorylevelone,pc2.name categoryleveltwo,pc3.name categorylevelthree from product p,product_category pc,product_category pc2,product_category pc3\n" +
            "\twhere p.categorylevelone_id=pc.id and p.categoryleveltwo_id=pc2.id and p.categorylevelthree_id=pc3.id limit #{page},#{limit};"})
    public List<ProductVO> findAllProductVO(Integer page,Integer limit);

}
