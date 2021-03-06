package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * MyMath 클래스 구현하기
 * 인스턴스를 생성할 수 없는 MyMath 클래스를 구현하시오.
 *
 * MyMath 클래스는 다음 정적 변수를 가진다.
 * PI = 3.1415927;
 * E = 2.718281;
 *
 * MyMath 클래스는 다음 정적 메소드를 가진다.
 * min - 정수 또는 실수를 여러개 입력받아 최소값을 구한다.
 * max - 정수 또는 실수를 여러개 입력받아 최대값을 구한다.
 * abs - 정수 또는 실수를 입력받아 절대값을 구한다.
 * floor - 실수를 입력받아 내림 연산한 정수를 출력한다.
 * ceil - 실수를 입력받아 올림 연산한 정수를 출력한다.
 *  System.out.println(MyMath.min(2, 3, -4, 6));
 *  System.out.println(MyMath.max(7, 0, 6, 16, -4));
 *  System.out.println(MyMath.abs(5));
 *  System.out.println(MyMath.abs(-2.3));
 *  System.out.println(MyMath.floor(-1.5232));
 *  System.out.println(MyMath.ceil(4.6452));
 */

public class MyMath {

    static double PI = 3.1415927;
    static double E = 2.718281;

    private MyMath() {}

    static double min(double...params) {
        double min = params[0];
        for (int i = 0; i < params.length; i++) {
            if (params[i] < min)
                min = params[i];
        }
        return min;
    }

    static double max(double...params) {
        double max = params[0];
        for (int i = 0; i < params.length; i++) {
            if (params[i] > max)
                max = params[i];
        }
        return max;
    }

    static double abs(double num) {
        return Math.abs(num);
    }

    static double floor(double num) {
        int value = (int) num;
        return value;
    }

    static double ceil(double num) {
        int value = (int) num;
        return value + 1;
    }
}

class MyMathTest {
    public static void main(String[] args) {
        // System.out.println(MyMath()); // should fail
        System.out.println(MyMath.PI);
        System.out.println(MyMath.E);
        System.out.println(MyMath.min(2, 3, -4, 6));
        System.out.println(MyMath.max(7, 0, 6, 16, -4));
        System.out.println(MyMath.abs(5));
        System.out.println(MyMath.abs(-2.3));
        System.out.println(MyMath.floor(-1.5232));
        System.out.println(MyMath.ceil(4.6452));
    }
}