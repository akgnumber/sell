package com.imooc.VO;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Huang
 * @Description:    http请求返回的最外层对象
 * @Date: Create in 15:40$ 2018/1/11$
 * @Modified By:
 */
@Data
public class ResultVO<T> implements Serializable{

    private static final long serialVersionUID = -6794159724606988147L;

    /** 错误码*/
    private Integer code;
    /** 提示信息*/
    private String msg;
    /** 返回内容*/
    private T date;
}
