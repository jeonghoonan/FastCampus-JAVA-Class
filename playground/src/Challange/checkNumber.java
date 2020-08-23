package Challange;

/**
 * Positive, Negative or Zero
 * Write a method called checkNumber with an int parameter number.
 *
 * The method shoudl not return any value, and it needs to print out
 *  the positive if the parameter number is > 0
 *  negative if the paramter number is < 0
 *  zero if the pramter number is equal to 0
 *  the checknumber method needs to be defiend as public static
 *  do not add a main method to your solution code
 */

class checkNumber {
    public static void main(String[] args) {
        checkNumber(1);
        checkNumber(-1);
        checkNumber(0);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}


/**
 * 처음에 했던거 
 */
//class checkNumber {
//    public static void main(String []args) {
//        int number = 2;
//        if (number > 0) {
//            System.out.println("positive");
//        } else if (number < 0) {
//            System.out.println("negative");
//        } else {
//            System.out.println("zero");
//        }
//    }
//}






