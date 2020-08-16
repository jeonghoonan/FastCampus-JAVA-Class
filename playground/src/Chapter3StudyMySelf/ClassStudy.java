package Chapter3StudyMySelf;

class Car { // created Chapter3StudyMySelf.Car class with the class keyword
    public void fullThrottle() { // created fullThrottle() and speed() methods in the Chapter3StudyMySelf.Car class
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}