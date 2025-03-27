package com.ftc.designpattern.structural.proxy;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-28 11:18:00
 * @describe: 明星经纪人类（静态代理）
 */
public class StarAgent implements Star {

    /**
     * 真实明星 
     */
    private final RealStar star;

    /**
     * 经纪人姓名
     */
    private final String agentName;

    /**
     * 构造方法
     *
     * @param star 真实明星
     * @param agentName 经纪人姓名
     */
    public StarAgent(RealStar star, String agentName) {
        this.star = star;
        this.agentName = agentName;
    }

    @Override
    public void business() {

        //1.经纪人处理商业活动细节
        System.out.println(agentName + ": 我是" + star.getClass().getSimpleName() + "的经纪人，负责谈商业活动细节");
        
        //2.必要时让明星出面
        star.business();
    }

    @Override
    public void signContract() {

        //1.经纪人处理合同细节
        System.out.println(agentName + ": 我负责审核合同条款");
        
        //2.明星签字
        star.signContract();
    }

    @Override
    public void perform() {

        //1.经纪人安排表演
        System.out.println(agentName + ": 我负责安排表演场地和时间");
        
        //2.明星表演
        star.perform();
    }
} 