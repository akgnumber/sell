package com.imooc.enums;

import com.imooc.util.EnumUtil;
import lombok.Getter;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 11:00$ 2018/1/12$
 * @Modified By:
 */
@Getter
public enum  OrderStatusEnum implements CodeEnum{

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消");

    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
