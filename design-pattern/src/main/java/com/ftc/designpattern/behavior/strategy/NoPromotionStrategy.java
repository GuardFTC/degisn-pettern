package com.ftc.designpattern.behavior.strategy;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-14 15:34:41
 * @describe: 无促销策略
 */
public class NoPromotionStrategy implements PromotionStrategy {

    @Override
    public double getPromotionPrice(double price) {
        return price;
    }
}
