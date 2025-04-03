package com.ftc.designpattern.structural.bridge;

/**
 * 基本遥控器 - 扩展抽象
 */
public class BasicRemote extends RemoteControl {

    /**
     * 构造函数初始化设备
     *
     * @param device 设备
     */
    public BasicRemote(Device device) {
        super(device);
    }

    /**
     * 频道上移
     */
    public void channelUp() {
        int currentChannel = device.getChannel();
        setChannel(currentChannel + 1);
    }

    /**
     * 频道下移
     */
    public void channelDown() {
        int currentChannel = device.getChannel();
        setChannel(currentChannel > 1 ? currentChannel - 1 : 1);
    }

    /**
     * 音量上移
     */
    public void volumeUp() {
        int currentVolume = device.getVolume();
        setVolume(Math.min(currentVolume + 5, 100));
    }

    /**
     * 音量下移
     */
    public void volumeDown() {
        int currentVolume = device.getVolume();
        setVolume(Math.max(currentVolume - 5, 0));
    }
} 