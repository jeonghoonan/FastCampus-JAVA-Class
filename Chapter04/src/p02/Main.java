package p02;

class Calculator {
    private final ArithmeticOperator op;

    public Calculator(ArithmeticOperator op) {
        this.op = op;
    }

    public int run(int x, int y) {
        return op.operate(x, y);

    }
    public long run(long x, long y) {
        return op.operate(x, y);
    }
    public double run(double x, double y) {
        return op.operate(x, y);
    }
}

class Runner {
    public static void run(ArithmeticOperator op, int x, int y) {
        System.out.println(op.operate(x, y));
    }
}

public class Main {
    public static void main(String[] args) {
        // 다향성의 예(1)
        ArithmeticOperator op;
        op = new Add();
        System.out.println(op.operate(10.0, 20)); // 30.0

        // 다형성의 예(2)
        ArithmeticOperator [] ops; // Array 는 같은 자료만 되는데, 다향성에서는 오버라이드 되는 특성을 이용 해 부모에 구현된걸 자식에 사용가능
        ops = new ArithmeticOperator[]{new Add(), new Multiply()};
        for (ArithmeticOperator o: ops) {
            System.out.println(o.operate(5, 2)); // 7, 10
            // 인터페이스는 상속개념이다 // 인터페이스는 객체를 만들수는 없다
        }

        // 다형성의 예(3)
        Calculator add = new Calculator(new Add());
        Calculator sub = new Calculator(new Substract());

        System.out.println(add.run(10, 20)); // 30
        System.out.println(sub.run(20, 15)); // 5

        // 다형성의 예(4) -> 한단계 더 가면 람다...
        Runner.run(new Add(), 40, 50); // 90
        Runner.run(new Divide(), 6, 2); // 3
    }
}
