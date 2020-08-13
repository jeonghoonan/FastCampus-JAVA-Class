/**
 * List 인터페이스를 구현하여 IntArrayList 클래스를 완성하시오.
 *
 * List는 순서가 있는 연속된 값으로, List 인터페이스에 선언되어 있는 메소드의 기능은 아래와 같다.
 *
 * - append(): List의 마지막에 value를 삽입한다.
 * - prepend(): List의 시작점에 value를 삽입한다. 기존의 데이터를 한 칸씩 뒤로 옮긴다.
 * - insert(): index에 value를 삽입한다. 기존 데이터를 한 칸씩 뒤로 옮긴다.
 * - remove(): index의 value를 삭제한다. 기존 데이터를 한 칸씩 앞으로 당긴다.
 * - get(): index의 value를 반환한다.
 * - length(): List의 길이를 출력한다.
 *
 * IntArrayList는 int []를 이용하여 List를 구현한다.
 * - 생성자에서는 capacity를 입력받으며, 배열의 크기가 부족할 때마다 2배씩 증가시킨다.
 */

interface List {
    public void append(int value);
    public void prepend(int value);
    public void insert(int index, int value);
    public void remove(int index);
    public int get(int index);
    int length();
}

class IntArrayList implements List {
    private int capacity;
    private int [] array;
    private int length; // length 가 따로 있어야한다. array 를 capacity로 입력 받아서 데이터가 없어서 0부터 시작. 그래서 lenght 가 4.

    public IntArrayList(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.length = array.length;
    }

    public IntArrayList() {

    }

    @Override
    public void append(int value) {

    }


    @Override
    public void prepend(int value) {

    }

    @Override
    public void insert(int index, int value) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public void length() {

    }

public static class IntArrayListTest {
    public static void main(String[] args) {
        IntArrayList list =new IntArrayList();
    }
}

}
