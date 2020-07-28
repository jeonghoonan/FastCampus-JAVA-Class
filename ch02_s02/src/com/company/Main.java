package com.company;

/**
 * 자료형 (Data Type)
 * 자료형 - 기본형 (Primitive Type), 참조형 (Reference Type)
 * 기본형 자로형 - 정수형, 싫수형, 문자형. 논리형
 * 참조형 자로형 - 문자열 (String)
 */

public class Main {

    public static void main(String[] args) {
//        // 정수형 : byte, short, int, long
//        // 1 byte 는 8 bit
//        System.out.println("Byte");
//        System.out.println(Byte.BYTES);
//        byte byteValue = 42;
//        System.out.println(byteValue);
//        System.out.println(Byte.MAX_VALUE); // 2^7 - 1
//        System.out.println(Byte.MIN_VALUE); // -2^7
//        byte byteValue1 = 127; // byte byteValue1 = 128; 하면은 빨간줄이 생김
//        System.out.println("");
//
//        System.out.println("Short");
//        System.out.println(Short.BYTES);
//        System.out.println(Short.MAX_VALUE); // 2^15 - 1
//        System.out.println(Short.MIN_VALUE); // -2^15
//        System.out.println("");
//
//        System.out.println("Int");
//        System.out.println(Integer.BYTES); // 4
//        System.out.println(Integer.MAX_VALUE); // 2^31 -1
//        System.out.println(Integer.MIN_VALUE); // -2^31
//        System.out.println("");
//
//        System.out.println("Long");
//        System.out.println(Long.BYTES); // 8
//        System.out.println(Long.MAX_VALUE); // 2^63 -1
//        System.out.println(Long.MIN_VALUE); // -2^63
//        System.out.println("");
//
//        // 메모리 할당량 때문에 필요에 따라 적합한 크기의 변수타입들을 사용을 한다
//
//        // Overflow
//        // 32667 = 2^15 - 1 => 0111111111111111
//        short shortValue = (short)64000;
//        System.out.println(shortValue);
//        System.out.println("");
//
//        // 정수형은 기본적으로 integer
//        // byte byteValue3 = 144;
//        short shortA = 10;
//        short shortB = 20;
//        short shortC = (short)(shortA + shortB); // short 의 범위를 넘어갈때는 (overflow 현상) 그럼 앞에(short)한다
//
//        int bigInt = Integer.MAX_VALUE;
//        int biggerInt = bigInt + 1; // overflow 주의
//        System.out.println(biggerInt);
//
//        long veryBigInt = 10000000000L;
//        long veryBigInt2 = 100_000_000_000L;
//
//        System.out.println(veryBigInt);
//
//        // 진수법 - Binary(2진수) , Octal(8) , Decimal(10) , Hexadecimal(16)
////        System.out.println(0b1101);
////        System.out.println(071);
////        System.out.println(1424);
////        System.out.println(0x10); // 0~9 10~15: a,b,c,d,e,f
////        System.out.println(0xff);
////        System.out.println("");
////        byte flagByte = 0b00101100;
//
//        // 실수형 float, double
//        System.out.println("float");
//        System.out.println(Float.BYTES); //4
//        System.out.println(Float.MAX_VALUE); // 3.4028235 * 10^38
//        System.out.println(Float.MIN_VALUE); // 1.4 * 10^-45 : resolution
//        System.out.println("");
//
//        System.out.println("double");
//        System.out.println(Double.BYTES); // 8
//        System.out.println(Double.MAX_VALUE); // 1.8 * 10^308
//        System.out.println(Double.MIN_VALUE); // 4.9 10^-324
//        System.out.println("");
//
//
//        float floatVal = 1.4234f;
//        float floatVal2 = (float)1.4234;
//
//        double doubleVal1 = 104.42512341245;
//        double doubleVal2 = 1.423e8;
//        double doubleVal3 = 1.425E8;
//        System.out.println("");
//
//        // 문자형
//        System.out.println("char"); // short
//        System.out.println(Character.BYTES); // 2
//        System.out.println((int)Character.MAX_VALUE); // 2^16 -1
//        System.out.println((int)Character.MIN_VALUE); // 0
//        System.out.println("");
//
//        char charVal = 'A'; // 문자는 '' 으로 묶고 string은 "" 로 묶는다. 대문자 A 는 65이다.
//        System.out.println(charVal);
//        System.out.println((int)charVal);
//        System.out.println('\'');
//        System.out.println('"');
//        System.out.println('\"'); // 습관적으로 이렇게 쓰는게 더 좋음
//
//        System.out.println('\u0041'); // 이거는 16진수이다. 41 -> 65 유니코드 .
//        System.out.println((char)65);
//        System.out.println("");
//
//        // 논리형
//        System.out.println("boolean");
//        System.out.println(Boolean.TRUE);
//        System.out.println(Boolean.FALSE);
//
//        boolean isTrue = true;
//        boolean isFalse = false;
//
//        // isTrue = 1; 이렇게는 쓸수없음. 논리형 리터럴리 아니면 안된다
//        // isFalse = 0; 자바에서는 안된다
//        System.out.println("");
//
//        // 문자열 (String)
//        System.out.println("String");
//
//        String s = "This is a new string.";
//        System.out.println(s);
//
//        String s1 = "This" + " is " + " also " + " a String.";
//        System.out.println(s1);
//
//        int intVal10 = 20;
//        String s2 = "String + Integer = " + intVal10; // 자동으로 String으로 변환 후 연결된다.
//        System.out.println(s2);
//
//        String s3 = "String + Integer = " + Integer.valueOf(intVal10).toString(); // 수동으로 String 변환 후 연결
//        System.out.println(s3);
//        System.out.println("");
//
//        // 형변환 (Type Casting)
//        System.out.println("Casting"); // Casting 을 하면 처리하지 않고 소실이 된다.
//        int intValue = (int)100.9; // 소실이 되기 때문에 100.9 가 100 으로 된다.
//        System.out.println(intValue);

        // Upcasting
//        System.out.println("Upcasting"); // 범위가 작은 쪽 에서 -> 범위가 큰쪽으로 간다 // 정밀도가 낮은쪽에서 -> 정밀도가 큰쪽으로간다(실수)
//        byte byteVal = 10;
//        int intVal = byteVal;
//        intVal = (int)byteVal; // Upcasting은 자동으로 되서 굳이 (int)안해도 된다
//
//        intVal = 10244;
//        long longVal = intVal;
//        longVal = (long)intVal;
//
//        float floatVal = longVal; // long 변수에서 float으로 자동으로 변환된다 float: 4byte, long: 8byte
//        floatVal = (float)longVal; // Upcasting. 자동으로 이루어진다
//
//        double doubleVal = floatVal;
//        doubleVal = (double)floatVal; // 범위, 정밀도가 double이 높아서 Upcasting 한다

        // Downcasting
        long longVal = 104244L;
//        int intVal = longVal; // Downcasting은 자동으로 이루어지지 않는다.
        int intVal = (int)longVal;
        System.out.println(intVal);

        longVal = 100_000_000_000L;
        intVal = (int)longVal;
        System.out.println(intVal); // Downcasting 하면서 상위 비트가 소실됨.

        char charVal = 4123;
        byte byteVal = (byte)charVal;
        System.out.println(byteVal);


    }
}
