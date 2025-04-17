package com.ftc.designpattern.behavior.observer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-16 18:02:14
 * @describe: 观察者模式示例代码
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {

        //1.创建公众号
        Publisher wechatPublic = new WechatPublic("夏洛特烦恼公众号");

        //2.新增订阅者
        Subscriber xl = new WechatUser("夏洛");
        Subscriber mdm = new WechatUser("马冬梅");
        wechatPublic.addSubscriber(xl);
        wechatPublic.addSubscriber(mdm);

        //3.通知消息
        wechatPublic.publishMessage("获得本chi大sha一等奖的是-----我为祖国献石油！！！");

        //4.移除订阅者
        wechatPublic.removeSubscriber(mdm);

        //5.新增订阅者
        Subscriber qy = new WechatUser("秋雅");
        wechatPublic.addSubscriber(qy);

        //6.再次通知消息
        wechatPublic.publishMessage("夏洛同学！要上春晚啦！！！！");
    }
}
