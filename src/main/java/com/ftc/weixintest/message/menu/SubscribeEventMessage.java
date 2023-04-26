package com.ftc.weixintest.message.menu;

import com.ftc.weixintest.message.base.BaseEventMessage;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-25 13:37:30
 * @describe: 菜单点击触发事件基础Message类
 */
@Data
@XmlRootElement(name = "xml")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class SubscribeEventMessage extends BaseEventMessage {
}
