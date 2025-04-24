package com.ftc.designpattern.behavior.chain_of_responsibility.validator;

import com.ftc.designpattern.behavior.chain_of_responsibility.Payload;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-24 16:26:27
 * @describe: 校验器接口
 */
public interface Validator {

    /**
     * 校验参数
     *
     * @param payload 校验数据
     */
    void validate(Payload payload);
}
