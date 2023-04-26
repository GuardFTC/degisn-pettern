package com.ftc.weixintest.handler.event.handler;

import cn.hutool.core.util.StrUtil;
import com.ftc.weixintest.common.util.XmlUtil;
import com.ftc.weixintest.handler.event.IEventHandler;
import com.ftc.weixintest.message.base.BaseEventMessage;
import com.ftc.weixintest.message.base.BaseMessage;
import com.ftc.weixintest.message.event.SubscribeEventMessage;
import org.springframework.stereotype.Component;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-26 10:42:17
 * @describe: 关注事件处理器
 */
@Component
public class SubscribeEventHandler implements IEventHandler {

    @Override
    public String getEvent() {
        return "subscribe";
    }

    @Override
    public String dealEventMessage(String msgStr) {

        //1.转换为关注消息
        SubscribeEventMessage subscribeEventMessage = (SubscribeEventMessage) XmlUtil.xmlToBean(msgStr, BaseMessage.class, BaseEventMessage.class, SubscribeEventMessage.class);

        return StrUtil.EMPTY;
    }
}
