package section05.challenge;

import java.security.PublicKey;

public class ifEvenNumber {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEveNumber(number)) {
                continue;
            }
            evenNumbersFound++;
            System.out.println("Even number " + number);
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEveNumber (int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
