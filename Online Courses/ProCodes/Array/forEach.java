package part4;

/**
 * for each
 * 그냥 for 문을 쓸때에는 배열의 크기를 확인을 하고, 변수를 선언하고 프린트 할수있엇지만,
 * for each 는 크기를 확인할 필요가 없다.
 *
 */

public class forEach {
    public static void main(String[] args) {
        int[] iarr = {10,20,30,40,50};

        for (int i = 0; i < iarr.length; i++) {
            int value = iarr[i];
            System.out.println(value);
        }

        // for(타입 값을 받아줄 변수명:출력하고 싶은 자료 구조
        for (int value:iarr) {
            System.out.println(value);
        }
    }
}
