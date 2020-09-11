package Inheritence;

/**
 * super 키워드 : 부모 객체를 나타내는 키워드
 *  class 가 인스턴스화 될때 생성자가 실행되면서 객체의 초기화를 한다. 그때 자신의 생성자만 실행이 되는게 아니고, 부모의 생성자부터 실행
 * this 키워드 : 나를 가르키는 키워드
 */

// 부모 생성자
public class Car1 {
    public Car1(String name) {
        System.out.println("Car1의 name 생성자 입니다");
    }
}

class Truck extends Car1 {
    public Truck() {
        super("소방차");
        System.out.println("Truck의 기본 생성자 입니다");
    }
}

// 생성자 테스트
class TruckExam {
    public static void main(String[] args) {
        Truck t = new Truck(); // Car1, Truck 의 기본생성자 입니다
        /**
         * new 연산자로 Bus 객체를 생성하면, Bus 객체가 메모리에 올라갈때 부모인 Car도 함께 메모리에 올라간다
         * 생성자는 객체를 초기화한다
         * 생성자가 호출될때 자동으로 부모의 생성자가 호출되면서 부모객체를 초기화 한다
         */

//        Car1 c = new Car1();
    }
}