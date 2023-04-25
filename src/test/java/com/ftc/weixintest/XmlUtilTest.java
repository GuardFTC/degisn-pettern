package com.ftc.weixintest;

import cn.hutool.core.lang.Assert;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.ftc.weixintest.common.util.XmlUtil;
import com.ftc.weixintest.message.base.BaseMessage;
import lombok.SneakyThrows;
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
            "  <toUserName>111</toUserName>\n" +
            "  <fromUserName>222</fromUserName>\n" +
            "  <createTime>333</createTime>\n" +
            "  <msgType>4444</msgType>\n" +
            "</xml>";

    @Test
    void testBeanToXML() {

        //1.创建Java Bean
        BaseMessage message = new BaseMessage();
        message.setToUserName("111");
        message.setFromUserName("222");
        message.setCreateTime(333);
        message.setMsgType("4444");

        //2.Bean To XML
        String xml = XmlUtil.beanToXml(message, BaseMessage.class);

        //3.验证
        Assert.isTrue(EXAMPLE_XML.equals(xml));
    }

    @Test
    @SneakyThrows({JsonProcessingException.class})
    void testXMLToBean() {

        //1.创建转换器
        XmlMapper xmlMapper = new XmlMapper();

        //2.转Bean
        BaseMessage message = xmlMapper.readValue(EXAMPLE_XML, BaseMessage.class);

        //3.验证
        Assert.isTrue("111".equals(message.getToUserName()));
        Assert.isTrue("222".equals(message.getFromUserName()));
        Assert.isTrue(333 == message.getCreateTime());
        Assert.isTrue("4444".equals(message.getMsgType()));
    }
}
