package com.ftc.deepseek.service;

import io.github.pigmesh.ai.deepseek.core.DeepSeekClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-02-19 14:26:37
 * @describe: DeepSeek调用服务类
 */
@Service
@RequiredArgsConstructor
public class DeepSeekService {

    private final DeepSeekClient deepSeekClient;

    public String talk(String message) {
        String content = "系统繁忙，稍后重试";
        try {
            content = deepSeekClient.chatCompletion(message).execute();
        } finally {
            deepSeekClient.shutdown();
        }
        return content;
    }
}
