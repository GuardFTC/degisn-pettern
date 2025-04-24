package com.ftc.designpattern.behavior.chain_of_responsibility.validator;

import cn.hutool.log.StaticLog;
import com.ftc.designpattern.behavior.chain_of_responsibility.Payload;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-24 14:22:39
 * @describe: 性别校验器
 */
public class SexValidator extends AbstractValidator {

    @Override
    public void doValidate(Payload payload) {

        //1.如果性别不为0/1，则校验不通过，抛出异常
        if (payload.getSex() != 0 && payload.getSex() != 1) {
            throw new IllegalArgumentException("性别校验不通过，性别校验异常");
        }

        //2.日志打印
        StaticLog.info("[参数校验]性别校验通过 ID:[{}]", payload.getId());
    }
}
