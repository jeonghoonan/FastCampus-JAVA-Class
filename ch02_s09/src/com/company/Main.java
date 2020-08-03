package com.company;

/**
 * 문자열 (String)
 *
 * 문자열은 내부적으로 '클래스'로 구성되어 있다.
 * 내부에는 문자의 배열로 된 데이터가 있다. char []
 * 한번 만든 문자열은 변하지 않는다. (Immutable)
 *
 * 문자열 편집은 String을 쓰지않고 Builder 나 Buffer 등을 사용한다.
 */

public class Main {

    public static void main(String[] args) {
        // 문자열 생성
        String s1 = "문자열 생성 방법";
        String s2 = new String( "문자열 생성 방법2"); //  클래스 생성자. 권장하지 않음

        String s3 = "abcde"; // 처음 상수 풀 안에  만들어진다 // 새로 만들지를 않는다
        String s4 = "abcde"; //
        String s5 = new String("abcde");

        System.out.println(s3 == s4); // true // 문자열을 곧바로 생성할 경우 상수 풀에서 찾아 사용
        System.out.println(s3 == s5); // false // 문자열을 클래스로 생성할 경우 새로운 값을 생성

        //
        System.out.println(s3.equals((s4))); // true
        System.out.println(s3.equals((s5))); // true

        String s = "This is a string";
        System.out.println(s.length()); // 16 // Method 사용시 명확하고 직관적으로 써야함
        System.out.println(s.charAt(2)); // 1
        System.out.println(s.indexOf('a')); // 'a' 는 문자열에 8번째에 있다. (공백도 카운트한다)
        System.out.println(s.equalsIgnoreCase("this Is A STRING")); // 대소문자 관계없이 입력을 받는다.
        System.out.println(s.replace('i', 't')); // i 대신 t 로 바뀐다.
        // 기존의 Sring을 바꾸는 것이 아니라, 변경된 String 을 새로 생성해서 출력한다.
        System.out.println(s);
        System.out.println(s.substring(3, 9)); // 3번 인덱스 부터 9번이 포함되지 않는 8번까지 잘라준다. // 마지막 인덱스는 제외하고 출력을 한다.
        System.out.println(" wwefw ".trim()); // 양엾의 공백들을 제거해준다.
        System.out.println("*".repeat(10)); // 문자열을 반복을 해준다. for 문을 사용안하고 간결하게 표현 가능
        System.out.println();

        char [] characters = s.toCharArray(); // 새로운 문자 배열을 만들어 반환
        for (char value: characters) {
            System.out.println(value); // string 문자가 한 문자씩 프린트가 된다
        }
    }
}
