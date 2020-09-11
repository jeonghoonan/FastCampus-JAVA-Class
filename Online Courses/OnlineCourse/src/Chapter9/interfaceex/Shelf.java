package Chapter9.interfaceex;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<>();
    }

    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}

interface Queue {
    void enQueue(String title);
    String deQueue();

    int getSize();
}

class BookShelf extends Shelf implements Queue {

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}

class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("태백산맥1");
        bookQueue.enQueue("태백산맥2");
        bookQueue.enQueue("태백산맥3");

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}