package com.ftc.designpattern.creater.prototype;

import cn.hutool.core.util.ObjectUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-18 14:56:27
 * @describe: 原型模式
 */

class PrototypeMode {

    public static void main(String[] args) {

        //1.创建NPC对象
        NPC originalNpc = new NPC("邪剑仙");

        //2.拷贝NPC对象
        NPC cloneNpc = (NPC) originalNpc.clone();
        cloneNpc.setName("重楼");

        //3.控制台输出
        System.out.println("原始NPC对象：" + originalNpc.getName());
        System.out.println("复制NPC对象：" + cloneNpc.getName());
    }
}

interface Prototype {

    /**
     * 拷贝
     *
     * @return 原型对象
     */
    Prototype clone();
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class NPC implements Prototype, Serializable {

    private String name;

    @Override
    public Prototype clone() {
        return ObjectUtil.clone(this);
    }
}
