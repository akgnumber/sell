package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 14:38$ 2018/1/12$
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail =  new OrderDetail();
        orderDetail.setDetailId("123456798ss");
        orderDetail.setOrderId("111111");
        orderDetail.setProductIcon("http://XX.jpg");
        orderDetail.setProductId("111112ssc");
        orderDetail.setProductName("嘿嘿嘿");
        orderDetail.setProductPrice(new BigDecimal(30.86));
        orderDetail.setProductQuantity(2);

        OrderDetail orderDetail1 = orderDetailRepository.save(orderDetail);
        Assert.assertNotNull(orderDetail);
    }

    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> orderDetailList = orderDetailRepository.findByOrderId("111111");
        Assert.assertNotNull(orderDetailList);
    }

}