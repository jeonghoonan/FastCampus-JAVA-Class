package Inheritence;

/**
 * 오버라이딩
 *  부모가 가지고 있는 메소드와 똑같은 모양의 메소드를 자식이 가지고 있는것.
 *  오버라이딩이랑 메소드를 재정의 하는것이다
 */

// run 메소드를 가지고 있는 Car 클래스
public class Car2 {
    public void run() {
        System.out.println("Car2의 run 메소드");
    }
}

// Car 를 상속받는 Bus 클래스
class Bus1 extends Car2 {
    public void run() {
        super.run(); // Car2 의 run 메소드
        System.out.println("Bus1의 run 메소드");
    }
}

class Bus1Exam {
    public static void main(String[] args) {
        Bus1 bus1 = new Bus1();
        bus1.run(); // Bus1 의 run 메소드
    }
}

/**
 * 메소드를 오버라이드 하면 항상 자식클래스에서 정의된 메소드가 호출된다
 * 오버라이딩 한다고해서 부모의 메소드가 사라지는것은 아니다
 *      super 키워드를 이용해 부모의 메소드를 호출할수있다
 */