package section03;

public class Main {
    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minium Value = " + myMinIntValue);
        System.out.println("Integer Maxiusm Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted MIN value = " + (myMinIntValue -1)); // underflow

//        int myMaxIntTest = 2147483648; // out of range
    }
}
