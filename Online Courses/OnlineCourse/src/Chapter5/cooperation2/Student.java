package Chapter5.cooperation2;

public class Student {

    String studentName;
    int grade;
    int money;

    // 초기화 하기 위해서 constructor 만든다
    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1250);
        this.money -= 1250;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}

class Bus {

    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) { // 승차 메소드
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "입니다");
    }
}

class Subway {

    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(lineNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "입니다");
    }
}

class TakeTransTest {
    public static void main(String[] args) {

        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Thomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);
        Subway subwayGreen = new Subway(2);
        Subway subwayBlue = new Subway(4);

        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();
        bus500.showBusInfo();

        subwayGreen.showSubwayInfo();
    }
}

