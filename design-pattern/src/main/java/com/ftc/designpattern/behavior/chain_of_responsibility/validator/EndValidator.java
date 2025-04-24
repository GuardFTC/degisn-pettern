package com.ftc.designpattern.behavior.chain_of_responsibility.validator;

import cn.hutool.log.StaticLog;
import com.ftc.designpattern.behavior.chain_of_responsibility.Payload;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-24 14:34:59
 * @describe: 结束校验器
 */
public class EndValidator extends AbstractValidator {

    @Override
    public void doValidate(Payload payload) {

        //1.日志打印
        StaticLog.info("[参数校验]通过 ID:[{}]", payload.getId());
    }
}
