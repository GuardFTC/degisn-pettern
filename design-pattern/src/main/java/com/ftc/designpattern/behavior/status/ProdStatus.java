package com.ftc.designpattern.behavior.status;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-15 09:26:16
 * @describe: 发布状态
 */
public class ProdStatus implements ProjectStatus {

    @Override
    public void execute(ProjectContext projectContext) {

        //1.发布项目
        System.out.println("项目发布中...");
        System.out.println("项目发布完成");
    }
}
