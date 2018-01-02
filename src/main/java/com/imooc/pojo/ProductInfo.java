package com.imooc.pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
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
public class ProductInfo {
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
    private Integer productStatus;
    /*  类目编号*/
    private Integer categoryType;

}
