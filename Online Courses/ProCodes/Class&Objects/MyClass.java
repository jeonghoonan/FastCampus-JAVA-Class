package part5;

// 매개변수도 없고 리턴하는 값도 없는 형태의 메소드
    // 리턴하는 것이 없을 경우 void 라고 작성한다
public class MyClass {
    public void method1() {
        System.out.println("method1 이 실행됩니다.");
    }

// 정수를 받아들인 후, 리턴하지 않는 메소드
    // 받아들이는 값은 어떤 타입이라도 상관없다
    // 받아 들이는 값의 수는 여러개 일수 있고, 여러개일 경우 콤마(,) 록 구분한다
    public void method2(int x) {
        System.out.println(x + " 를 이용하는 method 2 입니다.");
    }

    // 정수를 받아들인 후, 리턴하지 않는 메소드.
        // 리턴하는 값 앞에 return 이라는 키워드 사용
        // 메소드 이름 앞에는 리턴하는 타입을 적는다
        // 리턴타입은 하나만 사용가능하고, 리턴하는 타입은 어떤 타입이라도 상관없다
    public int method3() {
        System.out.println("method3 이 실행됩니다.");
        return 10;
    }

    // 정수 2개를 매개변수로 받고, 아무것도 반환하지 않는 메소드
    public void method4(int x, int y) {
        System.out.println(x + y + " 를 이용하는 method4입니다.");
    }

    // 정수 한개받고, 정수를 반환하는 메소드
    public int method5(int y) {
        System.out.println(y + " 를 이용하는 method5 입니다.");
        return y * 2;
    }
}

// 메소드를 사용하기 위해서는 메소드가 정의된 클래스가 생성되어야 한다
class MyClassExam {
    public static void main(String[] args) {
        // 객체를 생성할때는 new 연산자를 이용
        MyClass myclass = new MyClass();
        myclass.method1(); // method1 이 실행됩니다
        myclass.method2(10); // 10을 이용한 m2 실행
        myclass.method3(); // 그냥 출력하면 m3실행이다
        int value = myclass.method3(); // 출력이 되고, 리턴해준 값을 value 가 받아서 출력
        System.out.println("m3 이 리턴한 값" + value);
        myclass.method4(5, 10); // 15 를 이용하는 m4입니다.
        int value2 = myclass.method5(55);
        System.out.println("m5 가 리턴한 값은: " + value2); // 55 값을 넣고 그 값에다가 2를 곱한다
    }
}
