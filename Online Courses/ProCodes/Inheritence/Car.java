package Inheritence;

/**
 * 상속 : 부모가 가진것을 자식에서 물려주는것
 *      노트북은 컴퓨터의 한 종류
 *      침대는 가구의 한 종류
 *      소방차는 자동자이다
 *      이렇게 말할수 있는 관계를 is a 관계 혹은 kind of 관계라고 한다
 */

public class Car {
    // 부모클래스에 메소드 추가하기
    public void run() {
        System.out.println("달리다");
    }
}

/**
 * Car를 상속받은 Bus를 class로 표현하는 방법
 * 클래스뒤에 extends키워드를 적고 부모클래스를 쓰면 부모클래스가 가지고있는것을 상속 받는다
  */
class Bus extends Car {
    public void ppangppang() {
        System.out.println("빵빵");
    }
}

class BusExam {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.run(); // 달리다
        bus.ppangppang(); // 빵빵

        Car car = new Car();
        car.run(); // 달리다

        // car.ppangppang(); // 부모클래스는 자식이 가지고 있는것을 사용하지 못한다
        }
    }
