package com.ftc.designpattern.behavior.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-15 15:25:10
 * @describe: 士兵(命令接收者)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Soldier {

    /**
     * 名称
     */
    private String name;

    /**
     * 向左转
     */
    public void turnLeft() {
        System.out.println(STR."\{name}:向左转");
    }

    /**
     * 向右转
     */
    public void turnRight() {
        System.out.println(STR."\{name}:向右转");
    }

    /**
     * 向后转
     */
    public void turnBack() {
        System.out.println(STR."\{name}:向后转");
    }
}
