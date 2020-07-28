package com.company;

/**
 * 연산자 (Operator)
 * 연산자 (Operator), 피연산자(Operand) -> 연산식(Expression) // 현업에서 많이 쓰인다 expression
 *      사칙연산 : + - * /
 *      비교연산 : > < <= >=
 *      논리 연산자
 *      증감 연산자
 *      증감 연산자
 *      삼항 연산자
 *      비트 연산자
 */
public class Main {

    public static void main(String[] args) {
	// 사칙연산

        int x = 10, y = 20, z;

        z = x + y; // +: 연산자, x: 피연산자, y: 피연산자, x + y: 연산식(Expression) // 2항 연산자 라고 한다
                   // =: 연산자 z: 피연산자, x + y: 피연산자
        // 대입 연산자는 실행이 가장 늦다.
        System.out.println(z);

        System.out.println("정수형 사칙 연산");
        System.out.println(20 - 5);
        System.out.println(5 - 20);
        System.out.println(10 * 662);
        System.out.println(150 / 8); // 정수 나누기 -> 몫. 소수값은 나오지 않는다.
        System.out.println(150 % 8); // modulus, 나머지
        System.out.println("");

        System.out.println("실수형 사칙 연산");
        System.out.println(10.0 + 52.3);
        System.out.println(10.5f + 12.3); // (float, double)정수랑 실수랑 같이 계산이 되면, double 로 변환 후 연산
        System.out.println(10.4 - 50); // 실수형, 정수형을 같이 연산하면 실수형으로 변환 후 연산
        System.out.println(10.2 * 4.2);
        System.out.println(150 / 8.0); // 실수로 나누면 소수점까지 계산이 이루어진다
        System.out.println(5.2 / 1.2); // 몫이 아니고 실수값으로 계산이 된다
        System.out.println(5.2 % 1.2); // 실수 나눗셈도 modulus 연산으로 나머지 계산이 가능하다
        System.out.println("");

        System.out.println("사칙연산의 주의사항");
        System.out.println(Integer.MAX_VALUE / 2 * 3); // overflow 현상
        System.out.println(Integer.MAX_VALUE); // 가장 큰 값
        System.out.println(Integer.MAX_VALUE + 1); // 가장 큰 값에서 overflow 발생 시 가장 작은 값이 된다

        int maxVal = 0b01111111111111111111111111111111;
        int minVal = 0b10000000000000000000000000000000;
        System.out.println(maxVal);
        System.out.println(minVal);

        // 1's C

        System.out.println((6 - 5.9) * 10); // 6.0은 정밀도가 떨어지는 숫자다
        System.out.println(Math.floor((6 - 5.9) * 10)); // 정밀도 문제

        System.out.println();

        System.out.println(40 / 0.0); // 에러는 나지는 않지만 인피니티로 나타남 // Infinity // 수식으로는 문제가 안생기지만 값으로 생김
        System.out.println(40 % 0.0); // NaN. 계산 자체가 안된다
        System.out.println("");

        // 대입 연산자
        z = x + y;
        z += 10; // z = z + 10; 을 줄인말
        z %= 2;
        // 논리연산자, 비트연산자 등등 다 됨

        // 비교 연산자
        System.out.println("비교 연산자"); // 출력이 boolean으로 나온다
        System.out.println(10 > 20);
        System.out.println(10 < 20);
        System.out.println(10 >= 10);

        x = 10;
        y = 10;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println("");

        // 논리연산자 - 입출력이 모두 boolean
        // a AND b : a, b 모두 참일때만 참
        // a OR b : a 또는 b 둘중 하나만 참이어도 참
        // a XOR b : a 또는 b 둘중 하나만 참이어야 참 // exclusive or, 베타적 OR
        // NOT a : a가 참이면 거짓, 거짓이면 참 // 단항연산자
        System.out.println(10 < 20 & 40 >= 20); // AND
        System.out.println(40 < 2 | 1 > 0); //  OR
        System.out.println(!(10 > 20)); // NOT
        System.out.println(10 > 2 ^ 5 < 2); // XOR
        System.out.println("");

        // short-circuit 더 빠르다
        System.out.println(10 < 20 && 4 < 2);
        System.out.println(2 > 8 || 2 < 5);

        // 증감 연산자 - 단항 연산자
        int val = 0;

        System.out.println(val++); // ++가 뒤에 붙어있으면 Expression(연산식) // val = 0으로 먼저 Expression 평가 후에 val += 1적용
        // sout(val);
        // val += 1;
        System.out.println(++val); // va += 1 을 먼저 계산한 후에 Expression 평가
        // val += 1;
        // sout(val);
        System.out.println(val--);
        // sout(val);
        // val -- 1;
        System.out.println(--val);
        // val -= 1;
        // sout(val);

        val = 5;
        int new_val = val++ * 10 + --val;
        System.out.println(new_val);
        System.out.println("");

        // 삼항 연산자
        // (cond)?(true expression):(false expression)
        // boolean        값                값
        System.out.println(true?1:0);
        System.out.println(false?1:0);

        x = 10;
        y = 13;
        System.out.println(x > y?x:y); // max function
        System.out.println(x < y?x:y); // min function

        // 비트 연산자
        // 정수형 연산에 사용
        System.out.printf("b%32s\n", Integer.toBinaryString(8));
        System.out.printf("b%32s\n", Integer.toBinaryString(8 >> 1)); // shift 연산자
        System.out.printf("b%32s\n", Integer.toBinaryString(7));
        System.out.printf("b%32s\n", Integer.toBinaryString(1423));
        System.out.printf("b%32s\n", Integer.toBinaryString(1423 >> 2));
        System.out.printf("b%32s\n", Integer.toBinaryString(1423 >> 4));
        System.out.printf("b%32s\n", Integer.toBinaryString(1423 << 2));
        System.out.printf("b%32s\n", Integer.toBinaryString(1423 << 4)); // shift 연산자

        System.out.printf("b%32s\n", Integer.toBinaryString(-1));
        System.out.printf("b%32s\n", Integer.toBinaryString(-1 >> 1));
        System.out.printf("b%32s\n", Integer.toBinaryString(-1 >>> 1)); // sign 비트와 무관하게 0으로 채움(규칙)

        int intVal = 4123;
        intVal >>= 2; // intVal = intVal >> 2; Shift 연산자도 대입연산자 가능
        intVal |= 412; // intVal = intVal | 412; Bitwise 연산자도 대입연산자 가능

        System.out.printf("b%32s\n", Integer.toBinaryString(1252));
        System.out.printf("b%32s\n", Integer.toBinaryString(15234));
        System.out.printf("b%32s\n", Integer.toBinaryString(1252 & 15234));
        System.out.printf("b%32s\n", Integer.toBinaryString(1252 | 15234));
        System.out.printf("b%32s\n", Integer.toBinaryString(1252 ^ 15234));
        System.out.printf("b%32s\n", Integer.toBinaryString(~1252)); // 논리 연산자처럼 보이지만 비트연산자이다

    }
}
