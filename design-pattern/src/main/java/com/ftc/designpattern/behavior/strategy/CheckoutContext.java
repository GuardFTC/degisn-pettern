package com.ftc.designpattern.behavior.strategy;

import lombok.Data;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-14 15:36:27
 * @describe: 结算上下文
 */
@Data
public class CheckoutContext {

    /**
     * 优惠策略
     */
    private PromotionStrategy promotionStrategy;

    /**
     * 结算
     *
     * @param price 订单价格
     * @return 结算价格
     */
    public double checkout(double price) {
        return promotionStrategy.getPromotionPrice(price);
    }
}
