package com.ftc.designpattern.behavior.visitor.elements;

import com.ftc.designpattern.behavior.visitor.visitors.Visitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-21 16:07:11
 * @describe: 控球后卫
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PointGuard implements Element {

    /**
     * 名称
     */
    private String name;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
