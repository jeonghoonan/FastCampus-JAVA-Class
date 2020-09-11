package Chapter4.loopexample;

/**
 * break문
 *  감싸고 있는 블록의 제어를 빠져나오는 기능
 *  반복문, 조건문, switch-case등과 같이 쓰이며 현재 수행하고있는 블록에서 수행을 중지하고 외부로 제어가 이동
 *  반복문과 같이 사용하면 특정 조건일때 반복을 중지하는 기능 가능
*/

public class BreakExample {
    public static void main(String[] args) {

        int sum = 0;
        int num;
        for (num = 1; ; num++) {

            sum += num;
            if (sum >= 100) {
                break;
            }
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
