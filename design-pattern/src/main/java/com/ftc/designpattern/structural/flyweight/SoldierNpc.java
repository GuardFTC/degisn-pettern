package com.ftc.designpattern.structural.flyweight;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-10 15:07:22
 * @describe: 士兵NPC接口
 */
public interface SoldierNpc {

    /**
     * 攻击
     *
     * @param soldierContext 士兵上下文
     */
    void attack(SoldierContext soldierContext);
}
