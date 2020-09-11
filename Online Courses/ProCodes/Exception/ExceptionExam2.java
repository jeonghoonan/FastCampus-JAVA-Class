package Exception;

/**
 * Throws : 예외가 발생했을때 예외를 호출한 쪽에서 처리하도록 던져준다
 */

public class ExceptionExam2 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }

    // 메소드 선언뒤에 throws ArithmetixExceptiom 을 적으면 divide 메소드는 ArithmeticException이
    // 발생하니 divdie메소드를 호출하는쪽에서 오류를 처리하라는뜻
    public static int divide(int i, int j) throws ArithmeticException {
        int k = i / j;
        return k;
    }
}
