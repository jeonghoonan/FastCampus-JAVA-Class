package com.company.s03.p01;

/**
 * 클래스에 대한 설명. 이 클래스는 자바독 클래스로서 자바독을 공부하기 위함이다.
 * @author JeongHoon An
 */
public class JavaDocs {
    /**
     * 멤버 변수에 대한 설명을 적을 수 있다.
     */
    int memberInt;

    /**
     * 멤버 변수 또 다른것도 설명을 적을 수 있다.
     */
    String memberString;

    /**
     * 생성자에 대한 설명이다.
     * @param memberInt 입력1입니다.
     * @param memberString 입력2입니다.
     */
    public JavaDocs(int memberInt, String memberString) {
        this.memberInt = memberInt;
        this.memberString = memberString;
    }

    /**
     * 메소드에 대한 설명을 여기에 적는다.
     * @param string 입력 인자 (파라미터) 에 대한 설명을 적는다.
     * @return 리턴값에 대한 설명은 여기에 적는다.
     */
    public int methodA(String string) {
        return string.length();
    }
    public static void main(String[] args) {
        JavaDocs j = new JavaDocs(1, "string");
        j.methodA("abc");
    }
}
