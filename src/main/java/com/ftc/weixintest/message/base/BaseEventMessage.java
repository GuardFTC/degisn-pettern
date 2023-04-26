package com.ftc.weixintest.message.base;

import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-25 13:37:30
 * @describe: 菜单点击触发事件基础Message类
 */
@Data
@XmlRootElement(name = "xml")
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlSeeAlso({BaseEventMessage.class})
@XmlType(propOrder = {"event"})
public class BaseEventMessage extends BaseMessage {

    /**
     * 事件类型
     */
    @XmlElement(name = "Event")
    private String event;
}
