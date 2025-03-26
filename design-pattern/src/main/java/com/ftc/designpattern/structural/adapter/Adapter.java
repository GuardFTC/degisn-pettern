package com.ftc.designpattern.structural.adapter;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-26 15:19:14
 * @describe: 适配器模式
 */
public class Adapter {

    public static void main(String[] args) {

        //1.类适配器模式
        JapaneseVoltage japaneseVoltage1 = new VoltageAdapterV1();
        System.out.println(STR."类适配器模式 电压转化:\{japaneseVoltage1.getVoltage110()}V");

        //2.对象适配器模式
        ChineseGenerator chineseGenerator = new ChineseGenerator();
        JapaneseVoltage japaneseVoltage2 = new VoltageAdapterV2(chineseGenerator);
        System.out.println(STR."对象适配器模式 电压转化:\{japaneseVoltage2.getVoltage110()}V");
    }
}
