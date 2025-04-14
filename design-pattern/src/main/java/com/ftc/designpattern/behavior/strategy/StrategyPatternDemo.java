package com.ftc.designpattern.behavior.strategy;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-14 15:38:07
 * @describe: 策略模式示例
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {

        //1.创建价格结算上下文
        CheckoutContext checkoutContext = new CheckoutContext();

        //2.初始化订单价格
        double price = 150;

        //3.使用满减策略
        checkoutContext.setPromotionStrategy(new FullReductionStrategy());
        System.out.println(STR."使用满减策略，订单价格为：\{checkoutContext.checkout(price)}");

        //4.使用打折策略
        checkoutContext.setPromotionStrategy(new DiscountStrategy());
        System.out.println(STR."使用打折策略，订单价格为：\{checkoutContext.checkout(price)}");

        //5.使用原价策略
        checkoutContext.setPromotionStrategy(new NoPromotionStrategy());
        System.out.println(STR."使用原价策略，订单价格为：\{checkoutContext.checkout(price)}");
    }
}
