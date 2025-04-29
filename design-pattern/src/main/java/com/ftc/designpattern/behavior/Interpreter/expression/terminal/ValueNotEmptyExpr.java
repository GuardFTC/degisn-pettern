package com.ftc.designpattern.behavior.Interpreter.expression.terminal;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import com.ftc.designpattern.behavior.Interpreter.expression.AbstractExpr;

import java.util.Collection;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-29 14:27:03
 * @describe: 值非空解释器
 */
public class ValueNotEmptyExpr extends AbstractExpr {

    /**
     * 构造函数
     *
     * @param field 字段名称
     */
    public ValueNotEmptyExpr(String field) {
        super(field);
    }

    @Override
    public void doInterpret(String field, Object value) {
        if (ObjectUtil.isNull(value) || CollUtil.isEmpty((Collection) value)) {
            throw new IllegalArgumentException(STR."字段:\{field}为空");
        }
    }
}
