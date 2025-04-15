package com.ftc.designpattern.behavior.command;

import cn.hutool.core.collection.CollUtil;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-15 15:34:47
 * @describe: 命令模式示例代码
 */
public class CommandPatternDemo {

    public static void main(String[] args) {

        //1.创建士兵-命令接收者
        Soldier solider = new Soldier("马冬梅");

        //2.创建命令
        Command turnRightCommand = new TurnRightCommand(solider);
        Command turnLeftCommand = new TurnLeftCommand(solider);
        Command turnBackCommand = new TurnBackCommand(solider);

        //3.创建长官-命令调用者
        Commander commander = new Commander();

        //4.长官发布命令
        commander.setSoldierCommands(CollUtil.newArrayList(turnLeftCommand, turnRightCommand, turnBackCommand));
        commander.publishCommand();
    }
}
