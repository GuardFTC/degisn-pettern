package com.ftc.designpattern.behavior.strategy;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-14 15:33:49
 * @describe: 打折策略
 */
public class DiscountStrategy implements PromotionStrategy {

    @Override
    public double getPromotionPrice(double price) {

        //1.打9折
        return price * 0.9;
    }
}
