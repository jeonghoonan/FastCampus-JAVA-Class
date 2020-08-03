package com.company;

/**
 * 변수 (Variables)
 * 클래스에 쓰이는 다양한 변수
 *      - 클래스 멤버 변수 (static variable, class variable)
 *      - 인스턴스 멤버 변수 (member variable, attribute, ...)
 *      - 로컬 변수 (local variable)
 *      - 로컬 파라미터 변수 (local parameter variable)
 *                          (arguments)
 */

public class Variable {
    static int classVar; // 클래스 멤버 변수, 스태틱 변수(정적 변수)
    int instanceVar; // 인스턴스 멤버 변수, 필드, 속성

    public void method(int paramVar) { // 로컬 파라미터 변수
        System.out.println(paramVar);

        int localVar; // 로컬 변수를 생성가능

        // System.out.println(localV); // 로컬 변수는 초기화가 안됨
        localVar = 10;
        System.out.println(localVar);

        {
            localVar = 30;
            int localVar2 = 20;
        }
        System.out.println(localVar); // 블록 내에서 수정한 것도 반영됨
        // localVar2 = 40; // 접근 불가. 생명주기가 끝났다. Life-Cycle
    }
}

class VariableTest {
    public static void main(String[] args) {
        System.out.println("클래스 변수");
        System.out.println(Variable.classVar); // 0 // 클래스 변수는 클래스 이름으로 바로 접근 가능 // 0으로 초기화됨<- 외워야함
        Variable.classVar = 10; // 접근해서 값을 수정 가능 // 클래스이름.변수명으로 접근 가능
        System.out.println(Variable.classVar); // 10
        System.out.println("");

        System.out.println("인스턴스 멤버 변수");
        Variable var = new Variable();
        System.out.println(var.instanceVar); // 위에보면 초기화를 안해서(instanceVar) 0으로 된다
        var.instanceVar = 20; // 값을 넣으면 수정이 가능
        System.out.println(var.instanceVar);

        Variable var2 = new Variable();
        System.out.println(var2.instanceVar); // 초기화 안된 0 으로 나온다

        // System.out.println(var2.classVar); 이렇게 호출하는건 가능하나 권장하지 않는다. 특정 개체에 접근 하는게 아니기 때문에

        // Variable.instanceVar 는 접근 불가능

        System.out.println("로컬 변수");
        var.method(9); // 9

    }
}
