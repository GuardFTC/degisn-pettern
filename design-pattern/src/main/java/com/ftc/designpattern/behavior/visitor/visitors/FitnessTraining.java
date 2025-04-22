package com.ftc.designpattern.behavior.visitor.visitors;

import com.ftc.designpattern.behavior.visitor.elements.*;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-21 16:30:06
 * @describe: 体能训练
 */
public class FitnessTraining implements Visitor {

    @Override
    public void visit(PointGuard element) {
        System.out.println(STR."控球后卫\{element.getName()}进行体能训练");
    }

    @Override
    public void visit(ShootingGuard element) {
        System.out.println(STR."得分后卫\{element.getName()}进行体能训练");
    }

    @Override
    public void visit(SmallForward element) {
        System.out.println(STR."小前锋\{element.getName()}进行体能训练");
    }

    @Override
    public void visit(PowerForward element) {
        System.out.println(STR."大前锋\{element.getName()}进行体能训练");
    }

    @Override
    public void visit(Center element) {
        System.out.println(STR."中锋\{element.getName()}进行体能训练");
    }
}
