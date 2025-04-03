package com.ftc.designpattern.structural.bridge;

/**
 * 设备接口 - 实现部分
 * 定义所有设备都应该实现的基本操作
 */
public interface Device {

    /*
     * 开机
     */
    void turnOn();

    /*
     * 关机
     */
    void turnOff();

    /*
     * 设置频道
     */
    void setChannel(int channel);

    /*
     * 设置音量
     */
    void setVolume(int volume);

    /*
     * 获取频道
     */
    int getChannel();

    /*
     * 获取音量
     */
    int getVolume();
}