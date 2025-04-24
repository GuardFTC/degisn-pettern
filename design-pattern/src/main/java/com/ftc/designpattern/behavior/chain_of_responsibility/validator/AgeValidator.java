package com.ftc.designpattern.behavior.chain_of_responsibility.validator;

import cn.hutool.log.StaticLog;
import com.ftc.designpattern.behavior.chain_of_responsibility.Payload;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-24 14:14:51
 * @describe: 年龄校验器
 */
public class AgeValidator extends AbstractValidator {

    @Override
    public void doValidate(Payload payload) {

        //1.如果年龄大于100或年龄小于0，则校验不通过，抛出异常
        if (payload.getAge() > 100 || payload.getAge() < 0) {
            throw new IllegalArgumentException("年龄区间异常，年龄校验不通过");
        }

        //2.日志打印
        StaticLog.info("[参数校验]年龄校验通过 ID:[{}]", payload.getId());
    }
}
