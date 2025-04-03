package com.ftc.designpattern.structural.bridge;

/**
 * 收音机类 - 具体实现
 */
public class Radio implements Device {

    //1.定义状态
    private boolean on = false;

    //2.定义音量
    private int volume = 20;

    //3.定义频道
    private int channel = 1;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("收音机开启");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("收音机关闭");
    }

    @Override
    public void setChannel(int channel) {
        if (on) {
            this.channel = channel;
            System.out.println("收音机调整到频率：" + channel + " MHz");
        } else {
            System.out.println("收音机已关闭，无法调整频率");
        }
    }

    @Override
    public void setVolume(int volume) {
        if (on) {
            this.volume = volume;
            System.out.println("收音机音量设置为：" + volume);
        } else {
            System.out.println("收音机已关闭，无法调整音量");
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public int getVolume() {
        return volume;
    }
}