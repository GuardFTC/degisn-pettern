package com.ftc.designpattern.structural.decorator;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-19 15:52:31
 * @describe: 窗子房间装饰器类
 */
public class WindowRoomDecorator extends RoomDecorator {

    public WindowRoomDecorator(Room room) {
        super(room);
    }

    @Override
    public void show() {
        room.show();
        System.out.println("8个窗户");
    }
}
