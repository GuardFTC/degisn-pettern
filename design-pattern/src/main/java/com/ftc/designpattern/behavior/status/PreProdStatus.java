package com.ftc.designpattern.behavior.status;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-15 09:26:09
 * @describe: 预发布状态
 */
public class PreProdStatus implements ProjectStatus {

    @Override
    public void execute(ProjectContext projectContext) {

        //1.灰度发布项目
        System.out.println("灰度发布中...");
        System.out.println("灰度发布完成!");

        //2.状态变更
        projectContext.setProjectStatus(new ProdStatus());
    }
}
