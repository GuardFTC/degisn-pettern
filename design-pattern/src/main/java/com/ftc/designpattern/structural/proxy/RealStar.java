package com.ftc.designpattern.structural.proxy;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-28 11:16:30
 * @describe: 真实明星类
 */
public class RealStar implements Star {

    private final String name;

    /**
     * 构造方法
     *
     * @param name 明星姓名
     */
    public RealStar(String name) {
        this.name = name;
    }

    @Override
    public void business() {
        System.out.println(name + ": 我很忙，没时间谈商业活动的细节");
    }

    @Override
    public void signContract() {
        System.out.println(name + ": 签字");
    }

    @Override
    public void perform() {
        System.out.println(name + ": 精彩表演");
    }
} 