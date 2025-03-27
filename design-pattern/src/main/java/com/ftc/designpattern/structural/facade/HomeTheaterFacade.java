package com.ftc.designpattern.structural.facade;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-29 10:25:00
 * @describe: 家庭影院外观类
 */
public class HomeTheaterFacade {

    /**
     * 灯光系统
     */
    private final Light light;

    /**
     * 音响系统
     */
    private final SoundSystem soundSystem;

    /**
     * 投影仪系统
     */
    private final Projector projector;

    /**
     * 播放器系统
     */
    private final Player player;

    /**
     * 窗帘系统
     */
    private final Curtain curtain;

    /**
     * 构造方法
     *
     * @param light 灯光系统
     * @param soundSystem 音响系统
     * @param projector 投影仪系统
     * @param player 播放器系统
     * @param curtain 窗帘系统
     */
    public HomeTheaterFacade(Light light, SoundSystem soundSystem, Projector projector, Player player, Curtain curtain) {
        this.light = light;
        this.soundSystem = soundSystem;
        this.projector = projector;
        this.player = player;
        this.curtain = curtain;
    }

    /**
     * 一键观影
     *
     * @param movie 电影名称
     */
    public void watchMovie(String movie) {
        System.out.println("=== 准备观看电影: " + movie + " ===");
        
        //1.关闭窗帘
        curtain.close();
        
        //2.调暗灯光
        light.dim();
        
        //3.打开投影仪
        projector.turnOn();
        projector.setInput("HDMI");
        projector.setWideScreenMode();
        
        //4.打开音响
        soundSystem.turnOn();
        soundSystem.setSurroundSound();
        soundSystem.setVolume(15);
        
        //5.打开播放器并播放电影
        player.turnOn();
        player.play(movie);
        
        System.out.println("=== 电影已开始播放，请享受观影体验 ===");
    }

    /**
     * 一键结束观影
     */
    public void endMovie() {
        System.out.println("=== 结束观影，正在关闭家庭影院系统 ===");
        
        //1.停止播放并关闭播放器
        player.stop();
        player.turnOff();
        
        //2.关闭音响
        soundSystem.turnOff();
        
        //3.关闭投影仪
        projector.turnOff();
        
        //4.打开灯光
        light.turnOn();
        
        //5.打开窗帘
        curtain.open();
        
        System.out.println("=== 家庭影院系统已关闭 ===");
    }
} 