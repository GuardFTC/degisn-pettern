package com.ftc.designpattern.behavior.status;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-15 09:22:07
 * @describe: 开发状态
 */
public class DevelopStatus implements ProjectStatus {

    @Override
    public void execute(ProjectContext projectContext) {

        //1.开发
        System.out.println("项目开发中...");
        System.out.println("项目开发完成!");

        //2.状态变更
        projectContext.setProjectStatus(new TestStatus());
    }
}
