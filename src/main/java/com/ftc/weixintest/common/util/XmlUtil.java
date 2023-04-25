package com.ftc.weixintest.common.util;

import com.thoughtworks.xstream.XStream;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-25 14:03:08
 * @describe: XML工具类
 */
public class XmlUtil {

    /**
     * JavaBean To XML
     *
     * @param bean {@link Object}
     * @param cls  传入对象的字节码
     * @return XML XML格式字符串
     */
    public static <T> String beanToXml(Object bean, Class<T> cls) {
        XStream stream = new XStream();
        stream.processAnnotations(cls);
        return stream.toXML(bean);
    }
}
