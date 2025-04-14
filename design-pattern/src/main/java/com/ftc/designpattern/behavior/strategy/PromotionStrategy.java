package com.ftc.designpattern.behavior.strategy;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-14 15:29:42
 * @describe: 促销策略接口
 */
public interface PromotionStrategy {

    /**
     * 获取促销价格
     *
     * @param price 原价
     * @return 促销价格
     */
    double getPromotionPrice(double price);
}
