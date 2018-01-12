package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 16:33$ 2018/1/12$
 * @Modified By:
 */
public class SellException extends RuntimeException {

    private  Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());

        this.code = resultEnum.getCode();
    }
}