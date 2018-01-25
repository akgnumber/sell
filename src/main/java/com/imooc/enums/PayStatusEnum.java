package com.imooc.enums;

import lombok.Getter;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 11:25$ 2018/1/12$
 * @Modified By:
 */
@Getter
public enum  PayStatusEnum implements CodeEnum {

    WAIT(0,"未支付"),
    SUCCESS(1,"支付成功");

    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
