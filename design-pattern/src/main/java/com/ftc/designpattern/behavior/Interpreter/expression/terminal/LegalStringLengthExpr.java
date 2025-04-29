package com.ftc.designpattern.behavior.Interpreter.expression.terminal;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.ftc.designpattern.behavior.Interpreter.expression.AbstractExpr;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-29 10:17:56
 * @describe: 字符串长度解释器
 */
public class LegalStringLengthExpr extends AbstractExpr {

    /**
     * 最小长度
     */
    private int minLength;

    /**
     * 最大长度
     */
    private int maxLength;

    /**
     * 构造函数
     *
     * @param field     字段名称
     * @param minLength 最小长度
     * @param maxLength 最大长度
     */
    public LegalStringLengthExpr(String field, int minLength, int maxLength) {
        super(field);
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    @Override
    public void doInterpret(String field, Object value) {

        //1.判定值是否为空
        if (ObjectUtil.isNull(value) || StrUtil.isBlank(value.toString())) {
            return;
        }

        //2.字符串长度判定
        int strLength = value.toString().length();
        if (strLength < minLength || strLength > maxLength) {
            throw new IllegalArgumentException(STR."字段:\{field} 值:\{value} 长度超出范围");
        }
    }
}
