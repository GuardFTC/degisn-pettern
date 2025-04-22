package com.ftc.designpattern.behavior.visitor.visitors;

import com.ftc.designpattern.behavior.visitor.elements.*;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-21 16:02:23
 * @describe: 访问者接口
 */
public interface Visitor {

    /**
     * 控球后卫元素访问
     *
     * @param element 具体元素
     */
    void visit(PointGuard element);

    /**
     * 得分后卫元素访问
     *
     * @param element 具体元素
     */
    void visit(ShootingGuard element);

    /**
     * 小前锋元素访问
     *
     * @param element 具体元素
     */
    void visit(SmallForward element);

    /**
     * 大前锋元素访问
     *
     * @param element 具体元素
     */
    void visit(PowerForward element);

    /**
     * 中锋元素访问
     *
     * @param element 具体元素
     */
    void visit(Center element);
}
