package com.imooc.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.util.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 10:46$ 2017/12/28$
 * @Modified By:
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo implements Serializable{

    private static final long serialVersionUID = 6399186181668983148L;
    @Id
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
    /*  商品状态*/
    private Integer productStatus = ProductStatusEnum.UP.getCode();
    /*  类目编号*/
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }
}
