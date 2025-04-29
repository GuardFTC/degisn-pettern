package com.ftc.designpattern.behavior.Interpreter.expression.terminal;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.ftc.designpattern.behavior.Interpreter.expression.AbstractExpr;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-29 09:39:48
 * @describe: 值非空解释器
 */
public class ValueNotBlankExpr extends AbstractExpr {

    /**
     * 构造方法
     *
     * @param field 字段
     */
    public ValueNotBlankExpr(String field) {
        super(field);
    }

    @Override
    public void doInterpret(String field, Object value) {
        if (ObjectUtil.isNull(value) || StrUtil.isBlank(value.toString())) {
            throw new IllegalArgumentException(STR."字段:\{field}为空");
        }
    }
}
