package com.ftc.designpattern.behavior.template_method;

/**
 * @author: 冯铁城 [fengtiecheng@pwrd.com]
 * @date: 2025-05-28 14:21:41
 * @describe: NBA训练师
 */
public abstract class NbaTrainer {

    /**
     * 训练
     */
    public void train() {
        System.out.println("---------------------------------");

        //1.训练前准备
        prepare();

        //2.训练
        training();

        //3.训练后收尾
        afterTraining();
    }

    /**
     * 训练前准备
     */
    protected abstract void prepare();

    /**
     * 训练
     */
    protected abstract void training();

    /**
     * 训练后收尾
     */
    protected abstract void afterTraining();
}
