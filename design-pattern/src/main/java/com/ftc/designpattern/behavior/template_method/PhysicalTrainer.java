package com.ftc.designpattern.behavior.template_method;

/**
 * @author: 冯铁城 [fengtiecheng@pwrd.com]
 * @date: 2025-05-28 14:24:42
 * @describe: 体能训练师
 */
public class PhysicalTrainer extends NbaTrainer {

    @Override
    protected void prepare() {
        System.out.println("准备进行体能训练");
    }

    @Override
    protected void training() {
        System.out.println("进行体能训练");
    }

    @Override
    protected void afterTraining() {
        System.out.println("体能训练结束");
    }
}
