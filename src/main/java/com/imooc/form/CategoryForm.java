package com.imooc.form;

import lombok.Data;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 16:52$ 2018/1/25$
 * @Modified By:
 */
@Data
public class CategoryForm {
    private Integer categoryId;
    /** 类目名称*/
    private String categoryName;
    /** 类目编号*/
    private Integer categoryType;
}
