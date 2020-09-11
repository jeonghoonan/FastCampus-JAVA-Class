package section07;

public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }
}

class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}


