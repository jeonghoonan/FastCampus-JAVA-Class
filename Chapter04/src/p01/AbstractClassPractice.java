package p01;

/**
 * AbstractStack
 * -> Stack
 *
 * is_empty() :
 * push() :
 * pop() :
 * peek() :
 *
 *
 * 데이터가 들어갈때는 push() 로 들어가고, 먼저 들어가는게 먼저 나온다 pop() 으로 데이터를 빼고, peek() 데이터를 빼지않고 데이터를 본다
 * ex) 1 / 3 / 4 순서로 했을때 pop 을 하면 4 부터 나오고 3 나오고 1 이 나온다
 */

abstract class AbstractStack {
    protected int capacity;
    protected int top;

    public AbstractStack(int capacity) {
        this.capacity = capacity;
        this.top = 0;
    }

    public boolean isEmpty() {
        return this.top == 0; // top 이 0이면 true, 다른 숫자면 false
    }

    public abstract void push(int value);
    public abstract int pop();
    public abstract int peek();
}

class ArrayStack extends AbstractStack {
    private int [] array;

    public ArrayStack(int capacity) {
        super(capacity);
        array = new int[capacity];
    }

    @Override
    public void push(int value) {
        if (top == capacity) {
            int [] new_array = new int[capacity * 2];
            System.arraycopy(array, 0, new_array, 0, array.length);
            array = new_array;
            capacity *= 2;
        }
        array[top++] = value;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return array[--top];
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return array[top -1];
    }
}

public class AbstractClassPractice {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10); // 데이터를 10개까지 넣을수 있음

        for (int i = 0; i < 15; i++) {
            stack.push(i);
        } // 0 ~ 9 가 출력

        System.out.println(stack.peek());
        System.out.println(stack.peek());

        for (int i = 0; i < 20; i++) {
            System.out.println(stack.pop());
        } // 9 ~ 0 이 출력
    }
}
