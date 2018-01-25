package com.imooc.service.impl;

import com.imooc.dto.OrderDTO;
import com.imooc.enums.PayStatusEnum;
import com.imooc.service.OrderService;
import com.imooc.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 9:43$ 2018/1/18$
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PayServiceImplTest {

    @Autowired
    private PayService payService;

    @Autowired
    private OrderService orderService;

    private static final String ORDER_ID = "1516088779343180794";

    @Test
    public void create() throws Exception {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        payService.create(orderDTO);
    }


}