package Exception;

/**
 * 예외처리 : 프로그램실행중 예기치 못한 사건
 *  예외 상황을 미리 예측하고 처리할수있는데, 이렇게 하는것을 예외처리라고한다
 *
 */

public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = i / j;
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println("0으로 난눌수없습니다." +e.toString());
    } finally {
            System.out.println("오류가 발생했든 발생하지 않았던 무조건 실행");
        }

        System.out.println("main end!!");
    }
}

/**
 * Exception 처리하지 않았을때는 프로그램이 강제 종료되었는데 catch라는 블록으로 Exception을 처리하니 강제종료되지않고 잘 실행된다
 * try 블록에서 여러종류의 Exception이 발생한다면 catch 라는 블록을 여러개 둘수있다
 */

//public class ExceptionExam {
//    public static void main(String[] args) {
//        int i = 10;
//        int j = 5;
//        int k = i / j;
//        System.out.println(k);
//        System.out.println(main 종료);
//    }
//}
/**
 * 위 코드에서 j 를 0으로 바꾸면 ArithmeticExceptiom 이 발생하면서 프로그램이 종료된다
 * Java 는 정수를 정수로 나눌때 0으로 나누면안된다. 0으로 나누면 오류가 발생한다
 * 예외처리
 *      프로그래머는 j 라는 변수에 0이 들어올지도 모르는 예외 상황을 미리 예측하고 처리할수있다
 * 예외처리하는 문법
 *  오류가 발생할 예상 부분을 try라는 불록으로 감싼후, 발생할 오류와 관련된 Exception 을 catch라는 블록에서 처리한다
 *  오류가 발생했든 안했든 무조건 실행되는 finally 라는 블록을 가질수있다
 *  fianlly 블록은 생략가능하다
 */
