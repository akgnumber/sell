package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * 卖家端
 * @Author: Huang
 * @Description:
 * @Date: Create in 11:32$ 2018/1/26$
 * @Modified By:
 */
public interface SellerService {

    /**
     * 通过openid查询卖家信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
