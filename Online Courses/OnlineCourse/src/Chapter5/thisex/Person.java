package Chapter5.thisex;

public class Person {

    String name;
    int age;

    public Person() {
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println(name+ "," + age);
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
