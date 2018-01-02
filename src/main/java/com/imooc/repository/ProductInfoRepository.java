package com.imooc.repository;

import com.imooc.pojo.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 10:54$ 2017/12/28$
 * @Modified By:
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);

}
