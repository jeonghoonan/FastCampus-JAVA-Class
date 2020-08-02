package com.company;

import java.util.Scanner;

/**
 * 자료 입출력
 * 출력 - print println printf, 포맷팅 방법
 * 입력 - 키보드 입력 받기
 */

public class Main {

    public static void main(String[] args) {
        // 출력 메소드 // println 은 여러가지 자료형 입력 가능
        System.out.println("String can be printed."); // 문자열도 출력가능
        System.out.println('C'); // 문자 출력 가능
        System.out.println(40234); // 정수도 출력가능
        System.out.println(1.423f); // float 도 출력가능
        System.out.println(1523.124); // double도 가능

        System.out.print("124124\r\n"); // carriage return: 맨 첫글자로 보내는 'new'line. 요즘은 newline하면 케리지도 바로됨
        System.out.println("");

        System.out.printf(""); // 'f' 는 format. 특별한 문자열에서 사용
        System.out.printf("%s is for string\n", "STRING"); // %s 는 string
        System.out.printf("%s %s %s", "123", "1423", "15234"); // %s 할때 뛰어쓰기 해야지 된다
        System.out.printf("%b\n", true); // %b: boolean
        System.out.printf("%d 0x%x 0X%X 0%o\n", 15, 15, 15, 15); // %d: decimal %x:
        System.out.printf("%f\n", 14.23); //%f: float number
        System.out.printf("%f\n", 14/23f);
        System.out.printf("%e\n", 14.423); //%e: 지수표현
        System.out.printf("%c %c\n", 'U', '\u0042'); // %c: 유니코드. u0041: A u0042: B
        System.out.printf("%n"); // new line으로 사용

        // 정수 자릿수 표현
        // -숫자d 는 왼쪽정렬
        System.out.printf("%5d.\n", 10); // 10을 표현하는데 3칸이 뛰어져있음 // .은 그냥 보기 쉽게 할려고. 무시
        System.out.printf("%-5d.\n", 10); // -를 붙이면 좌측정렬
        System.out.printf("%05d\n", 234);
        System.out.printf("%3d\n", 104294); // 최소한 3칸을 확보 길면 상관없음.
        System.out.println("");

        // 실수 자릿수 표현
        System.out.printf("%2.4f\n", 15525234.452342);
        System.out.printf("%5.2f\n", 1.425); // 소수점 아래에서는 반올림됨. 소멸은 안되는게 casting은 아니라서
        System.out.printf("%-5.2f\n", 1.425);

        // 입력 메소드1
        System.out.println("Input methods.");
        Scanner scanner = new Scanner(System.in); // 키보드 시스텤 기본 입력

//        String s1 = scanner.next(); // next는 스캐너에서 받는데 공백으로 구분뒨 String을 입력 받는다.
//        String s2 = scanner.next();
        // this is string
        // 공백으로 구분되는 문자열
        // next() 메소드는 입력을 내용이 있을때 까지 기다린다
        // Blocking 메소드 라고 부른다. (반대로는) non-blocking 메소드 라고 한다.
//        System.out.println(scanner.next()); // "this" 가 반환
//        System.out.println(scanner.next()); // "is"
//        System.out.println(scanner.next()); // "string"

        // 공백으로 구분되는 정수
        // int만 입력 하기로 했으면 숫자만 입력해야한다.
//        System.out.println(scanner.nextInt());
//        System.out.println(scanner.nextInt());
//        System.out.println(scanner.nextInt());
//        System.out.println(scanner.nextInt()); // 자료형 안맞으면 에러가 발생한다

        // TIL 작성하면서 float 이랑 double 해보기

        // nextLine 은 \n(뉴라인으로) 구분이 되는 String을 입력 받는다
        // 키보드에서는 엔터
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());






    }
}
