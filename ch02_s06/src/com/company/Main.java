package com.company;

/**
 * 반복문 (Loops)
 * for 문, while 문
 * 초기화 - 반복문을 실행하기 위해서 증감할 변수를 초기화
 * 조건식 - 반복문을 실행할 조건 (또는 종료할 조건)
 * 실행문 - 조건식이 참(또는 거짓)일 경우 실행할 코드
 * 증감식 - 실행문이 실행된 후에 변수에 증감을 주는 것
 */
public class Main {

    public static void main(String[] args) {
	    // for 문의 기본 문법
        // 보통 i 를 많이쓴다
        //   초기화를 하고;조건식;증감식
        for (int i = 0; i < 5; i++) { // 초기화는 한번만 진행된다 // i <= 4 는 하지않는다
            System.out.println(i); // 실행문
        }
        System.out.println("");

        for (int i = 0; i < 5; i += 2) { // 증감식에 대입 연산자가 들어갈수있다.
            System.out.println(i);
        }
        System.out.println("");

        for (int i = 4; i >= 0; i--) { // 0 부터 4 가 아니라 4 부터 0 까지
            System.out.println(i);
        }
        System.out.println("");

        // nested for 문
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("(%d, %d)\n", i, j);
            }
        } // 5 * 5 = 25

        // for 문을 사용할때 주의할점
        for (int i = 0; i < 5; i++)
            System.out.print(i); // 01234 중괄호가 없기때문에 이렇게 출력 // iterated
        System.out.println(""); // not iterated (반복이 되지않았다)

        // while 문
        // 초기화 를 따로 해줘야 한다
        // while (조건문) {
        //    실행문
        //    증감식
        // }

//        int i = 0; // 이렇게 하면 i 를 다시 선언 할수없다. 외부 라서 그렇다. 또 i 를 선언 할수 없다.
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }

//        i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while(false); // 조건문이 false여도 반드시 한번 실행된다.

        // 제어문 - break continue
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
//                continue; // continue문은 for 문을 돌다가 i 가 3이 될때 if문 안쪽으로 들어온다. 실행문이 그만되고 증감식이 진행이된다.
                break; // break를 만나면 바로 종료를 한다
            }
            System.out.println(i);
        }

        // nested // label(outer // label 은 아무말로 해도된다.
        // 반복문에만 쓸수있다. label
        // for 문이 중첩된 경우에 사용을 한다
        // continue, break 가 콜이되면 가장 가까운 for 문에 동작이된다
        // label있게되면 label이 적혀있는 for 문에 간다
        outer:
        for (int i = 0; i < 5; i++) { // outer 를 j 가 아니라 i를 증감시킨다
            for (int j = 0; j < 5; j++) {
                if (i == 3) {
                    System.out.println("continue called");
                    continue outer;
                }
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
