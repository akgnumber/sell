package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 16:34$ 2018/1/26$
 * @Modified By:
 */
public interface PushMessage {

    /**
     *
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
