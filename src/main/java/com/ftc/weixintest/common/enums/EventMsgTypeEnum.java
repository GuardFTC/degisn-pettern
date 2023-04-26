package com.ftc.weixintest.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-26 14:00:27
 * @describe: 微信公众号事件消息枚举类型
 */
@Getter
@AllArgsConstructor
public enum EventMsgTypeEnum {

    /**
     * 订阅事件
     */
    MESSAGE_SUBSCRIBE("subscribe"),

    /**
     * 取消订阅事件
     */
    MESSAGE_UNSUBSCRIBE("unsubscribe"),

    /**
     * 点击事件
     */
    MESSAGE_CLICK("CLICK"),

    /**
     * 点击跳转链接事件
     */
    MESSAtGE_VIEW("VIEW"),

    /**
     * 扫码关注-已关注事件
     */
    MESSAGE_SCAN("SCAN"),

    /**
     * 上报地理位置事件
     */
    MESSAGE_LOCATION("LOCATION"),
    ;

    /**
     * 事件类型
     */
    private final String event;
}
