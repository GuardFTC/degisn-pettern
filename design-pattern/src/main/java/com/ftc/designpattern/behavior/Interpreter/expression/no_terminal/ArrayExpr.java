package com.ftc.designpattern.behavior.Interpreter.expression.no_terminal;

import cn.hutool.core.collection.CollUtil;
import com.alibaba.fastjson2.JSONArray;
import com.ftc.designpattern.behavior.Interpreter.expression.AbstractExpr;

import java.util.List;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-29 14:33:59
 * @describe: 数组解释器
 */
public class ArrayExpr extends AbstractExpr {

    /**
     * 数组元素解释器
     */
    private List<AbstractExpr> itemExpressions;

    /**
     * 构造函数
     *
     * @param field           字段名称
     * @param itemExpressions 数组元素解释器
     */
    public ArrayExpr(String field, List<AbstractExpr> itemExpressions) {
        super(field);
        this.itemExpressions = itemExpressions;
    }

    @Override
    public void doInterpret(String field, Object value) {

        //1.类型转换
        JSONArray arrayValue = (JSONArray) value;

        //2.为空直接返回
        if (CollUtil.isEmpty(arrayValue)) {
            return;
        }

        //3.校验数组元素
        arrayValue.forEach(item -> itemExpressions.forEach(expression -> expression.doInterpret(field, item)));
    }
}
