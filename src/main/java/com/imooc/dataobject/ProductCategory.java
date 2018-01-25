package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 13:39$ 2017/12/27$
 * @Modified By:
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    @Id
    @GeneratedValue
    private Integer categoryId;
    /** 类目名称*/
    private String categoryName;
    /** 类目编号*/
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
