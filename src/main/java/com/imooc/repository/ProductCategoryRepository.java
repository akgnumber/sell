package com.imooc.repository;

import com.imooc.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 13:47$ 2017/12/27$
 * @Modified By:
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {


    ProductCategory findByCategoryName(String categoryName);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes);

}
