package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 13:34$ 2018/1/17$
 * @Modified By:
 */
public interface BuyerService {

    //查询订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
