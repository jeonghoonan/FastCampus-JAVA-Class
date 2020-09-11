package part5;

/**
 * 자바의 변수 타입
 *      기본형 타입
 *          논리형 : boolean
 *          문자형 : char
 *          정수형 : byte, short, int, long
 *          실수형 : float, double
 *
 */

/**
 * 참조형 타입은 기본형 타입을 제외한 모든 타입
 *      배열, 클래스도 모두 참조 타입
 */

public class type {
    public static void main(String[] args) {
        int i = 4; // 기본형

//        StringClass str = new StringClass("hello"); // 참조형
                     // new 라는 키워드는 객체를 메모리에 올려줌
                     // 이렇게 메모리에 올라간 객체를 인스턴스 라고 함
                    // 메모리에 올라간 인스턴스를 가리키는 변수, 참조하는 변수, 레퍼런스 하는 변수가 str 이다
                    // 참조, 레퍼런스 한다고하는 것은 변수가 인스턴스를 가지고있는게 아니라 말 그래도 가리킨다는 의미
    }
}
