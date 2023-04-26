package com.ftc.weixintest.handler.event;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.ftc.weixintest.common.util.XmlUtil;
import com.ftc.weixintest.handler.IMessageHandler;
import com.ftc.weixintest.message.base.BaseEventMessage;
import com.ftc.weixintest.message.base.BaseMessage;
import org.springframework.stereotype.Component;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-26 10:27:12
 * @describe: Event类型消息处理器
 */
@Component
public class EventHandler implements IMessageHandler {

    @Override
    public String getType() {
        return "event";
    }

    @Override
    public String dealMessage(String msgStr) {

        //1.XML转Java Bean
        BaseEventMessage baseEventMessage = (BaseEventMessage) XmlUtil.xmlToBean(msgStr, BaseMessage.class, BaseEventMessage.class);
        if (ObjectUtil.isNull(baseEventMessage)) {
            return StrUtil.EMPTY;
        }

        //2.根据消息类型获取对应处理器  TODO 后续异常情况抛出自定义异常
        IEventHandler eventHandler = EventHandlerFactory.getEventHandler(baseEventMessage.getEvent());
        if (ObjectUtil.isNull(eventHandler)) {
            return StrUtil.EMPTY;
        }

        //3.处理消息并返回
        return eventHandler.dealEventMessage(msgStr);
    }
}
