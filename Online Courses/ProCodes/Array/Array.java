package part4;

public class Array {

    public static void main (String[] args) {
        int[] array1 = new int[100];

        array1[0] = 50; // 0번째에 50
        array1[10] = 100; // 10 번째 자리에 100

        // array1 = 1234
        // array1[0] = 1;
        // array1[1] = 2;
        // array1[2] = 3;
        // array1[3] = 4;
        // 4 칸의 메모리 가지고 있음

        int[] array2 = new int[]{1,2,3,4}; // 몇개짜리 할것인지

        int[] array3 = {1,2,3,4}; // 1차형 배열

        System.out.println(array3[3]);
    }
}
