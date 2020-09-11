package part5;

/**
 * 변수의 scope 와 static
 * 프로그램상에서 사용되는 변수들은 사용 가능한 범위를 가진다. 그 범위를 변수의 스코프 라고 한다
 */
public class VariableScopeExam {
    int globalScope = 10; // 인스턴스 변수이며, 사용 범위는 클래스 전체이다
    static int staticVal = 7;

    public void scopeTest(int value) { // 매개변수로 선언되고,
                                     // 블럭 바깥에 존재하지만 메서드 선언부에 존재해 사용범위는 해당 메소드 블럭내이다

        int localScope = 20; // 사용범위는 메소드 블럭내이다

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2) {
        System.out.println(globalScope);
        // System.out.println(localScope);
        // System.out.println(value);
        System.out.println(value2);
    }

    // static 때문에 실행이 되지않음. static을 사용하면 인스턴스화 하지 않아도 사용할수있다
    public static void main(String[] args) {
        /**
         * 같은 클래스 안에 있는데 globalScope변수를 사용할수 없다
         * main은 static한 메소드이다. static한 메서드에서는 static 하지 않은 필드를 사용할수없다
         * static 한 변수는 공유된다
         *      static 하게 선언된 변ㄴ수는 값을 저장할수있는 공간이 하나만 생성된다
         *          인스턴스가 여러개 생성되도 static 한 변수는 하나다
         */
        // System.out.println(globalScope);
        // System.out.println(localScope);
        // System.out.println(value);
        System.out.println(staticVal); // 7

        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope); // 10
        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope); // 10
        System.out.println(v2.globalScope); // 20
        v1.staticVal = 50;
        v2.staticVal = 100;
        System.out.println(v1.staticVal); // 100
        System.out.println(v2.staticVal); // 100
        System.out.println(VariableScopeExam.staticVal);
        /**
         * globalScope같은 변수(필드) 는 인스턴스가 생성될때 성성되기 때문에 인스턴스 변수라고 한다
         * staticVal 같은 static 한 필드를 클래스 변수라고 한다
         *      클래스 변수는 레퍼런스, 변수명 하고 사용하기 보다는 클래스명, 변수명 으로 사용하는것이 더 좋다다         */
    }
}
