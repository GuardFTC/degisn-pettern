package com.ftc.designpattern.structural.facade;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-29 10:18:00
 * @describe: 投影仪系统
 */
public class Projector {

    /**
     * 打开投影仪
     */
    public void turnOn() {
        System.out.println("投影仪已打开");
    }

    /**
     * 关闭投影仪
     */
    public void turnOff() {
        System.out.println("投影仪已关闭");
    }

    /**
     * 设置输入源
     *
     * @param source 输入源
     */
    public void setInput(String source) {
        System.out.println("投影仪输入源已设置为: " + source);
    }

    /**
     * 设置宽屏模式
     */
    public void setWideScreenMode() {
        System.out.println("投影仪已设置为宽屏模式");
    }
} 