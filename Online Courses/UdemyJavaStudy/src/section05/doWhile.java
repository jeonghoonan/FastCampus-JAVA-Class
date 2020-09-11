package section05;

public class doWhile {
    public static void main(String[] args) {
        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for (int i = 6; i!= 6; i++) {
//            System.out.println("Count value is " + count);
//        }

        // FOR LOOP BELOW IS NOT INDENTICAL TO THE ABOVE WHILE LOOP
//        for (int i = 1; i < 7; i++) {
//            System.out.println("Count value is " + count);
//        }

//        for (count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }

//        count = 1;
//        while (true) {
//            if (count == 5) {
//                break;
//            }
//
//            System.out.println("Count value is " + count);
//            count++;
//        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);
    }
}
