package com.ftc.designpattern.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-28 11:20:00
 * @describe: 明星经纪人动态代理类
 */
public class StarAgentDynamic implements InvocationHandler {

    /**
     * 目标明星
     */ 
    private final Object star;

    /**
     * 经纪人姓名
     */
    private final String agentName;

    /**
     * 构造方法
     *
     * @param star 目标明星
     * @param agentName 经纪人姓名
     */
    public StarAgentDynamic(Object star, String agentName) {
        this.star = star;
        this.agentName = agentName;
    }

    /**
     * 获取代理实例
     *
     * @param star 目标明星
     * @param agentName 经纪人姓名
     * @return 代理对象
     */
    public static Object getProxy(Object star, String agentName) {
        return Proxy.newProxyInstance(
                star.getClass().getClassLoader(),
                star.getClass().getInterfaces(),
                new StarAgentDynamic(star, agentName)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //1.获取方法名
        String methodName = method.getName();
        
        //2.根据不同方法执行不同的前置处理
        if ("business".equals(methodName)) {
            System.out.println(agentName + ": 我是经纪人，负责谈商业活动细节");
        } else if ("signContract".equals(methodName)) {
            System.out.println(agentName + ": 我负责审核合同条款");
        } else if ("perform".equals(methodName)) {
            System.out.println(agentName + ": 我负责安排表演场地和时间");
        }
        
        //3.调用目标明星的方法
        Object result = method.invoke(star, args);
        
        //4.方法执行后的处理
        System.out.println(agentName + ": 工作完成，收取佣金");
        
        //5.返回结果
        return result;
    }
} 