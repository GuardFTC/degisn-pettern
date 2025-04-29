package com.ftc.designpattern.behavior.memento;

import cn.hutool.core.map.MapUtil;

import java.util.Map;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-28 09:36:00
 * @describe: 备忘录管理者
 */
public class LocationCaretaker {

    /**
     * 时间-位置备忘录Map
     */
    private static final Map<String, LocationMemento> LOCATION_MAP = MapUtil.newHashMap();

    /**
     * 保存备忘录
     *
     * @param time            时间
     * @param locationMemento 位置备忘录
     */
    public static void save(String time, LocationMemento locationMemento) {
        LOCATION_MAP.put(time, locationMemento);
    }

    /**
     * 获取备忘录
     *
     * @param time 时间
     * @return 获取的备忘录
     */
    public static LocationMemento get(String time) {
        return LOCATION_MAP.get(time);
    }
}
