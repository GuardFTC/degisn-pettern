package com.ftc.designpattern.behavior.chain_of_responsibility;

import com.ftc.designpattern.behavior.chain_of_responsibility.validator.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-24 14:48:56
 * @describe: 验证器类型枚举
 */
@Getter
@AllArgsConstructor
public enum ValidatorTypeEnum {

    /**
     * 起始验证器
     */
    START,

    /**
     * 结束验证器
     */
    END,

    /**
     * 年龄验证器
     */
    AGE,

    /**
     * 姓名验证器
     */
    NAME,

    /**
     * 分数验证器
     */
    SCORE,

    /**
     * 性别验证器
     */
    SEX,
    ;

    /**
     * 根据类型获取验证器
     *
     * @param type 类型
     * @return 验证器
     */
    public static AbstractValidator getValidator(ValidatorTypeEnum type) {
        return switch (type) {
            case START -> new StartValidator();
            case END -> new EndValidator();
            case AGE -> new AgeValidator();
            case NAME -> new NameValidator();
            case SCORE -> new ScoreValidator();
            case SEX -> new SexValidator();
        };
    }
}
