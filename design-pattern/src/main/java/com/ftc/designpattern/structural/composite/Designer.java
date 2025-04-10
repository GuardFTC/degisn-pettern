package com.ftc.designpattern.structural.composite;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-10 10:42:02
 * @describe: 设计师
 */
public class Designer extends Employee {

    /**
     * 构造方法
     *
     * @param name 名称
     */
    public Designer(String name) {
        super(name, "设计师");
    }

    @Override
    public void getDetails() {
        System.out.println("名称:" + getName() + ",职位:设计师");
    }
}
