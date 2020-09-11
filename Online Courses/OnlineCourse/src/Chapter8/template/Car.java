package Chapter8.template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }



    public void washCar() {}

    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}

class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("자율 주행합니다");
        System.out.println("자동차가 스스로 방향을 바꿉니다");

    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춥니다");
    }

    @Override
    public void washCar() {
        System.out.println("스스로 차를 씻습니다");
    }
}

class ManualCar extends Car {

    @Override
    public void drive() {
        System.out.println("사람이 운전합니다");
        System.out.println("사람이 조작합니다");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아서 정지합니다");
    }
}

class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();

        Car manualCar = new ManualCar();
        manualCar.run();
    }
}