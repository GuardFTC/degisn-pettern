package com.ftc.designpattern.structural.flyweight;

import java.util.HashMap;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-10 15:22:00
 * @describe: 士兵工厂
 */
public class SoldierFactory {

    /**
     * 士兵类型-士兵元对象Map
     */
    private static final HashMap<String, SoldierNpc> SOLDIER_NPC_MAP = new HashMap<>();

    /**
     * 获取士兵对象
     *
     * @param type 士兵类型
     * @return 士兵对象
     * @throws IllegalArgumentException 如果士兵类型无效
     */
    public static SoldierNpc getSoldier(String type) {
        return SOLDIER_NPC_MAP.computeIfAbsent(type, t -> switch (t) {
            case "horseback" -> new HorsebackSoldier();
            case "foot" -> new FootSoldier();
            default -> throw new IllegalArgumentException(STR."Invalid soldier type: \{t}");
        });
    }
}
