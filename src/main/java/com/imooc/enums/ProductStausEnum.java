package com.imooc.enums;

import lombok.Getter;

/**
 * @Author: Huang
 * @Description: 商品状态
 * @Date: Create in 16:14$ 2017/12/29$
 * @Modified By:
 */
@Getter
public enum ProductStausEnum {

    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;

    private String message;

    ProductStausEnum(Integer code) {
        this.code = code;
    }

    ProductStausEnum(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
