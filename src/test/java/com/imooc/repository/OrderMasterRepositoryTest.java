package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Pageable;
import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 13:02$ 2018/1/12$
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("251265");
        orderMaster.setBuyerName("大师兄");
        orderMaster.setBuyerPhone("18657156922");
        orderMaster.setBuyerAddress("召唤师峡谷");
        orderMaster.setBuyerOpenid("45224");
        orderMaster.setOrderAmount(new BigDecimal(8.6));
        OrderMaster orderMaster1 = orderMasterRepository.save(orderMaster);
        Assert.assertNotNull(orderMaster1);

    }

    @Test
    public void testFindByBuyerOpenid() throws Exception {
        PageRequest request = new PageRequest(1,10);

        Page<OrderMaster> result = orderMasterRepository.findByBuyerOpenid("110110",request);
        System.out.println(result.getTotalElements());
    }

}