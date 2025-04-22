package com.ftc.designpattern.behavior.visitor;

import com.ftc.designpattern.behavior.visitor.elements.*;
import com.ftc.designpattern.behavior.visitor.visitors.FitnessTraining;
import com.ftc.designpattern.behavior.visitor.visitors.ShootingDrills;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-21 16:33:32
 * @describe: 访问者模式示例代码
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {

        //1.创建5个位置的球员（元素）
        PointGuard pg = new PointGuard("库里");
        ShootingGuard sg = new ShootingGuard("哈登");
        SmallForward sf = new SmallForward("杜兰特");
        PowerForward pf = new PowerForward("浓眉哥");
        Center c = new Center("文班亚马");

        //2.创建训练（访问者）
        ShootingDrills shootingDrills = new ShootingDrills();
        FitnessTraining fitnessTraining = new FitnessTraining();

        //3.通过访问模式进行投篮训练
        System.out.println("=== 投篮训练开始 ===");
        pg.accept(shootingDrills);
        sg.accept(shootingDrills);
        sf.accept(shootingDrills);
        pf.accept(shootingDrills);
        c.accept(shootingDrills);

        //4.通过访问模式进行体能训练
        System.out.println("=== 体能训练开始 ===");
        pg.accept(fitnessTraining);
        sg.accept(fitnessTraining);
        sf.accept(fitnessTraining);
        pf.accept(fitnessTraining);
        c.accept(fitnessTraining);
    }
}
