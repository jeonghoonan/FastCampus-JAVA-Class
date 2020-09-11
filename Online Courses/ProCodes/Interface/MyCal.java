package Interface;

// calculator인터페이스를 구현한 MyCalculator 클래스
public class MyCal implements Calculator {

    @Override
    public int plus(int i, int j) {
        return i + j;
    }

    @Override
    public int multiple(int i, int j) {
        return i * j;
    }

    public int exec2(int i, int j) {
        return i * j;
    }
}

// 인터페이스에서 정의한 static 메소드는 반드시 인터페이스명, 메소드 형식으로 호출해야한다
class MyCalTest {
    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3, 4);
        int i = cal.exec(5, 6);
        System.out.println(i);

        Calculator.exec2(3, 4); // static 메소드 호출
    }
}

/**
 * 인터페이스가 변경되면 인터페이스를 구현하는 모든 클래스들이 해당 메소드를 구현해야 하는 문제가 있다
 *  이를 해결하기 위해 인터페이스에 메소드를 구현해 놓을수 있다
 *  인터페이스에 static 메소드를 선언함으로써 인터페이스를 이용해 간단한 기능을 가지는 유틸리티성 인터페이스를 만들수있게 되었다 
 */
