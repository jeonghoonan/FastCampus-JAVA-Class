/**
 * 입력받아 처리하기
 *
 * 3개의 정수를 입력받아, 그 중 최대값을 출력하고자 한다.
 * 이를 수행하는 프로그램을 작성하시오.
 *
 */

package com.company;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        int num2 = scanner.nextInt();
        scanner.nextLine();
        int num3 = scanner.nextInt();
        scanner.nextLine();

        int biggerNum = num1>num2?num1:num2;
        int biggestNum = biggerNum>num3?biggerNum:num3;

        System.out.printf("Biggest Number is %d", biggestNum);


    }
}
