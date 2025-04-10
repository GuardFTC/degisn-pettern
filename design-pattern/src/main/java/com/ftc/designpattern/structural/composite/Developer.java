package com.ftc.designpattern.structural.composite;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-10 10:39:49
 * @describe: 开发者
 */
public class Developer extends Employee {

    /**
     * 构造方法
     *
     * @param name 名称
     */
    public Developer(String name) {
        super(name, "开发人员");
    }

    @Override
    public void getDetails() {
        System.out.println("名称:" + getName() + ",职位:开发人员");
    }
}
