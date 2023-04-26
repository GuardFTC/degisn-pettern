package com.ftc.weixintest.message.response;

import com.ftc.weixintest.message.base.BaseMessage;
import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-26 13:52:43
 * @describe: 文本类型回复消息
 */
@Data
@XmlRootElement(name = "xml")
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = {"content"})
public class TextMessage extends BaseMessage {

    /**
     * 文本内容
     */
    @XmlElement(name = "Content")
    private String content;
}
