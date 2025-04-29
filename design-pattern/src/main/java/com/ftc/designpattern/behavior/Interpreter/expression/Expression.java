package com.ftc.designpattern.behavior.Interpreter.expression;


import com.alibaba.fastjson2.JSONObject;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-29 09:05:46
 * @describe: 解释器接口
 */
public interface Expression {

    /**
     * 解释器方法
     *
     * @param context 解释器上下文
     */
    void interpret(JSONObject context);
}
