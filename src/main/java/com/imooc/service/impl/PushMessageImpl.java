package com.imooc.service.impl;

import com.imooc.config.WechatAccountConfig;
import com.imooc.dto.OrderDTO;
import com.imooc.service.PushMessage;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 16:34$ 2018/1/26$
 * @Modified By:
 */
@Service
@Slf4j
public class PushMessageImpl implements PushMessage {

    @Autowired
    private WxMpService wxMpService;
    @Autowired
    private WechatAccountConfig wechatAccountConfig;

    @Override
    public void orderStatus(OrderDTO orderDTO) {
        List<WxMpTemplateData> wxMpTemplateData = Arrays.asList(
                new WxMpTemplateData("first","记得收货"),
                new WxMpTemplateData("2","微信点餐"),
                new WxMpTemplateData("3","记得收货"),
                new WxMpTemplateData("4",orderDTO.getOrderId()),
                new WxMpTemplateData("5",orderDTO.getOrderStatusEnum().getMsg()),
                new WxMpTemplateData("6","¥" + orderDTO.getOrderAmount()),
                new WxMpTemplateData("7","欢迎再次光临")
        );
        WxMpTemplateMessage templateMessage = WxMpTemplateMessage.builder().build();
        templateMessage.setTemplateId("");
        templateMessage.setToUser("");
        templateMessage.addWxMpTemplateData(wxMpTemplateData.get(0));
        try {
            wxMpService.getTemplateMsgService().sendTemplateMsg(templateMessage);
        } catch (WxErrorException e) {
            log.error("【微信模板消息】 发送失败, {}", e);
        }
    }
}
