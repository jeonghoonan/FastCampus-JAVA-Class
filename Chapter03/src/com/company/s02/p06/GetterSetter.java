package com.company.s02.p06;

/**
 * Getter, Setter
 * 맴버 변수를 간접적으로 다를 수 있게 해 주는 메소드
 * 멤버 변수의 캡슐화(Enxapsulation)에 도임이 됨
 *          -> 정보의 은닉/보호
 * 멤버 변수의 값을 제한해야 할 때 유용
 * code / generate / getter.setter / 다 클릭  / ok
 * code / generate / constructor / 다 클릭 /  ok
 */

public class GetterSetter {
    int x, y;
    String z;
    float w;

//    public GetterSetter(int x, int y, String z, float w) { // constructor
//        this.x = x;
//        this.y = y;
//        this.z = z;
//        this.w = w;
//    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x > 0 && x <= 1000) {
            this.x = x;
        } else {
            System.out.println("x should be 1 <= x <= 1000");
            System.out.println("however, you put in x = " + x);
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public float getW() {
        return w;
    }

    public void setW(float w) {
        this.w = w;
    }
}

class GetterSetterTest {
    public static void main(String[] args) {
        GetterSetter m = new GetterSetter();

        m.x = 10;
        System.out.println(m.x);

        m.setX(20);
        System.out.println(m.getX());

        m.x = 20; // 권장되지 않는 멤버 변수 처리 방식

        m.setX(11111111);
        System.out.println(m.getX());
    }
}