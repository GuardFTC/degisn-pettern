package com.ftc.designpattern.behavior.mediator;

import lombok.Data;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-17 16:16:00
 * @describe: 出租人
 */
@Data
public class Lessor extends Colleague {

    /**
     * 姓名
     */
    private String name;

    /**
     * 构造方法
     *
     * @param mediator 中介者
     * @param name     姓名
     */
    public Lessor(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    /**
     * 出租房屋
     */
    public void rent() {
        mediator.notify(this, "rent");
    }
}
