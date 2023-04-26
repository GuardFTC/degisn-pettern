package com.ftc.weixintest;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.ObjectUtil;
import com.ftc.weixintest.common.util.XmlUtil;
import com.ftc.weixintest.message.base.BaseEventMessage;
import com.ftc.weixintest.message.base.BaseMessage;
import com.ftc.weixintest.message.event.SubscribeEventMessage;
import org.junit.jupiter.api.Test;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-25 11:13:08
 * @describe: JacksonXML操作单元测试类
 */
public class XmlUtilTest {

    /**
     * 测试XML
     */
    private static final String EXAMPLE_XML = "<xml>\n" +
            "    <ToUserName><![CDATA[gh_e27309ea25fd]]></ToUserName>\n" +
            "    <FromUserName><![CDATA[o2s9V6ugD046jsgkzIuu-Xg8YeXM]]></FromUserName>\n" +
            "    <CreateTime>1682471904</CreateTime>\n" +
            "    <MsgType><![CDATA[event]]></MsgType>\n" +
            "    <Event><![CDATA[subscribe]]></Event>\n" +
            "    <EventKey><![CDATA[https://ecosys.china-inv.cn/web/download/welcome.html]]></EventKey>\n" +
            "    <MenuId>453412811</MenuId>\n" +
            "</xml>";

    @Test
    void testBeanToXML() {

        //1.创建Java Bean
        BaseMessage message = new BaseMessage();
        message.setToUserName("gh_e27309ea25fd");
        message.setFromUserName("o2s9V6ugD046jsgkzIuu-Xg8YeXM");
        message.setCreateTime(1682471904);
        message.setMsgType("event");

        //2.Bean To Xml
        String xml = XmlUtil.beanToXml(message);

        //3.验证
        String result = "<xml>\n" +
                "    <ToUserName>gh_e27309ea25fd</ToUserName>\n" +
                "    <FromUserName>o2s9V6ugD046jsgkzIuu-Xg8YeXM</FromUserName>\n" +
                "    <CreateTime>1682471904</CreateTime>\n" +
                "    <MsgType>event</MsgType>\n" +
                "</xml>";
        Assert.isTrue(result.equals(xml));
    }

    @Test
    void testXMLToBean() {

        //1.Xml To Bean
        BaseMessage message = (BaseMessage) XmlUtil.xmlToBean(EXAMPLE_XML, BaseMessage.class);

        //2.验证
        Assert.isTrue(ObjectUtil.isNotNull(message));
        Assert.isTrue("gh_e27309ea25fd".equals(message.getToUserName()));
        Assert.isTrue("o2s9V6ugD046jsgkzIuu-Xg8YeXM".equals(message.getFromUserName()));
        Assert.isTrue(1682471904 == message.getCreateTime());
        Assert.isTrue("event".equals(message.getMsgType()));

        //3.Xml To Bean子类
        BaseEventMessage baseEventMessage = (BaseEventMessage) XmlUtil.xmlToBean(EXAMPLE_XML, BaseMessage.class, BaseEventMessage.class);

        //4.验证
        Assert.isTrue(ObjectUtil.isNotNull(baseEventMessage));
        Assert.isTrue("gh_e27309ea25fd".equals(baseEventMessage.getToUserName()));
        Assert.isTrue("o2s9V6ugD046jsgkzIuu-Xg8YeXM".equals(baseEventMessage.getFromUserName()));
        Assert.isTrue(1682471904 == baseEventMessage.getCreateTime());
        Assert.isTrue("event".equals(baseEventMessage.getMsgType()));
        Assert.isTrue("subscribe".equals(baseEventMessage.getEvent()));

        //5.Xml To Bean子类
        SubscribeEventMessage subscribeEventMessage = (SubscribeEventMessage) XmlUtil.xmlToBean(EXAMPLE_XML, BaseMessage.class, BaseEventMessage.class, SubscribeEventMessage.class);

        //6.验证
        Assert.isTrue(ObjectUtil.isNotNull(subscribeEventMessage));
        Assert.isTrue("gh_e27309ea25fd".equals(subscribeEventMessage.getToUserName()));
        Assert.isTrue("o2s9V6ugD046jsgkzIuu-Xg8YeXM".equals(subscribeEventMessage.getFromUserName()));
        Assert.isTrue(1682471904 == subscribeEventMessage.getCreateTime());
        Assert.isTrue("event".equals(subscribeEventMessage.getMsgType()));
        Assert.isTrue("subscribe".equals(subscribeEventMessage.getEvent()));
    }
}
