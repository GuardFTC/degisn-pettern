package com.ftc.designpattern.behavior.observer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-16 17:52:12
 * @describe: 订阅者接口
 */
public interface Subscriber {

    /**
     * 接收消息
     *
     * @param message 消息
     */
    void receiveMessage(String message);
}
