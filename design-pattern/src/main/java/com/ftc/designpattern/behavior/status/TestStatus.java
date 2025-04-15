package com.ftc.designpattern.behavior.status;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-15 09:25:33
 * @describe: 测试状态
 */
public class TestStatus implements ProjectStatus {

    @Override
    public void execute(ProjectContext projectContext) {

        //1.测试项目
        System.out.println("项目测试中...");
        System.out.println("项目测试完成!");

        //2.变更状态
        projectContext.setProjectStatus(new PreProdStatus());
    }
}
