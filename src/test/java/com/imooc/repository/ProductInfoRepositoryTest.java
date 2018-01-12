package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 11:36$ 2017/12/28$
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void save(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("滴滴");
        productInfo.setProductPrice(new BigDecimal(2.56));
        productInfo.setProductDescription("舒服");
        productInfo.setProductIcon("http://www.baidu.com");
        productInfo.setCategoryType(3);
        ProductInfo didi = productInfoRepository.save(productInfo);
//        Assert.assertNotEquals(null,productInfo1);
    }
    @Test
    public void findByProductStatus() {
        productInfoRepository.findByProductStatus(1);
    }
}