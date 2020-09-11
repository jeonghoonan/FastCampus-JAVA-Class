package part5;

/**
 * 필드(field) 선언
 * 자동자 = 자동차 이름, 번호를 가지고 있고
 * 자동차 = 달리고, 멈추는 기능이 있다. // 이 들을 속성이라고 하고 자바에서는 Field라고 한다
 */

public class Car {
    // 타입 필드명
    String name;
    int number;
}

/**
 * 자바는 객체를 만들기 위해 반드시 클래스를 먼저 만들어야 한다
 */

class CarExam { // Car.java 라는 파일은 만든다. 자동차 클래스가 생성되었다고 자동차가 만들어 지는것은 아니다
    public static void main(String[] args) {
        Car c1 = new Car(); // new 연산자는 new 연산자 뒤에 나오는 생성자를 이용하여 메모리에 객체를 만들라는 명령
        Car c2 = new Car();
        // 메모리에 만들어진 객체를 인스턴스(Instance)라고 한다
        // Car 라는 인스턴스가 메모리에 2개 만들어진다. 객체별로 name/number 라는 속성을 가진다

        c1.name = "소방차";
        c1.number = 1234;

        c2.name = "구급차";
        c2.number = 1111;

        System.out.println(c1.name); // 소방차
        System.out.println(c1.number); // 1234
        System.out.println("");
        System.out.println(c2.name); // 구급차
        System.out.println(c2.number); // 1111
    }
}

