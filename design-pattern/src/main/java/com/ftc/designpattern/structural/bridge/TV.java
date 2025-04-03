package com.ftc.designpattern.structural.bridge;

/**
 * 电视类 - 具体实现
 */
public class TV implements Device {

    //1.定义状态
    private boolean on = false;

    //2.定义音量
    private int volume = 30;

    //3.定义频道
    private int channel = 1;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("电视开机");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("电视关机");
    }

    @Override
    public void setChannel(int channel) {
        if (on) {
            this.channel = channel;
            System.out.println("电视切换到频道：" + channel);
        } else {
            System.out.println("电视已关机，无法切换频道");
        }
    }

    @Override
    public void setVolume(int volume) {
        if (on) {
            this.volume = volume;
            System.out.println("电视音量设置为：" + volume);
        } else {
            System.out.println("电视已关机，无法调整音量");
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