package Chapter9.interfaceex;

public interface X {
    void x();
}

interface Y {
    void y();
}

interface MyInterface extends X, Y{
    void myMethod();
}

class MyClass implements MyInterface {

    @Override
    public void x() {

    }

    @Override
    public void y() {

    }

    @Override
    public void myMethod() {

    }
}