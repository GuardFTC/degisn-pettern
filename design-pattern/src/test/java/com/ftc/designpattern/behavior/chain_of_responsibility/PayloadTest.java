package com.ftc.designpattern.behavior.chain_of_responsibility;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.IdUtil;
import com.ftc.designpattern.behavior.chain_of_responsibility.validator.Validator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PayloadTest {

    @Test
    void testValidate() {

        //1.获取验证器链
        Validator validatorChain = ValidatorChain.getValidatorChain();

        //2.正常参数
        validatorChain.validate(new Payload(IdUtil.randomUUID(), 10, "张三", 100.0D, 1));
        System.out.println("---------------------------------------------------------");

        //3.年龄异常
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            validatorChain.validate(new Payload(IdUtil.randomUUID(), 101, "张三", 100.0D, 1));
        });
        Assert.isTrue("年龄区间异常，年龄校验不通过".equals(illegalArgumentException.getMessage()));
        System.out.println("---------------------------------------------------------");

        //4.名称异常
        illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            validatorChain.validate(new Payload(IdUtil.randomUUID(), 10, "", 100.0D, 1));
        });
        Assert.isTrue("姓名为空，或姓名长度>5，姓名校验异常".equals(illegalArgumentException.getMessage()));
        System.out.println("---------------------------------------------------------");

        //5.分数异常
        illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            validatorChain.validate(new Payload(IdUtil.randomUUID(), 10, "张三", 5.0D, 1));
        });
        Assert.isTrue("分数不能低于60分，分数校验异常".equals(illegalArgumentException.getMessage()));
        System.out.println("---------------------------------------------------------");

        //6.性别异常
        illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            validatorChain.validate(new Payload(IdUtil.randomUUID(), 10, "张三", 100.0D, 3));
        });
        Assert.isTrue("性别校验不通过，性别校验异常".equals(illegalArgumentException.getMessage()));
        System.out.println("---------------------------------------------------------");
    }

    @Test
    void testFlyWeight() {
        Assert.isTrue(ValidatorChain.getValidatorChain().equals(ValidatorChain.getValidatorChain()));
    }
}