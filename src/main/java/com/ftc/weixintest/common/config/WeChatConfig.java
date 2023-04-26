package com.ftc.weixintest.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-26 14:44:30
 * @describe: 微信公众号配置
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "wechat")
public class WeChatConfig {

    /**
     * 公众号TOKEN
     */
    private String token;

    /**
     * 订阅事件回复消息内容
     */
    private String subscribeMessage;

    /**
     * 下载APP URL
     */
    private String downloadAppUrl;

    /**
     * 绑定APP URL
     */
    private String bindAppUrl;
}
