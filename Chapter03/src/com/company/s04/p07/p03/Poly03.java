package com.company.s04.p07.p03;

/**
 * 공변 반환 타입 (Covariant return type)
 */

class Foo {
    public Foo getInstance() {
        return this;
    }
}

class Bar extends Foo { // 같이 변하는 공변 변홥 타입
    @Override
    public Bar getInstance() { // 오버라이딩이지만, 리턴 타입이 달라질수 있다.
        return this;
    }
}

public class Poly03 {
}
