package com.ftc.weixintest.service;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-21 16:44:18
 * @describe: 测试Service
 */
@Service
public class BaseService {

    /**
     * 默认TOKEN
     * TODO 后续将TOKEN写入配置
     */
    private static final String TOKEN = "ftcctv";

    /**
     * 校验服务器URL
     *
     * @param signature 签名
     * @param timestamp 时间戳
     * @param nonce     随机数
     * @param echostr   随机字符串
     * @return 校验结果/true=echostr|false=""
     */
    public String checkUrl(String signature, String timestamp, String nonce, String echostr) {

        //1.校验消息来源
        boolean isWeChatMessage = checkWeChatMessage(signature, timestamp, nonce);

        //4.比较并返回
        return isWeChatMessage ? echostr : StrUtil.EMPTY;
    }

    /**
     * 校验消息来源是否为微信服务器
     *
     * @param signature 签名
     * @param timestamp 时间戳
     * @param nonce     随机数
     * @return 息来源是否为微信服务器
     */
    protected boolean checkWeChatMessage(String signature, String timestamp, String nonce) {

        //1.参数排序
        List<String> params = CollUtil.newArrayList(TOKEN, timestamp, nonce);
        Collections.sort(params);

        //2.拼接为一个字符串
        String allParamStr = CollUtil.join(params, StrUtil.EMPTY);

        //3.SHA1加密
        String sha1Str = SecureUtil.sha1(allParamStr);

        //4.返回
        return sha1Str.equals(signature);
    }
}
