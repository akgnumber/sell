package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import com.imooc.util.EnumUtil;
import com.imooc.util.serialiazer.Data2LongSerialiazer;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 15:12$ 2018/1/12$
 * @Modified By:
 */
@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonSerialize(using = Data2LongSerialiazer.class)
    private Date createTime;
    /*  更新时间*/
    @JsonSerialize(using = Data2LongSerialiazer.class)
    private Date updateTime;

    private List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum() {
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum() {
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }
}
