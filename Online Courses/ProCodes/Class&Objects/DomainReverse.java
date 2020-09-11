package part5;

/**
 * 도메인 뒤집기
 *
 * 주어진 홈페이지 주소를 .을 기준으로 각각 뒤집어 출력하시오.
 *
 * ex) www.google.com -> www.elgoog.moc
 *
 * 인자
 * string: 홈페이지 주소
 */

public class DomainReverse {
    public static void main(String[] args) {
        String string = "www.google.com";
        String [] arr = string.split("\\.");

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length() -1; j >= 0; j--) {
                System.out.print(arr[i].charAt(j));
            }
            if (i < arr.length) {
                System.out.print(".");
            }
        }
    }
}