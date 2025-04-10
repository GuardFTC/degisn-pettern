package com.ftc.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-10 10:45:03
 * @describe: 管理者
 */
public class Manager extends Employee {

    /**
     * 下属列表
     */
    private List<Employee> subordinates = new ArrayList<>();

    /**
     * 添加下属
     *
     * @param employee 下属
     */
    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    /**
     * 移除下属
     *
     * @param employee 下属
     */
    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }

    /**
     * 构造方法
     *
     * @param name 名称
     */
    public Manager(String name) {
        super(name, "管理者");
    }

    @Override
    public void getDetails() {

        //1.打印管理者信息
        System.out.println("名称:" + getName() + ",职位:管理者");

        //2.打印下属信息
        for (Employee employee : subordinates) {
            System.out.print(" ");
            employee.getDetails();
        }
    }
}
