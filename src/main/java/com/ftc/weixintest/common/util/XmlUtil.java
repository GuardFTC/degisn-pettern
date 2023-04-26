package com.ftc.weixintest.common.util;

import cn.hutool.core.util.StrUtil;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-25 14:03:08
 * @describe: XML工具类
 */
public class XmlUtil {

    /**
     * JavaBean To Xml
     *
     * @param bean         Java Bean
     * @param inheritClazz Java Bean中嵌套的类，且有继承关系的Java Class
     * @return - Xml
     */
    public static String beanToXml(Object bean, Class<?>... inheritClazz) {
        try {
            JAXBContext context = initContext(bean.getClass(), inheritClazz);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            StringWriter writer = new StringWriter();
            marshaller.marshal(bean, writer);
            return writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return StrUtil.EMPTY;
    }

    /**
     * Xml To JavaBean
     *
     * @param xml          - Xml
     * @param beanClazz    - JavaBean Class
     * @param inheritClazz - JavaBean中嵌套的类，且有继承关系的Java Class
     * @return - JavaBean
     */
    public static Object xmlToBean(String xml, Class<?> beanClazz, Class<?>... inheritClazz) {
        try {
            JAXBContext context = initContext(beanClazz, inheritClazz);
            Unmarshaller um = context.createUnmarshaller();
            StringReader sr = new StringReader(xml);
            return um.unmarshal(sr);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 初始化JAXBContext
     *
     * @param mainClazz    - 序列化或反序列化Class
     * @param inheritClazz - Java Bean中嵌套的类，且有继承关系的Java Class
     * @return - JAXBContext
     */
    private static JAXBContext initContext(Class<?> mainClazz, Class<?>... inheritClazz) throws JAXBException {
        JAXBContext context;
        if (inheritClazz != null) {
            Class<?>[] clazzArr = new Class[inheritClazz.length + 1];
            clazzArr[0] = mainClazz;
            System.arraycopy(inheritClazz, 0, clazzArr, 1, clazzArr.length - 1);
            context = JAXBContext.newInstance(clazzArr);
        } else {
            context = JAXBContext.newInstance(mainClazz);
        }
        return context;
    }
}
