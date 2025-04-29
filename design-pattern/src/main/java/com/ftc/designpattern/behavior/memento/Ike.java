package com.ftc.designpattern.behavior.memento;

import lombok.Data;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-28 09:12:31
 * @describe: 发起人
 */
@Data
public class Ike {

    /**
     * 位置
     */
    private String location = "泉水";

    /**
     * 移动
     *
     * @param location 位置
     */
    public void move(String location) {
        this.location = location;
        System.out.println(STR."艾克移动，位置:\{location}");
    }

    /**
     * 创建位置备忘录
     *
     * @return 位置备忘录
     */
    public LocationMemento createLocationMemento() {
        return new LocationMemento(location);
    }

    /**
     * 恢复位置
     *
     * @param locationMemento 位置备忘录
     */
    public void restoreLocation(LocationMemento locationMemento) {
        this.location = locationMemento.getLocation();
    }
}
