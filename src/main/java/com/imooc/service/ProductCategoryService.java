package com.imooc.service;

import com.imooc.pojo.ProductCategory;

import java.util.List;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 9:28$ 2017/12/28$
 * @Modified By:
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer productCategoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> list);

    ProductCategory save(ProductCategory productCategory);
}
