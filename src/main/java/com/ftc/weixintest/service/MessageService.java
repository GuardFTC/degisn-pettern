package com.ftc.weixintest.service;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.ftc.weixintest.common.util.XmlUtil;
import com.ftc.weixintest.handler.IMessageHandler;
import com.ftc.weixintest.handler.MessageHandlerFactory;
import com.ftc.weixintest.message.base.BaseMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-25 15:36:05
 * @describe: 消息服务
 */
@Service
@RequiredArgsConstructor
public class MessageService {

    private final BaseService baseService;

    /**
     * 处理消息并分发
     *
     * @param signature 签名
     * @param timestamp 时间戳
     * @param nonce     随机数
     * @param msgStr    XML消息字符串
     * @return 响应消息（XML字符串）
     * TODO 后续异常情况抛出自定义异常
     */
    public String processMessage(String signature, String timestamp, String nonce, String msgStr) {

        //1.校验消息来源
        boolean isWeChatMessage = baseService.checkWeChatMessage(signature, timestamp, nonce);
        if (!isWeChatMessage) {
            return StrUtil.EMPTY;
        }

        //2.XML转Java Bean
        BaseMessage baseMessage = (BaseMessage) XmlUtil.xmlToBean(msgStr, BaseMessage.class);

        //3.根据消息类型获取对应处理器
        IMessageHandler handler = MessageHandlerFactory.getHandler(baseMessage.getMsgType());
        if (ObjectUtil.isNull(handler)) {
            return StrUtil.EMPTY;
        }

        //4.处理消息并返回
        return handler.dealMessage(msgStr);
    }
}
