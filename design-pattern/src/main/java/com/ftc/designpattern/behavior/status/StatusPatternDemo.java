package com.ftc.designpattern.behavior.status;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-15 09:31:10
 * @describe: 状态模式示例代码
 */
public class StatusPatternDemo {

    public static void main(String[] args) {

        //1.创建项目相关上下文
        ProjectContext projectContext = new ProjectContext();

        //2.开发->测试->灰度发布->上线
        projectContext.execute();
        projectContext.execute();
        projectContext.execute();
        projectContext.execute();
    }
}
