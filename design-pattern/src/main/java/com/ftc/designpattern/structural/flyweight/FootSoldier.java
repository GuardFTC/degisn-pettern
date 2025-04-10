package com.ftc.designpattern.structural.flyweight;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-10 15:09:07
 * @describe: 步兵
 */
public class FootSoldier implements SoldierNpc {

    @Override
    public void attack(SoldierContext soldierContext) {
        System.out.println(
                STR."""
        肤色: \{soldierContext.getSkinColor()}
        装备: \{soldierContext.getEquipment()}
        武器: \{soldierContext.getWeapon()}
        的步兵对你发起攻击
        """
        );
    }
}
