package Chapter9.interfaceex;

public interface Calc {

    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        System.out.println("정수 계산기를 구현합니다");
        myMethod();
    }

    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }

        return total;
    }

    private void myMethod() {
        System.out.println("private method");
    }
}

abstract class Calculator implements Calc {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}

class CompleteCalc extends Calculator {

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            return ERROR;
        } else {
            return num1 / num2;
        }
    }
        public void showInfo() {
            System.out.println("모두 구현하겠습니다");
    }

    @Override
    public void description() {
        System.out.println("재정의 한 description");
    }
}

class CalcTest {
    public static void main(String[] args) {
        CompleteCalc calc = new CompleteCalc();
        int n1 = 10;
        int n2 = 2;

        System.out.println(calc.add(n1, n2));
        System.out.println(calc.substract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.divide(n1, n2));
        calc.showInfo();

        calc.description();

        int[] arr = {1, 2, 3, 4, 5};
        int sum = Calc.total(arr);
        System.out.println(sum);
    }
}