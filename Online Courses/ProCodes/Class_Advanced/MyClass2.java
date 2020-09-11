package Class_Advanced;

/**
 * 메소드 오버로딩
 *  매개변수의 수, 타입이 다른경우 동일한 이름으로 메소드를 여러개 정의할수있다
 */

public class MyClass2 {
    public int plus (int x, int y) {
        return x + y;
    }

    public int plus (int x, int y, int z) {
        return x + y + z;
    }

    public String plus (String x, String y) {
        return x + y;
    }

    // 이들을 메소드 오버로딩 이라고 한다

    // public int plus(int i, int j) { -> 이렇게 하면 에러가 생긴다.
    // public int plus (int x, int y) { -> 매개변수의 이름은 중요하지 않다, 타입이 중요하다
                                     // -> 변수명은 다르지만, 매개변수의 타입과 개수가 동일한 메소드라서 정의할수없다
//
//    }
}

class MethodOverloadExam {
    public static void main(String[] args) {
        MyClass2 m = new MyClass2();

        System.out.println(m.plus(4, 5)); // 9

        System.out.println(m.plus(4, 6, 7)); // 17

        System.out.println(m.plus("hello", "world")); // helloworld

    }
}
