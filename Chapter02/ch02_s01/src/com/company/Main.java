package com.company;

/**
 * 변수 (Variable)
 * 변하는 수. 수학의 변수와 유사하다.
 * 변수의 타입, 변수명(XYZ), 값을 할당할수있다.
 * 변수의 선언 (어떤 변수가 존재한다)
 * 변수에 값 할당 (리터럴)
 * 변수명 규칙
 */

public class Main {
    static int STATIC_VARIABLE = 10; // 변하지 않는 수

    public static void main(String[] args) {
        // int 는 정수 10 은 리터럴(순수한 값, 있는 그대로의 상속값)
	    int x;
	    x = 10;
        System.out.println(x);

        int y, z, value;
        int valueOne = 10;
        int valueTwo = 20;

        int valueThree = 100, valueFour = 1000;

        // int int 는 불가능. 그대로는 사용 불가능
        int intOne; // 이건 가능

        // int 4thWord; 숫자를 처음으로 시작은 불가능
        int val2ue1; // 이건 가능

        int 한글도_됩니다; // 가능은 하지만 쓰지마라

        // int fwei&wfe; 특정문자 사용 불가
        int $power; // 왠만하면 쓰지마라

        // code Convention
        int valueOfComputer;
        int camelCase; //  라고 부름
        int lowerCamelCase;
        int UpperCamelCase;
        // int PascalCase; -> class 이름 등... 변수에 사용하지는 않음

        int _8thWord; // 숫자를 앞에 써야할때 _ 를 사용한다
    }
}
