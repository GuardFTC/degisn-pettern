package com.ftc.designpattern.structural.flyweight;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-10 15:09:37
 * @describe: 骑兵
 */
public class HorsebackSoldier implements SoldierNpc {

    @Override
    public void attack(SoldierContext soldierContext) {
        System.out.println(
                STR."""
        肤色: \{soldierContext.getSkinColor()}
        装备: \{soldierContext.getEquipment()}
        武器: \{soldierContext.getWeapon()}
        的骑兵对你发起攻击
        """
        );
    }
}
