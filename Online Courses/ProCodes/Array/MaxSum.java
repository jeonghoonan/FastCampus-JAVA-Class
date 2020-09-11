package part4;

/**
 * 배열의 연속합 최대 구하기
 *
 * 정수 배열에서 연속된 값의 합의 최대값을 구하시오.
 *
 * ex1) {1, 45, -2, 5, -6} => 1 + 45 + (-2) + 5 = 49
 * ex2) {-4, 5, 12, -7, 52, -5, 7} => 52
 *
 *
 * 인자
 * integers: 정수 배열
 */

public class MaxSum {
    public static void main(String[] args) {
        int [] integers = {-4, 7, 14, 9, -5, 4, 16, -22, 31};
        int maxValue = 0;

        for (int i = 0; i < integers.length; i++) {
            int sumValue = 0;
            for (int j = i; j < integers.length; j++) {
                sumValue += integers[j];
            }
            if (maxValue < sumValue) {
                maxValue = sumValue;
            }
            System.out.println(maxValue);
        }
    }
}