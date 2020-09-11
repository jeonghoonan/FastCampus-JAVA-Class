package Chapter4.ifexample;

import java.util.Scanner;

/**
 * switch-case문 문제
 * 1,3,5,7,8,10,12-31
 * 4,6,9,11-30
 * 2-28
 */

public class SwitchCase2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day;

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 4: case 6: case 11:
                day = 30;
                break;
            default:
                System.out.println("Error");
                day = 0;
        }
        System.out.println(month + "월은 " + day + "일 입니다");
    }
}

