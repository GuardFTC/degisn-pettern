package com.ftc.designpattern.behavior.template_method;

/**
 * @author: 冯铁城 [fengtiecheng@pwrd.com]
 * @date: 2025-05-28 14:26:50
 * @describe: 模板方法模式测试类
 */
public class TemplateMethodPatternDemo {

    public static void main(String[] args) {

        //1.创建体能训练师
        NbaTrainer physicalTrainer = new PhysicalTrainer();

        //2.创建投篮训练师
        NbaTrainer shootingTrainer = new ShootingTrainer();

        //3.进行体能训练
        physicalTrainer.train();

        //4.进行投篮训练
        shootingTrainer.train();
    }
}
