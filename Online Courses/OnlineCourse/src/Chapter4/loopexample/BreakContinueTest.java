package Chapter4.loopexample;

public class BreakContinueTest {
    public static void main(String[] args) {

//        int dan;
//        int count;
//
//        for (dan = 2; dan <= 9; dan++) {
//            if ((dan % 2) != 0) continue;
//            for (count = 1; count <= 9; count++) {
//                if(count > dan) break;
//                System.out.println(dan + "X" + count + "=" + dan * count);
//            }
//            System.out.println();
//        }

        for (int i = 2; i <= 9; i++) {
            if ((i % 2) != 0) continue;
            for (int j = 1; j <= 9; j++) {
                if (j > i) break;
                System.out.println(i + "X" + j + "=" + i * j);
            }
            System.out.println("");
        }
    }
}
