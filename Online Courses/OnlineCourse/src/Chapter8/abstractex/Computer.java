package Chapter8.abstractex;

public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("전등을 켭니다");
    }

    public void turnOff() {
        System.out.println("전들을 끕니다");
    }
}

class Desktop extends Computer {
    public void display() {
        System.out.println("Desktop display");
    }

    public void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    public void turnOff() {
        System.out.println("desktop turnoff");
    }
}

abstract class NoteBook extends Computer {

    @Override
    public void typing() {
        System.out.println("NotebBook typing");
    }
}

class MyNoteBook extends NoteBook {

    @Override
    public void display() {
        System.out.println("MyNoteBook display");
    }
}

class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Desktop();
        computer.display();
        computer.turnOff();

        NoteBook myNote = new MyNoteBook();
    }
}