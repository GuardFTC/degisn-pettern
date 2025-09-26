package com.ftc.designpattern.behavior.expression.no_terminal;

import cn.hutool.core.util.ObjectUtil;
import com.alibaba.fastjson2.JSONObject;
import com.ftc.designpattern.behavior.expression.AbstractExpr;
import com.ftc.designpattern.behavior.expression.Expression;

import java.util.List;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-29 11:32:29
 * @describe: 对象表达式
 */
public class ObjectExpr extends AbstractExpr {

    /**
     * 对象字段解释器集合
     */
    private List<Expression> fieldExpressions;

    /**
     * 构造方法
     *
     * @param field            对象字段
     * @param fieldExpressions 对象字段解释器集合
     */
    public ObjectExpr(String field, List<Expression> fieldExpressions) {
        super(field);
        this.fieldExpressions = fieldExpressions;
    }

    @Override
    public void doInterpret(String field, Object value) {

        //1.为空直接返回
        if (ObjectUtil.isNull(value)) {
            return;
        }

        //2.类型转换
        JSONObject objectValue = (JSONObject) value;

        //3.校验对象字段
        fieldExpressions.forEach(expression -> expression.interpret(objectValue));
    }
}
