package com.ftc.designpattern.behavior.command;

import lombok.Data;

import java.util.List;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-15 15:32:35
 * @describe: 长官(命令调用者)
 */
@Data
public class Commander {

    /**
     * 士兵命令
     */
    private List<Command> soldierCommands;

    /**
     * 发布命令
     */
    public void publishCommand() {
        soldierCommands.forEach(Command::execute);
    }
}
