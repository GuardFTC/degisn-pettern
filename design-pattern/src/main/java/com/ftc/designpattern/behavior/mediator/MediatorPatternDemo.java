package com.ftc.designpattern.behavior.mediator;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-17 16:41:53
 * @describe: 中介者模式示例代码
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {

        //1.创建链家中介
        Lianjia lianjia = new Lianjia();

        //2.创建出租人
        Lessor lessor = new Lessor(lianjia, "袁华");

        //3.创建租客
        Tenant tenant = new Tenant(lianjia, "秋雅");

        //4.中介与出租人和租客构建中介代理关系
        lianjia.setLessor(lessor);
        lianjia.setTenant(tenant);

        //5.出租人出租房屋
        lessor.rent();
        System.out.println("---------------------------------------------");

        //6.租客退租房屋
        tenant.rentRefund();
    }
}
