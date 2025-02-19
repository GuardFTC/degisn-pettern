package com.ftc.deepseek.service;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.StrUtil;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DeepSeekServiceTest {

    @Resource
    private DeepSeekService deepSeekService;

    @Test
    void talk() {

        //1.创建用户信息
        String message = "你好";

        //2.调用AI对话方法
        String content = deepSeekService.talk(message);

        //3.打印响应信息
        Assert.isTrue(StrUtil.isNotBlank(content));
        System.out.println(content);
    }
}