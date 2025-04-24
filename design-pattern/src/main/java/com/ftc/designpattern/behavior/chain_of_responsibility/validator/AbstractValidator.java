package com.ftc.designpattern.behavior.chain_of_responsibility.validator;

import com.ftc.designpattern.behavior.chain_of_responsibility.Payload;
import lombok.Data;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-24 14:06:19
 * @describe: 抽象校验器
 */
@Data
public abstract class AbstractValidator implements Validator {

    /**
     * 下一个校验器
     */
    private AbstractValidator nextValidator;

    /**
     * 设置下一个校验器
     *
     * @param nextValidator 下一个校验器
     * @return 校验器自身
     */
    public AbstractValidator setNextValidator(AbstractValidator nextValidator) {
        this.nextValidator = nextValidator;
        return this;
    }

    @Override
    public void validate(Payload payload) {

        //1.执行校验逻辑
        doValidate(payload);

        //2.调用下一个校验器
        AbstractValidator nextValidator = getNextValidator();
        if (nextValidator != null) {
            nextValidator.validate(payload);
        }
    }

    /**
     * 执行具体的参数校验逻辑
     *
     * @param payload 校验数据
     */
    protected abstract void doValidate(Payload payload);
}
