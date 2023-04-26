package com.ftc.weixintest.handler;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-25 14:47:08
 * @describe: 消息处理器工厂
 */
@Component
public class MessageHandlerFactory implements ApplicationContextAware {

    /**
     * 类型对应处理器MAP
     */
    private static final Map<String, IMessageHandler> TYPE_HANDLER_MAP = new HashMap<>();

    /**
     * 获取消息处理器
     *
     * @param type 消息类型
     * @return 消息处理器
     */
    public static IMessageHandler getHandler(String type) {
        return TYPE_HANDLER_MAP.get(type);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        //1.获取全部实现类
        Map<String, IMessageHandler> beansOfType = applicationContext.getBeansOfType(IMessageHandler.class);

        //2.循环
        for (String className : beansOfType.keySet()) {

            //3.获取实现类以及typeId集合
            IMessageHandler iMessageHandler = beansOfType.get(className);
            String type = iMessageHandler.getType();

            //4.封装Map
            TYPE_HANDLER_MAP.put(type, iMessageHandler);
        }
    }
}
