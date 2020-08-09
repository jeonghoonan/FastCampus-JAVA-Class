package com.company;

/**
 * 클래스와 객체의 메모리 구조
 *  - 클래스 영역 (Class area, method area, code area, static area) // 한번 클래스가 사용되면 계속 사용가능한다
 *   -> field 정보, method 정보, type 정보, constant pool
 *  - 스택 영역 (Stack area)
 *   -> method 호출 시 선언된 로컬 변수 (임시로 있다가 사라짐)
 *  - 힙 영역( Heap area) // 객체에 쓰는 속성들
 *   -> new 키워드로 생선된 객체
 *   -> garbage collection 이 동작하는 영역 (GC)
 *      더이상 사용하지 않는 메모리를 아랑서 반환하는 JVM 의 기능
 */

public class MemoryStructure { // 클래스 영역
    int x, y; // 힙 영역 // 객체에 속하기 때문
    String string = "String!!"; // 힙 영역 이긴 한데, 상수풀에 생성된다

    public void method(int value) { // 클래스 영역,
        // int value => 스택 영역
        char c = 'w'; // 스택 영역
    }
}
