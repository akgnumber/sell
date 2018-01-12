package com.imooc.dto;

import lombok.Data;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 17:25$ 2018/1/12$
 * @Modified By:
 */
@Data
public class CartDTO {
    /*  商品id*/
    private String productId;
    /*  商品数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
