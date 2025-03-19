package com.ftc.designpattern.structural.decorator;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-19 15:54:31
 * @describe: 装饰者模式
 */
public class Decorator {

    public static void main(String[] args) {

        //1.创建简单房间
        Room simpleRoom = new SimpleRoom();
        simpleRoom.show();
        System.out.println("----------------------------------------------------------------------------------------");

        //2.创建门房
        Room doorRoom = new DoorRoomDecorator(simpleRoom);
        doorRoom.show();
        System.out.println("----------------------------------------------------------------------------------------");

        //3.创建窗房
        Room windowRoom = new WindowRoomDecorator(simpleRoom);
        windowRoom.show();
        System.out.println("----------------------------------------------------------------------------------------");

        //4.创建既有门又有窗子的房间
        Room doorAndWindowRoom = new WindowRoomDecorator(doorRoom);
        doorAndWindowRoom.show();
    }
}
