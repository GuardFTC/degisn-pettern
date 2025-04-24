package com.ftc.designpattern.behavior.chain_of_responsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-24 14:07:35
 * @describe: 入参对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payload {

    /**
     * 参数ID 全局唯一
     */
    private String id;

    /**
     * 年龄
     */
    private int age;

    /**
     * 姓名
     */
    private String name;

    /**
     * 分数
     */
    private double score;

    /**
     * 性别
     */
    private int sex;
}
