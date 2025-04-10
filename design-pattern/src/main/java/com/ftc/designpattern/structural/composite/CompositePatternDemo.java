package com.ftc.designpattern.structural.composite;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-10 10:49:22
 * @describe: 组合模式Demo
 */
public class CompositePatternDemo {

    public static void main(String[] args) {

        //1.创建开发
        Developer developer = new Developer("马冬梅");
        Developer developer1 = new Developer("夏洛");

        //2.创建设计师
        Designer designer = new Designer("秋雅");

        //3.创建开发管理
        Manager developerManager = new Manager("张扬");
        developerManager.addSubordinate(developer);
        developerManager.addSubordinate(developer1);

        //4.创建设计师管理
        Manager designerManager = new Manager("袁华");
        designerManager.addSubordinate(designer);

        //5.创建总领导
        Manager boss = new Manager("陈凯哥哥");
        boss.addSubordinate(designerManager);
        boss.addSubordinate(developerManager);

        //6.展示详情
        boss.getDetails();
    }
}
