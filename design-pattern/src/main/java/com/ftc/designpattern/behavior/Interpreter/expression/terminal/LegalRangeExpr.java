package com.ftc.designpattern.behavior.Interpreter.expression.terminal;

import cn.hutool.core.util.ObjectUtil;
import com.ftc.designpattern.behavior.Interpreter.expression.AbstractExpr;

import java.math.BigDecimal;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-29 09:48:31
 * @describe: 范围判定解释器
 */
public class LegalRangeExpr extends AbstractExpr {

    /**
     * 最小值
     */
    private BigDecimal min;

    /**
     * 最大值
     */
    private BigDecimal max;

    /**
     * 构造方法
     *
     * @param field 字段名称
     * @param min   最小值
     * @param max   最大值
     */
    public LegalRangeExpr(String field, BigDecimal min, BigDecimal max) {
        super(field);
        this.min = min;
        this.max = max;
    }

    @Override
    public void doInterpret(String field, Object value) {

        //1.判定值是否为空
        if (ObjectUtil.isNull(value)) {
            return;
        }

        //2.类型转换
        BigDecimal checkValue = new BigDecimal(value.toString());

        //3.范围判定
        if (checkValue.compareTo(min) < 0 || checkValue.compareTo(max) > 0) {
            throw new IllegalArgumentException(STR."字段:\{field} 值:\{value} 不在范围区间内");
        }
    }
}
