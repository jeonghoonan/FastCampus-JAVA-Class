package Gugudan;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
//        System.out.println(2 * 1);
//        System.out.println(2 * 2);
//        System.out.println(2 * 3);
//        System.out.println(2 * 4);
//        System.out.println(2 * 5);
//        System.out.println(2 * 6);
//        System.out.println(2 * 7);
//        System.out.println(2 * 8);
//        System.out.println(2 * 9);
//
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println(1 * number);
//        System.out.println(2 * number);
//        System.out.println(3 * number);
//        System.out.println(4 * number);

//        int i = 1;
//        while (i < 10) {
//            System.out.println(6 * i);
//            i = i + 1;
//        }

//        for (int j = 1; j < 10; j++) {
//            System.out.println(7 * j);
//        }
//        System.out.println("구구단 중 출력할 단은? : ");
//        Scanner scanner = new Scanner(System.in);
//        int number  = scanner.nextInt();
//        System.out.println("number : " + number);
//
//        if ( number < 2) {
//            System.out.println("값을 잘못 입력하였습니다");
//        } else if (number > 9) {
//            System.out.println("값을 잘못 입력하였습니다");
//        } else {
//            for (int i = 1; i < 10; i++) {
//                System.out.println(number * i);
//            }
//        }

        int [] result = new int[9];
        for (int i = 0; i <= result.length; i++) {
            result[i] = 2 * (i + 1);
        }

        for (int i = 0; i <= result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
