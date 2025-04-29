package com.ftc.designpattern.behavior.Interpreter.expression;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.Assert;
import com.alibaba.fastjson2.JSONObject;
import com.ftc.designpattern.behavior.Interpreter.expression.no_terminal.AndExpr;
import com.ftc.designpattern.behavior.Interpreter.expression.no_terminal.ArrayExpr;
import com.ftc.designpattern.behavior.Interpreter.expression.no_terminal.ObjectExpr;
import com.ftc.designpattern.behavior.Interpreter.expression.terminal.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ExpressionTest {

    @Test
    void testLegal() {

        //1.定义待校验JSON
        JSONObject context = JSONObject.parseObject("{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 28,\n" +
                "  \"address\": {\n" +
                "    \"street\": \"123 Main St\"\n" +
                "  },\n" +
                "  \"tags\": [\n" +
                "    { \"label\": \"developer\" },\n" +
                "    { \"label\": \"blogger\" },\n" +
                "    { \"label\": \"traveler\" }\n" +
                "  ]\n" +
                "}");

        //2.构建校验表达式
        AndExpr expression = new AndExpr(CollUtil.newArrayList(
                new ValueNotBlankExpr("name"),
                new LegalStringLengthExpr("name", 4, 20),
                new ValueNullExpr("age"),
                new LegalRangeExpr("age", new BigDecimal(18), new BigDecimal(60)),
                new ValueNullExpr("address"),
                new ObjectExpr("address", CollUtil.newArrayList(
                        new ValueNotBlankExpr("street"),
                        new LegalStringLengthExpr("street", 10, 30)
                )),
                new ValueNotEmptyExpr("tags"),
                new ArrayExpr("tags", CollUtil.newArrayList(
                        new ObjectExpr("", CollUtil.newArrayList(
                                new ValueNullExpr("label"),
                                new LegalStringLengthExpr("label", 4, 20)
                        ))
                ))
        ));

        //3.校验
        expression.interpret(context);
    }

    @Test
    void testBlank() {

        //1.定义待校验JSON
        JSONObject context = JSONObject.parseObject("{\n" +
                "  \"name\": \"\",\n" +
                "  \"age\": 28,\n" +
                "  \"address\": {\n" +
                "    \"street\": \"123 Main St\"\n" +
                "  },\n" +
                "  \"tags\": [\n" +
                "    { \"label\": \"developer\" },\n" +
                "    { \"label\": \"blogger\" },\n" +
                "    { \"label\": \"traveler\" }\n" +
                "  ]\n" +
                "}");

        //2.构建校验表达式
        AndExpr expression = new AndExpr(CollUtil.newArrayList(
                new ValueNotBlankExpr("name"),
                new LegalStringLengthExpr("name", 4, 20),
                new ValueNullExpr("age"),
                new LegalRangeExpr("age", new BigDecimal(18), new BigDecimal(60)),
                new ValueNullExpr("address"),
                new ObjectExpr("address", CollUtil.newArrayList(
                        new ValueNotBlankExpr("street"),
                        new LegalStringLengthExpr("street", 10, 30)
                )),
                new ValueNotEmptyExpr("tags"),
                new ArrayExpr("tags", CollUtil.newArrayList(
                        new ObjectExpr("", CollUtil.newArrayList(
                                new ValueNullExpr("label"),
                                new LegalStringLengthExpr("label", 4, 20)
                        ))
                ))
        ));

        //3.校验
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> expression.interpret(context));
        Assert.isTrue(exception.getMessage().equals("字段:name为空"));
    }

    @Test
    void testLengthIllegal() {

        //1.定义待校验JSON
        JSONObject context = JSONObject.parseObject("{\n" +
                "  \"name\": \"Doe\",\n" +
                "  \"age\": 28,\n" +
                "  \"address\": {\n" +
                "    \"street\": \"123 Main St\"\n" +
                "  },\n" +
                "  \"tags\": [\n" +
                "    { \"label\": \"developer\" },\n" +
                "    { \"label\": \"blogger\" },\n" +
                "    { \"label\": \"traveler\" }\n" +
                "  ]\n" +
                "}");

        //2.构建校验表达式
        AndExpr expression = new AndExpr(CollUtil.newArrayList(
                new ValueNotBlankExpr("name"),
                new LegalStringLengthExpr("name", 4, 20),
                new ValueNullExpr("age"),
                new LegalRangeExpr("age", new BigDecimal(18), new BigDecimal(60)),
                new ValueNullExpr("address"),
                new ObjectExpr("address", CollUtil.newArrayList(
                        new ValueNotBlankExpr("street"),
                        new LegalStringLengthExpr("street", 10, 30)
                )),
                new ValueNotEmptyExpr("tags"),
                new ArrayExpr("tags", CollUtil.newArrayList(
                        new ObjectExpr("", CollUtil.newArrayList(
                                new ValueNullExpr("label"),
                                new LegalStringLengthExpr("label", 4, 20)
                        ))
                ))
        ));

        //3.校验
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> expression.interpret(context));
        Assert.isTrue(exception.getMessage().equals("字段:name 值:Doe 长度超出范围"));
    }

    @Test
    void testNull() {

        //1.定义待校验JSON
        JSONObject context = JSONObject.parseObject("{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"address\": {\n" +
                "    \"street\": \"123 Main St\"\n" +
                "  },\n" +
                "  \"tags\": [\n" +
                "    { \"label\": \"developer\" },\n" +
                "    { \"label\": \"blogger\" },\n" +
                "    { \"label\": \"traveler\" }\n" +
                "  ]\n" +
                "}");

        //2.构建校验表达式
        AndExpr expression = new AndExpr(CollUtil.newArrayList(
                new ValueNotBlankExpr("name"),
                new LegalStringLengthExpr("name", 4, 20),
                new ValueNullExpr("age"),
                new LegalRangeExpr("age", new BigDecimal(18), new BigDecimal(60)),
                new ValueNullExpr("address"),
                new ObjectExpr("address", CollUtil.newArrayList(
                        new ValueNotBlankExpr("street"),
                        new LegalStringLengthExpr("street", 10, 30)
                )),
                new ValueNotEmptyExpr("tags"),
                new ArrayExpr("tags", CollUtil.newArrayList(
                        new ObjectExpr("", CollUtil.newArrayList(
                                new ValueNullExpr("label"),
                                new LegalStringLengthExpr("label", 4, 20)
                        ))
                ))
        ));

        //3.校验
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> expression.interpret(context));
        Assert.isTrue(exception.getMessage().equals("字段:age为空"));
    }

    @Test
    void testIllegalRange() {

        //1.定义待校验JSON
        JSONObject context = JSONObject.parseObject("{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 101,\n" +
                "  \"address\": {\n" +
                "    \"street\": \"123 Main St\"\n" +
                "  },\n" +
                "  \"tags\": [\n" +
                "    { \"label\": \"developer\" },\n" +
                "    { \"label\": \"blogger\" },\n" +
                "    { \"label\": \"traveler\" }\n" +
                "  ]\n" +
                "}");

        //2.构建校验表达式
        AndExpr expression = new AndExpr(CollUtil.newArrayList(
                new ValueNotBlankExpr("name"),
                new LegalStringLengthExpr("name", 4, 20),
                new ValueNullExpr("age"),
                new LegalRangeExpr("age", new BigDecimal(18), new BigDecimal(60)),
                new ValueNullExpr("address"),
                new ObjectExpr("address", CollUtil.newArrayList(
                        new ValueNotBlankExpr("street"),
                        new LegalStringLengthExpr("street", 10, 30)
                )),
                new ValueNotEmptyExpr("tags"),
                new ArrayExpr("tags", CollUtil.newArrayList(
                        new ObjectExpr("", CollUtil.newArrayList(
                                new ValueNullExpr("label"),
                                new LegalStringLengthExpr("label", 4, 20)
                        ))
                ))
        ));

        //3.校验
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> expression.interpret(context));
        Assert.isTrue(exception.getMessage().equals("字段:age 值:101 不在范围区间内"));
    }

    @Test
    void testIllegalObjectValue() {

        //1.定义待校验JSON
        JSONObject context = JSONObject.parseObject("{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 28,\n" +
                "  \"address\": {\n" +
                "    \"street\": \"123\"\n" +
                "  },\n" +
                "  \"tags\": [\n" +
                "    { \"label\": \"developer\" },\n" +
                "    { \"label\": \"blogger\" },\n" +
                "    { \"label\": \"traveler\" }\n" +
                "  ]\n" +
                "}");

        //2.构建校验表达式
        AndExpr expression = new AndExpr(CollUtil.newArrayList(
                new ValueNotBlankExpr("name"),
                new LegalStringLengthExpr("name", 4, 20),
                new ValueNullExpr("age"),
                new LegalRangeExpr("age", new BigDecimal(18), new BigDecimal(60)),
                new ValueNullExpr("address"),
                new ObjectExpr("address", CollUtil.newArrayList(
                        new ValueNotBlankExpr("street"),
                        new LegalStringLengthExpr("street", 10, 30)
                )),
                new ValueNotEmptyExpr("tags"),
                new ArrayExpr("tags", CollUtil.newArrayList(
                        new ObjectExpr("", CollUtil.newArrayList(
                                new ValueNullExpr("label"),
                                new LegalStringLengthExpr("label", 4, 20)
                        ))
                ))
        ));

        //3.校验
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> expression.interpret(context));
        Assert.isTrue(exception.getMessage().equals("字段:street 值:123 长度超出范围"));
    }

    @Test
    void testEmpty() {

        //1.定义待校验JSON
        JSONObject context = JSONObject.parseObject("{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 28,\n" +
                "  \"address\": {\n" +
                "    \"street\": \"123 Main St\"\n" +
                "  },\n" +
                "  \"tags\": []" +
                "}");

        //2.构建校验表达式
        AndExpr expression = new AndExpr(CollUtil.newArrayList(
                new ValueNotBlankExpr("name"),
                new LegalStringLengthExpr("name", 4, 20),
                new ValueNullExpr("age"),
                new LegalRangeExpr("age", new BigDecimal(18), new BigDecimal(60)),
                new ValueNullExpr("address"),
                new ObjectExpr("address", CollUtil.newArrayList(
                        new ValueNotBlankExpr("street"),
                        new LegalStringLengthExpr("street", 10, 30)
                )),
                new ValueNotEmptyExpr("tags"),
                new ArrayExpr("tags", CollUtil.newArrayList(
                        new ObjectExpr("", CollUtil.newArrayList(
                                new ValueNullExpr("label"),
                                new LegalStringLengthExpr("label", 4, 20)
                        ))
                ))
        ));

        //3.校验
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> expression.interpret(context));
        Assert.isTrue(exception.getMessage().equals("字段:tags为空"));
    }

    @Test
    void testIllegalArrayItemValue() {

        //1.定义待校验JSON
        JSONObject context = JSONObject.parseObject("{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 28,\n" +
                "  \"address\": {\n" +
                "    \"street\": \"123 Main St\"\n" +
                "  },\n" +
                "  \"tags\": [\n" +
                "    { \"label\": \"per\" },\n" +
                "    { \"label\": \"blogger\" },\n" +
                "    { \"label\": \"traveler\" }\n" +
                "  ]\n" +
                "}");

        //2.构建校验表达式
        AndExpr expression = new AndExpr(CollUtil.newArrayList(
                new ValueNotBlankExpr("name"),
                new LegalStringLengthExpr("name", 4, 20),
                new ValueNullExpr("age"),
                new LegalRangeExpr("age", new BigDecimal(18), new BigDecimal(60)),
                new ValueNullExpr("address"),
                new ObjectExpr("address", CollUtil.newArrayList(
                        new ValueNotBlankExpr("street"),
                        new LegalStringLengthExpr("street", 10, 30)
                )),
                new ValueNotEmptyExpr("tags"),
                new ArrayExpr("tags", CollUtil.newArrayList(
                        new ObjectExpr("", CollUtil.newArrayList(
                                new ValueNullExpr("label"),
                                new LegalStringLengthExpr("label", 4, 20)
                        ))
                ))
        ));

        //3.校验
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> expression.interpret(context));
        Assert.isTrue(exception.getMessage().equals("字段:label 值:per 长度超出范围"));
    }
}