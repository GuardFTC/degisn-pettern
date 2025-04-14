package com.ftc.designpattern.behavior.strategy;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-14 15:30:46
 * @describe: 满减策略
 */
public class FullReductionStrategy implements PromotionStrategy {

    @Override
    public double getPromotionPrice(double price) {

        //1.满100-5
        return price - Math.floor(price / 100) * 5;
    }
}
