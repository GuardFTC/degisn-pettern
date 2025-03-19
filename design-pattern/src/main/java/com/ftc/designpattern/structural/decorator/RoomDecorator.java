package com.ftc.designpattern.structural.decorator;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-19 15:45:53
 * @describe: 房间装饰器类
 */
public abstract class RoomDecorator implements Room {

    protected Room room;

    public RoomDecorator(Room room) {
        this.room = room;
    }

    @Override
    public void show() {
        room.show();
    }
}
