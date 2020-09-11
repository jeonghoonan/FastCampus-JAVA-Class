package Chapter5;

/**
 * 클래스릉 이용하여 나이 : 40
 *                이름 : James
 *                결혼여부 : true
 *                자녀수 : 3
 * 을 출력하세요
 */

public class Person {
    int age;
    String name;
    boolean marriage;
    int children;
}

class PersonTest {
    public static void main(String[] args) {

        Person person = new Person(); // 객체생성... 위에 public class Person 를 사용하기위해
        person.age = 40;
        person.name = "James";
        person.marriage = true;
        person.children = 3;

        System.out.println("나이 : " + person.age);
        System.out.println("이름 : " + person.name);
        System.out.println("결혼여부 : " + true);
        System.out.println("자녀수 : " + person.children);
    }
}
