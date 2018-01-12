package com.imooc.VO;

import lombok.Data;

/**
 * @Author: Huang
 * @Description:    http请求返回的最外层对象
 * @Date: Create in 15:40$ 2018/1/11$
 * @Modified By:
 */
@Data
public class ResultVO<T> {
    /** 错误码*/
    private Integer code;
    /** 提示信息*/
    private String msg;
    /** 返回内容*/
    private T date;
}
