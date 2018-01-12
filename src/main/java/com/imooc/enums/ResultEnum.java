package com.imooc.enums;

import lombok.Getter;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 16:34$ 2018/1/12$
 * @Modified By:
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_STOCK_ERROR(11,"商品库存不正确")
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
