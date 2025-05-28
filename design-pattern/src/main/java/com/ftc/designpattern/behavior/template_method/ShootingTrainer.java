package com.ftc.designpattern.behavior.template_method;

/**
 * @author: 冯铁城 [fengtiecheng@pwrd.com]
 * @date: 2025-05-28 14:24:54
 * @describe: 投篮训练师
 */
public class ShootingTrainer extends NbaTrainer {

    @Override
    protected void prepare() {
        System.out.println("准备投篮训练");
    }

    @Override
    protected void training() {
        System.out.println("进行投篮训练");
    }

    @Override
    protected void afterTraining() {
        System.out.println("结束投篮训练");
    }
}
