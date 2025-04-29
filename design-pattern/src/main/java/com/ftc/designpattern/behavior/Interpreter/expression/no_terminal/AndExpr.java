package com.ftc.designpattern.behavior.Interpreter.expression.no_terminal;

import com.alibaba.fastjson2.JSONObject;
import com.ftc.designpattern.behavior.Interpreter.expression.Expression;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-29 09:58:06
 * @describe: And逻辑解释器
 */
@Data
@AllArgsConstructor
public class AndExpr implements Expression {

    /**
     * 解释器列表
     */
    private List<Expression> expressions;

    @Override
    public void interpret(JSONObject context) {

        //1.循环执行所有解释器，必须全部通过
        expressions.forEach(expression -> expression.interpret(context));
    }
}
