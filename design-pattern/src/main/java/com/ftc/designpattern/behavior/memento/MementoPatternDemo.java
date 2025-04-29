package com.ftc.designpattern.behavior.memento;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-28 09:56:10
 * @describe: 备忘录模式示例代码
 */
public class MementoPatternDemo {

    public static void main(String[] args) {

        //1.创建艾克
        Ike ike = new Ike();
        System.out.println(STR."游戏开始，艾克初始位置:\{ike.getLocation()}");

        //2.艾克移动到中路
        ike.move("中路");
        LocationCaretaker.save("1", ike.createLocationMemento());

        //3.艾克移动到上路
        ike.move("上路");
        LocationCaretaker.save("2", ike.createLocationMemento());

        //4.艾克移动到下路
        ike.move("下路");
        LocationCaretaker.save("3", ike.createLocationMemento());

        //5.艾克移动到野区
        ike.move("野区");
        LocationCaretaker.save("4", ike.createLocationMemento());

        //6.时间回溯，恢复到中路
        ike.restoreLocation(LocationCaretaker.get("1"));
        System.out.println(STR."时间回溯，艾克将位置恢复为:\{ike.getLocation()}");
    }
}
