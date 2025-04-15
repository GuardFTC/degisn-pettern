package com.ftc.designpattern.behavior.status;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-15 09:19:05
 * @describe: 项目状态
 */
public interface ProjectStatus {

    /**
     * 执行项目流程
     *
     * @param projectContext 项目上下文
     */
    void execute(ProjectContext projectContext);
}
