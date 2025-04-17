package com.ftc.designpattern.behavior.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-16 17:55:58
 * @describe: 具体订阅者
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WechatUser implements Subscriber {

    /**
     * 用户名
     */
    private String userName;

    @Override
    public void receiveMessage(String message) {
        System.out.println(STR."\{userName}收到消息:\{message}");
    }
}
