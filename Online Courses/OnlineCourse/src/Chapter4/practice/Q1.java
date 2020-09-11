package Chapter4.practice;

/**
 * 연산자와 두 수를 변수로 선언한후 사칙연산이 수행되는 프로그램
 * if - else if - else, switch-case 방식 모두 구현
 */

public class Q1 {
    public static void main(String[] args) {
        String operator = "+";
        int num1 = 2;
        int num2 = 4;

        int result = 0;

        if (operator == "+") {
            result = num1 + num2;
        } else if (operator == "-") {
            result = num1 - num2;
        } else if (operator == "*") {
            result = num1 * num2;
        } else if (operator == "/") {
            result = num1 / num2;
        } else {
            System.out.println("연산자 오류입니다");
            return;
        }
        System.out.println("결과 값은 " + result + "입니다");
    }
}