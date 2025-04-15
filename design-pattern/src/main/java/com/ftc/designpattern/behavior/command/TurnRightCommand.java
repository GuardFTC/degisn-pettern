package com.ftc.designpattern.behavior.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-15 15:31:11
 * @describe: 向右转命令
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TurnRightCommand implements Command {

    /**
     * 士兵
     */
    private Soldier solider;

    @Override
    public void execute() {
        solider.turnRight();
    }
}
