package Inheritence;

/**
 * 클래스 형변환
 * 부모타입으로 자식객체를 참조하게 되면 부모가 가지고있는 메소드만 사용할수있다.
 * 자식객체가 가지고있는 메소드나 속성을 사용하고싶다면 형변환 해야한다
 * 객체들끼리도 형변환이 가능하다. 단, 상속관계에 있을때만 가능하다
 * 부모타입으로 자식타입의 객체를 참조할때는 묵시적으로 형변환이 일어난다
 * 부모타입의 객체를 자식타입으로 참조하게 할때는 명시적으로 형변환 해주어야한다.
 *  단, 이렇게 형변환할때에는 부모가 참조하는 인스턴스가 형변환하려는 자식타입일때만 가능하다
 */

public class Car3 {
    public void run() {
        System.out.println("Car3의 run 메소드");
    }
}

class Bus3 extends Car3 {
    public void ppangppang() {
        System.out.println("빵빵");
    }
}

class Bus3Exam {
    public static void main(String[] args) {
        Car3 c = new Bus3();
        c.run(); // Car3의 run 메소드
        // c.ppangppang();

        Bus3 bus3 = (Bus3)c;
        bus3.run();
        bus3.ppangppang();
    }
}