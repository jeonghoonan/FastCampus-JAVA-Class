package Chapter4.loopexample;

/**
 * 반복문
 * 동일한 수행문을 조건에 맞는 동안 수행하도록 하는 기능
 * while문
 *      조건이 참인 동안 수행문이 반복해서 수행된다
 *      조건이 참이지않으면 블록을 빠져나간다
 * do-while
 * 먼저 수행문을 수행하고 조건 체그
 * 한번 이상 수행문이 수행되어야 하는 경우 사용
 */


import java.util.Scanner;

/**
 * sum += num; 이라는건 sum = sum + num이다
 */

public class WhileExample {
    public static void main(String[] args) {

//        int num = 1;
//        int sum = 0;

//        while (num <= 10) {
//            sum += num;
//            num++; // 11 되면 빠져나온다
//        }
//        System.out.println(sum);
//        System.out.println(num);

        int input;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        while(input != 0) {
            sum += input;
            input = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
