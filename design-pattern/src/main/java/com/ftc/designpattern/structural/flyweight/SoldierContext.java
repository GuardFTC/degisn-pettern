package com.ftc.designpattern.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-10 15:12:38
 * @describe: 士兵上下文
 */
@Data
@AllArgsConstructor
public class SoldierContext {

    /**
     * 士兵武器
     */
    private String weapon;

    /**
     * 士兵装备
     */
    private String equipment;

    /**
     * 士兵肤色
     */
    private String skinColor;
}
