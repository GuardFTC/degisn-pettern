package com.ftc.designpattern.structural.proxy;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-28 11:25:00
 * @describe: 明星代理模式演示
 */
public class StarProxyDemo {

    public static void main(String[] args) {

        //1.创建真实明星
        RealStar realStar = new RealStar("周杰伦");
        
        //2.直接与明星交流（不使用代理）
        System.out.println("===== 直接与明星交流 =====");
        realStar.business();
        realStar.signContract();
        realStar.perform();
        System.out.println("----------------------------------------------------------------------------------------");
        
        //3.通过静态代理（经纪人）与明星交流
        System.out.println("===== 通过经纪人（静态代理）与明星交流 =====");
        StarAgent starAgent = new StarAgent(realStar, "张三");
        starAgent.business();
        starAgent.signContract();
        starAgent.perform();
        System.out.println("----------------------------------------------------------------------------------------");
        
        //4.通过动态代理与明星交流
        System.out.println("===== 通过经纪人（动态代理）与明星交流 =====");
        Star dynamicProxy = (Star) StarAgentDynamic.getProxy(realStar, "李四");
        dynamicProxy.business();
        dynamicProxy.signContract();
        dynamicProxy.perform();
    }
} 