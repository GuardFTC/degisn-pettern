package com.ftc.weixintest.message.base;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-25 13:37:30
 * @describe: 基础Message类
 */
@Data
@XStreamAlias("xml")
public class BaseMessage {

    /**
     * 开发者 微信号
     */
    @XmlElement(name = "ToUserName")
    private String toUserName;

    /**
     * 发送方帐号（一个OpenID）
     */
    @XmlElement(name = "ToUserName")
    private String fromUserName;

    /**
     * 消息创建时间 （整型）
     */
    @XmlElement(name = "ToUserName")
    private int createTime;

    /**
     * 消息类型
     */
    @XmlElement(name = "ToUserName")
    private String msgType;
}
