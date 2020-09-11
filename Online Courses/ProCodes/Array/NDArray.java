package part4;

/**
 * 2차원 배열
 * 2 차원 배열은 크기가 다른것도 생성 가능
 */

public class NDArray {
    public static void main(String[] args) {
        int[][] array4 = new int[3][4]; // 배열의 크기 지정. 정수를 4개씩 담을수 있는 배열 3개 생성
        array4[0][1] = 10; // 그냥 array4[10] 은 안된다.

        int[][] array5 = new int[3][];

        array5[0] = new int[1];
        array5[0][0] = 10; // 오류는 나지는 않지만 실행 시키면 오류가 있다

        int[][] array6 = {{1}, {1,2}, {1,2,3}}; // 선언과 함께 선언

        System.out.println(array6[0][0]); // 1

        System.out.println(array6[2][2]); // 3
    }
}
