package com.ftc.designpattern.structural.bridge;

/**
 * 桥接模式演示
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        System.out.println("===== 桥接模式演示 =====");
        System.out.println("使用基本遥控器控制电视：");
        testDevice(new TV(), false);

        System.out.println("\n使用高级遥控器控制电视：");
        testDevice(new TV(), true);
        
        System.out.println("\n使用基本遥控器控制收音机：");
        testDevice(new Radio(), false);
        
        System.out.println("\n使用高级遥控器控制收音机：");
        testDevice(new Radio(), true);
    }
    
    /**
     * 测试设备
     * @param device 设备
     * @param isAdvanced 是否使用高级遥控器
     */
    public static void testDevice(Device device, boolean isAdvanced) {
        System.out.println("测试: " + device.getClass().getSimpleName());
        
        //1.定义遥控器
        RemoteControl remote;
        if (isAdvanced) {
            remote = new AdvancedRemote(device);
        } else {
            remote = new BasicRemote(device);
        }
        
        //2.测试基本功能
        remote.turnOn();
        remote.setChannel(5);
        remote.setVolume(25);
        
        //3.测试基本遥控器特有功能
        if (remote instanceof BasicRemote) {
            BasicRemote basicRemote = (BasicRemote) remote;
            System.out.println("测试频道和音量调整：");
            basicRemote.channelUp();
            basicRemote.volumeUp();  
            basicRemote.channelDown(); 
            basicRemote.volumeDown();  
        }
        
        //4.测试高级遥控器特有功能
        if (remote instanceof AdvancedRemote) {
            AdvancedRemote advancedRemote = (AdvancedRemote) remote;
            System.out.println("测试高级功能：");
            advancedRemote.setChannel(10);
            System.out.println("设置快捷频道访问...");
            int[] favoriteChannels = {2, 4, 6, 8};
            advancedRemote.quickChannelAccess(favoriteChannels, 2); 
            advancedRemote.mute(); 
            advancedRemote.returnToPreviousChannel(); 
        }
        
        //5.测试关机
        remote.turnOff();
    }
} 