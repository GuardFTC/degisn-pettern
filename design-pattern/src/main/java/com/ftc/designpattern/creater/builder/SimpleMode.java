package com.ftc.designpattern.creater.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-18 09:52:41
 * @describe: 建造者模式
 */
public class SimpleMode {
    public void main(String[] args) {

        //1.创建指挥者
        Director director = new Director();

        //2.创建宝马汽车
        BMWBuilder bmwBuilder = new BMWBuilder();
        Car bmwCar = director.constructCar(bmwBuilder);
        bmwCar.print();

        //3.创建奥迪汽车
        AudiBuilder audiBuilder = new AudiBuilder();
        Car audiCar = director.constructCar(audiBuilder);
        audiCar.print();
    }
}

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-18 10:11:40
 * @describe: 调度者
 */
class Director {

    public Car constructCar(CarBuilder builder) {
        builder.buildBrand();
        builder.buildEngine();
        builder.buildColor();
        return builder.build();
    }
}

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-18 10:09:52
 * @describe: 汽车建造者抽象类
 */
abstract class CarBuilder {

    protected Car car = new Car();

    public Car build() {
        return car;
    }

    public abstract void buildBrand();

    public abstract void buildEngine();

    public abstract void buildColor();
}

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-18 10:10:33
 * @describe: 宝马builder
 */
class BMWBuilder extends CarBuilder {

    @Override
    public void buildBrand() {
        car.setBrand("BMW");
    }

    @Override
    public void buildEngine() {
        car.setEngine("V8");
    }

    @Override
    public void buildColor() {
        car.setColor("white");
    }
}

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-18 10:11:07
 * @describe: 奥迪builder
 */
class AudiBuilder extends CarBuilder {

    @Override
    public void buildBrand() {
        car.setBrand("Audi");
    }

    @Override
    public void buildEngine() {
        car.setEngine("V6");
    }

    @Override
    public void buildColor() {
        car.setColor("black");
    }
}

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-18 10:08:36
 * @describe: 汽车产品
 */
@Setter
@Getter
class Car {

    private String brand;
    private String engine;
    private String color;

    public void print() {
        System.out.println(STR."Car{brand='\{brand}', engine='\{engine}', color='\{color}'}");
    }
}

