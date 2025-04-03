package com.ftc.designpattern.structural.bridge;

/**
 * 遥控器 - 抽象部分
 */
public abstract class RemoteControl {

    //保存对设备的引用 - 这就是桥接部分
    protected Device device;

    /**
     * 构造函数初始化设备
     * @param device 设备
     */
    public RemoteControl(Device device) {
        this.device = device;
    }

    /**
     * 开机
     */
    public void turnOn() {
        device.turnOn();
    }

    /**
     * 关机
     */
    public void turnOff() {
        device.turnOff();
    }

    /**
     * 设置频道
     * @param channel 频道
     */
    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    /**
     * 设置音量
     * @param volume 音量
     */
    public void setVolume(int volume) {
        device.setVolume(volume);
    }
} 