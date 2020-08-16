package Homeworks;

public class JoonGugudan {
    public static void main(String[] args) { // 구구단 출력
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.printf("%d * %d = %2d     ", j, i, i * j);
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i <= 9; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.printf("%d * %d = %2d     ", j, i, i * j);
            }
            System.out.println("");
        }
    }
}
