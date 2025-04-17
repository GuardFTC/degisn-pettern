package com.ftc.designpattern.behavior.observer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-16 17:53:26
 * @describe: 发布者接口
 */
public interface Publisher {

    /**
     * 添加订阅者
     *
     * @param subscriber 订阅者
     */
    void addSubscriber(Subscriber subscriber);

    /**
     * 移除订阅者
     *
     * @param subscriber 订阅者
     */
    void removeSubscriber(Subscriber subscriber);

    /**
     * 发布消息
     *
     * @param message 消息
     */
    void publishMessage(String message);
}
