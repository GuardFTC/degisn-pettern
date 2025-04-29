package com.ftc.designpattern.behavior.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-28 09:13:12
 * @describe: 位置备忘录
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationMemento {

    /**
     * 位置
     */
    private String location;
}
