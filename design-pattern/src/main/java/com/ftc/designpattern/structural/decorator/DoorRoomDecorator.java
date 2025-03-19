package com.ftc.designpattern.structural.decorator;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-19 15:49:41
 * @describe: 门房装饰器
 */
public class DoorRoomDecorator extends RoomDecorator {

    public DoorRoomDecorator(Room room) {
        super(room);
    }

    @Override
    public void show() {
        room.show();
        System.out.println("一个门");
    }
}
