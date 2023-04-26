package com.ftc.weixintest.handler;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-25 14:42:32
 * @describe: 消息处理顶层接口
 */
public interface IMessageHandler {

    /**
     * 获取处理器类型
     *
     * @return 消息处理器的类型
     */
    String getType();

    /**
     * 处理XMLMessage
     *
     * @param msgStr XML消息
     * @return 处理后响应的XML消息
     */
    String dealMessage(String msgStr);
}
