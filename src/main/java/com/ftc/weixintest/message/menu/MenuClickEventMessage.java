package com.ftc.weixintest.message.menu;

import com.ftc.weixintest.message.base.BaseMenuMessage;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-25 13:49:57
 * @describe: 点击菜单触发事件消息
 */
@Data
@XStreamAlias("xml")
public class MenuClickEventMessage extends BaseMenuMessage {
}
