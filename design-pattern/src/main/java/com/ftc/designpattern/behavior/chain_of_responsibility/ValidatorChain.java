package com.ftc.designpattern.behavior.chain_of_responsibility;

import cn.hutool.core.lang.Singleton;
import com.ftc.designpattern.behavior.chain_of_responsibility.validator.AbstractValidator;
import com.ftc.designpattern.behavior.chain_of_responsibility.validator.Validator;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-04-24 15:36:27
 * @describe: 验证器链
 */
public class ValidatorChain {

    /**
     * 获取验证器链
     *
     * @return 验证器链
     */
    public static Validator getValidatorChain() {
        return Singleton.get("VALIDATOR_CHAIN", () -> new ValidatorChainBuilder()
                .addValidator(ValidatorFactory.getValidator(ValidatorTypeEnum.START))
                .addValidator(ValidatorFactory.getValidator(ValidatorTypeEnum.AGE))
                .addValidator(ValidatorFactory.getValidator(ValidatorTypeEnum.NAME))
                .addValidator(ValidatorFactory.getValidator(ValidatorTypeEnum.SCORE))
                .addValidator(ValidatorFactory.getValidator(ValidatorTypeEnum.SEX))
                .addValidator(ValidatorFactory.getValidator(ValidatorTypeEnum.END))
                .build());
    }

    /**
     * 验证器链构建者
     */
    public static class ValidatorChainBuilder {

        /**
         * 验证器链起始节点
         */
        private AbstractValidator firstValidator;

        /**
         * 验证器链终止节点
         */
        private AbstractValidator lastValidator;

        /**
         * 添加验证器节点
         *
         * @param validator 验证器节点
         * @return 验证器链构建者
         */
        public ValidatorChainBuilder addValidator(AbstractValidator validator) {

            //1.为空完成节点初始化，否则添加下一个节点
            if (firstValidator == null) {
                firstValidator = validator;
            } else {
                lastValidator.setNextValidator(validator);
            }

            //2.更新最后一个节点
            lastValidator = validator;

            //3.返回构建者,实现链式调用
            return this;
        }

        /**
         * 构建验证器链
         *
         * @return 验证器链
         */
        public AbstractValidator build() {
            return firstValidator;
        }
    }
}
