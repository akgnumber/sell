package com.imooc.dto;

import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 15:12$ 2018/1/12$
 * @Modified By:
 */
@Data
public class OrderDTO {
    /*  订单id*/
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
    /*  创建时间*/
    private Date createTime;
    /*  更新时间*/
    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
