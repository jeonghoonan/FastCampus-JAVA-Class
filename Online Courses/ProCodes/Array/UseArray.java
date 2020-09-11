package part4;

public class UseArray {
    public static void main(String[] args) {
        int[] iarray = new int[100]; // 100개를 담을수 있는거 선언
        iarray[0] = 1;
        iarray[1] = 2;

        for (int i = 0; i < iarray.length; i++) {
            iarray[i] = i + i; // 1 부터 100 까지 해당 값 할당 가능
        } // for 문은 여기 시점에서 종료된다. for block 에서만 사용 가능

        int sum = 0; // sum 을 사용하기위해서. for 문 안에서는 선언 불가. // 값을 누적하기 위한 변수는 반복문 밖에서 선언
        for (int i = 0; i < iarray.length; i++) { // 배열의 크기만큼 반복
            sum = sum + iarray[i]; // 반복문 밖에서 선언한 변수에 반복적으로 값 누적
        }

        System.out.println(sum);
    }
}
