package com.imooc.form;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 15:21$ 2018/1/25$
 * @Modified By:
 */
@Data
public class ProductForm {

    private String productId;
    /*  名字*/
    private String productName;
    /*  商品名称*/
    private BigDecimal productPrice;
    /*  库存*/
    private Integer productStock;
    /*  描述*/
    private String productDescription;
    /*  小图*/
    private String productIcon;
    /*  类目编号*/
    private Integer categoryType;

}
