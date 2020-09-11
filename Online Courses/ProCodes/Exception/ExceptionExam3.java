package Exception;

/**
 * 예외처리(Exception) 발생시키기
 * 강제로 오류를 발생시키는 throw
 */

public class ExceptionExam3 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = divide(i, j);
            System.out.println(k);
        }catch(IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }

    public static int divide(int i, int j) throws IllegalArgumentException{
        if (j == 0) {
            throw new IllegalArgumentException("0으로 나눌수 없습니다");
        }
        int k = i / j;
        return k;
    }
}
