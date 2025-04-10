package com.ftc.designpattern.structural.flyweight;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-10 15:38:44
 * @describe: 享元模式Demo
 */
public class FlyWeightPatternDemo {

    public static void main(String[] args) {

        //1.创建SoldierContext对象
        SoldierContext soldierContext1 = new SoldierContext("刀", "布甲", "白色");
        SoldierContext soldierContext2 = new SoldierContext("长枪", "铁甲", "黑色");

        //2.创建步兵
        SoldierNpc footSoldier1 = SoldierFactory.getSoldier("foot");
        SoldierNpc footSoldier2 = SoldierFactory.getSoldier("foot");

        //3.创建骑兵
        SoldierNpc horsebackSoldier1 = SoldierFactory.getSoldier("horseback");
        SoldierNpc horsebackSoldier2 = SoldierFactory.getSoldier("horseback");

        //4.步兵攻击
        footSoldier1.attack(soldierContext1);
        footSoldier2.attack(soldierContext2);

        //5.骑兵攻击
        horsebackSoldier1.attack(soldierContext1);
        horsebackSoldier2.attack(soldierContext2);

        //6.判定对象是否相同对象
        System.out.println(STR."步兵对象是否相同：\{footSoldier1 == footSoldier2}");
        System.out.println(STR."骑兵对象是否相同：\{horsebackSoldier1 == horsebackSoldier2}");
    }
}
