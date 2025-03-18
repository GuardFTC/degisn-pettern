package com.ftc.designpattern.creater.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-18 11:25:01
 * @describe: 链式调用建造者模式
 */
public class LombokChainMode {

    public static void main(String[] args) {

        //1.建造macbook电脑
        Computer1 macBook = Computer1.builder()
                .cpu("M2")
                .disk("SSD")
                .graphicsBoard("AMD")
                .build();
        macBook.print();
    }
}

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-18 10:08:36
 * @describe: 电脑产品
 */
@Setter
@Getter
@Builder
class Computer1 {

    private String cpu;
    private String disk;
    private String graphicsBoard;

    public void print() {
        System.out.println(STR."Computer{cpu='\{cpu}', disk='\{disk}', graphicsBoard='\{graphicsBoard}'}");
    }
}
