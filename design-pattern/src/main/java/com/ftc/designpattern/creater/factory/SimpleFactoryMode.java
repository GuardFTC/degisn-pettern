/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-17 16:39:20
 * @describe: 简单工厂模式
 */
public static class SimpleFactory {

    /**
     * 创建汽车
     * @param carName 汽车名称
     * @return 汽车
     */
    public static Car createCar(String carName) {
        switch (carName) {
            case "BMW":
                return new BMW();
            case "Audi":
                return new Audi();
            default:
                throw new RuntimeException("不支持该品牌");
        }
    }
}

interface Car {
    void drive();
}

static class BMW implements Car {
    @Override
    public void drive() {
        System.out.println("宝马 is driving");
    }
}

static class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("奥迪 is driving");
    }
}

public static void main(String[] args) {
    Car bmw = SimpleFactory.createCar("BMW");
    bmw.drive();
    Car audi = SimpleFactory.createCar("Audi");
    audi.drive();
}