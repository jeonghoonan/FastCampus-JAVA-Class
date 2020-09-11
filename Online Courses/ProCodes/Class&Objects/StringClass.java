package part5;

/**
 * String 클래스
 *  문자열을 표현하는 자바에서 가장 많이 사용하는 클래스
 *  new 라는 키워드를 사용하지 않아도, 인스턴스를 만들수있음
 *      String 은 메모리를 아끼려면 new 를 사용하지 않는게 좋다
 *  String 은 불변 클래스
 *      불변이란 String이 인스턴스가 될때 가지고 있던 값을 나중에 수정 불가
 */

public class StringClass {
    public static void main(String[] args) {
        // new 연산자를 이용하지 않고 인스턴스를 만드는 경우
        String str1 = "hello";
        String str2 = "hello";
        // str1, str2  는 같은 인스턴스를 가리키고/참조 하고 있다

        // new 연산자를 이용하여 인스턴스를 만들면 인스턴스는 무조건 새롭게 만들어진다
        String str3 = new String("hello");
        String str4 = new String("hello");
        // 무조건 heap영역에 만들어져서 둘은 다르다

        if (str1 == str2) { // 같은 인스턴스를 참조하므로 true
            System.out.println("str1 과 str2 는 같은 레퍼런스입니다");
        }

        if (str1 == str3) { // str1 과 str3 은 서로 다른 인스턴스 참조하니 false
            System.out.println("str3 과 str 1은 같은 레퍼런스입니다.");
        }

        if (str3 == str4) { // str3, 4 는 서로 다른 인스턴스 참조하니 false
            System.out.println("str3 과 str4 는 같은 레퍼런스입니다");
        }
    }
}
