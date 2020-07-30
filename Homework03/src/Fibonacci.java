/**
 * 피보나치 수열
 *
 * 피보나치 수열을 출력하는 프로그램을 작성하시오.
 *
 * 피보나치 수열의 점화식 : f(n) = f(n-1) + f(n-2)
 *                        f(1) = 0, f(2) = 1
 *
 * 0, 1, 1, 2, 3, 5, 8, ...
 *
 * 인자
 * seqLength: 출력하고자 하는 피보나치 수열의 길이
 */

public class Fibonacci {
    public static void main(String[] args) {

        double maxNum = 100;
        double previousNum = 0;
        double nextNum = 1;

        System.out.println("Fibonacci of " + 0 + " to " + maxNum + " numbers: ");
        for (int i = 0; i <= maxNum; i++) {
            System.out.println(i + ". " + previousNum);

            double sum = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = sum;
        }
    }
}