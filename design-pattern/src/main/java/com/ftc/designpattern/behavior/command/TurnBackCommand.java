package com.ftc.designpattern.behavior.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-15 15:27:55
 * @describe: 向后转命令
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TurnBackCommand implements Command {

    /**
     * 士兵
     */
    private Soldier solider;

    @Override
    public void execute() {
        solider.turnBack();
    }
}
