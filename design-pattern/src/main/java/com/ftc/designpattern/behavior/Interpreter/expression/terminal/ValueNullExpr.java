package com.ftc.designpattern.behavior.Interpreter.expression.terminal;

import cn.hutool.core.util.ObjectUtil;
import com.ftc.designpattern.behavior.Interpreter.expression.AbstractExpr;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-29 09:38:25
 * @describe: 值非空解释器
 */
public class ValueNullExpr extends AbstractExpr {

    /**
     * 构造函数
     *
     * @param field 字段名称
     */
    public ValueNullExpr(String field) {
        super(field);
    }

    @Override
    public void doInterpret(String field, Object value) {
        if (ObjectUtil.isNull(value)) {
            throw new IllegalArgumentException(STR."字段:\{field}为空");
        }
    }
}
