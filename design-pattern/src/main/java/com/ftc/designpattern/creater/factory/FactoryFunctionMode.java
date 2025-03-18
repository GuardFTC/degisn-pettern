/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-17 16:50:57
 * @describe: 工厂方法模式
 */
public static void main(String[] args) {
    CarFactory bmwFactory = new BMWFactory();
    Car bmw = bmwFactory.createCar();
    bmw.drive();

    CarFactory audiFactory = new AudiFactory();
    Car audi = audiFactory.createCar();
    audi.drive();
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

interface CarFactory {
    Car createCar();
}

static class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }
}

static class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
