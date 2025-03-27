package com.ftc.designpattern.structural.facade;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-29 10:15:00
 * @describe: 灯光系统
 */
public class Light {

    /**
     * 打开灯光
     */
    public void turnOn() {
        System.out.println("灯光已打开，调整为影院模式");
    }

    /**
     * 关闭灯光
     */
    public void turnOff() {
        System.out.println("灯光已关闭");
    }

    /**
     * 调暗灯光
     */
    public void dim() {
        System.out.println("灯光已调暗，适合观影");
    }
} 