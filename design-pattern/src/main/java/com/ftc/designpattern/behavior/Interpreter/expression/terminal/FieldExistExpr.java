package com.ftc.designpattern.behavior.Interpreter.expression.terminal;

import com.alibaba.fastjson2.JSONObject;
import com.ftc.designpattern.behavior.Interpreter.expression.Expression;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-29 09:26:59
 * @describe: 字段存在表达式
 */
@Data
@AllArgsConstructor
public class FieldExistExpr implements Expression {

    /**
     * 字段名称
     */
    private String field;

    @Override
    public void interpret(JSONObject context) {
        if (!context.containsKey(field)) {
            throw new IllegalArgumentException(STR."字段:\{field}不存在");
        }
    }
}
