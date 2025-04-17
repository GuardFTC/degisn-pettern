package com.ftc.designpattern.behavior.mediator;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-17 16:11:26
 * @describe: 中介者接口
 */
public interface Mediator {

    /**
     * 通知接口
     *
     * @param colleague 被代理对象
     * @param message   消息
     */
    void notify(Colleague colleague, String message);
}
