package com.imooc.pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 10:59$ 2017/12/28$
 * @Modified By:
 */
@Entity
@Data
@DynamicUpdate
public class OrderDetail {
    @Id
    private String detailId;

    private String orderId;

    private String productId;
    /*  商品名称*/
    private String productName;
    /*  商品价格*/
    private BigDecimal productPrice;
    /*  商品数量*/
    private Integer productQuantity;
    /*  商品小图*/
    private String productIcon;

}
