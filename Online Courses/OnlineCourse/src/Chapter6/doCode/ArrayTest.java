package Chapter6.doCode;

/**
 * 문자 배열을 생성하고 출력
 * 대문자를 A - Z 까지 배열에 저장하고 이를 출력
 * 아스키코드 이용한거다
 */

public class ArrayTest {
    public static void main(String[] args) {

        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = ch++;
        }
        for (int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i] + "," + (int)alphabets[i]);
        }




    }
}
