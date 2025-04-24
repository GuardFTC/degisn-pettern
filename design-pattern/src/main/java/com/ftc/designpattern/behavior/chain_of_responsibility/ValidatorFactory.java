package com.ftc.designpattern.behavior.chain_of_responsibility;

import com.ftc.designpattern.behavior.chain_of_responsibility.validator.AbstractValidator;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-24 14:57:17
 * @describe: 校验器工厂
 */
public class ValidatorFactory {

    /**
     * 校验器Map
     */
    private static final ConcurrentHashMap<ValidatorTypeEnum, AbstractValidator> VALIDATOR_MAP = new ConcurrentHashMap<>();

    /**
     * 获取校验器
     *
     * @param type 校验器类型
     * @return 校验器
     */
    public static AbstractValidator getValidator(ValidatorTypeEnum type) {
        return VALIDATOR_MAP.computeIfAbsent(type, ValidatorTypeEnum::getValidator);
    }
}
