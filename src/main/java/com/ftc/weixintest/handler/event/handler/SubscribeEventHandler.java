package com.ftc.weixintest.handler.event.handler;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.ftc.weixintest.common.enums.ResponseMsgTypeEnum;
import com.ftc.weixintest.common.util.XmlUtil;
import com.ftc.weixintest.handler.event.IEventHandler;
import com.ftc.weixintest.message.base.BaseEventMessage;
import com.ftc.weixintest.message.base.BaseMessage;
import com.ftc.weixintest.message.event.SubscribeEventMessage;
import com.ftc.weixintest.message.response.TextMessage;
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
        if (ObjectUtil.isNull(subscribeEventMessage)) {
            return StrUtil.EMPTY;
        }

        //2.创建文本类型消息
        TextMessage textMessage = new TextMessage();
        textMessage.setToUserName(subscribeEventMessage.getFromUserName());
        textMessage.setFromUserName(subscribeEventMessage.getToUserName());
        textMessage.setCreateTime(System.currentTimeMillis());
        textMessage.setMsgType(ResponseMsgTypeEnum.MESSAGE_TEXT.getType());
        textMessage.setContent("欢迎关注我的公众号！");

        //3.转xml并返回
        return XmlUtil.beanToXml(textMessage, BaseMessage.class, TextMessage.class);
    }
}
