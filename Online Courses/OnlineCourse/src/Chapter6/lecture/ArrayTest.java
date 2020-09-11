package Chapter6.lecture;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int total = 0;
        //int[] arr = {1, 2, 3}; 선언과 동시에 초기화 할수있다

        for (int i = 0, num = 1; i < arr.length; i++, num++) {
            arr[i] = num;
        }

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            System.out.println(total);
//            System.out.println(arr[i]);
        }
    }
}
