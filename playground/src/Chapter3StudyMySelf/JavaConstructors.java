package Chapter3StudyMySelf;

public class JavaConstructors { // create a JavaConstructors class
    int x; // create a class attribute

    public JavaConstructors() { // create a class constructor for the JavaConstructors class
        x = 5; // set the initial value for the class attribute  of x
    }

    public static void main(String[] args) {
        JavaConstructors myObj = new JavaConstructors(); // create an object of class JavaConstructors
        System.out.println(myObj.x); // print value of x
    }
}
