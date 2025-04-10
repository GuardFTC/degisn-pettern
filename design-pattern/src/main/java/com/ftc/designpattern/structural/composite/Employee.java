package com.ftc.designpattern.structural.composite;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-10 10:37:08
 * @describe: 员工类
 */
@Setter
@Getter
public abstract class Employee {

    /**
     * 名称
     */
    private String name;

    /**
     * 职位
     */
    private String position;

    /**
     * 构造方法
     *
     * @param name     名称
     * @param position 职位
     */
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    /**
     * 抽象方法 获取细节信息
     */
    public abstract void getDetails();
}
