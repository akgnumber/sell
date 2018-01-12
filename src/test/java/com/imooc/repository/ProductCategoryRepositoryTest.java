package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 13:48$ 2017/12/27$
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private  ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.getCategoryName());
    }

    @Test
    public void saveTest() {
//        ProductCategory productCategory = repository.findByCategoryName("丢雷楼母");
//        System.out.println(productCategory.getCategoryId());
        ProductCategory productCategory = repository.findOne(1);
//        System.out.println(productCategory.getCategoryName());
        productCategory.setCategoryName("类丢楼母");
        repository.save(productCategory);
    }

    @Test
    public void testFindByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> productCategories = repository.findByCategoryTypeIn(list);
        System.out.println(productCategories.size());
    }
}