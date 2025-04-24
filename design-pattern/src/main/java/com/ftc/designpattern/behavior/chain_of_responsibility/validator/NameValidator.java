package com.ftc.designpattern.behavior.chain_of_responsibility.validator;

import cn.hutool.core.util.StrUtil;
import cn.hutool.log.StaticLog;
import com.ftc.designpattern.behavior.chain_of_responsibility.Payload;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-24 14:10:47
 * @describe: 姓名校验器
 */
public class NameValidator extends AbstractValidator {

    @Override
    public void doValidate(Payload payload) {

        //1.如果名字为空，或者名字长度超过5，则校验不通过，抛出异常
        if (StrUtil.isBlank(payload.getName()) || payload.getName().length() > 5) {
            throw new IllegalArgumentException("姓名为空，或姓名长度>5，姓名校验异常");
        }

        //2.日志打印
        StaticLog.info("[参数校验]姓名校验通过 ID:[{}]", payload.getId());
    }
}
