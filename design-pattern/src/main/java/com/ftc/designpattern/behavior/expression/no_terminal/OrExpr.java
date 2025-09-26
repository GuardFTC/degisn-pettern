package com.ftc.designpattern.behavior.expression.no_terminal;

import com.alibaba.fastjson2.JSONObject;
import com.ftc.designpattern.behavior.expression.Expression;
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
public class OrExpr implements Expression {

    /**
     * 解释器列表
     */
    private List<Expression> expressions;

    @Override
    public void interpret(JSONObject context) {

        //1.定义校验结果，用于标识是否存在解释器校验通过
        boolean isValid = false;

        //2.循环执行所有解释器，必须全部通过
        for (Expression expression : expressions) {
            try {
                expression.interpret(context);
                isValid = true;
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //3.判定是否全部校验失败
        if (!isValid) {
            throw new IllegalArgumentException("无任何字段匹配，校验失败");
        }
    }
}
