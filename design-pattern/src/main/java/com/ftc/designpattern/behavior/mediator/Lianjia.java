package com.ftc.designpattern.behavior.mediator;

import cn.hutool.core.lang.Assert;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-17 16:20:05
 * @describe: 链家中介
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lianjia implements Mediator {

    /**
     * 出租人
     */
    private Lessor lessor;

    /**
     * 租客
     */
    private Tenant tenant;

    @Override
    public void notify(Colleague colleague, String message) {

        //1.非空判定
        Assert.notNull(lessor, "出租人不能为空");
        Assert.notNull(tenant, "租客不能为空");

        //2.租赁事件判定
        if ("rent".equals(message) && colleague == lessor) {
            System.out.println("链家收到通知，开始履行中介义务");
            System.out.println(STR."\{lessor.getName()}出租房屋");
            System.out.println(STR."\{tenant.getName()}想要租赁房屋");
            System.out.println("双方签订合同，合同签订成功，钥匙交接，房屋租赁完成");
        }

        //3.退租事件判定
        if ("rentRefund".equals(message) && colleague == tenant) {
            System.out.println("链家收到通知，开始履行中介义务");
            System.out.println(STR."\{tenant.getName()}退租房屋");
            System.out.println(STR."\{lessor.getName()}检查房屋");
            System.out.println("房屋验收完毕，合同终止，钥匙交接，房屋退租完成");
        }
    }
}
