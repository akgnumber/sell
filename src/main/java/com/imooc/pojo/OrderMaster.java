package com.imooc.pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 11:06$ 2017/12/28$
 * @Modified By:
 */
@Data
@Entity
@DynamicUpdate
public class OrderMaster {
    @Id
    private String orderId;
    /*  买家名称*/
    private String buyerName;
    /*  买家电话*/
    private String buyerPhone;
    /*  买家地址*/
    private String buyerAddress;
    /*  买家微信openid*/
    private String buyerOpenid;
    /*  订单总金额*/
    private BigDecimal orderAmount;
    /*  订单状态*/
    private Integer orderStatus;
    /*  支付状态*/
    private Integer payStatus;
}
