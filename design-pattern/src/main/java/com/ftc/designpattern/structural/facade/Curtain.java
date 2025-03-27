package com.ftc.designpattern.structural.facade;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-29 10:22:00
 * @describe: 自动窗帘系统
 */
public class Curtain {

    /**
     * 打开窗帘
     */
    public void open() {
        System.out.println("窗帘已打开");
    }

    /**
     * 关闭窗帘
     */
    public void close() {
        System.out.println("窗帘已关闭，营造黑暗环境");
    }
} 