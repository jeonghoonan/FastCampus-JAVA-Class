package s02;

/**
 * 인터페이스 (Interface)
 * - 클래스가 사용되는 방식 / 접점만을 선언하는 클래스와 유사한 틀
 * - 아무런 구현이 되어 있지 않으먀, 모든 메소드가 추상 메소드
 *
 * 인터페이스의 특징
 * - class 가 아니고 interface 라는 키워드를 사용
 * - 멤버 변수는 항상 "public static final" 이다. (생략 가능)
 * - 멤버 메소드는 항상 "public abstract" 이다. (생략 가능) private abstract 가 있으면 구현할수 없어서 의미가 없다. public abstract이어야함
 * - 클래스 는 하나만 상속 할수 있으나, 인터페이스는 여러개 가능
 *   (extends 쓴 다음에는 하나만 상속)
 *   (그러나 인터페이스 는 가능하다)
 *
 * - 인터페이스 의 상속은 implements 키워드
 */

// public, default 가능
interface IFoo {
    public static final int MEMBER_VAR = 10; // 무조건 public static final 이다. 실수는 대문자로
    int MEMBER_VAR2 = 20; // public static final (이미 이거다)

    public abstract void methodA(int param);
    void methodB(int param); // public abstract 생략 가능
}

class Foo implements IFoo {

    @Override
    public void methodA(int param) {
        System.out.println(param);
    }

    @Override
    public void methodB(int param) {
        System.out.println(param);
    }
}

// interface IFoo <- class Foo
// interface Printable <- class Bar

/**
 * 인터페이스간 의 상속
 * 인터페이스 로 인터페이스 를 상속할 경우, extends 를 사용
 * 클래스 <- 클래스 상속과 달리 다중 상속 가능
 */

interface Walkable {
    void walk();
}

interface Runnable {
    void run();
}

interface Jumpable extends Walkable, Runnable { // 걷고 달린수 있는 사람은 점프도 할수있을꺼다
    void jump();
}

class Jumper implements Jumpable {

    @Override
    public void walk() { System.out.println("walk"); }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void jump() {
        System.out.println("jump");
    }
}

/**
 * JDK 1.8 이후의 인터페이스
 *
 * - 인터페이스에는 default 메소드를 구현할 수 있음
 * - default 메소드는 항상 public 이다
 * - 인터페이스의 철학과 맞지 않으나, 기존에 사용하던 인터페이스가 개선되어, 모든 자식 매소드에 동일하게 구현되어야하는 메소드가 생긴 경우에
 *     쉽게 기능을 추가하기 위해 만들어짐
 */

interface IFooTwo {
    void abstractMethod();
    default void defaultMethod() { // 디폴트 메소드
        System.out.println("Default method");
    }
}

class FooTwo implements IFooTwo {

    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implemented");
    }

    @Override // Overriding not necessary
    public void defaultMethod() {
        System.out.println("Overriden default method");
    }
}

class SuperFoo {
    public void defaultMethod() {
        System.out.println("Default method in Super class");
    }
}

// 인터페이스의 static 메소드
interface IBar {
    static void staticMethod() {
        System.out.println("static method"); // default 메소드 처럼 바로 구현이 된다
    }
}

class Bar implements IBar {

}

class FooThree extends SuperFoo implements IFooTwo {

    @Override
    public void abstractMethod() {
        System.out.println("abstract method implemented");
    }
}

public class Interface {
    public static void main(String[] args) {
        FooTwo footwo = new FooTwo();
        footwo.abstractMethod(); // Abstract method implemented
        footwo.defaultMethod(); // Overriden default method

        FooThree foothree = new FooThree();
        foothree.abstractMethod(); // abstract method implemented
        foothree.defaultMethod(); // Default method in Super class //  부모와 인터페이스에 모두 메소드가 있는 경우에 부모 클래스에 있는 메소드를 실행한다
        // 클래스는 다중 상속이 안된다
        // interface 는 다중 상속 가능
        // 다중 상속 시 문제를 방지하기 위해, 인터페이스보다 일반 상속이 우선시. (일반상속은 다중상속 X)

        IBar.staticMethod(); // 인터페이스명으로 클래스 메소드 호출 가능
        // Bar.staticMethod(); // 구현체인 자식 클래스로는 클래스 메소드 호출 불가
    }
}
