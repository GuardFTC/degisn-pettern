package com.ftc.designpattern.structural.adapter;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-26 15:14:19
 * @describe: 电压适配器 对象适配器模式
 */
public class VoltageAdapterV2 implements JapaneseVoltage {

    private final ChineseGenerator chineseGenerator;

    /**
     * 构造方法
     *
     * @param chineseGenerator 中国发电机
     */
    public VoltageAdapterV2(ChineseGenerator chineseGenerator) {
        this.chineseGenerator = chineseGenerator;
    }

    @Override
    public int getVoltage110() {
        return chineseGenerator.getVoltage220() / 2;
    }
}
