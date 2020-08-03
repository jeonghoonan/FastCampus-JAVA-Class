package com.company;

/**
 * 클래스 - 객체를 생성하기 위한 설계도 (Class)
 * 객체 - 클래스를 구체화하여 값으로 생성된것 (Object, instance)
 * 클래스를 객체로 만드는 과정 -> Instanciation
 */

class Car { // 클래스 뒤에다가 이름만 정하면 됨. 클래스 이름은 보통 PascalCase 로 표기를 한다.
    int speed = 0; // 속성, 멤버 변수라고 하기도 한다.
    // 속성: attribute, filed
    // 멤버 변수: member variable

    void move() { // **이게 메소드이다. (method)**, (멤버 함수 라고 하지만 잘 안부른다). 함수 라고 부르기도 한다.
        speed = 10; // 행위를 구현, 속성을 변경
    }
}

public class Main {
    public static void main(String[] args) {
        Car carOne = new Car(); // car라는 클래스로 부터 새로운 객체를 만든다. new 키워드로 클래스에서 생성
        System.out.println(carOne.speed); //0 // .을 찍으면 객체나 속성에 접근 가능
        carOne.move(); // 메소드 호출 (method call) 이라고 부른다
        System.out.println(carOne.speed); // 10

        Car carTwo = new Car(); // new 라고 할때만 새로운 객체가 생성된다. Car carThree = carOne 이면 그냥 같다고 가리킨다
        System.out.println(carTwo.speed); // 0 // 독립적인 객체가 존재 할수 있다.

        Car carThree = carOne; // 참조형 객체 이므로 새 객체를 만들지 않았다
        // carThree 는 new를 쓰지않아서 새로 만든건 아니다. 그냥 carOne에 접근을 한거다. 그래서 carOne 도 양향을 받은거다.
        System.out.println(carThree.speed); // 10
        carThree.speed = 5;
        System.out.println(carThree.speed); // 5
        System.out.println(carOne.speed); // 10 에서 5 로 변경됨.
    }
}

