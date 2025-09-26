package com.ftc.designpattern.behavior.expression;

import com.alibaba.fastjson2.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-29 14:12:15
 * @describe: 抽象终端解释器
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractExpr implements Expression {

    /**
     * 字段名称
     */
    public String field;

    @Override
    public void interpret(JSONObject context) {

        //1.获取字段值
        Object value = context.get(field);

        //2.解释器校验字段值
        doInterpret(field, value);
    }

    /**
     * 抽象解释方法
     *
     * @param field 字段名称
     * @param value 字段值
     */
    public abstract void doInterpret(String field, Object value);
}
