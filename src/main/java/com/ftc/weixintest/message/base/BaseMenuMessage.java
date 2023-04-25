package com.ftc.weixintest.message.base;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-25 13:37:30
 * @describe: 菜单点击触发事件基础Message类
 */
@Data
@XStreamAlias("xml")
public class BaseMenuMessage extends BaseMessage {

    /**
     * 事件类型
     */
    @XmlElement(name = "Event")
    private String event;

    /**
     * 事件Key
     */
    @XmlElement(name = "EventKey")
    private String eventKey;
}
