package com.ftc.designpattern.behavior.status;

import lombok.Data;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-15 09:19:37
 * @describe: 项目相关上下文
 */
@Data
public class ProjectContext {

    /**
     * 项目状态 初始为开发状态
     */
    private ProjectStatus projectStatus = new DevelopStatus();

    /**
     * 运转项目流程
     */
    public void execute() {
        projectStatus.execute(this);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
    }
}
