package com.ftc.designpattern.structural.bridge;

/**
 * 高级遥控器 - 扩展抽象
 */
public class AdvancedRemote extends BasicRemote {

    //定义上一个频道      
    private int lastChannel = 1;

    /**
     * 构造函数初始化设备
     *
     * @param device 设备
     */
    public AdvancedRemote(Device device) {
        super(device);
    }

    /**
     * 静音功能
     */
    public void mute() {
        System.out.println("静音");
        // 记住当前音量并设置为0
        device.setVolume(0);
    }

    /**
     * 返回上一个频道功能
     */
    public void returnToPreviousChannel() {
        System.out.println("返回上一个频道");
        super.setChannel(lastChannel);
    }

    /**
     * 快速跳转到指定频道
     *
     * @param favoriteChannels 快捷频道
     * @param index            索引
     */
    public void quickChannelAccess(int[] favoriteChannels, int index) {
        if (index >= 0 && index < favoriteChannels.length) {
            setChannel(favoriteChannels[index]);
        } else {
            System.out.println("无效的快捷频道索引");
        }
    }

    /**
     * 设置频道
     *
     * @param channel 频道
     */
    @Override
    public void setChannel(int channel) {
        // 保存当前频道，以便可以返回
        lastChannel = device.getChannel();
        super.setChannel(channel);
    }
} 