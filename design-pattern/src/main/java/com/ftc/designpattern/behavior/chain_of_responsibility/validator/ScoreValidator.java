package com.ftc.designpattern.behavior.chain_of_responsibility.validator;

import cn.hutool.log.StaticLog;
import com.ftc.designpattern.behavior.chain_of_responsibility.Payload;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-24 14:21:03
 * @describe: 分数校验器
 */
public class ScoreValidator extends AbstractValidator {

    @Override
    public void doValidate(Payload payload) {

        //1.如果分数小于60，则校验不通过，抛出异常
        if (payload.getScore() < 60) {
            throw new IllegalArgumentException("分数不能低于60分，分数校验异常");
        }

        //2.日志打印
        StaticLog.info("[参数校验]分数校验通过 ID:[{}]", payload.getId());
    }
}
