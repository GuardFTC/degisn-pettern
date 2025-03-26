package com.ftc.designpattern.structural.adapter;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-26 15:14:19
 * @describe: 电压适配器 类适配器模式
 */
public class VoltageAdapterV1 extends ChineseGenerator implements JapaneseVoltage {

    @Override
    public int getVoltage110() {
        return getVoltage220() / 2;
    }
}
