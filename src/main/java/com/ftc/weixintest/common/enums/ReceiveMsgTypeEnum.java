package com.ftc.weixintest.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-26 14:00:27
 * @describe: 微信公众号接收普通消息枚举类型
 */
@Getter
@AllArgsConstructor
public enum ReceiveMsgTypeEnum {

    /**
     * 文本消息
     */
    MESSAGE_TEXT("text"),

    /**
     * 图片消息
     */
    MESSAtGE_IMAGE("image"),

    /**
     * 语音消息
     */
    MESSAGE_VOICE("voice"),

    /**
     * 视频消息
     */
    MESSAGE_VIDEO("video"),

    /**
     * 短视频消息
     */
    MESSAGE_SHORT_VIDEO("shortvideo"),

    /**
     * 地理位置消息
     */
    MESSAGE_LOCATION("location"),

    /**
     * 链接消息
     */
    MESSAGE_LINK("link"),

    /**
     * 事件消息
     */
    MESSAGE_EVENT("event"),
    ;

    /**
     * 接收消息类型
     */
    private final String type;
}
