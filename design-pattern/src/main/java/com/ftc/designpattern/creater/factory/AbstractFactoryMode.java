/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-17 17:42:39
 * @describe: 抽象工厂模式
 */
public static void main(String[] args) {
    CarFactory bmwFactory = new BMWFactory();
    Car bmw = bmwFactory.createCar();
    Engine bmwEngine = bmwFactory.createEngine();
    bmw.drive();
    bmwEngine.run();

    CarFactory audiFactory = new AudiFactory();
    Car audi = audiFactory.createCar();
    Engine audiEngine = audiFactory.createEngine();
    audi.drive();
    audiEngine.run();
}

interface CarFactory {
    Car createCar();
    Engine createEngine();
}

static class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }
    @Override
    public Engine createEngine() {
        return new BMWEngine();
    }
}

static class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
    @Override
    public Engine createEngine() {
        return new AudiEngine();
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

interface Engine {
    void run();
}

static class BMWEngine implements Engine {
    @Override
    public void run() {
        System.out.println("宝马引擎 is running");
    }
}

static class AudiEngine implements Engine {
    @Override
    public void run() {
        System.out.println("奥迪引擎 is running");
    }
}
