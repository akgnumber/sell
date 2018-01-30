package com.imooc.dataobject.mapper;

import com.imooc.dataobject.ProductCategory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import java.util.Map;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 10:25$ 2018/1/29$
 * @Modified By:
 */
public interface ProductCategoryMapper {

    @Insert("insert into product_category (category_name, category_type) values (#{category_name,jdbcType=VARCHAR}," +
            "#{category_type,jdbcType=INTEGER})")
    int insertByMap(Map<String, Object> map);

    @Insert("insert into product_category (category_name, category_type) values (#{categoryName,jdbcType=VARCHAR}," +
            "#{categoryType,jdbcType=INTEGER})")
    @Results(
            {@Result(column = "category_type", property = "categoryType"),
             @Result(column = "category_id", property = "categoryId"),
             @Result(column = "category_name", property = "categoryName")}
            )
    int insertByObject(ProductCategory productCategory);
}
