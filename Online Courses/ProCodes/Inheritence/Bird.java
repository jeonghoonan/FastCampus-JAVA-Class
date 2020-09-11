package Inheritence;

/**
 * 추상클래스
 *  구체적이지 않은 클래스. ex) 독수리, 타조는 구체적인 새를 지칭하는데 새, 포유류 같은것은 구체적이지 않다
 *  클래스 앞에 abstract 키워드를 이용해 정의
 *  미완성의 추상 메소드를 포함할수있다
 *  인스턴스를 생성할수없다
 */

public abstract class Bird {
    public abstract void sing();
    public void fly() {
        System.out.println("날다");
    }
}

/**
 * 추상 클래스를 상속받은 클래스는 추상클래스가 가지고있는 추상메소드를 반드시 구현해야한다
 * 추상 클래스를 상속받고, 추상클래스가 갖고있는 메소드를 구현하지않으면 해당 클래스도 추상 클래스가된다
 */
class Duck extends Bird {
    @Override
    public void sing() {
        System.out.println("꽥꽥");
    }
}

class DuckExam {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sing(); // 꽥꽥
        duck.fly(); // 날다
    }
}
