package com.ftc.designpattern.creater.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-18 11:25:01
 * @describe: 链式调用建造者模式
 */
public class ChainMode {

    public static void main(String[] args) {

        //1.建造macbook电脑
        Computer macBook = Computer.builder()
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
class Computer {

    private String cpu;
    private String disk;
    private String graphicsBoard;

    public void print() {
        System.out.println(STR."Computer{cpu='\{cpu}', disk='\{disk}', graphicsBoard='\{graphicsBoard}'}");
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    /**
     * @author: 冯铁城 [17615007230@163.com]
     * @date: 2025-03-18 10:09:52
     * @describe: 电脑建造者
     */
    static class ComputerBuilder {

        private final Computer computer = new Computer();

        public Computer build() {
            return computer;
        }

        public ComputerBuilder cpu(String cpu) {
            computer.setCpu(cpu);
            return this;
        }

        public ComputerBuilder disk(String disk) {
            computer.setDisk(disk);
            return this;
        }

        public ComputerBuilder graphicsBoard(String graphicsBoard) {
            computer.setGraphicsBoard(graphicsBoard);
            return this;
        }
    }
}
