package com.ftc.weixintest.handler.event;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-26 10:32:41
 * @describe: Event消息顶层接口
 */
public interface IEventHandler {

    /**
     * 获取处理器事件
     *
     * @return 处理器事件
     */
    String getEvent();

    /**
     * 处理Event消息
     *
     * @param msgStr Event消息
     * @return 处理后响应的XML消息
     */
    String dealEventMessage(String msgStr);
}
