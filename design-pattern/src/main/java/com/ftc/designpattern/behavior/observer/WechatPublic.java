package com.ftc.designpattern.behavior.observer;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-16 17:58:15
 * @describe: 微信公众号
 */
@Data
public class WechatPublic implements Publisher {

    /**
     * 公众号名称
     */
    private String publicName;

    /**
     * 订阅者集合
     */
    private Set<Subscriber> subscribers = new HashSet<>();

    /**
     * 构造方法
     *
     * @param publicName 公众号名称
     */
    public WechatPublic(String publicName) {
        this.publicName = publicName;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void publishMessage(String message) {
        System.out.println(STR."公众号:\{publicName}发布新消息:\{message}");
        subscribers.forEach(subscriber -> subscriber.receiveMessage(message));
    }
}
