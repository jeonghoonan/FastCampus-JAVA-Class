package Interface;

/**
 * 인터페이스의 default method
 * default method : 인터페이스가 default키워드로 선언되면 메소드가 구현될수있다.
 * 이를 구현하는 클래스는 default메소드를 오버라이딩 할수있다
 */

public interface Calculator {
    public int plus(int i, int j);
    public int multiple(int i, int j);

    default int exec(int i, int j) { // default로 선언함으로 메소드를 구현할수있다
        return i + j;
    }

    public static int exec2(int i, int j) { // static 메소드
        return i * j;
    }
}

