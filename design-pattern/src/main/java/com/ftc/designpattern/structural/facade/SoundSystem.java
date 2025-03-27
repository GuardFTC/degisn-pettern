package com.ftc.designpattern.structural.facade;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-29 10:16:30
 * @describe: 音响系统
 */
public class SoundSystem {

    /**
     * 打开音响
     */
    public void turnOn() {
        System.out.println("音响系统已打开");
    }

    /**
     * 关闭音响
     */
    public void turnOff() {
        System.out.println("音响系统已关闭");
    }

    /**
     * 设置音量
     *
     * @param volume 音量大小
     */
    public void setVolume(int volume) {
        System.out.println("音量已设置为: " + volume);
    }

    /**
     * 设置环绕声模式
     */
    public void setSurroundSound() {
        System.out.println("已设置为环绕声模式");
    }
} 