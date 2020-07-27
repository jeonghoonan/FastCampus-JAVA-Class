package com.company;

/**
 * 자료형 (Data Type)
 * 자료형 - 기본형 (Primitive Type), 참조형 (Reference Type)
 * 기본형 자로형 - 정수형, 싫수형, 문자형. 논리형
 * 참조형 자로형 - 문자열 (String)
 */

public class Main {

    public static void main(String[] args) {
        // 정수형 : byte, short, int, long
        // 1 byte 는 8 bit
        System.out.println("Byte");
        System.out.println(Byte.BYTES);
        byte byteValue = 42;
        System.out.println(byteValue);
        System.out.println(Byte.MAX_VALUE); // 2^7 - 1
        System.out.println(Byte.MIN_VALUE); // -2^7
        byte byteValue1 = 127; // byte byteValue1 = 128; 하면은 빨간줄이 생김
        System.out.println("");

        System.out.println("Short");
        System.out.println(Short.BYTES);
        System.out.println(Short.MAX_VALUE); // 2^15 - 1
        System.out.println(Short.MIN_VALUE); // -2^15
        System.out.println("");

        System.out.println("Int");
        System.out.println(Integer.BYTES); // 4
        System.out.println(Integer.MAX_VALUE); // 2^31 -1
        System.out.println(Integer.MIN_VALUE); // -2^31
        System.out.println("");

        System.out.println("Long");
        System.out.println(Long.BYTES); // 8
        System.out.println(Long.MAX_VALUE); // 2^63 -1
        System.out.println(Long.MIN_VALUE); // -2^63
        System.out.println("");

        // 메모리 할당량 때문에 필요에 따라 적합한 크기의 변수타입들을 사용을 한다

        // Overflow
        // 32667 = 2^15 - 1 => 0111111111111111
        short shortValue = (short)64000;
        System.out.println(shortValue);
        System.out.println("");

        // 정수형은 기본적으로 integer
        // byte byteValue3 = 144;
        short shortA = 10;
        short shortB = 20;
        short shortC = (short)(shortA + shortB); // short 의 범위를 넘어갈때는 (overflow 현상) 그럼 앞에(short)한다

        int bigInt = Integer.MAX_VALUE;
        int biggerInt = bigInt + 1; // overflow 주의
        System.out.println(biggerInt);

        long veryBigInt = 10000000000L;
        System.out.println(veryBigInt);

        // 진수법 - Binary(2진수) , Octal(8) , Decimal(10) , Hexadecimal(16)
        System.out.println(0b1101);
        System.out.println(071);
        System.out.println(1424);
        System.out.println(0x10); // 0~9 10~15: a,b,c,d,e,f
        System.out.println(0xff);

    }
}
