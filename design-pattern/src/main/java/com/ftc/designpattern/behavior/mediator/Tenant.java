package com.ftc.designpattern.behavior.mediator;

import lombok.Data;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-17 16:18:08
 * @describe: 租客
 */
@Data
public class Tenant extends Colleague {

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
    public Tenant(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    /**
     * 租客退租
     */
    public void rentRefund() {
        mediator.notify(this, "rentRefund");
    }
}
