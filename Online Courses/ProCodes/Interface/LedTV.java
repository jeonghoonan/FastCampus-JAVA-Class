package Interface;

public class LedTV implements TV {

    @Override
    public void turnOn() {
        System.out.println("켜다");
    }

    @Override
    public void turnOff() {
        System.out.println("끄다");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("볼륨을 조절하다");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("채널을 조절하다");
    }
}

class LedExam {
    public static void main(String[] args) {
        TV tv = new LedTV();
        tv.turnOn();
        tv.changeChannel(8);
        tv.changeVolume(39);
        tv.turnOff();
    }
}

/**
 *
 */