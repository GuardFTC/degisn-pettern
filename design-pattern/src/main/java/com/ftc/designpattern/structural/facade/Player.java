package com.ftc.designpattern.structural.facade;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-29 10:20:00
 * @describe: 播放器系统
 */
public class Player {

    /**
     * 打开播放器
     */
    public void turnOn() {
        System.out.println("播放器已打开");
    }

    /**
     * 关闭播放器
     */
    public void turnOff() {
        System.out.println("播放器已关闭");
    }

    /**
     * 播放电影
     *
     * @param movie 电影名称
     */
    public void play(String movie) {
        System.out.println("正在播放电影: " + movie);
    }

    /**
     * 停止播放
     */
    public void stop() {
        System.out.println("播放已停止");
    }
} 