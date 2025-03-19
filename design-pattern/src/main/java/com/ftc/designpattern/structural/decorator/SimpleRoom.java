package com.ftc.designpattern.structural.decorator;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-19 15:49:00
 * @describe: 简单房间
 */
public class SimpleRoom implements Room {

    @Override
    public void show() {
        System.out.println("四面墙");
    }
}
