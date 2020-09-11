package Chapter5.thisex2;

public class Person {

    String name;
    int age;

    public Person() { // 인스턴스 생성을 초기화한다
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println(name + "," + age);
    }

    public Person getSelf() {
        return this;
    }
}

class PersonTest {
    public static void main(String[] args) {

        Person personNoname = new Person();
        personNoname.showInfo();

        Person personLee = new Person("Lee", 20);
        personLee.showInfo();
        System.out.println(personLee);

        Person p = personLee.getSelf();
        System.out.println(p);
    }
}
