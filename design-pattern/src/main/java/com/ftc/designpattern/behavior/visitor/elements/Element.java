package com.ftc.designpattern.behavior.visitor.elements;

import com.ftc.designpattern.behavior.visitor.visitors.Visitor;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-21 16:01:54
 * @describe: 元素接口
 */
public interface Element {

    /**
     * 接受访问者
     *
     * @param visitor 访问者
     */
    void accept(Visitor visitor);
}
