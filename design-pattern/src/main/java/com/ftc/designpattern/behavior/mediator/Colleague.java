package com.ftc.designpattern.behavior.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-17 16:12:32
 * @describe: 同事（被代理对象）抽象类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Colleague {

    /**
     * 中介者接口变量
     */
    protected Mediator mediator;
}
