package com.ftc.weixintest.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-26 14:00:27
 * @describe: 微信公众号回复消息枚举类型
 */
@Getter
@AllArgsConstructor
public enum ResponseMsgTypeEnum {

    /**
     * 文本消息
     */
    MESSAGE_TEXT("text"),

    /**
     * 图片消息
     */
    MESSAtGE_IMAGE("image"),

    /**
     * 图文消息
     */
    MESSAGE_NEWS("news"),

    /**
     * 语音消息
     */
    MESSAGE_VOICE("voice"),

    /**
     * 视频消息
     */
    MESSAGE_VIDEO("video"),
    ;

    private final String type;
}
