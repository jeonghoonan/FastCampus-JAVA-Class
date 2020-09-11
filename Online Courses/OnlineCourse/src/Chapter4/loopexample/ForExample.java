package Chapter4.loopexample;

/**
 * for문
 *  반복문 중 가장 많이 사용됨
 *  일정 횟수에 기반한 반복을 구현할때 효율적임
 *  for (초기화식; 조건식; 증감식)
 */

public class ForExample {
    public static void main(String[] args) {

        int count = 1;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += count;
            count++;
        }
        System.out.println(sum);
    }
}

/**
 * 같은의미이다
 * for(;;) {
 * }
 * while(true) {
 * }
 */

/**
 * 중첩 반복문
 * 반복문이 중첩되어 구현되는 경우
 * 반복문 내부에 또 다른 반복문이 있다
 * 외부 반복문과 내부 반복문 간의 변수 값 변화에 유의 하며 구현 해야 한다
 */
