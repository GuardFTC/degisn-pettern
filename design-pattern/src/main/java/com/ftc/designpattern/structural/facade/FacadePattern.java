package com.ftc.designpattern.structural.facade;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-29 10:30:00
 * @describe: 外观模式演示
 */
public class FacadePattern {

    public static void main(String[] args) {

        //1.创建各个子系统
        Light light = new Light();
        SoundSystem soundSystem = new SoundSystem();
        Projector projector = new Projector();
        Player player = new Player();
        Curtain curtain = new Curtain();
        
        //2.创建外观
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(light, soundSystem, projector, player, curtain);
        
        //3.使用外观模式一键观影
        homeTheater.watchMovie("复仇者联盟4：终局之战");
        System.out.println("\n--- 电影播放中 ---\n");
        
        //4.使用外观模式一键结束观影
        homeTheater.endMovie();
        
        //5.不使用外观模式的复杂操作示例
        System.out.println("\n=== 不使用外观模式的复杂操作 ===");
        curtain.close();
        light.dim();
        projector.turnOn();
        projector.setInput("HDMI");
        projector.setWideScreenMode();
        soundSystem.turnOn();
        soundSystem.setSurroundSound();
        soundSystem.setVolume(15);
        player.turnOn();
        player.play("复仇者联盟4：终局之战");
        
        System.out.println("\n--- 电影播放中 ---\n");
        
        player.stop();
        player.turnOff();
        soundSystem.turnOff();
        projector.turnOff();
        light.turnOn();
        curtain.open();
    }
} 